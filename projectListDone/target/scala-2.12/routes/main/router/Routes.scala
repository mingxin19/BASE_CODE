
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/BASE_CODE/projectListDone/conf/routes
// @DATE:Sun Mar 17 21:19:42 GMT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:29
  LoginController_2: controllers.LoginController,
  // @LINE:34
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:29
    LoginController_2: controllers.LoginController,
    // @LINE:34
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, LoginController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, LoginController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.HomeController.profile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee""", """controllers.HomeController.employee"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.HomeController.admin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProjects""", """controllers.HomeController.addProjects"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProjectsSubmit""", """controllers.HomeController.addProjectsSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEmployee""", """controllers.HomeController.addEmployee"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEmployeeSubmit""", """controllers.HomeController.addEmployeeSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addAdmin""", """controllers.HomeController.addAdmin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addAdminSubmit""", """controllers.HomeController.addAdminSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delProjects/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteProjects(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delEmployee/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteEmployee(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delAdmin/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteAdmin(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProjects/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProjects(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateEmployee/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateEmployee(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateAdmin/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateAdmin(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
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
    HomeController_0.index(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_profile1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_HomeController_profile1_invoker = createInvoker(
    HomeController_0.profile,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profile",
      Nil,
      "GET",
      this.prefix + """profile""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_employee2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee")))
  )
  private[this] lazy val controllers_HomeController_employee2_invoker = createInvoker(
    HomeController_0.employee,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "employee",
      Nil,
      "GET",
      this.prefix + """employee""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_admin3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_HomeController_admin3_invoker = createInvoker(
    HomeController_0.admin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "admin",
      Nil,
      "GET",
      this.prefix + """admin""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_addProjects4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProjects")))
  )
  private[this] lazy val controllers_HomeController_addProjects4_invoker = createInvoker(
    HomeController_0.addProjects,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProjects",
      Nil,
      "GET",
      this.prefix + """addProjects""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_addProjectsSubmit5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProjectsSubmit")))
  )
  private[this] lazy val controllers_HomeController_addProjectsSubmit5_invoker = createInvoker(
    HomeController_0.addProjectsSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProjectsSubmit",
      Nil,
      "POST",
      this.prefix + """addProjectsSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_addEmployee6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEmployee")))
  )
  private[this] lazy val controllers_HomeController_addEmployee6_invoker = createInvoker(
    HomeController_0.addEmployee,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addEmployee",
      Nil,
      "GET",
      this.prefix + """addEmployee""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_addEmployeeSubmit7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEmployeeSubmit")))
  )
  private[this] lazy val controllers_HomeController_addEmployeeSubmit7_invoker = createInvoker(
    HomeController_0.addEmployeeSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addEmployeeSubmit",
      Nil,
      "POST",
      this.prefix + """addEmployeeSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_addAdmin8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addAdmin")))
  )
  private[this] lazy val controllers_HomeController_addAdmin8_invoker = createInvoker(
    HomeController_0.addAdmin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addAdmin",
      Nil,
      "GET",
      this.prefix + """addAdmin""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_addAdminSubmit9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addAdminSubmit")))
  )
  private[this] lazy val controllers_HomeController_addAdminSubmit9_invoker = createInvoker(
    HomeController_0.addAdminSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addAdminSubmit",
      Nil,
      "POST",
      this.prefix + """addAdminSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_deleteProjects10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delProjects/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteProjects10_invoker = createInvoker(
    HomeController_0.deleteProjects(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteProjects",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """delProjects/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_deleteEmployee11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delEmployee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteEmployee11_invoker = createInvoker(
    HomeController_0.deleteEmployee(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteEmployee",
      Seq(classOf[String]),
      "GET",
      this.prefix + """delEmployee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_deleteAdmin12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delAdmin/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteAdmin12_invoker = createInvoker(
    HomeController_0.deleteAdmin(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteAdmin",
      Seq(classOf[String]),
      "GET",
      this.prefix + """delAdmin/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_updateProjects13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProjects/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProjects13_invoker = createInvoker(
    HomeController_0.updateProjects(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProjects",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateProjects/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_updateEmployee14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateEmployee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateEmployee14_invoker = createInvoker(
    HomeController_0.updateEmployee(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateEmployee",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateEmployee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_updateAdmin15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateAdmin/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateAdmin15_invoker = createInvoker(
    HomeController_0.updateAdmin(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateAdmin",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateAdmin/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_LoginController_login16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login16_invoker = createInvoker(
    LoginController_2.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_LoginController_loginSubmit17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit17_invoker = createInvoker(
    LoginController_2.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_LoginController_logout18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout18_invoker = createInvoker(
    LoginController_2.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Assets_versioned19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned19_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
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
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_index0_invoker.call(HomeController_0.index(cat))
      }
  
    // @LINE:7
    case controllers_HomeController_profile1_route(params@_) =>
      call { 
        controllers_HomeController_profile1_invoker.call(HomeController_0.profile)
      }
  
    // @LINE:8
    case controllers_HomeController_employee2_route(params@_) =>
      call { 
        controllers_HomeController_employee2_invoker.call(HomeController_0.employee)
      }
  
    // @LINE:9
    case controllers_HomeController_admin3_route(params@_) =>
      call { 
        controllers_HomeController_admin3_invoker.call(HomeController_0.admin)
      }
  
    // @LINE:12
    case controllers_HomeController_addProjects4_route(params@_) =>
      call { 
        controllers_HomeController_addProjects4_invoker.call(HomeController_0.addProjects)
      }
  
    // @LINE:13
    case controllers_HomeController_addProjectsSubmit5_route(params@_) =>
      call { 
        controllers_HomeController_addProjectsSubmit5_invoker.call(HomeController_0.addProjectsSubmit)
      }
  
    // @LINE:14
    case controllers_HomeController_addEmployee6_route(params@_) =>
      call { 
        controllers_HomeController_addEmployee6_invoker.call(HomeController_0.addEmployee)
      }
  
    // @LINE:15
    case controllers_HomeController_addEmployeeSubmit7_route(params@_) =>
      call { 
        controllers_HomeController_addEmployeeSubmit7_invoker.call(HomeController_0.addEmployeeSubmit)
      }
  
    // @LINE:16
    case controllers_HomeController_addAdmin8_route(params@_) =>
      call { 
        controllers_HomeController_addAdmin8_invoker.call(HomeController_0.addAdmin)
      }
  
    // @LINE:17
    case controllers_HomeController_addAdminSubmit9_route(params@_) =>
      call { 
        controllers_HomeController_addAdminSubmit9_invoker.call(HomeController_0.addAdminSubmit)
      }
  
    // @LINE:20
    case controllers_HomeController_deleteProjects10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteProjects10_invoker.call(HomeController_0.deleteProjects(id))
      }
  
    // @LINE:21
    case controllers_HomeController_deleteEmployee11_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteEmployee11_invoker.call(HomeController_0.deleteEmployee(id))
      }
  
    // @LINE:22
    case controllers_HomeController_deleteAdmin12_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteAdmin12_invoker.call(HomeController_0.deleteAdmin(id))
      }
  
    // @LINE:25
    case controllers_HomeController_updateProjects13_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProjects13_invoker.call(HomeController_0.updateProjects(id))
      }
  
    // @LINE:26
    case controllers_HomeController_updateEmployee14_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateEmployee14_invoker.call(HomeController_0.updateEmployee(id))
      }
  
    // @LINE:27
    case controllers_HomeController_updateAdmin15_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateAdmin15_invoker.call(HomeController_0.updateAdmin(id))
      }
  
    // @LINE:29
    case controllers_LoginController_login16_route(params@_) =>
      call { 
        controllers_LoginController_login16_invoker.call(LoginController_2.login)
      }
  
    // @LINE:30
    case controllers_LoginController_loginSubmit17_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit17_invoker.call(LoginController_2.loginSubmit)
      }
  
    // @LINE:31
    case controllers_LoginController_logout18_route(params@_) =>
      call { 
        controllers_LoginController_logout18_invoker.call(LoginController_2.logout)
      }
  
    // @LINE:34
    case controllers_Assets_versioned19_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned19_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
