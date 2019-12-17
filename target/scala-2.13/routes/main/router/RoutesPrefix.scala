// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tsubasa/IdeaProjects/may_day_/conf/routes
// @DATE:Tue Dec 17 11:48:45 JST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
