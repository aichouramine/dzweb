// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ADMIN/git/dzweb/demo_play/conf/routes
// @DATE:Thu Aug 01 14:51:57 CEST 2019


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
