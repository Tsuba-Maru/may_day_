
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
    """),format.raw/*14.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*14.50*/routes/*14.56*/.Assets.versioned("stylesheets/style.css")),format.raw/*14.98*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.55*/routes/*15.61*/.Assets.versioned("images/favicon.png")),format.raw/*15.100*/("""">
    <script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
</head>
<body>
    <nav></nav>
    <main class="main-content" role="main">
        """),_display_(/*21.10*/content),format.raw/*21.17*/("""
    """),format.raw/*22.5*/("""</main>
    <footer></footer>
    <script src=""""),_display_(/*24.19*/routes/*24.25*/.Assets.versioned("javascripts/script.js")),format.raw/*24.67*/("""" type="text/javascript"></script>
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
                  DATE: 2019-12-17T11:48:45.876117
                  SOURCE: /Users/tsubasa/IdeaProjects/may_day_/app/views/main.scala.html
                  HASH: 56fe4f138df5f6d8c9dd3d484de3256fc0a63f6c
                  MATRIX: 765->108|889->139|916->140|1022->219|1048->224|1086->261|1118->266|1190->311|1205->317|1268->359|1352->416|1367->422|1428->461|1702->708|1730->715|1762->720|1837->768|1852->774|1915->816
                  LINES: 21->7|26->8|27->9|31->13|31->13|31->13|32->14|32->14|32->14|32->14|33->15|33->15|33->15|39->21|39->21|40->22|42->24|42->24|42->24
                  -- GENERATED --
              */
          