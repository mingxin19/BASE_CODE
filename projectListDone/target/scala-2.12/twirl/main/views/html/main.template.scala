
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
                <a class="navbar-brand" href="/">Fishbone</a>
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*27.22*/if(title=="Projects" )/*27.44*/{_display_(Seq[Any](format.raw/*27.45*/("""class="active"""")))}),format.raw/*27.60*/(""">
                    <a href="/">Projects</a>
                </li>

                <li """),_display_(/*31.22*/if(title=="Profile" )/*31.43*/{_display_(Seq[Any](format.raw/*31.44*/("""class="active"""")))}),format.raw/*31.59*/(""">
                    <a href="#">My Profile</a>
                </li>

                <li """),_display_(/*35.22*/if(title=="Admin" )/*35.41*/{_display_(Seq[Any](format.raw/*35.42*/("""class="active"""")))}),format.raw/*35.57*/(""">
                    <a href="#">Admin</a>
                </li>

                <li """),_display_(/*39.22*/if(title=="Login")/*39.40*/{_display_(Seq[Any](format.raw/*39.41*/("""class="active"""")))}),format.raw/*39.56*/(""">
                    """),_display_(/*40.22*/if(user != null)/*40.38*/ {_display_(Seq[Any](format.raw/*40.40*/("""
                        """),format.raw/*41.25*/("""<a href=""""),_display_(/*41.35*/routes/*41.41*/.LoginController.logout()),format.raw/*41.66*/("""">Logout """),_display_(/*41.76*/user/*41.80*/.getName()),format.raw/*41.90*/("""</a>
                    """)))}/*42.23*/else/*42.28*/{_display_(Seq[Any](format.raw/*42.29*/("""
                        """),format.raw/*43.25*/("""<a href=""""),_display_(/*43.35*/routes/*43.41*/.LoginController.login()),format.raw/*43.65*/("""">Login</a>
                    """)))}),format.raw/*44.22*/("""

                """),format.raw/*46.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*56.18*/content),format.raw/*56.25*/("""
            """),format.raw/*57.13*/("""</div>
        </row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12">
                Copyright
                <strong>EMS</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*71.19*/routes/*71.25*/.Assets.versioned("javascripts/main.js")),format.raw/*71.65*/(""""></script>
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
                  DATE: Sat Mar 16 14:40:05 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/main.scala.html
                  HASH: 84ab559d74751a6b7541608600410aca1c7df5d8
                  MATRIX: 970->1|1121->57|1149->59|1266->150|1280->156|1339->195|1419->248|1445->253|1657->438|1672->444|1734->485|2062->786|2093->808|2132->809|2178->824|2296->915|2326->936|2365->937|2411->952|2531->1045|2559->1064|2598->1065|2644->1080|2759->1168|2786->1186|2825->1187|2871->1202|2921->1225|2946->1241|2986->1243|3039->1268|3076->1278|3091->1284|3137->1309|3174->1319|3187->1323|3218->1333|3263->1360|3276->1365|3315->1366|3368->1391|3405->1401|3420->1407|3465->1431|3529->1464|3575->1482|3738->1618|3766->1625|3807->1638|4107->1911|4122->1917|4183->1957
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|42->10|42->10|46->14|46->14|46->14|59->27|59->27|59->27|59->27|63->31|63->31|63->31|63->31|67->35|67->35|67->35|67->35|71->39|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|73->41|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|75->43|76->44|78->46|88->56|88->56|89->57|103->71|103->71|103->71
                  -- GENERATED --
              */
          