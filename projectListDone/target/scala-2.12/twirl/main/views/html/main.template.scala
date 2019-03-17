
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

                """),_display_(/*31.18*/if(user != null)/*31.34*/{_display_(Seq[Any](format.raw/*31.35*/("""
                """),format.raw/*32.17*/("""<li """),_display_(/*32.22*/if(title=="My Profile" )/*32.46*/{_display_(Seq[Any](format.raw/*32.47*/("""class="active"""")))}),format.raw/*32.62*/(""">
                    <a href=""""),_display_(/*33.31*/routes/*33.37*/.HomeController.profile()),format.raw/*33.62*/("""">My Profile</a>
                </li>
                """)))}),format.raw/*35.18*/("""

                """),_display_(/*37.18*/if((user != null) && ("admin".equals(user.getRole())))/*37.72*/{_display_(Seq[Any](format.raw/*37.73*/("""

                    """),format.raw/*39.21*/("""<li """),_display_(/*39.26*/if(title=="Admin" )/*39.45*/{_display_(Seq[Any](format.raw/*39.46*/("""class="active"""")))}),format.raw/*39.61*/(""">
                        <a href=""""),_display_(/*40.35*/routes/*40.41*/.HomeController.admin()),format.raw/*40.64*/("""">Admin</a>
                    </li>
                    <li """),_display_(/*42.26*/if(title=="Manager" )/*42.47*/{_display_(Seq[Any](format.raw/*42.48*/("""class="active"""")))}),format.raw/*42.63*/(""">
                        <a href=""""),_display_(/*43.35*/routes/*43.41*/.HomeController.manager()),format.raw/*43.66*/("""">Manager</a>
                    </li>
                    <li """),_display_(/*45.26*/if(title=="Employee" )/*45.48*/{_display_(Seq[Any](format.raw/*45.49*/("""class="active"""")))}),format.raw/*45.64*/(""">
                            <a href=""""),_display_(/*46.39*/routes/*46.45*/.HomeController.employee()),format.raw/*46.71*/("""">Employee</a>
                    </li>
                """)))}),format.raw/*48.18*/("""
                

                """),format.raw/*51.17*/("""<li """),_display_(/*51.22*/if(title=="Login")/*51.40*/{_display_(Seq[Any](format.raw/*51.41*/("""class="active"""")))}),format.raw/*51.56*/(""">
                    """),_display_(/*52.22*/if(user != null)/*52.38*/ {_display_(Seq[Any](format.raw/*52.40*/("""
                        """),format.raw/*53.25*/("""<a href=""""),_display_(/*53.35*/routes/*53.41*/.LoginController.logout()),format.raw/*53.66*/("""">Logout """),_display_(/*53.76*/user/*53.80*/.getName()),format.raw/*53.90*/("""</a>
                    """)))}/*54.23*/else/*54.28*/{_display_(Seq[Any](format.raw/*54.29*/("""
                        """),format.raw/*55.25*/("""<a href=""""),_display_(/*55.35*/routes/*55.41*/.LoginController.login()),format.raw/*55.65*/("""">Login</a>
                    """)))}),format.raw/*56.22*/("""

                """),format.raw/*58.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*68.18*/content),format.raw/*68.25*/("""
            """),format.raw/*69.13*/("""</div>
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
    <script src=""""),_display_(/*83.19*/routes/*83.25*/.Assets.versioned("javascripts/main.js")),format.raw/*83.65*/(""""></script>
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
                  DATE: Sun Mar 17 22:39:23 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/main.scala.html
                  HASH: d7e1e84956e17ba7523ae3f407522a2205da1da7
                  MATRIX: 970->1|1121->57|1149->59|1266->150|1280->156|1339->195|1419->248|1445->253|1657->438|1672->444|1734->485|1965->689|1980->695|2024->718|2148->815|2179->837|2218->838|2264->853|2323->885|2338->891|2382->914|2464->969|2489->985|2528->986|2573->1003|2605->1008|2638->1032|2677->1033|2723->1048|2782->1080|2797->1086|2843->1111|2930->1167|2976->1186|3039->1240|3078->1241|3128->1263|3160->1268|3188->1287|3227->1288|3273->1303|3336->1339|3351->1345|3395->1368|3485->1431|3515->1452|3554->1453|3600->1468|3663->1504|3678->1510|3724->1535|3816->1600|3847->1622|3886->1623|3932->1638|3999->1678|4014->1684|4061->1710|4150->1768|4213->1803|4245->1808|4272->1826|4311->1827|4357->1842|4407->1865|4432->1881|4472->1883|4525->1908|4562->1918|4577->1924|4623->1949|4660->1959|4673->1963|4704->1973|4749->2000|4762->2005|4801->2006|4854->2031|4891->2041|4906->2047|4951->2071|5015->2104|5061->2122|5224->2258|5252->2265|5293->2278|5598->2556|5613->2562|5674->2602
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|42->10|42->10|46->14|46->14|46->14|54->22|54->22|54->22|59->27|59->27|59->27|59->27|60->28|60->28|60->28|63->31|63->31|63->31|64->32|64->32|64->32|64->32|64->32|65->33|65->33|65->33|67->35|69->37|69->37|69->37|71->39|71->39|71->39|71->39|71->39|72->40|72->40|72->40|74->42|74->42|74->42|74->42|75->43|75->43|75->43|77->45|77->45|77->45|77->45|78->46|78->46|78->46|80->48|83->51|83->51|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|85->53|85->53|85->53|85->53|85->53|86->54|86->54|86->54|87->55|87->55|87->55|87->55|88->56|90->58|100->68|100->68|101->69|115->83|115->83|115->83
                  -- GENERATED --
              */
          