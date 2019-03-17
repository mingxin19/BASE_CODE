
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/BASE_CODE/projectListDone/conf/routes
// @DATE:Sun Mar 17 21:19:42 GMT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def addProjects(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addProjects")
    }
  
    // @LINE:8
    def employee(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employee")
    }
  
    // @LINE:9
    def admin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin")
    }
  
    // @LINE:15
    def addEmployeeSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addEmployeeSubmit")
    }
  
    // @LINE:21
    def deleteEmployee(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delEmployee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:7
    def profile(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
    // @LINE:16
    def addAdmin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addAdmin")
    }
  
    // @LINE:13
    def addProjectsSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addProjectsSubmit")
    }
  
    // @LINE:6
    def index(cat:Long = 0L): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(cat == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("cat", cat)))))
    }
  
    // @LINE:27
    def updateAdmin(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateAdmin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:25
    def updateProjects(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateProjects/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:22
    def deleteAdmin(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delAdmin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:20
    def deleteProjects(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delProjects/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:26
    def updateEmployee(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateEmployee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:14
    def addEmployee(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addEmployee")
    }
  
    // @LINE:17
    def addAdminSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addAdminSubmit")
    }
  
  }

  // @LINE:29
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def loginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:31
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:29
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:34
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
