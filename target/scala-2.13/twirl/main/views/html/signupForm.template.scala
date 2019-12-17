
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

  /*
* ユーザー情報を入力するページ
* - 名前とパスワードを入力させる
*/
  def apply/*6.2*/(isError: Int)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*8.2*/import helper._


Seq[Any](format.raw/*7.1*/("""
"""),format.raw/*9.1*/("""
"""),_display_(/*10.2*/register("新規アカウント登録", "/signup/confirm")/*10.42*/ {_display_(Seq[Any](format.raw/*10.44*/("""

"""),_display_(/*12.2*/if(isError == 1)/*12.18*/{_display_(Seq[Any](format.raw/*12.19*/(""" """),format.raw/*12.20*/("""このユーザー名はすでに使われています<br> """)))}),format.raw/*12.44*/("""
"""),_display_(/*13.2*/CSRF/*13.6*/.formField),format.raw/*13.16*/("""
"""),format.raw/*14.1*/("""ユーザー名 <br>
<input type="text" name="userName"> <br>
パスワード入力 <br>
<input type="text" name="password"> <br> <br>
""")))}))
      }
    }
  }

  def render(isError:Int,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(isError)(request)

  def f:((Int) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (isError) => (request) => apply(isError)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-17T11:52:26.728992
                  SOURCE: /Users/tsubasa/IdeaProjects/may_day_/app/views/signupForm.scala.html
                  HASH: feddae10fa3a72a0682f505e2cc62a4fd9a179ba
                  MATRIX: 782->44|902->94|946->92|973->110|1001->112|1050->152|1090->154|1119->157|1144->173|1183->174|1212->175|1267->199|1295->201|1307->205|1338->215|1366->216
                  LINES: 24->6|27->8|30->7|31->9|32->10|32->10|32->10|34->12|34->12|34->12|34->12|34->12|35->13|35->13|35->13|36->14
                  -- GENERATED --
              */
          