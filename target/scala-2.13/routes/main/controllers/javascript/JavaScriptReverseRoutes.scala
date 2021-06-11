// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tsubasa/may_day_/conf/routes
// @DATE:Mon Jan 27 16:52:02 JST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers.javascript {

  // @LINE:38
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "favicon.ico"})
        }
      """
    )
  
    // @LINE:39
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:37
  class ReverseDefault(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def notFound: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Default.notFound",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "robot.txt"})
        }
      """
    )
  
  }

  // @LINE:2
  class ReverseMotherListController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MotherListController.delete",
      """
        function(listId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lists/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("listId", listId0)) + "/delete"})
        }
      """
    )
  
    // @LINE:8
    def confirmShare: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MotherListController.confirmShare",
      """
        function(listId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "lists/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("listId", listId0)) + "/share"})
        }
      """
    )
  
    // @LINE:7
    def share: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MotherListController.share",
      """
        function(listId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lists/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("listId", listId0)) + "/share"})
        }
      """
    )
  
    // @LINE:4
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MotherListController.register",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "lists/create"})
        }
      """
    )
  
    // @LINE:2
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MotherListController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lists"})
        }
      """
    )
  
    // @LINE:3
    def listRegistration: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MotherListController.listRegistration",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lists/create"})
        }
      """
    )
  
    // @LINE:6
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MotherListController.edit",
      """
        function(listId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lists/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("listId", listId0)) + "/edit"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def signupConfirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.signupConfirm",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup/confirm"})
        }
      """
    )
  
    // @LINE:28
    def signupComplete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.signupComplete",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup/complete"})
        }
      """
    )
  
    // @LINE:32
    def settingsConfirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.settingsConfirm",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/confirm"})
        }
      """
    )
  
    // @LINE:26
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:31
    def deactivate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.deactivate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deactivate"})
        }
      """
    )
  
    // @LINE:30
    def settings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.settings",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings"})
        }
      """
    )
  
    // @LINE:29
    def signin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.signin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
        }
      """
    )
  
    // @LINE:33
    def settingsComplete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.settingsComplete",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/complete"})
        }
      """
    )
  
    // @LINE:24
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.index",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseTaskController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.register",
      """
        function(listId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lists/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("listId", listId0)) + "/add"})
        }
      """
    )
  
    // @LINE:16
    def confirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.confirm",
      """
        function(listId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "lists/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("listId", listId0)) + "/add"})
        }
      """
    )
  
    // @LINE:12
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.list",
      """
        function(listId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lists/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("listId", listId0))})
        }
      """
    )
  
    // @LINE:17
    def comp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.comp",
      """
        function(listId0,taskId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lists/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("listId", listId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("taskId", taskId1)) + "/comp"})
        }
      """
    )
  
    // @LINE:19
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.update",
      """
        function(listId0,taskId1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "lists/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("listId", listId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("taskId", taskId1)) + "/edit"})
        }
      """
    )
  
    // @LINE:13
    def extract: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.extract",
      """
        function(listId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "lists/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("listId", listId0))})
        }
      """
    )
  
    // @LINE:14
    def sort: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.sort",
      """
        function(listId0,sortItem1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lists/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("listId", listId0)) + "/sorted/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("sortItem", sortItem1))})
        }
      """
    )
  
    // @LINE:20
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.delete",
      """
        function(listId0,taskId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lists/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("listId", listId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("taskId", taskId1)) + "/delete"})
        }
      """
    )
  
    // @LINE:18
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.edit",
      """
        function(listId0,taskId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lists/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("listId", listId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("taskId", taskId1)) + "/edit"})
        }
      """
    )
  
  }


}
