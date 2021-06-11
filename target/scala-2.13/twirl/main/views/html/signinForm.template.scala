
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

object signinForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Mother")/*5.16*/{_display_(Seq[Any](format.raw/*5.17*/("""
    """),format.raw/*6.5*/("""<form action="/signin" method="POST">
        """),_display_(/*7.10*/CSRF/*7.14*/.formField),format.raw/*7.24*/("""
        """),format.raw/*8.9*/("""名前<br>
        <input type="text" name="userName" required><br>
        パスワード<br>
        <input type="password" name="password" required><br>
        <input type="submit" value="ログイン"><br>
    </form>
    <p>
        アカウントをお持ちですか?<br>
    </p>
    <div class="w3-left">
        <a href="/signup"><span class="w3-button w3-green">新規登録</span></a>
    </div>
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
                  DATE: 2020-01-27T16:52:02.624597
                  SOURCE: /Users/tsubasa/may_day_/app/views/signinForm.scala.html
                  HASH: 87f9fba11e4b76b6cd0c675abf24c1bce6029989
                  MATRIX: 741->1|847->37|891->35|918->53|945->55|967->69|1005->70|1036->75|1109->122|1121->126|1151->136|1186->145
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|30->6|31->7|31->7|31->7|32->8
                  -- GENERATED --
              */
          