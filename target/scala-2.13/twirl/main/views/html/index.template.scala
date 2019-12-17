
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /* 引数としてメッセージを受け取る */
  def apply/*8.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.1*/("""
"""),_display_(/*10.2*/main("Home")/*10.14*/ {_display_(Seq[Any](format.raw/*10.16*/("""
    """),format.raw/*11.5*/("""<h1>"""),_display_(/*11.10*/message),format.raw/*11.17*/("""</h1>
    <a href="/formapp/messages">前半課題 formapp の Play による実装</a>
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-17T11:48:46.051291
                  SOURCE: /Users/tsubasa/IdeaProjects/may_day_/app/views/index.scala.html
                  HASH: 0a12d02b8c480debe6cc5a04a8b41fbaa1a9ab19
                  MATRIX: 746->120|857->138|885->140|906->152|946->154|978->159|1010->164|1038->171|1137->240
                  LINES: 21->8|26->9|27->10|27->10|27->10|28->11|28->11|28->11|30->13
                  -- GENERATED --
              */
          