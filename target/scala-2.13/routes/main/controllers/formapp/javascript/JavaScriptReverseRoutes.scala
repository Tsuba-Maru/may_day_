// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tsubasa/IdeaProjects/may_day_/conf/routes
// @DATE:Tue Dec 17 11:48:45 JST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:18
package controllers.formapp.javascript {

  // @LINE:18
  class ReverseFormappController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def registerMessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.formapp.FormappController.registerMessage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "formapp/register/message"})
        }
      """
    )
  
    // @LINE:20
    def startRegistration: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.formapp.FormappController.startRegistration",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "formapp/register"})
        }
      """
    )
  
    // @LINE:24
    def confirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.formapp.FormappController.confirm",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "formapp/register/confirm"})
        }
      """
    )
  
    // @LINE:18
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.formapp.FormappController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "formapp/messages"})
        }
      """
    )
  
    // @LINE:19
    def entry: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.formapp.FormappController.entry",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "formapp/messages/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:21
    def registerName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.formapp.FormappController.registerName",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "formapp/register/name"})
        }
      """
    )
  
    // @LINE:22
    def registerGender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.formapp.FormappController.registerGender",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "formapp/register/gender"})
        }
      """
    )
  
  }


}
