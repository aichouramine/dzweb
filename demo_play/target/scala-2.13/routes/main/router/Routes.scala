// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ADMIN/git/dzweb/demo_play/conf/routes
// @DATE:Thu Aug 01 14:13:53 CEST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_3: controllers.HomeController,
  // @LINE:10
  JSONController_0: controllers.JSONController,
  // @LINE:17
  StudentController_1: controllers.StudentController,
  // @LINE:26
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_3: controllers.HomeController,
    // @LINE:10
    JSONController_0: controllers.JSONController,
    // @LINE:17
    StudentController_1: controllers.StudentController,
    // @LINE:26
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_3, JSONController_0, StudentController_1, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, JSONController_0, StudentController_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """map""", """controllers.JSONController.usingMap"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """catch""", """controllers.JSONController.catchObj(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """return""", """controllers.JSONController.returnObj"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pathStudents""", """controllers.StudentController.listStudents()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pathStudents/""" + "$" + """id<[^/]+>""", """controllers.StudentController.retrieve(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pathStudents""", """controllers.StudentController.create(request:Request)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pathStudents""", """controllers.StudentController.update(request:Request)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pathStudents/""" + "$" + """id<[^/]+>""", """controllers.StudentController.delete(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_JSONController_usingMap1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("map")))
  )
  private[this] lazy val controllers_JSONController_usingMap1_invoker = createInvoker(
    JSONController_0.usingMap,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JSONController",
      "usingMap",
      Nil,
      "GET",
      this.prefix + """map""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_JSONController_catchObj2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("catch")))
  )
  private[this] lazy val controllers_JSONController_catchObj2_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      JSONController_0.catchObj(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JSONController",
      "catchObj",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """catch""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_JSONController_returnObj3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("return")))
  )
  private[this] lazy val controllers_JSONController_returnObj3_invoker = createInvoker(
    JSONController_0.returnObj,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JSONController",
      "returnObj",
      Nil,
      "GET",
      this.prefix + """return""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_StudentController_listStudents4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pathStudents")))
  )
  private[this] lazy val controllers_StudentController_listStudents4_invoker = createInvoker(
    StudentController_1.listStudents(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentController",
      "listStudents",
      Nil,
      "GET",
      this.prefix + """pathStudents""",
      """ Student REST API""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_StudentController_retrieve5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pathStudents/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StudentController_retrieve5_invoker = createInvoker(
    StudentController_1.retrieve(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentController",
      "retrieve",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """pathStudents/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_StudentController_create6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pathStudents")))
  )
  private[this] lazy val controllers_StudentController_create6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      StudentController_1.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """pathStudents""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_StudentController_update7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pathStudents")))
  )
  private[this] lazy val controllers_StudentController_update7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      StudentController_1.update(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentController",
      "update",
      Seq(classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """pathStudents""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_StudentController_delete8_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pathStudents/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StudentController_delete8_invoker = createInvoker(
    StudentController_1.delete(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentController",
      "delete",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """pathStudents/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Assets_versioned9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned9_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_3.index)
      }
  
    // @LINE:10
    case controllers_JSONController_usingMap1_route(params@_) =>
      call { 
        controllers_JSONController_usingMap1_invoker.call(JSONController_0.usingMap)
      }
  
    // @LINE:12
    case controllers_JSONController_catchObj2_route(params@_) =>
      call { 
        controllers_JSONController_catchObj2_invoker.call(
          req => JSONController_0.catchObj(req))
      }
  
    // @LINE:13
    case controllers_JSONController_returnObj3_route(params@_) =>
      call { 
        controllers_JSONController_returnObj3_invoker.call(JSONController_0.returnObj)
      }
  
    // @LINE:17
    case controllers_StudentController_listStudents4_route(params@_) =>
      call { 
        controllers_StudentController_listStudents4_invoker.call(StudentController_1.listStudents())
      }
  
    // @LINE:18
    case controllers_StudentController_retrieve5_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_StudentController_retrieve5_invoker.call(StudentController_1.retrieve(id))
      }
  
    // @LINE:19
    case controllers_StudentController_create6_route(params@_) =>
      call { 
        controllers_StudentController_create6_invoker.call(
          req => StudentController_1.create(req))
      }
  
    // @LINE:20
    case controllers_StudentController_update7_route(params@_) =>
      call { 
        controllers_StudentController_update7_invoker.call(
          req => StudentController_1.update(req))
      }
  
    // @LINE:21
    case controllers_StudentController_delete8_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_StudentController_delete8_invoker.call(StudentController_1.delete(id))
      }
  
    // @LINE:26
    case controllers_Assets_versioned9_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned9_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
