// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tsubasa/may_day_/conf/routes
// @DATE:Mon Jan 27 16:52:02 JST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  MotherListController_0: controllers.MotherListController,
  // @LINE:12
  TaskController_3: controllers.TaskController,
  // @LINE:24
  UserController_1: controllers.UserController,
  // @LINE:37
  Default_4: controllers.Default,
  // @LINE:38
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    MotherListController_0: controllers.MotherListController,
    // @LINE:12
    TaskController_3: controllers.TaskController,
    // @LINE:24
    UserController_1: controllers.UserController,
    // @LINE:37
    Default_4: controllers.Default,
    // @LINE:38
    Assets_2: controllers.Assets
  ) = this(errorHandler, MotherListController_0, TaskController_3, UserController_1, Default_4, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, MotherListController_0, TaskController_3, UserController_1, Default_4, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lists""", """controllers.MotherListController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lists/create""", """controllers.MotherListController.listRegistration"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lists/create""", """controllers.MotherListController.register"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lists/""" + "$" + """listId<[^/]+>/delete""", """controllers.MotherListController.delete(listId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lists/""" + "$" + """listId<[^/]+>/edit""", """controllers.MotherListController.edit(listId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lists/""" + "$" + """listId<[^/]+>/share""", """controllers.MotherListController.share(listId:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lists/""" + "$" + """listId<[^/]+>/share""", """controllers.MotherListController.confirmShare(listId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lists/""" + "$" + """listId<[^/]+>""", """controllers.TaskController.list(listId:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lists/""" + "$" + """listId<[^/]+>""", """controllers.TaskController.extract(listId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lists/""" + "$" + """listId<[^/]+>/sorted/""" + "$" + """sortItem<[^/]+>""", """controllers.TaskController.sort(listId:Int, sortItem:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lists/""" + "$" + """listId<[^/]+>/add""", """controllers.TaskController.register(listId:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lists/""" + "$" + """listId<[^/]+>/add""", """controllers.TaskController.confirm(listId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lists/""" + "$" + """listId<[^/]+>/""" + "$" + """taskId<[^/]+>/comp""", """controllers.TaskController.comp(listId:Int, taskId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lists/""" + "$" + """listId<[^/]+>/""" + "$" + """taskId<[^/]+>/edit""", """controllers.TaskController.edit(listId:Int, taskId:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lists/""" + "$" + """listId<[^/]+>/""" + "$" + """taskId<[^/]+>/edit""", """controllers.TaskController.update(listId:Int, taskId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lists/""" + "$" + """listId<[^/]+>/""" + "$" + """taskId<[^/]+>/delete""", """controllers.TaskController.delete(listId:Int, taskId:Int)"""),
    ("""GET""", this.prefix, """controllers.UserController.index"""),
    ("""POST""", this.prefix, """controllers.UserController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.UserController.signup"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup/confirm""", """controllers.UserController.signupConfirm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup/complete""", """controllers.UserController.signupComplete"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.UserController.signin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings""", """controllers.UserController.settings"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deactivate""", """controllers.UserController.deactivate"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/confirm""", """controllers.UserController.settingsConfirm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/complete""", """controllers.UserController.settingsComplete"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """robot.txt""", """controllers.Default.notFound"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """favicon.ico""", """controllers.Assets.at(path:String = "/public/images", file:String = "favicon.png")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_MotherListController_list0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lists")))
  )
  private[this] lazy val controllers_MotherListController_list0_invoker = createInvoker(
    MotherListController_0.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MotherListController",
      "list",
      Nil,
      "GET",
      this.prefix + """lists""",
      """ MotherList""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_MotherListController_listRegistration1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lists/create")))
  )
  private[this] lazy val controllers_MotherListController_listRegistration1_invoker = createInvoker(
    MotherListController_0.listRegistration,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MotherListController",
      "listRegistration",
      Nil,
      "GET",
      this.prefix + """lists/create""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_MotherListController_register2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lists/create")))
  )
  private[this] lazy val controllers_MotherListController_register2_invoker = createInvoker(
    MotherListController_0.register,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MotherListController",
      "register",
      Nil,
      "POST",
      this.prefix + """lists/create""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_MotherListController_delete3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lists/"), DynamicPart("listId", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_MotherListController_delete3_invoker = createInvoker(
    MotherListController_0.delete(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MotherListController",
      "delete",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """lists/""" + "$" + """listId<[^/]+>/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_MotherListController_edit4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lists/"), DynamicPart("listId", """[^/]+""",true), StaticPart("/edit")))
  )
  private[this] lazy val controllers_MotherListController_edit4_invoker = createInvoker(
    MotherListController_0.edit(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MotherListController",
      "edit",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """lists/""" + "$" + """listId<[^/]+>/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_MotherListController_share5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lists/"), DynamicPart("listId", """[^/]+""",true), StaticPart("/share")))
  )
  private[this] lazy val controllers_MotherListController_share5_invoker = createInvoker(
    MotherListController_0.share(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MotherListController",
      "share",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """lists/""" + "$" + """listId<[^/]+>/share""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_MotherListController_confirmShare6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lists/"), DynamicPart("listId", """[^/]+""",true), StaticPart("/share")))
  )
  private[this] lazy val controllers_MotherListController_confirmShare6_invoker = createInvoker(
    MotherListController_0.confirmShare(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MotherListController",
      "confirmShare",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """lists/""" + "$" + """listId<[^/]+>/share""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_TaskController_list7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lists/"), DynamicPart("listId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TaskController_list7_invoker = createInvoker(
    TaskController_3.list(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "list",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """lists/""" + "$" + """listId<[^/]+>""",
      """ Task""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_TaskController_extract8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lists/"), DynamicPart("listId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TaskController_extract8_invoker = createInvoker(
    TaskController_3.extract(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "extract",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """lists/""" + "$" + """listId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_TaskController_sort9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lists/"), DynamicPart("listId", """[^/]+""",true), StaticPart("/sorted/"), DynamicPart("sortItem", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TaskController_sort9_invoker = createInvoker(
    TaskController_3.sort(fakeValue[Int], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "sort",
      Seq(classOf[Int], classOf[String]),
      "GET",
      this.prefix + """lists/""" + "$" + """listId<[^/]+>/sorted/""" + "$" + """sortItem<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_TaskController_register10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lists/"), DynamicPart("listId", """[^/]+""",true), StaticPart("/add")))
  )
  private[this] lazy val controllers_TaskController_register10_invoker = createInvoker(
    TaskController_3.register(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "register",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """lists/""" + "$" + """listId<[^/]+>/add""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_TaskController_confirm11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lists/"), DynamicPart("listId", """[^/]+""",true), StaticPart("/add")))
  )
  private[this] lazy val controllers_TaskController_confirm11_invoker = createInvoker(
    TaskController_3.confirm(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "confirm",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """lists/""" + "$" + """listId<[^/]+>/add""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_TaskController_comp12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lists/"), DynamicPart("listId", """[^/]+""",true), StaticPart("/"), DynamicPart("taskId", """[^/]+""",true), StaticPart("/comp")))
  )
  private[this] lazy val controllers_TaskController_comp12_invoker = createInvoker(
    TaskController_3.comp(fakeValue[Int], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "comp",
      Seq(classOf[Int], classOf[Int]),
      "GET",
      this.prefix + """lists/""" + "$" + """listId<[^/]+>/""" + "$" + """taskId<[^/]+>/comp""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_TaskController_edit13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lists/"), DynamicPart("listId", """[^/]+""",true), StaticPart("/"), DynamicPart("taskId", """[^/]+""",true), StaticPart("/edit")))
  )
  private[this] lazy val controllers_TaskController_edit13_invoker = createInvoker(
    TaskController_3.edit(fakeValue[Int], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "edit",
      Seq(classOf[Int], classOf[Int]),
      "GET",
      this.prefix + """lists/""" + "$" + """listId<[^/]+>/""" + "$" + """taskId<[^/]+>/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_TaskController_update14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lists/"), DynamicPart("listId", """[^/]+""",true), StaticPart("/"), DynamicPart("taskId", """[^/]+""",true), StaticPart("/edit")))
  )
  private[this] lazy val controllers_TaskController_update14_invoker = createInvoker(
    TaskController_3.update(fakeValue[Int], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "update",
      Seq(classOf[Int], classOf[Int]),
      "POST",
      this.prefix + """lists/""" + "$" + """listId<[^/]+>/""" + "$" + """taskId<[^/]+>/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_TaskController_delete15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lists/"), DynamicPart("listId", """[^/]+""",true), StaticPart("/"), DynamicPart("taskId", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_TaskController_delete15_invoker = createInvoker(
    TaskController_3.delete(fakeValue[Int], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "delete",
      Seq(classOf[Int], classOf[Int]),
      "GET",
      this.prefix + """lists/""" + "$" + """listId<[^/]+>/""" + "$" + """taskId<[^/]+>/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_UserController_index16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_UserController_index16_invoker = createInvoker(
    UserController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ User""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_UserController_index17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_UserController_index17_invoker = createInvoker(
    UserController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "index",
      Nil,
      "POST",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_UserController_signup18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_UserController_signup18_invoker = createInvoker(
    UserController_1.signup,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "signup",
      Nil,
      "GET",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_UserController_signupConfirm19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup/confirm")))
  )
  private[this] lazy val controllers_UserController_signupConfirm19_invoker = createInvoker(
    UserController_1.signupConfirm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "signupConfirm",
      Nil,
      "POST",
      this.prefix + """signup/confirm""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_UserController_signupComplete20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup/complete")))
  )
  private[this] lazy val controllers_UserController_signupComplete20_invoker = createInvoker(
    UserController_1.signupComplete,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "signupComplete",
      Nil,
      "GET",
      this.prefix + """signup/complete""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_UserController_signin21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_UserController_signin21_invoker = createInvoker(
    UserController_1.signin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "signin",
      Nil,
      "POST",
      this.prefix + """signin""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_UserController_settings22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings")))
  )
  private[this] lazy val controllers_UserController_settings22_invoker = createInvoker(
    UserController_1.settings,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "settings",
      Nil,
      "GET",
      this.prefix + """settings""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_UserController_deactivate23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deactivate")))
  )
  private[this] lazy val controllers_UserController_deactivate23_invoker = createInvoker(
    UserController_1.deactivate,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "deactivate",
      Nil,
      "GET",
      this.prefix + """deactivate""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_UserController_settingsConfirm24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/confirm")))
  )
  private[this] lazy val controllers_UserController_settingsConfirm24_invoker = createInvoker(
    UserController_1.settingsConfirm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "settingsConfirm",
      Nil,
      "POST",
      this.prefix + """settings/confirm""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_UserController_settingsComplete25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/complete")))
  )
  private[this] lazy val controllers_UserController_settingsComplete25_invoker = createInvoker(
    UserController_1.settingsComplete,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "settingsComplete",
      Nil,
      "POST",
      this.prefix + """settings/complete""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Default_notFound26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("robot.txt")))
  )
  private[this] lazy val controllers_Default_notFound26_invoker = createInvoker(
    Default_4.notFound,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Default",
      "notFound",
      Nil,
      "GET",
      this.prefix + """robot.txt""",
      """ Resources""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Assets_at27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("favicon.ico")))
  )
  private[this] lazy val controllers_Assets_at27_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """favicon.ico""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Assets_versioned28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned28_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_MotherListController_list0_route(params@_) =>
      call { 
        controllers_MotherListController_list0_invoker.call(MotherListController_0.list)
      }
  
    // @LINE:3
    case controllers_MotherListController_listRegistration1_route(params@_) =>
      call { 
        controllers_MotherListController_listRegistration1_invoker.call(MotherListController_0.listRegistration)
      }
  
    // @LINE:4
    case controllers_MotherListController_register2_route(params@_) =>
      call { 
        controllers_MotherListController_register2_invoker.call(MotherListController_0.register)
      }
  
    // @LINE:5
    case controllers_MotherListController_delete3_route(params@_) =>
      call(params.fromPath[Int]("listId", None)) { (listId) =>
        controllers_MotherListController_delete3_invoker.call(MotherListController_0.delete(listId))
      }
  
    // @LINE:6
    case controllers_MotherListController_edit4_route(params@_) =>
      call(params.fromPath[Int]("listId", None)) { (listId) =>
        controllers_MotherListController_edit4_invoker.call(MotherListController_0.edit(listId))
      }
  
    // @LINE:7
    case controllers_MotherListController_share5_route(params@_) =>
      call(params.fromPath[Int]("listId", None)) { (listId) =>
        controllers_MotherListController_share5_invoker.call(MotherListController_0.share(listId))
      }
  
    // @LINE:8
    case controllers_MotherListController_confirmShare6_route(params@_) =>
      call(params.fromPath[Int]("listId", None)) { (listId) =>
        controllers_MotherListController_confirmShare6_invoker.call(MotherListController_0.confirmShare(listId))
      }
  
    // @LINE:12
    case controllers_TaskController_list7_route(params@_) =>
      call(params.fromPath[Int]("listId", None)) { (listId) =>
        controllers_TaskController_list7_invoker.call(TaskController_3.list(listId))
      }
  
    // @LINE:13
    case controllers_TaskController_extract8_route(params@_) =>
      call(params.fromPath[Int]("listId", None)) { (listId) =>
        controllers_TaskController_extract8_invoker.call(TaskController_3.extract(listId))
      }
  
    // @LINE:14
    case controllers_TaskController_sort9_route(params@_) =>
      call(params.fromPath[Int]("listId", None), params.fromPath[String]("sortItem", None)) { (listId, sortItem) =>
        controllers_TaskController_sort9_invoker.call(TaskController_3.sort(listId, sortItem))
      }
  
    // @LINE:15
    case controllers_TaskController_register10_route(params@_) =>
      call(params.fromPath[Int]("listId", None)) { (listId) =>
        controllers_TaskController_register10_invoker.call(TaskController_3.register(listId))
      }
  
    // @LINE:16
    case controllers_TaskController_confirm11_route(params@_) =>
      call(params.fromPath[Int]("listId", None)) { (listId) =>
        controllers_TaskController_confirm11_invoker.call(TaskController_3.confirm(listId))
      }
  
    // @LINE:17
    case controllers_TaskController_comp12_route(params@_) =>
      call(params.fromPath[Int]("listId", None), params.fromPath[Int]("taskId", None)) { (listId, taskId) =>
        controllers_TaskController_comp12_invoker.call(TaskController_3.comp(listId, taskId))
      }
  
    // @LINE:18
    case controllers_TaskController_edit13_route(params@_) =>
      call(params.fromPath[Int]("listId", None), params.fromPath[Int]("taskId", None)) { (listId, taskId) =>
        controllers_TaskController_edit13_invoker.call(TaskController_3.edit(listId, taskId))
      }
  
    // @LINE:19
    case controllers_TaskController_update14_route(params@_) =>
      call(params.fromPath[Int]("listId", None), params.fromPath[Int]("taskId", None)) { (listId, taskId) =>
        controllers_TaskController_update14_invoker.call(TaskController_3.update(listId, taskId))
      }
  
    // @LINE:20
    case controllers_TaskController_delete15_route(params@_) =>
      call(params.fromPath[Int]("listId", None), params.fromPath[Int]("taskId", None)) { (listId, taskId) =>
        controllers_TaskController_delete15_invoker.call(TaskController_3.delete(listId, taskId))
      }
  
    // @LINE:24
    case controllers_UserController_index16_route(params@_) =>
      call { 
        controllers_UserController_index16_invoker.call(UserController_1.index)
      }
  
    // @LINE:25
    case controllers_UserController_index17_route(params@_) =>
      call { 
        controllers_UserController_index17_invoker.call(UserController_1.index)
      }
  
    // @LINE:26
    case controllers_UserController_signup18_route(params@_) =>
      call { 
        controllers_UserController_signup18_invoker.call(UserController_1.signup)
      }
  
    // @LINE:27
    case controllers_UserController_signupConfirm19_route(params@_) =>
      call { 
        controllers_UserController_signupConfirm19_invoker.call(UserController_1.signupConfirm)
      }
  
    // @LINE:28
    case controllers_UserController_signupComplete20_route(params@_) =>
      call { 
        controllers_UserController_signupComplete20_invoker.call(UserController_1.signupComplete)
      }
  
    // @LINE:29
    case controllers_UserController_signin21_route(params@_) =>
      call { 
        controllers_UserController_signin21_invoker.call(UserController_1.signin)
      }
  
    // @LINE:30
    case controllers_UserController_settings22_route(params@_) =>
      call { 
        controllers_UserController_settings22_invoker.call(UserController_1.settings)
      }
  
    // @LINE:31
    case controllers_UserController_deactivate23_route(params@_) =>
      call { 
        controllers_UserController_deactivate23_invoker.call(UserController_1.deactivate)
      }
  
    // @LINE:32
    case controllers_UserController_settingsConfirm24_route(params@_) =>
      call { 
        controllers_UserController_settingsConfirm24_invoker.call(UserController_1.settingsConfirm)
      }
  
    // @LINE:33
    case controllers_UserController_settingsComplete25_route(params@_) =>
      call { 
        controllers_UserController_settingsComplete25_invoker.call(UserController_1.settingsComplete)
      }
  
    // @LINE:37
    case controllers_Default_notFound26_route(params@_) =>
      call { 
        controllers_Default_notFound26_invoker.call(Default_4.notFound)
      }
  
    // @LINE:38
    case controllers_Assets_at27_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("favicon.png"))) { (path, file) =>
        controllers_Assets_at27_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:39
    case controllers_Assets_versioned28_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned28_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
