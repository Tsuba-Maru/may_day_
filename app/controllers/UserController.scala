package controllers

import javax.inject.{Inject, Singleton}

import play.api.mvc.{AbstractController, ControllerComponents, Result}
import models._

/**
  * Userコントローラ
  */
@Singleton
class UserController @Inject()(tasks: Tasks)(users: Users)(cc: ControllerComponents) extends AbstractController(cc) {

  /**
    * 初期ページを表示
    */
  def index = Action { request =>
    Ok(views.html.signinForm(request)) //newSessionにするとエラー発生のため削除
  }

  /** *ユーザー登録 ***/
  def signup = Action { request =>
    Ok(views.html.signupForm(0)(request)) // 同上
  }

  def signupConfirm = Action { request => //登録可能か調べ、確認画面へ
    (for {
      param    <- request.body.asFormUrlEncoded
      userName <- param.get("userName").flatMap(_.headOption)
      password <- param.get("password").flatMap(_.headOption)
    } yield {
      users.findByName(userName) match { //名前があるかを確認
        case Some(e) =>
          Ok(views.html.signupForm(1)(request))
            .withSession(request.session + ("userName" -> userName) + ("password" -> password))
        case None =>
          users.getMaxID match {
            case Some(userId) =>
              Ok(views.html.signupConfirm(userName)(userId + 1)(request))
                .withSession(request.session + ("userName" -> userName) + ("password" -> password))
            case None =>
              Redirect("/")
          }
      }
    }).getOrElse[Result](Redirect("/"))
  }

  def signupComplete = Action { request => //登録をする
    (for {
      userName <- request.session.get("userName")
      password <- request.session.get("password")
    } yield {
      users.save(User(userName, utility.Digest.apply(password), true))
      Redirect("/").withNewSession
    }).getOrElse[Result](Redirect("/"))
  }

  /***ログイン***/
  def signin = Action { request =>
    (for {
      param    <- request.body.asFormUrlEncoded
      userName <- param.get("userName").flatMap(_.headOption)
      password <- param.get("password").flatMap(_.headOption)
    } yield {
      users.findByName(userName) match { //ユーザーが存在するか確認
        case Some(user) =>
          if (!user.isActive) { //退会していないかどうか
            Ok(views.html.signinError("このユーザーは退会済みです"))
          } else if (utility.Digest.apply(password) == user.password) { //ログイン成功
            Redirect("/lists").withNewSession.withSession(("userId" -> user.userId.toString))
          } else {
            Ok(views.html.signinError("パスワードが違います"))
          }
        case None => Ok(views.html.signinError(s"${userName} というユーザーは存在しません"))
      }
    }).getOrElse[Result](Redirect("/"))
  }

  /***ユーザー情報編集・退会***/
  def settings = Action { request =>
    (for {
      userId <- request.session.get("userId")
    } yield {
      users.findByID(userId.toInt) match {
        case Some(user) =>
          if (!user.isActive) {
            Ok(views.html.signinError("このユーザーは退会済みです"))
          } else {
            Ok(views.html.settings(0)(user)(request))
              .withSession(
                request.session + ("userId" -> userId.toString) + ("userName" -> user.userName) + ("password" -> user.password)
              )
          }
        case None => NotFound(s"No entry for id=${userId}")
      }
    }).getOrElse[Result](Redirect("/"))
  }

  def settingsConfirm = Action { request =>
    (for {
      param    <- request.body.asFormUrlEncoded
      userId   <- request.session.get("userId")
      userName <- param.get("userName").flatMap(_.headOption)
      password <- param.get("password").flatMap(_.headOption)
    } yield {
      users.findByName(userName) match {
        case Some(user) =>
          if (user.userId != userId.toInt) { //他のユーザーと名前が同じではないか
            Ok(views.html.settings(1)(user)(request))
              .withSession(request.session)
          } else {
            val user = User(userName, password, true)
            Ok(views.html.settingsConfirm(user)(request))
              .withSession(request.session + ("userName" -> userName) + ("password" -> password))
          }
        case None =>
          val user = User(userName, password, true)
          Ok(views.html.settingsConfirm(user)(request))
            .withSession(request.session + ("userName" -> userName) + ("password" -> password))
      }
    }).getOrElse[Result](Redirect("/"))
  }

  def settingsComplete = Action { request =>
    (for {
      userId   <- request.session.get("userId")
      userName <- request.session.get("userName")
      password <- request.session.get("password")
      user     <- users.findByID(userId.toInt)
    } yield {
      users.save(new User(userId.toInt, userName, utility.Digest.apply(password), user.isActive, user.createdAt))
      Redirect("/").withSession("userId" -> user.userId.toString) //親リストへ
    }).getOrElse[Result](Redirect("/"))
  }

  def deactivate = Action { request =>
    (for {
      userId <- request.session.get("userId")
    } yield {
      users.findByID(userId.toInt) match {
        case Some(e) =>
          users.save(new User(userId.toInt, e.userName, e.password, false, e.createdAt))
          Redirect("/").withNewSession
        case None => Ok(views.html.signinError(s"ユーザーIDが${userId}のユーザーは存在しません"))
      }
    }).getOrElse[Result](Redirect("/"))
  }
}
