
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Projects],List[models.Department],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projects: List[models.Projects], department: List[models.Department], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.97*/("""

"""),_display_(/*3.2*/main("Projects",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<p class="lead">Project Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Department</h4>
    <div class="list-group">
      <a href=""""),_display_(/*11.17*/routes/*11.23*/.HomeController.index(0)),format.raw/*11.47*/("""" class="list-group-item">All Department</a>
      """),_display_(/*12.8*/for(c <- department) yield /*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""
        """),format.raw/*13.9*/("""<a href=""""),_display_(/*13.19*/routes/*13.25*/.HomeController.index(c.getId)),format.raw/*13.55*/("""" class="list-group-item">"""),_display_(/*13.82*/c/*13.83*/.getName),format.raw/*13.91*/("""
          """),format.raw/*14.11*/("""<span class="badge">"""),_display_(/*14.32*/c/*14.33*/.getProjects.size()),format.raw/*14.52*/("""</span>
        </a>
      """)))}),format.raw/*16.8*/("""
    """),format.raw/*17.5*/("""</div>
  </div>
  <div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*21.8*/if(flash.containsKey("success"))/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
        """),format.raw/*22.9*/("""<div class="alert alert-success">
          """),_display_(/*23.12*/flash/*23.17*/.get("success")),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""</div>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""<thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Category</th>
          <th>Description</th>
          <th>Start Date</th>
          
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*39.10*/for(p<-projects) yield /*39.26*/ {_display_(Seq[Any](format.raw/*39.28*/("""
          """),format.raw/*40.11*/("""<tr>
            <td class="numeric">"""),_display_(/*41.34*/p/*41.35*/.getId),format.raw/*41.41*/("""</td>
            <td>"""),_display_(/*42.18*/p/*42.19*/.getName),format.raw/*42.27*/("""</td>
            <td>"""),_display_(/*43.18*/p/*43.19*/.getDepartment.getName),format.raw/*43.41*/("""</td>        
            <td>"""),_display_(/*44.18*/p/*44.19*/.getDescription),format.raw/*44.34*/("""</td>
            <td>"""),_display_(/*45.18*/p/*45.19*/.getStartDate),format.raw/*45.32*/("""</td>
            
            <td>
              <a href=""""),_display_(/*48.25*/routes/*48.31*/.HomeController.updateProjects(p.getId)),format.raw/*48.70*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*52.25*/routes/*52.31*/.HomeController.deleteProjects(p.getId)),format.raw/*52.70*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*57.10*/("""
      """),format.raw/*58.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*63.17*/routes/*63.23*/.HomeController.addProjects()),format.raw/*63.52*/("""">
        <button class="btn btn-primary">Add a projects</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*69.2*/("""
"""))
      }
    }
  }

  def render(projects:List[models.Projects],department:List[models.Department],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(projects,department,user)

  def f:((List[models.Projects],List[models.Department],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (projects,department,user) => apply(projects,department,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 14:36:19 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/index.scala.html
                  HASH: a3f7fdc85a26f24d0b2d527eca1cc7dea33c2ff5
                  MATRIX: 1005->1|1195->96|1223->99|1252->120|1291->122|1319->124|1501->279|1516->285|1561->309|1639->361|1675->381|1715->383|1751->392|1788->402|1803->408|1854->438|1908->465|1918->466|1947->474|1986->485|2034->506|2044->507|2084->526|2142->554|2174->559|2318->677|2359->709|2399->711|2435->720|2507->765|2521->770|2557->785|2593->794|2637->808|2671->815|2956->1073|2988->1089|3028->1091|3067->1102|3132->1140|3142->1141|3169->1147|3219->1170|3229->1171|3258->1179|3308->1202|3318->1203|3361->1225|3419->1256|3429->1257|3465->1272|3515->1295|3525->1296|3559->1309|3646->1369|3661->1375|3721->1414|3918->1584|3933->1590|3993->1629|4213->1818|4247->1825|4322->1873|4337->1879|4387->1908|4521->2012
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|71->39|71->39|71->39|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|80->48|80->48|80->48|84->52|84->52|84->52|89->57|90->58|95->63|95->63|95->63|101->69
                  -- GENERATED --
              */
          