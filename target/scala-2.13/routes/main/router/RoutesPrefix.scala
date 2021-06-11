// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tsubasa/may_day_/conf/routes
// @DATE:Mon Jan 27 16:52:02 JST 2020


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
