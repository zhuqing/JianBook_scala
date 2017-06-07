
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/zhuleqi/GitHub/JianBook_scala/conf/routes
// @DATE:Wed Jun 07 22:12:01 CST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_2: controllers.AsyncController,
  // @LINE:12
  UserController_3: controllers.UserController,
  // @LINE:19
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_2: controllers.AsyncController,
    // @LINE:12
    UserController_3: controllers.UserController,
    // @LINE:19
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_1, CountController_0, AsyncController_2, UserController_3, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, AsyncController_2, UserController_3, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/insert/""" + "$" + """name<[^/]+>/""" + "$" + """password<[^/]+>""", """controllers.UserController.insert(name:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/find/""" + "$" + """id<[^/]+>""", """controllers.UserController.find(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/findAll/""" + "$" + """page<[^/]+>/""" + "$" + """pageSize<[^/]+>""", """controllers.UserController.findAll(page:Int, pageSize:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/update/""" + "$" + """id<[^/]+>/""" + "$" + """email<[^/]+>""", """controllers.UserController.update(id:String, email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/remove/""" + "$" + """id<[^/]+>""", """controllers.UserController.remove(id:String)"""),
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
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserController_insert3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/insert/"), DynamicPart("name", """[^/]+""",true), StaticPart("/"), DynamicPart("password", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_insert3_invoker = createInvoker(
    UserController_3.insert(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "insert",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """user/insert/""" + "$" + """name<[^/]+>/""" + "$" + """password<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_find4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/find/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_find4_invoker = createInvoker(
    UserController_3.find(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "find",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """user/find/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UserController_findAll5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/findAll/"), DynamicPart("page", """[^/]+""",true), StaticPart("/"), DynamicPart("pageSize", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_findAll5_invoker = createInvoker(
    UserController_3.findAll(fakeValue[Int], fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "findAll",
      Seq(classOf[Int], classOf[Int]),
      "GET",
      """""",
      this.prefix + """user/findAll/""" + "$" + """page<[^/]+>/""" + "$" + """pageSize<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UserController_update6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/update/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_update6_invoker = createInvoker(
    UserController_3.update(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "update",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """user/update/""" + "$" + """id<[^/]+>/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_remove7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/remove/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_remove7_invoker = createInvoker(
    UserController_3.remove(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "remove",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """user/remove/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:12
    case controllers_UserController_insert3_route(params) =>
      call(params.fromPath[String]("name", None), params.fromPath[String]("password", None)) { (name, password) =>
        controllers_UserController_insert3_invoker.call(UserController_3.insert(name, password))
      }
  
    // @LINE:13
    case controllers_UserController_find4_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_find4_invoker.call(UserController_3.find(id))
      }
  
    // @LINE:14
    case controllers_UserController_findAll5_route(params) =>
      call(params.fromPath[Int]("page", None), params.fromPath[Int]("pageSize", None)) { (page, pageSize) =>
        controllers_UserController_findAll5_invoker.call(UserController_3.findAll(page, pageSize))
      }
  
    // @LINE:15
    case controllers_UserController_update6_route(params) =>
      call(params.fromPath[String]("id", None), params.fromPath[String]("email", None)) { (id, email) =>
        controllers_UserController_update6_invoker.call(UserController_3.update(id, email))
      }
  
    // @LINE:16
    case controllers_UserController_remove7_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_remove7_invoker.call(UserController_3.remove(id))
      }
  
    // @LINE:19
    case controllers_Assets_versioned8_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
