
package views.html.formapp

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

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>"""),_display_(/*7.13*/if(title.nonEmpty)/*7.31*/{_display_(Seq[Any](format.raw/*7.32*/(""" """),_display_(/*7.34*/title),format.raw/*7.39*/(""" """),format.raw/*7.40*/("""| """)))}),format.raw/*7.43*/("""Formapp</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("stylesheets/formapp.css")),format.raw/*9.100*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.versioned("images/favicon.png")),format.raw/*10.100*/("""">
    <script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
</head>
<body>
    <div class="w3-content">
        <main class="main-content w3-container" role="main">
            <h1>Formapp on Play Framework</h1>
            """),_display_(/*17.14*/content),format.raw/*17.21*/("""
        """),format.raw/*18.9*/("""</main>
    </div>
    <script src=""""),_display_(/*20.19*/routes/*20.25*/.Assets.versioned("javascripts/formapp.js")),format.raw/*20.68*/("""" type="text/javascript"></script>
</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-17T11:48:45.984645
                  SOURCE: /Users/tsubasa/IdeaProjects/may_day_/app/views/formapp/main.scala.html
                  HASH: 9fc3842aa4fc1972b73635910881d553b6eac781
                  MATRIX: 741->1|865->32|892->33|997->112|1023->130|1061->131|1089->133|1114->138|1142->139|1175->142|1342->283|1356->289|1421->333|1505->390|1520->396|1581->435|1936->763|1964->770|2000->779|2064->816|2079->822|2143->865
                  LINES: 21->1|26->2|27->3|31->7|31->7|31->7|31->7|31->7|31->7|31->7|33->9|33->9|33->9|34->10|34->10|34->10|41->17|41->17|42->18|44->20|44->20|44->20
                  -- GENERATED --
              */
          