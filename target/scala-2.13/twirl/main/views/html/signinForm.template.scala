
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

object signinForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /*
* 初期ページ
* - 引数としてメッセージを受け取り，画面に表示する
* - UserController.signinを呼び出す
* - UserController.startSignupを呼び出す
*/
  def apply/*9.2*/(message: String)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*11.2*/import helper._


Seq[Any](format.raw/*10.1*/("""
"""),format.raw/*12.1*/("""
"""),format.raw/*13.1*/("""<h1>"""),_display_(/*13.6*/message),format.raw/*13.13*/("""</h1>
<form action="/signin" method="POST">
    ユーザー名 <br>
    <input type="text" name="userName"> <br>
    パスワード入力 <br>
    <input type="text" name="password">

    <td><a href="/signin"><input type="submit" value="ログイン"></a></td><br>
     <br>
</form>

</form>
    ↓↓新規登録はこちら↓↓<br>
    <a href="/signup">新規アカウント登録</a> <br>
</form>"""))
      }
    }
  }

  def render(message:String,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(message)(request)

  def f:((String) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (message) => (request) => apply(message)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-17T11:48:45.940460
                  SOURCE: /Users/tsubasa/IdeaProjects/may_day_/app/views/signinForm.scala.html
                  HASH: 49ee165a1d220c6fecdcb65db0b289b5da7d35b9
                  MATRIX: 852->112|976->165|1021->163|1049->181|1077->182|1108->187|1136->194
                  LINES: 26->9|29->11|32->10|33->12|34->13|34->13|34->13
                  -- GENERATED --
              */
          