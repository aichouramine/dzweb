// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ADMIN/git/dzweb/demo_play/conf/routes
// @DATE:Thu Aug 01 14:51:57 CEST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:10
  class ReverseJSONController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def usingMap(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "map")
    }
  
    // @LINE:12
    def catchObj(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "catch")
    }
  
    // @LINE:13
    def returnObj(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "return")
    }
  
  }

  // @LINE:17
  class ReverseStudentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def delete(id:Int): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "pathStudents/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:17
    def listStudents(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pathStudents")
    }
  
    // @LINE:20
    def update(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "pathStudents")
    }
  
    // @LINE:18
    def retrieve(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "pathStudents/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:19
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "pathStudents")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def hello(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hello/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
  }

  // @LINE:26
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
