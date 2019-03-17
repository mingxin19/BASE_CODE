
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/BASE_CODE/projectListDone/conf/routes
// @DATE:Sun Mar 17 21:19:42 GMT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def addProjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addProjects",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addProjects"})
        }
      """
    )
  
    // @LINE:8
    def employee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.employee",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee"})
        }
      """
    )
  
    // @LINE:9
    def admin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.admin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
    // @LINE:15
    def addEmployeeSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addEmployeeSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addEmployeeSubmit"})
        }
      """
    )
  
    // @LINE:21
    def deleteEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteEmployee",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delEmployee/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:7
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:16
    def addAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addAdmin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addAdmin"})
        }
      """
    )
  
    // @LINE:13
    def addProjectsSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addProjectsSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addProjectsSubmit"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function(cat0) {
          return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(cat0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0))])})
        }
      """
    )
  
    // @LINE:27
    def updateAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateAdmin",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateAdmin/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:25
    def updateProjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateProjects",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateProjects/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:22
    def deleteAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteAdmin",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delAdmin/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:20
    def deleteProjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteProjects",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delProjects/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:26
    def updateEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateEmployee",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateEmployee/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:14
    def addEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addEmployee",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addEmployee"})
        }
      """
    )
  
    // @LINE:17
    def addAdminSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addAdminSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addAdminSubmit"})
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.loginSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSubmit"})
        }
      """
    )
  
    // @LINE:31
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:29
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
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
