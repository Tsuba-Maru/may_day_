
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

  /*
* ログインエラーから最初に戻るページ
* - 引数として失敗内容とその原因を受け取り，画面に表示する
*/
  def apply/*6.2*/(cause: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.1*/("""
"""),_display_(/*8.2*/register("ログインに失敗しました", "/")/*8.30*/ {_display_(Seq[Any](format.raw/*8.32*/("""

"""),format.raw/*10.1*/("""原因："""),_display_(/*10.5*/cause),format.raw/*10.10*/("""<br>

タイトル画面に戻ります
""")))}),format.raw/*13.2*/("""

"""))
      }
    }
  }

  def render(cause:String): play.twirl.api.HtmlFormat.Appendable = apply(cause)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (cause) => apply(cause)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-17T11:48:45.845249
                  SOURCE: /Users/tsubasa/IdeaProjects/may_day_/app/views/signinError.scala.html
                  HASH: df7fc1c397d612fd9d1173da93031198e0e3f3b0
                  MATRIX: 788->60|897->76|924->78|960->106|999->108|1028->110|1058->114|1084->119|1133->138
                  LINES: 24->6|29->7|30->8|30->8|30->8|32->10|32->10|32->10|35->13
                  -- GENERATED --
              */
          