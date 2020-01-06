package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents, Result}
import models.{List, Lists, Tasks}

/**
  * 親リストのコントローラ
  */
@Singleton
class MotherListController @Inject()(lists: Lists)(tasks: Tasks)(cc: ControllerComponents) extends AbstractController(cc) {

  def list = Action { request =>
    (for {
      userId <- request.session.get("userId")
    } yield {
      val entreis = lists.findByUserId(userId.toInt)
      Ok(views.html.home(entreis)(request)).withSession(request.session)
    }).getOrElse[Result](Redirect("/"))
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

  def entry(listId: Int) = Action { request =>
    lists.findByListId(listId) match {
      case Some(e) => {
        val task = tasks.findByListId(listId)
        Ok(views.html.list(task)(e.genreId)(listId)).withSession(request.session)
      }
      case None    => NotFound(s"No entry for id=${listId}")
    }
  }

  def delete(listId: Int) = Action { request =>
    lists.deleteList(listId)
    Redirect("/lists").withSession(request.session)
  }

  def edit(listId: Int) = Action {request =>
    (for {
      param    <- request.body.asFormUrlEncoded
      listName <- param.get("listName").flatMap(_.headOption)
      userId   <- request.session.get("userId")
    } yield {
      lists.editListName(listName)(listId)
      Redirect(s"/lists/${listId}").withSession("userId" -> userId)
    }).getOrElse[Result](Redirect("/lists"))
  }

}
