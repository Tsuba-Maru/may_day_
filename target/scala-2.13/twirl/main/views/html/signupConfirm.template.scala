
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

object signupConfirm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.User,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /*
* 登録するユーザー情報の確認ページ
* - 入力された名前とパスワードの平文を表示
*/
  def apply/*6.2*/(user: models.User)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*8.2*/import helper._


Seq[Any](format.raw/*7.1*/("""
"""),format.raw/*9.1*/("""
"""),_display_(/*10.2*/register("確認画面", "/signup/complete")/*10.38*/ {_display_(Seq[Any](format.raw/*10.40*/("""
"""),format.raw/*11.1*/("""<dl>
    <dt>ユーザー名</dt>
    <dd>"""),_display_(/*13.10*/user/*13.14*/.userName),format.raw/*13.23*/("""</dd>
    <dt>パスワード</dt>
    <dd>"""),_display_(/*15.10*/user/*15.14*/.password),format.raw/*15.23*/("""</dd>
</dl>
<p>以上の内容で登録します</p>
""")))}))
      }
    }
  }

  def render(user:models.User,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(user)(request)

  def f:((models.User) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (user) => (request) => apply(user)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-17T11:48:45.922954
                  SOURCE: /Users/tsubasa/IdeaProjects/may_day_/app/views/signupConfirm.scala.html
                  HASH: db8994bd0af0980ca8f6613d467628a7e64a0432
                  MATRIX: 800->51|925->106|969->104|996->122|1024->124|1069->160|1109->162|1137->163|1197->196|1210->200|1240->209|1301->243|1314->247|1344->256
                  LINES: 24->6|27->8|30->7|31->9|32->10|32->10|32->10|33->11|35->13|35->13|35->13|37->15|37->15|37->15
                  -- GENERATED --
              */
          