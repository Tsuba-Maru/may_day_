package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents, Result}
import models.{List, Lists}

/**
  * 親リストのコントローラ
  */
@Singleton
class MotherListController @Inject()(lists: Lists)(cc: ControllerComponents) extends AbstractController(cc) {

  def list = Action { request =>
    val entreis = lists.list
    Ok(views.html.home(entreis)(request)).withSession(request.session)
  }

  def listRegistration = Action { request =>
    Ok(views.html.createList(request)).withSession(request.session)
  }

  def register = Action { request =>
    (for {
      param    <- request.body.asFormUrlEncoded
      userId   <- request.session.get("userId")
      listName <- param.get("listName").flatMap(_.headOption)
      genreId  <- param.get("genreId").flatMap(_.headOption)
    } yield {
      val list = List(listName, userId.toInt, genreId.toInt)
      lists.save(list)
      Redirect("/lists").withSession("userId" -> userId)
    }).getOrElse[Result](Redirect("/lists/create"))
  }

  /*TODO: listの第一引数のtask*/
  def entry(listId: Int) = Action { request =>
    lists.findByListId(listId) match {
      case Some(e) => Ok(views.html.list(tasks)(e.genreId)(listId)).withSession(request.session)
      case None    => NotFound(s"No entry for id=${listId}")
    }
  }

  def delete(listId: Int) = Action { request =>
    lists.deleteList(listId)
    Redirect("/lists").withSession(request.session)
  }

}
