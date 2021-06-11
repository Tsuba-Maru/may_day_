// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tsubasa/may_day_/conf/routes
// @DATE:Mon Jan 27 16:52:02 JST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers {

  // @LINE:38
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def at(): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"), ("file", "favicon.png"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "favicon.ico")
    }
  
    // @LINE:39
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:37
  class ReverseDefault(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def notFound(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "robot.txt")
    }
  
  }

  // @LINE:2
  class ReverseMotherListController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def delete(listId:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "lists/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("listId", listId)) + "/delete")
    }
  
    // @LINE:8
    def confirmShare(listId:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "lists/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("listId", listId)) + "/share")
    }
  
    // @LINE:7
    def share(listId:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "lists/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("listId", listId)) + "/share")
    }
  
    // @LINE:4
    def register(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "lists/create")
    }
  
    // @LINE:2
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "lists")
    }
  
    // @LINE:3
    def listRegistration(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "lists/create")
    }
  
    // @LINE:6
    def edit(listId:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "lists/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("listId", listId)) + "/edit")
    }
  
  }

  // @LINE:24
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def signupConfirm(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signup/confirm")
    }
  
    // @LINE:28
    def signupComplete(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup/complete")
    }
  
    // @LINE:32
    def settingsConfirm(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "settings/confirm")
    }
  
    // @LINE:26
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:31
    def deactivate(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deactivate")
    }
  
    // @LINE:30
    def settings(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "settings")
    }
  
    // @LINE:29
    def signin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signin")
    }
  
    // @LINE:33
    def settingsComplete(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "settings/complete")
    }
  
    // @LINE:24
    def index(): Call = {
    
      () match {
      
        // @LINE:24
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
  }

  // @LINE:12
  class ReverseTaskController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def register(listId:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "lists/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("listId", listId)) + "/add")
    }
  
    // @LINE:16
    def confirm(listId:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "lists/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("listId", listId)) + "/add")
    }
  
    // @LINE:12
    def list(listId:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "lists/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("listId", listId)))
    }
  
    // @LINE:17
    def comp(listId:Int, taskId:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "lists/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("listId", listId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("taskId", taskId)) + "/comp")
    }
  
    // @LINE:19
    def update(listId:Int, taskId:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "lists/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("listId", listId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("taskId", taskId)) + "/edit")
    }
  
    // @LINE:13
    def extract(listId:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "lists/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("listId", listId)))
    }
  
    // @LINE:14
    def sort(listId:Int, sortItem:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "lists/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("listId", listId)) + "/sorted/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("sortItem", sortItem)))
    }
  
    // @LINE:20
    def delete(listId:Int, taskId:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "lists/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("listId", listId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("taskId", taskId)) + "/delete")
    }
  
    // @LINE:18
    def edit(listId:Int, taskId:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "lists/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("listId", listId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("taskId", taskId)) + "/edit")
    }
  
  }


}
