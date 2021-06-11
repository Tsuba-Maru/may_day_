
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
import play.api.mvc._
import play.api.data._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /* ページタイトル，ページ本体のHTML構造を引数として受け取る */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>  """),format.raw/*13.55*/("""
    """),format.raw/*14.5*/("""<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" rel="stylesheet">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*16.50*/routes/*16.56*/.Assets.versioned("stylesheets/style.css")),format.raw/*16.98*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.55*/routes/*17.61*/.Assets.versioned("images/favicon.png")),format.raw/*17.100*/("""">
    <script type="text/javascript" src=""""),_display_(/*18.42*/routes/*18.48*/.Assets.versioned("javascripts/script.js")),format.raw/*18.90*/(""""></script>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
</head>
<body>
    <nav></nav>
    <main class="main-content" role="main">
        <a href="/lists" class="top-page">
        <h1>Mother</h1>
        </a>
        """),_display_(/*27.10*/content),format.raw/*27.17*/("""
    """),format.raw/*28.5*/("""</main>
    <footer></footer>
    <script src=""""),_display_(/*30.19*/routes/*30.25*/.Assets.versioned("javascripts/script.js")),format.raw/*30.67*/("""" type="text/javascript"></script>
</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-27T16:52:02.521635
                  SOURCE: /Users/tsubasa/may_day_/app/views/main.scala.html
                  HASH: d02d8557b40762b9c188a86fac110640258af2f2
                  MATRIX: 765->108|889->139|916->140|1022->219|1048->224|1086->261|1118->266|1357->478|1372->484|1435->526|1519->583|1534->589|1595->628|1666->672|1681->678|1744->720|2107->1056|2135->1063|2167->1068|2242->1116|2257->1122|2320->1164
                  LINES: 21->7|26->8|27->9|31->13|31->13|31->13|32->14|34->16|34->16|34->16|35->17|35->17|35->17|36->18|36->18|36->18|45->27|45->27|46->28|48->30|48->30|48->30
                  -- GENERATED --
              */
          