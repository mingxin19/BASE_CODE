
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object addProjects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Projects],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projectsForm: Form[models.Projects], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Projects",user)/*4.27*/ {_display_(Seq[Any](format.raw/*4.29*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new project</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addProjectsSubmit(), 'class -> "form-horizontal", 'role -> "form")/*6.106*/ {_display_(Seq[Any](format.raw/*6.108*/("""
        """),format.raw/*7.37*/("""
        """),_display_(/*8.10*/CSRF/*8.14*/.formField),format.raw/*8.24*/("""

        """),_display_(/*10.10*/inputText(projectsForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*10.86*/("""
        """),_display_(/*11.10*/select(
            projectsForm("department.id"),
            options(Department.options),
            '_label -> "Department", '_default -> "-- Choose a department --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*16.10*/("""
        """),_display_(/*17.10*/inputText(projectsForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*17.100*/("""
        """),_display_(/*18.10*/inputText(projectsForm("startDate"), '_label -> "Start Date", 'class -> "form-control")),format.raw/*18.97*/("""
        

        """),_display_(/*21.10*/inputText(projectsForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*21.75*/("""

        """),format.raw/*23.9*/("""<div class="actions">
            <input type="submit" value="Add/Update Projects" class="btn btn-primary">
            <a href=""""),_display_(/*25.23*/routes/*25.29*/.HomeController.index(0)),format.raw/*25.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*29.6*/("""
""")))}))
      }
    }
  }

  def render(projectsForm:Form[models.Projects],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(projectsForm,user)

  def f:((Form[models.Projects],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (projectsForm,user) => apply(projectsForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 16:40:58 GMT 2019
                  SOURCE: /home/wdd/CRUDComplete/app/views/addProjects.scala.html
                  HASH: c16dfb7e383e4de106bd3dd7caed16ac1b627e8c
                  MATRIX: 987->1|1122->65|1167->63|1194->81|1221->83|1254->108|1293->110|1324->115|1392->158|1501->258|1541->260|1577->297|1613->307|1625->311|1655->321|1693->332|1790->408|1827->418|2093->663|2130->673|2242->763|2279->773|2387->860|2434->880|2520->945|2557->955|2714->1085|2729->1091|2774->1115|2922->1233
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|38->6|38->6|39->7|40->8|40->8|40->8|42->10|42->10|43->11|48->16|49->17|49->17|50->18|50->18|53->21|53->21|55->23|57->25|57->25|57->25|61->29
                  -- GENERATED --
              */
          