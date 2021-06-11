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
    val entries = tasks.listFromListID(listId)
    val genreId = lists.findByListId(listId).get.genreId
    Ok(views.html.list(entries)(genreId)(listId)(request))
  }

  /**
    * 検索機能
    * タスク名は任意、完了状態は必須事項
    */
  def extract(listId: Int) = Action { implicit request =>
    (for {
      param  <- request.body.asFormUrlEncoded
      title  <- param.get("title").flatMap(_.headOption)
      isDone <- param.get("isDone").flatMap(_.headOption)
    } yield {
      val genreId = lists.findByListId(listId).get.genreId
      if (title == "") {
        val entries = tasks.findByIsDone(listId, !isDone.toBoolean)
        Ok(views.html.list(entries)(genreId)(listId)(request))
      } else {
        val entries = tasks.search(listId, title, !isDone.toBoolean)
        Ok(views.html.list(entries)(genreId)(listId)(request))
      }
    }).getOrElse[Result](Redirect(routes.TaskController.list(listId)))
  }

  def sort(listId: Int, sortItem: String) = Action { implicit request =>
    val entries = tasks.listFromListID(listId)
    var result  = Seq.empty[Task]
    sortItem match {
      case "name1" => result = entries.sortBy(_.name1.toLowerCase)
      case "name2" => result = entries.sortBy(_.name2.toLowerCase)
      case "deadline" =>
        result = entries.sortWith(
          (x, y) =>
            x.deadYear.compareTo(y.deadYear) match {
              case 0 =>
                x.deadMonth.compareTo(y.deadMonth) match {
                  case 0 => x.deadDay.compareTo(y.deadDay) < 0
                  case c => c < 0
                }
              case c => c < 0
            }
        )
      //case "isDone" => result = entries.sortBy(_.isDone)
    }
    val genreId = lists.findByListId(listId).get.genreId
    Ok(views.html.list(result)(genreId)(listId)(request))
  }

  /**
    * タスク新規登録ページを表示
    */
  def register(listId: Int) = Action { implicit request =>
    val genreId = lists.findByListId(listId).get.genreId
    Ok(views.html.taskForm(genreId)(listId)(request))
  }

  /**
    * タスクを新規登録
    */
  def confirm(listId: Int) = Action { request =>
    (for {
      param       <- request.body.asFormUrlEncoded
      name1       <- param.get("name1").flatMap(_.headOption)
      name2       <- param.get("name2").flatMap(_.headOption)
      description <- param.get("description").flatMap(_.headOption)
      year        <- param.get("year").flatMap(_.headOption)
      month       <- param.get("month").flatMap(_.headOption)
      day         <- param.get("day").flatMap(_.headOption)
    } yield {
      tasks.save(Task(listId, name1, name2, description, year, month, day, false))
      Redirect(routes.TaskController.list(listId)).withNewSession
    }).getOrElse[Result](Redirect("/lists/" + listId + "/add"))
  }

  /**
    * 完了状態のみを変更
    */
  def comp(listId: Int, taskId: Int) = Action {
    tasks.findByID(taskId) match {
      case Some(e) =>
        if (e.isDone == false) {
          val after = true
          tasks.switchIsDone(taskId, after)
        } else {
          val after = false
          tasks.switchIsDone(taskId, after)
        }
      case None => NotFound(s"No entry for id=${taskId}")
    }
    Redirect(routes.TaskController.list(listId))
  }

  /**
    * タスク編集ページを表示
    */
  def edit(listId: Int, taskId: Int) = Action { implicit request =>
    val genreId = lists.findByListId(listId).get.genreId
    tasks.findByID(taskId) match {
      case Some(e) => Ok(views.html.editTask(e)(genreId)(listId)(request))
      case None    => NotFound(s"No entry for id=${taskId}")
    }
  }

  /**
    * タスク上書き
    */
  def update(listId: Int, taskId: Int) = Action { request =>
    (for {
      param       <- request.body.asFormUrlEncoded
      name1       <- param.get("name1").flatMap(_.headOption)
      name2       <- param.get("name2").flatMap(_.headOption)
      description <- param.get("description").flatMap(_.headOption)
      year        <- param.get("year").flatMap(_.headOption)
      month       <- param.get("month").flatMap(_.headOption)
      day         <- param.get("day").flatMap(_.headOption)
    } yield {
      val isDone = tasks.findByID(taskId).get.isDone
      tasks.save(Task(taskId, listId, name1, name2, description, year, month, day, null, isDone))
      Redirect(routes.TaskController.list(listId)).withNewSession
    }).getOrElse[Result](Redirect("/lists/" + listId + "/" + taskId + "/edit"))
  }

  /**
    * タスク削除
    */
  def delete(listId: Int, taskId: Int) = Action {
    tasks.findByID(taskId) match {
      case Some(e) => tasks.delete(taskId)
      case None    => NotFound(s"No entry for id=${taskId}")
    }
    Redirect(routes.TaskController.list(listId)).withNewSession
  }
}
