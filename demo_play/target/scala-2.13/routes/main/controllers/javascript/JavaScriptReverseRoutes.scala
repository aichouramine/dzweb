// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ADMIN/git/dzweb/demo_play/conf/routes
// @DATE:Thu Aug 01 14:51:57 CEST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:10
  class ReverseJSONController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def usingMap: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JSONController.usingMap",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "map"})
        }
      """
    )
  
    // @LINE:12
    def catchObj: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JSONController.catchObj",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "catch"})
        }
      """
    )
  
    // @LINE:13
    def returnObj: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JSONController.returnObj",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "return"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseStudentController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudentController.delete",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "pathStudents/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:17
    def listStudents: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudentController.listStudents",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pathStudents"})
        }
      """
    )
  
    // @LINE:20
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudentController.update",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "pathStudents"})
        }
      """
    )
  
    // @LINE:18
    def retrieve: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudentController.retrieve",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "pathStudents/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:19
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudentController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "pathStudents"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def hello: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.hello",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hello/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
