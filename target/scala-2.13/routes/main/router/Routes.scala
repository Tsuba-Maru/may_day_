// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tsubasa/IdeaProjects/may_day_/conf/routes
// @DATE:Tue Dec 17 11:48:45 JST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  UserController_2: controllers.UserController,
  // @LINE:14
  TodoListController_1: controllers.TodoListController,
  // @LINE:18
  FormappController_0: controllers.formapp.FormappController,
  // @LINE:25
  Default_4: controllers.Default,
  // @LINE:29
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    UserController_2: controllers.UserController,
    // @LINE:14
    TodoListController_1: controllers.TodoListController,
    // @LINE:18
    FormappController_0: controllers.formapp.FormappController,
    // @LINE:25
    Default_4: controllers.Default,
    // @LINE:29
    Assets_3: controllers.Assets
  ) = this(errorHandler, UserController_2, TodoListController_1, FormappController_0, Default_4, Assets_3, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UserController_2, TodoListController_1, FormappController_0, Default_4, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.UserController.index"""),
    ("""POST""", this.prefix, """controllers.UserController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.UserController.startSignup"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup/confirm""", """controllers.UserController.signup"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup/complete""", """controllers.UserController.confirmSignup"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.UserController.signin"""),
    ("""GET""", this.prefix, """controllers.TodoListController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """formapp/messages""", """controllers.formapp.FormappController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """formapp/messages/""" + "$" + """id<[^/]+>""", """controllers.formapp.FormappController.entry(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """formapp/register""", """controllers.formapp.FormappController.startRegistration"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """formapp/register/name""", """controllers.formapp.FormappController.registerName"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """formapp/register/gender""", """controllers.formapp.FormappController.registerGender"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """formapp/register/message""", """controllers.formapp.FormappController.registerMessage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """formapp/register/confirm""", """controllers.formapp.FormappController.confirm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """formapp""", """controllers.Default.redirect(to:String = "/formapp/messages")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """robot.txt""", """controllers.Default.notFound"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """favicon.ico""", """controllers.Assets.at(path:String = "/public/images", file:String = "favicon.png")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_UserController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_UserController_index0_invoker = createInvoker(
    UserController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ User(ユーザー登録、ログイン)""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_UserController_index1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_UserController_index1_invoker = createInvoker(
    UserController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "index",
      Nil,
      "POST",
      this.prefix + """""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:5
  private[this] lazy val controllers_UserController_startSignup2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_UserController_startSignup2_invoker = createInvoker(
    UserController_2.startSignup,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "startSignup",
      Nil,
      "GET",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_UserController_signup3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup/confirm")))
  )
  private[this] lazy val controllers_UserController_signup3_invoker = createInvoker(
    UserController_2.signup,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "signup",
      Nil,
      "POST",
      this.prefix + """signup/confirm""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UserController_confirmSignup4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup/complete")))
  )
  private[this] lazy val controllers_UserController_confirmSignup4_invoker = createInvoker(
    UserController_2.confirmSignup,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "confirmSignup",
      Nil,
      "POST",
      this.prefix + """signup/complete""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UserController_signin5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_UserController_signin5_invoker = createInvoker(
    UserController_2.signin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "signin",
      Nil,
      "POST",
      this.prefix + """signin""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:14
  private[this] lazy val controllers_TodoListController_index6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_TodoListController_index6_invoker = createInvoker(
    TodoListController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoListController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ TodoList""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_formapp_FormappController_list7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("formapp/messages")))
  )
  private[this] lazy val controllers_formapp_FormappController_list7_invoker = createInvoker(
    FormappController_0.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.formapp.FormappController",
      "list",
      Nil,
      "GET",
      this.prefix + """formapp/messages""",
      """ Formapp
# Normal""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_formapp_FormappController_entry8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("formapp/messages/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_formapp_FormappController_entry8_invoker = createInvoker(
    FormappController_0.entry(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.formapp.FormappController",
      "entry",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """formapp/messages/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_formapp_FormappController_startRegistration9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("formapp/register")))
  )
  private[this] lazy val controllers_formapp_FormappController_startRegistration9_invoker = createInvoker(
    FormappController_0.startRegistration,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.formapp.FormappController",
      "startRegistration",
      Nil,
      "GET",
      this.prefix + """formapp/register""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_formapp_FormappController_registerName10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("formapp/register/name")))
  )
  private[this] lazy val controllers_formapp_FormappController_registerName10_invoker = createInvoker(
    FormappController_0.registerName,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.formapp.FormappController",
      "registerName",
      Nil,
      "POST",
      this.prefix + """formapp/register/name""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_formapp_FormappController_registerGender11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("formapp/register/gender")))
  )
  private[this] lazy val controllers_formapp_FormappController_registerGender11_invoker = createInvoker(
    FormappController_0.registerGender,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.formapp.FormappController",
      "registerGender",
      Nil,
      "POST",
      this.prefix + """formapp/register/gender""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_formapp_FormappController_registerMessage12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("formapp/register/message")))
  )
  private[this] lazy val controllers_formapp_FormappController_registerMessage12_invoker = createInvoker(
    FormappController_0.registerMessage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.formapp.FormappController",
      "registerMessage",
      Nil,
      "POST",
      this.prefix + """formapp/register/message""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_formapp_FormappController_confirm13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("formapp/register/confirm")))
  )
  private[this] lazy val controllers_formapp_FormappController_confirm13_invoker = createInvoker(
    FormappController_0.confirm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.formapp.FormappController",
      "confirm",
      Nil,
      "POST",
      this.prefix + """formapp/register/confirm""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Default_redirect14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("formapp")))
  )
  private[this] lazy val controllers_Default_redirect14_invoker = createInvoker(
    Default_4.redirect(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Default",
      "redirect",
      Seq(classOf[String]),
      "GET",
      this.prefix + """formapp""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Default_notFound15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("robot.txt")))
  )
  private[this] lazy val controllers_Default_notFound15_invoker = createInvoker(
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

  // @LINE:29
  private[this] lazy val controllers_Assets_at16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("favicon.ico")))
  )
  private[this] lazy val controllers_Assets_at16_invoker = createInvoker(
    Assets_3.at(fakeValue[String], fakeValue[String]),
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

  // @LINE:30
  private[this] lazy val controllers_Assets_versioned17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned17_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
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
    case controllers_UserController_index0_route(params@_) =>
      call { 
        controllers_UserController_index0_invoker.call(UserController_2.index)
      }
  
    // @LINE:4
    case controllers_UserController_index1_route(params@_) =>
      call { 
        controllers_UserController_index1_invoker.call(UserController_2.index)
      }
  
    // @LINE:5
    case controllers_UserController_startSignup2_route(params@_) =>
      call { 
        controllers_UserController_startSignup2_invoker.call(UserController_2.startSignup)
      }
  
    // @LINE:6
    case controllers_UserController_signup3_route(params@_) =>
      call { 
        controllers_UserController_signup3_invoker.call(UserController_2.signup)
      }
  
    // @LINE:8
    case controllers_UserController_confirmSignup4_route(params@_) =>
      call { 
        controllers_UserController_confirmSignup4_invoker.call(UserController_2.confirmSignup)
      }
  
    // @LINE:10
    case controllers_UserController_signin5_route(params@_) =>
      call { 
        controllers_UserController_signin5_invoker.call(UserController_2.signin)
      }
  
    // @LINE:14
    case controllers_TodoListController_index6_route(params@_) =>
      call { 
        controllers_TodoListController_index6_invoker.call(TodoListController_1.index)
      }
  
    // @LINE:18
    case controllers_formapp_FormappController_list7_route(params@_) =>
      call { 
        controllers_formapp_FormappController_list7_invoker.call(FormappController_0.list)
      }
  
    // @LINE:19
    case controllers_formapp_FormappController_entry8_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_formapp_FormappController_entry8_invoker.call(FormappController_0.entry(id))
      }
  
    // @LINE:20
    case controllers_formapp_FormappController_startRegistration9_route(params@_) =>
      call { 
        controllers_formapp_FormappController_startRegistration9_invoker.call(FormappController_0.startRegistration)
      }
  
    // @LINE:21
    case controllers_formapp_FormappController_registerName10_route(params@_) =>
      call { 
        controllers_formapp_FormappController_registerName10_invoker.call(FormappController_0.registerName)
      }
  
    // @LINE:22
    case controllers_formapp_FormappController_registerGender11_route(params@_) =>
      call { 
        controllers_formapp_FormappController_registerGender11_invoker.call(FormappController_0.registerGender)
      }
  
    // @LINE:23
    case controllers_formapp_FormappController_registerMessage12_route(params@_) =>
      call { 
        controllers_formapp_FormappController_registerMessage12_invoker.call(FormappController_0.registerMessage)
      }
  
    // @LINE:24
    case controllers_formapp_FormappController_confirm13_route(params@_) =>
      call { 
        controllers_formapp_FormappController_confirm13_invoker.call(FormappController_0.confirm)
      }
  
    // @LINE:25
    case controllers_Default_redirect14_route(params@_) =>
      call(Param[String]("to", Right("/formapp/messages"))) { (to) =>
        controllers_Default_redirect14_invoker.call(Default_4.redirect(to))
      }
  
    // @LINE:28
    case controllers_Default_notFound15_route(params@_) =>
      call { 
        controllers_Default_notFound15_invoker.call(Default_4.notFound)
      }
  
    // @LINE:29
    case controllers_Assets_at16_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("favicon.png"))) { (path, file) =>
        controllers_Assets_at16_invoker.call(Assets_3.at(path, file))
      }
  
    // @LINE:30
    case controllers_Assets_versioned17_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned17_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
