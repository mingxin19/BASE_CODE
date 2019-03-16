
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

object employee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employee: List[models.Employee], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.60*/("""

"""),_display_(/*3.2*/main("Employee",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<p class="lead">Employee List</p>

"""),_display_(/*7.2*/if(flash.containsKey("success"))/*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""
  """),format.raw/*8.3*/("""<div class="alert alert-success">
    """),_display_(/*9.6*/flash/*9.11*/.get("success")),format.raw/*9.26*/("""
  """),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

"""),format.raw/*13.1*/("""<table class="table table-bordered table-hover table-condensed">

  <thead>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Email</th>
      <th>Update</th>
      <th>Delete</th>     
    </tr>
  </thead>

  <tbody>
    """),_display_(/*26.6*/for(e<-employee) yield /*26.22*/ {_display_(Seq[Any](format.raw/*26.24*/("""
      """),format.raw/*27.7*/("""<tr>
        <td class="numeric">"""),_display_(/*28.30*/e/*28.31*/.getId),format.raw/*28.37*/("""</td>
        <td>"""),_display_(/*29.14*/e/*29.15*/.getName),format.raw/*29.23*/("""</td>
        <td>"""),_display_(/*30.14*/e/*30.15*/.getEmail),format.raw/*30.24*/("""</td>
        <td>
          <a href=""""),_display_(/*32.21*/routes/*32.27*/.HomeController.updateEmployee(e.getId)),format.raw/*32.66*/("""" class="button-xs btn-danger">
            <span class="glyphicon glyphicon-pencil"></span>
          </a>
        </td>  
        <td>
          <a href=""""),_display_(/*37.21*/routes/*37.27*/.HomeController.deleteEmployee(e.getId)),format.raw/*37.66*/("""" class="button-xs btn-danger"  onclick="return confirmDel()">
            <span class="glyphicon glyphicon-trash"></span>
          </a>
        </td>
      </tr>
    """)))}),format.raw/*42.6*/("""
  """),format.raw/*43.3*/("""</tbody>

</table>
<p>
  <a href=""""),_display_(/*47.13*/routes/*47.19*/.HomeController.addEmployee()),format.raw/*47.48*/("""">
    <button class="btn btn-primary">Add an Employee</button>
  </a>
</p>

""")))}))
      }
    }
  }

  def render(employee:List[models.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employee,user)

  def f:((List[models.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employee,user) => apply(employee,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 16:19:13 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/employee.scala.html
                  HASH: 14008774e270495c363fc23289ecde61a7cd85c5
                  MATRIX: 984->1|1137->59|1165->62|1194->83|1233->85|1261->87|1322->123|1362->155|1401->157|1430->160|1494->199|1507->204|1542->219|1572->222|1610->230|1639->232|1895->462|1927->478|1967->480|2001->487|2062->521|2072->522|2099->528|2145->547|2155->548|2184->556|2230->575|2240->576|2270->585|2336->624|2351->630|2411->669|2595->826|2610->832|2670->871|2869->1040|2899->1043|2961->1078|2976->1084|3026->1113
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|58->26|58->26|58->26|59->27|60->28|60->28|60->28|61->29|61->29|61->29|62->30|62->30|62->30|64->32|64->32|64->32|69->37|69->37|69->37|74->42|75->43|79->47|79->47|79->47
                  -- GENERATED --
              */
          