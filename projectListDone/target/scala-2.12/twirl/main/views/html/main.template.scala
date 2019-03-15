
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
    <meta charset="utf-8">
    <title>EMS - """),_display_(/*9.19*/title),format.raw/*9.24*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="/">EMS</a>
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*26.22*/if(title=="Projects" )/*26.44*/{_display_(Seq[Any](format.raw/*26.45*/("""class="active"""")))}),format.raw/*26.60*/(""">
                    <a href="#">Projects</a>
                </li>

                <li """),_display_(/*30.22*/if(title=="Profile" )/*30.43*/{_display_(Seq[Any](format.raw/*30.44*/("""class="active"""")))}),format.raw/*30.59*/(""">
                    <a href="#">My Profile</a>
                </li>

                <li """),_display_(/*34.22*/if(title=="Admin" )/*34.41*/{_display_(Seq[Any](format.raw/*34.42*/("""class="active"""")))}),format.raw/*34.57*/(""">
                    <a href="#">Admin</a>
                </li>

                <li """),_display_(/*38.22*/if(title=="Login")/*38.40*/{_display_(Seq[Any](format.raw/*38.41*/("""class="active"""")))}),format.raw/*38.56*/(""">
                    """),_display_(/*39.22*/if(user != null)/*39.38*/ {_display_(Seq[Any](format.raw/*39.40*/("""
                        """),format.raw/*40.25*/("""<a href=""""),_display_(/*40.35*/routes/*40.41*/.LoginController.logout()),format.raw/*40.66*/("""">Logout """),_display_(/*40.76*/user/*40.80*/.getName()),format.raw/*40.90*/("""</a>
                    """)))}/*41.23*/else/*41.28*/{_display_(Seq[Any](format.raw/*41.29*/("""
                        """),format.raw/*42.25*/("""<a href=""""),_display_(/*42.35*/routes/*42.41*/.LoginController.login()),format.raw/*42.65*/("""">Login</a>
                    """)))}),format.raw/*43.22*/("""

                """),format.raw/*45.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*55.18*/content),format.raw/*55.25*/("""
            """),format.raw/*56.13*/("""</div>
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
    <script src=""""),_display_(/*70.19*/routes/*70.25*/.Assets.versioned("javascripts/main.js")),format.raw/*70.65*/(""""></script>
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
                  DATE: Fri Mar 15 16:40:58 GMT 2019
                  SOURCE: /home/wdd/CRUDComplete/app/views/main.scala.html
                  HASH: 63200cf0598520ab07557180e78aed6ae6e8574f
                  MATRIX: 970->1|1121->57|1149->59|1262->146|1287->151|1499->336|1514->342|1576->383|1899->679|1930->701|1969->702|2015->717|2133->808|2163->829|2202->830|2248->845|2368->938|2396->957|2435->958|2481->973|2596->1061|2623->1079|2662->1080|2708->1095|2758->1118|2783->1134|2823->1136|2876->1161|2913->1171|2928->1177|2974->1202|3011->1212|3024->1216|3055->1226|3100->1253|3113->1258|3152->1259|3205->1284|3242->1294|3257->1300|3302->1324|3366->1357|3412->1375|3575->1511|3603->1518|3644->1531|3944->1804|3959->1810|4020->1850
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|58->26|58->26|58->26|58->26|62->30|62->30|62->30|62->30|66->34|66->34|66->34|66->34|70->38|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|72->40|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|74->42|75->43|77->45|87->55|87->55|88->56|102->70|102->70|102->70
                  -- GENERATED --
              */
          