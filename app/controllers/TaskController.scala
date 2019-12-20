package controllers

import javax.inject.{Inject, Singleton}
import models.{List, Lists, Task, Tasks}
import play.api.mvc.{AbstractController, ControllerComponents, Result}

@Singleton
class TaskController @Inject()(tasks: Tasks)(lists: Lists)(cc: ControllerComponents) extends AbstractController(cc) {

  /**
    * インデックスページを表示
    */
  def list(listId: Int) = Action { request =>
    val entries  = tasks.listFromListID(listId)
    val genreId  = lists.getFromListID.get.genre_id //Listモデルと擦り合わせて要変更
    Ok(views.html.list(entries, listId, genreId))
  }

  def register(listId: Int) = Action { request =>
    val genreId = lists.getFromListID.get.genre_id //Listモデルと擦り合わせて要変更
    Ok(views.html.taskForm(listId, genreId)(request))
  }

  def confirm(listId: Int) = Action { request =>
    (for {
      param       <- request.body.asFormUrlEncoded
      name1       <- param.get("name1").flatMap(_.headOption)
      name2       <- param.get("name2").flatMap(_.headOption)
      description <- param.get("description").flatMap(_.headOption)
      deadline    <- param.get("deadline").flatMap(_.headOption)
    } yield {
      tasks.save(Task(listId, name1, name2, description, deadline, false))
      Redirect(routes.TaskController.list(listId)).withNewSession
    }).getOrElse[Result](Redirect("./lists/" + listId + "/add"))
  }

  def comp(taskId: Int, listId: Int) = Action {
    tasks.findByID(taskId) match {
      case Some(e) =>
        var isDone = false
        if (e.isDone == false) {
          isDone = true
        } else {
          isDone = false
        }
        tasks.switchIsDone(taskId, isDone)
      case None => NotFound(s"No entry for id=${taskId}")
    }
    Redirect(routes.TaskController.list(listId)).withNewSession
  }

  def edit(listId: Int, taskId: Int) = Action { request =>
    tasks.findByID(taskId) match {
      case Some(e) => Ok(views.html.editTask(listId, taskId)(request))
      case None    => NotFound(s"No entry for id=${taskId}")
    }
  }

  def delete(listId: Int, taskId: Int) = Action {
    tasks.findByID(taskId) match {
      case Some(e) => tasks.delete(taskId)
      case None    => NotFound(s"No entry for id=${taskId}")
    }
    Redirect(routes.TaskController.list(listId)).withNewSession
  }
}