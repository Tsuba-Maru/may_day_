
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

object messageForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._

def /*5.2*/message/*5.9*/ = {{request.session.get("formapp::message").getOrElse("")}};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*5.68*/("""

"""),_display_(/*7.2*/register("メッセージ入力", "/formapp/register/message")/*7.50*/ {_display_(Seq[Any](format.raw/*7.52*/("""
    """),_display_(/*8.6*/CSRF/*8.10*/.formField),format.raw/*8.20*/("""
    """),format.raw/*9.5*/("""<textarea name="message">"""),_display_(/*9.31*/message),format.raw/*9.38*/("""</textarea>
""")))}))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(request)

  def f:((RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (request) => apply(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-17T11:48:46.043003
                  SOURCE: /Users/tsubasa/IdeaProjects/may_day_/app/views/formapp/messageForm.scala.html
                  HASH: c7f37dc7267760c1672939595ca204117248b443
                  MATRIX: 750->1|856->37|884->55|898->62|986->35|1013->53|1041->121|1069->124|1125->172|1164->174|1195->180|1207->184|1237->194|1268->199|1320->225|1347->232
                  LINES: 21->1|24->3|26->5|26->5|27->2|28->4|29->5|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9
                  -- GENERATED --
              */
          