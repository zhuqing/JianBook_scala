
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/zhuleqi/GitHub/JianBook_scala/conf/routes
// @DATE:Wed Jun 07 22:12:01 CST 2017


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
