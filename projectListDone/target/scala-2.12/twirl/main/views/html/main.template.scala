
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
                    <li """),_display_(/*42.26*/if(title=="Employee" )/*42.48*/{_display_(Seq[Any](format.raw/*42.49*/("""class="active"""")))}),format.raw/*42.64*/(""">
                            <a href=""""),_display_(/*43.39*/routes/*43.45*/.HomeController.employee()),format.raw/*43.71*/("""">Employee</a>
                    </li>
                """)))}),format.raw/*45.18*/("""
                

                """),format.raw/*48.17*/("""<li """),_display_(/*48.22*/if(title=="Login")/*48.40*/{_display_(Seq[Any](format.raw/*48.41*/("""class="active"""")))}),format.raw/*48.56*/(""">
                    """),_display_(/*49.22*/if(user != null)/*49.38*/ {_display_(Seq[Any](format.raw/*49.40*/("""
                        """),format.raw/*50.25*/("""<a href=""""),_display_(/*50.35*/routes/*50.41*/.LoginController.logout()),format.raw/*50.66*/("""">Logout """),_display_(/*50.76*/user/*50.80*/.getName()),format.raw/*50.90*/("""</a>
                    """)))}/*51.23*/else/*51.28*/{_display_(Seq[Any](format.raw/*51.29*/("""
                        """),format.raw/*52.25*/("""<a href=""""),_display_(/*52.35*/routes/*52.41*/.LoginController.login()),format.raw/*52.65*/("""">Login</a>
                    """)))}),format.raw/*53.22*/("""

                """),format.raw/*55.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*65.18*/content),format.raw/*65.25*/("""
            """),format.raw/*66.13*/("""</div>
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
    <script src=""""),_display_(/*80.19*/routes/*80.25*/.Assets.versioned("javascripts/main.js")),format.raw/*80.65*/(""""></script>
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
                  DATE: Sun Mar 17 21:19:42 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/main.scala.html
                  HASH: 9c906e04940d3951e111c2f318d63919539d6ea3
                  MATRIX: 970->1|1121->57|1149->59|1266->150|1280->156|1339->195|1419->248|1445->253|1657->438|1672->444|1734->485|1965->689|1980->695|2024->718|2148->815|2179->837|2218->838|2264->853|2323->885|2338->891|2382->914|2464->969|2489->985|2528->986|2573->1003|2605->1008|2638->1032|2677->1033|2723->1048|2782->1080|2797->1086|2843->1111|2930->1167|2976->1186|3039->1240|3078->1241|3128->1263|3160->1268|3188->1287|3227->1288|3273->1303|3336->1339|3351->1345|3395->1368|3485->1431|3516->1453|3555->1454|3601->1469|3668->1509|3683->1515|3730->1541|3819->1599|3882->1634|3914->1639|3941->1657|3980->1658|4026->1673|4076->1696|4101->1712|4141->1714|4194->1739|4231->1749|4246->1755|4292->1780|4329->1790|4342->1794|4373->1804|4418->1831|4431->1836|4470->1837|4523->1862|4560->1872|4575->1878|4620->1902|4684->1935|4730->1953|4893->2089|4921->2096|4962->2109|5267->2387|5282->2393|5343->2433
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|42->10|42->10|46->14|46->14|46->14|54->22|54->22|54->22|59->27|59->27|59->27|59->27|60->28|60->28|60->28|63->31|63->31|63->31|64->32|64->32|64->32|64->32|64->32|65->33|65->33|65->33|67->35|69->37|69->37|69->37|71->39|71->39|71->39|71->39|71->39|72->40|72->40|72->40|74->42|74->42|74->42|74->42|75->43|75->43|75->43|77->45|80->48|80->48|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|82->50|82->50|82->50|82->50|83->51|83->51|83->51|84->52|84->52|84->52|84->52|85->53|87->55|97->65|97->65|98->66|112->80|112->80|112->80
                  -- GENERATED --
              */
          