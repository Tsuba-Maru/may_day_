package controllers

import javax.inject.{Inject, Singleton}
import models.{Task, Tasks, List, Lists}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class TaskController @Inject()(tasks: Tasks)(lists: Lists)(cc: ControllerComponents) extends AbstractController(cc) {

  /**
    * インデックスページを表示
    */
  def list(listId: Int) = Action { request =>
    val entries  = tasks.listFromListID(listId)
    Ok(views.html.list(entries))
  }

  def register(listId: Int) = Action { request =>
    val genreId = lists.getFromListID.get.genre_id //要変更
    Ok(views.html.taskForm(listId, genreId))
  }

  def confirm(listId: Int) = Action { request =>
    (for {
      param       <- request.body.asFormUrlEncoded
      name1       <- param.get("name1").flatMap(_.headOption)
      name2       <- param.get("name2").flatMap(_.headOption)
      description <- param.get("description").flatMap(_.headOption)
      deadline       <- param.get("deadline").flatMap(_.headOption)
    } yield {
      tasks.save(Task(listId, name1, name2, description, deadline, false))
      Redirect("./lists/" + listId).withNewSession
    }).getOrElse[Result](Redirect("./lists/" + listId + "/add"))
  }

  def comp = TODO

  def edit = TODO

  def delete = TODO
}