
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
        <link rel="icon" type="image/png" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("images/favicon.png")),format.raw/*8.95*/("""">
    <meta charset="utf-8">
    <title>Fishbone - """),_display_(/*10.24*/title),format.raw/*10.29*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*14.18*/routes/*14.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href=""""),_display_(/*22.48*/routes/*22.54*/.HomeController.index()),format.raw/*22.77*/("""">Fishbone</a>
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*27.22*/if(title=="Projects" )/*27.44*/{_display_(Seq[Any](format.raw/*27.45*/("""class="active"""")))}),format.raw/*27.60*/(""">
                    <a href=""""),_display_(/*28.31*/routes/*28.37*/.HomeController.index()),format.raw/*28.60*/("""">Projects</a>
                </li>

                <li """),_display_(/*31.22*/if(title=="My Profile" )/*31.46*/{_display_(Seq[Any](format.raw/*31.47*/("""class="active"""")))}),format.raw/*31.62*/(""">
                    <a href=""""),_display_(/*32.31*/routes/*32.37*/.HomeController.profile()),format.raw/*32.62*/("""">My Profile</a>
                </li>

                """),_display_(/*35.18*/if((user != null) && ("admin".equals(user.getRole())))/*35.72*/{_display_(Seq[Any](format.raw/*35.73*/("""
                    """),format.raw/*36.21*/("""<li """),_display_(/*36.26*/if(title=="Employee" )/*36.48*/{_display_(Seq[Any](format.raw/*36.49*/("""class="active"""")))}),format.raw/*36.64*/(""">
                            <a href=""""),_display_(/*37.39*/routes/*37.45*/.HomeController.employee()),format.raw/*37.71*/("""">Admin</a>
                    </li>
                """)))}),format.raw/*39.18*/("""
                

                """),format.raw/*42.17*/("""<li """),_display_(/*42.22*/if(title=="Login")/*42.40*/{_display_(Seq[Any](format.raw/*42.41*/("""class="active"""")))}),format.raw/*42.56*/(""">
                    """),_display_(/*43.22*/if(user != null)/*43.38*/ {_display_(Seq[Any](format.raw/*43.40*/("""
                        """),format.raw/*44.25*/("""<a href=""""),_display_(/*44.35*/routes/*44.41*/.LoginController.logout()),format.raw/*44.66*/("""">Logout """),_display_(/*44.76*/user/*44.80*/.getName()),format.raw/*44.90*/("""</a>
                    """)))}/*45.23*/else/*45.28*/{_display_(Seq[Any](format.raw/*45.29*/("""
                        """),format.raw/*46.25*/("""<a href=""""),_display_(/*46.35*/routes/*46.41*/.LoginController.login()),format.raw/*46.65*/("""">Login</a>
                    """)))}),format.raw/*47.22*/("""

                """),format.raw/*49.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*59.18*/content),format.raw/*59.25*/("""
            """),format.raw/*60.13*/("""</div>
        </row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12">
                Copyright
                <strong>Fishbone</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*74.19*/routes/*74.25*/.Assets.versioned("javascripts/main.js")),format.raw/*74.65*/(""""></script>
</body>

</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 13:29:28 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/main.scala.html
                  HASH: 17fd2e1fed491d1f18ef7c77786ef8e0836c2243
                  MATRIX: 970->1|1121->57|1149->59|1266->150|1280->156|1339->195|1419->248|1445->253|1657->438|1672->444|1734->485|1965->689|1980->695|2024->718|2148->815|2179->837|2218->838|2264->853|2323->885|2338->891|2382->914|2468->973|2501->997|2540->998|2586->1013|2645->1045|2660->1051|2706->1076|2790->1133|2853->1187|2892->1188|2941->1209|2973->1214|3004->1236|3043->1237|3089->1252|3156->1292|3171->1298|3218->1324|3304->1379|3367->1414|3399->1419|3426->1437|3465->1438|3511->1453|3561->1476|3586->1492|3626->1494|3679->1519|3716->1529|3731->1535|3777->1560|3814->1570|3827->1574|3858->1584|3903->1611|3916->1616|3955->1617|4008->1642|4045->1652|4060->1658|4105->1682|4169->1715|4215->1733|4378->1869|4406->1876|4447->1889|4752->2167|4767->2173|4828->2213
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|42->10|42->10|46->14|46->14|46->14|54->22|54->22|54->22|59->27|59->27|59->27|59->27|60->28|60->28|60->28|63->31|63->31|63->31|63->31|64->32|64->32|64->32|67->35|67->35|67->35|68->36|68->36|68->36|68->36|68->36|69->37|69->37|69->37|71->39|74->42|74->42|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|76->44|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|78->46|78->46|79->47|81->49|91->59|91->59|92->60|106->74|106->74|106->74
                  -- GENERATED --
              */
          