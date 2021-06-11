
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

object signupForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Int,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(error: Int)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/signup/*5.8*/{_display_(Seq[Any](format.raw/*5.9*/("""
    """),format.raw/*6.5*/("""<div>
        <form action="/signup/confirm" method="POST">
            """),_display_(/*8.14*/CSRF/*8.18*/.formField),format.raw/*8.28*/("""
            """),format.raw/*9.13*/("""名前<br>
            <input type="text" name="userName"><br>
            パスワード<br>
            <input type="password" name="password" required><br>
            <input type="submit" value="登録">
        </form>
    </div>
""")))}))
      }
    }
  }

  def render(error:Int,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(error)(request)

  def f:((Int) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (error) => (request) => apply(error)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-27T16:52:02.533441
                  SOURCE: /Users/tsubasa/may_day_/app/views/signupForm.scala.html
                  HASH: b4ceaa1a9042814e73266caa386bf543cf543630
                  MATRIX: 745->1|863->49|907->47|934->65|961->67|974->73|1011->74|1042->79|1141->152|1153->156|1183->166|1223->179
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|30->6|32->8|32->8|32->8|33->9
                  -- GENERATED --
              */
          