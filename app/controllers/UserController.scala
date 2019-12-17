package controllers

import javax.inject.{Inject, Singleton}

import play.api.mvc.{AbstractController, ControllerComponents, Result}
import models.{Task, Tasks}
import models.{User, Users}

/**
  * Userコントローラ
  */
@Singleton
class UserController @Inject()(tasks: Tasks)(users: Users)(cc: ControllerComponents) extends AbstractController(cc) {

  /**
    * 初期ページを表示
    */
  def index = Action { request =>
    Ok(views.html.signinForm("MOTHERへようこそ")(request)).withNewSession
  }

  /** *ユーザー登録 ***/
  def startSignup = Action { request => //ユーザー登録画面
    Ok(views.html.signupForm(0)(request)).withNewSession
  }

  def signup = Action { request => //登録可能か調べ、確認画面へ
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
          val user = User(userName, password, true)
          Ok(views.html.signupConfirm(user)(request))
            .withSession(request.session + ("userName" -> userName) + ("password" -> password))
      }
    }).getOrElse[Result](Redirect("/"))

  }

  def confirmSignup = Action { request => //登録をする
    (for {
      userName <- request.session.get("userName")
      password <- request.session.get("password")
    } yield {
      users.save(User(userName, utility.Digest.apply(password), true))
      Redirect("/").withNewSession
    }).getOrElse[Result](Redirect("/"))
  }

  /** *ログイン ***/
  def signin = Action { request =>
    (for {
      param    <- request.body.asFormUrlEncoded
      userName <- param.get("userName").flatMap(_.headOption)
      password <- param.get("password").flatMap(_.headOption)
    } yield {
      users.findByName(userName) match { //ユーザーが存在するか確認
        case Some(e) =>
          (for {
            user <- users.findByName(userName)
          } yield {
            if (!user.isActive) { //退会していないかどうか
              Ok(views.html.signinError("このユーザーは退会済みです"))
            } else {
              if (utility.Digest.apply(password) == user.password) {
                NotFound("Success")
              } else {
                Ok(views.html.signinError("パスワードが違います"))
              }
            }
          }).getOrElse[Result](Redirect("/"))
        case None => Ok(views.html.signinError(s"${userName} というユーザーは存在しません"))
      }
    }).getOrElse[Result](Redirect("/"))
  }
}
