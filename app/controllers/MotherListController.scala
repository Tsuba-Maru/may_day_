package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents, Result}
import models._
import java.time.LocalDate

/**
  * 親リストのコントローラ
  */
@Singleton
class MotherListController @Inject()(lists: Lists)(tasks: Tasks)(users: Users)(links: Links)(cc: ControllerComponents)
    extends AbstractController(cc) {

  def list = Action { request =>
    (for {
      userId <- request.session.get("userId")
    } yield {
      var entries = lists.findByUserId(userId.toInt)

      /***********共有用***********/
      val linkList = links.findByUserId(userId.toInt)
      linkList.foreach { e =>
        lists.findByListId(e.listId) match {
          case Some(s) => entries = entries :+ s
          case None    =>
        }
      }
      entries = entries.distinct

      /****************************/


      val today: LocalDate        = LocalDate.now()
      var pastDeadline: Seq[Task] = Seq.empty
      var nearDeadline: Seq[Task] = Seq.empty

      for (entry <- entries) {
        val taskEntry = tasks.listFromListID(entry.listId).filter(task => (task.deadYear.toInt != 0) && (!task.isDone))
        nearDeadline ++= taskEntry.filter(task =>
          LocalDate.of(task.deadYear.toInt, task.deadMonth.toInt, task.deadDay.toInt)
              .compareTo(today) >= 0 ||
            LocalDate
              .of(task.deadYear.toInt, task.deadMonth.toInt, task.deadDay.toInt)
              .compareTo(today) < 2)
        pastDeadline ++= taskEntry.filter(
          task =>
            LocalDate
              .of(task.deadYear.toInt, task.deadMonth.toInt, task.deadDay.toInt)
              .compareTo(today) < 0)
      }

      nearDeadline = nearDeadline.sortWith(
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

      pastDeadline = pastDeadline.sortWith(
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

      Ok(views.html.home(entries)(nearDeadline)(pastDeadline)(request)).withSession(request.session)

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

  /*
  def entry(listId: Int) = Action { request =>
    lists.findByListId(listId) match {
      case Some(e) => {
        val task = tasks.listFromListID(listId)
        Ok(views.html.list(task)(e.genreId)(listId)).withSession(request.session)
      }
      case None    => NotFound(s"No entry for id=${listId}")
    }
  }
   */

  def delete(listId: Int) = Action { request =>
    //lists.deleteList(listId)
    //Redirect("/lists").withSession(request.session)
    /***********共有用***********/
    (for {
      userId <- request.session.get("userId")
    } yield {
      lists.findByListId(listId) match {
        case Some(e) => {
          val owner = e.userId
          if (owner == userId.toInt) {
            lists.deleteList(listId)
            links.deleteList(listId)
            tasks.deleteList(listId)
          } else {
            links.deleteLink(listId, userId.toInt)
          }
        }
        case None => NotFound(s"No entry for id=${listId}")
      }
      Redirect("/lists").withSession(request.session)
    }).getOrElse[Result](Redirect(s"/lists/${listId}")).withSession(request.session)
    /***************************/
  }

  def edit(listId: Int) = Action { request =>
    (for {
      param    <- request.body.asFormUrlEncoded
      listName <- param.get("listName").flatMap(_.headOption)
      userId   <- request.session.get("userId")
    } yield {
      lists.editListName(listName)(listId)
      Redirect(s"/lists/${listId}").withSession("userId" -> userId)
    }).getOrElse[Result](Redirect("/lists"))
  }

  //共有
  def share(listId: Int) = Action { request =>
    Ok(views.html.share(listId)(request)).withSession(request.session)
  }

  def confirmShare(listId: Int) = Action { request =>
    (for {
      param      <- request.body.asFormUrlEncoded
      userName   <- param.get("userName").flatMap(_.headOption)
      thisUserId <- request.session.get("userId")
    } yield {
      users.findByName(userName) match {
        case Some(e) => {
          val userId = e.userId
          links.save(Link(listId, userId))
          Redirect(s"/lists/${listId}").withSession("userId" -> thisUserId)
        }
        case None => NotFound(s"No entry for name=${userName}")
      }
    }).getOrElse[Result](Redirect(s"/lists/${listId}/share")).withSession(request.session)
  }

}
