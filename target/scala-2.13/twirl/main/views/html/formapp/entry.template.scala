
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

object entry extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.formapp.Enquete,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(entry: models.formapp.Enquete):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/views/*3.7*/.html.formapp.main("登録済みメッセージ")/*3.38*/ {_display_(Seq[Any](format.raw/*3.40*/("""
    """),format.raw/*4.5*/("""<table class="w3-table">
        <tr>
            <th>ID</th>
            <td>"""),_display_(/*7.18*/entry/*7.23*/.id),format.raw/*7.26*/("""</td>
        </tr>
        <tr>
            <th>氏名</th>
            <td>"""),_display_(/*11.18*/entry/*11.23*/.name),format.raw/*11.28*/("""</td>
        </tr>
        <tr>
            <th>性別</th>
            <td>"""),_display_(/*15.18*/entry/*15.23*/.gender),format.raw/*15.30*/("""</td>
        </tr>
        <tr>
            <th>投稿日時</th>
            <td>"""),_display_(/*19.18*/entry/*19.23*/.createdAt),format.raw/*19.33*/("""</td>
        </tr>
        <tr>
            <th>メッセージ</th>
            <td><textarea disabled>"""),_display_(/*23.37*/entry/*23.42*/.message),format.raw/*23.50*/("""</textarea></td>
        </tr>
    </table>
    <a href="/formapp/messages">戻る</a>
""")))}))
      }
    }
  }

  def render(entry:models.formapp.Enquete): play.twirl.api.HtmlFormat.Appendable = apply(entry)

  def f:((models.formapp.Enquete) => play.twirl.api.HtmlFormat.Appendable) = (entry) => apply(entry)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-17T11:48:45.971284
                  SOURCE: /Users/tsubasa/IdeaProjects/may_day_/app/views/formapp/entry.scala.html
                  HASH: 406e229c1452b5182b4f81ad2dd8b4a827b1df17
                  MATRIX: 753->1|878->33|905->35|917->40|956->71|995->73|1026->78|1131->157|1144->162|1167->165|1268->239|1282->244|1308->249|1409->323|1423->328|1451->335|1554->411|1568->416|1599->426|1722->522|1736->527|1765->535
                  LINES: 21->1|26->2|27->3|27->3|27->3|27->3|28->4|31->7|31->7|31->7|35->11|35->11|35->11|39->15|39->15|39->15|43->19|43->19|43->19|47->23|47->23|47->23
                  -- GENERATED --
              */
          