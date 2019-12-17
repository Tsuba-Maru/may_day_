// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tsubasa/IdeaProjects/may_day_/conf/routes
// @DATE:Tue Dec 17 11:48:45 JST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:18
package controllers.formapp {

  // @LINE:18
  class ReverseFormappController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def registerMessage(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "formapp/register/message")
    }
  
    // @LINE:20
    def startRegistration(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "formapp/register")
    }
  
    // @LINE:24
    def confirm(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "formapp/register/confirm")
    }
  
    // @LINE:18
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "formapp/messages")
    }
  
    // @LINE:19
    def entry(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "formapp/messages/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:21
    def registerName(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "formapp/register/name")
    }
  
    // @LINE:22
    def registerGender(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "formapp/register/gender")
    }
  
  }


}
