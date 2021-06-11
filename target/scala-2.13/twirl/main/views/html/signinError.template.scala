
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

object signinError extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cause: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("ログイン")/*3.14*/{_display_(Seq[Any](format.raw/*3.15*/("""
    """),format.raw/*4.5*/("""<p>ログインに失敗しました</p><br>
    原因:"""),_display_(/*5.9*/cause),format.raw/*5.14*/("""<br>
    <div class="w3-left">
        <a href="/"><span class="w3-button w3-green">戻る</span></a>
    </div>
""")))}))
      }
    }
  }

  def render(cause:String): play.twirl.api.HtmlFormat.Appendable = apply(cause)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (cause) => apply(cause)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-27T16:52:02.376713
                  SOURCE: /Users/tsubasa/may_day_/app/views/signinError.scala.html
                  HASH: 6846a15d7a59d87ec96c11ab3f2ad35b3ae9c96e
                  MATRIX: 735->1|844->17|871->19|891->31|929->32|960->37|1016->68|1041->73
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|29->5|29->5
                  -- GENERATED --
              */
          