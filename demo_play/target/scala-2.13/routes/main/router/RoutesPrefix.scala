// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ADMIN/Documents/NetBeansProjects/PLAY_PROJECTS/demo_play/conf/routes
// @DATE:Wed Jul 31 17:13:24 CEST 2019


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
