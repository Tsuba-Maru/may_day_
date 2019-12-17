
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

object confirm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.formapp.Enquete,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(enquete: models.formapp.Enquete)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/views/*5.7*/.html.formapp.main("確認画面")/*5.33*/ {_display_(Seq[Any](format.raw/*5.35*/("""
    """),format.raw/*6.5*/("""<dl>
        <dt>名前</dt>
        <dd>"""),_display_(/*8.14*/enquete/*8.21*/.name),format.raw/*8.26*/("""</dd>
        <dt>性別</dt>
        <dd>"""),_display_(/*10.14*/enquete/*10.21*/.gender),format.raw/*10.28*/("""</dd>
        <dt>メッセージ</dt>
        <dd>"""),_display_(/*12.14*/enquete/*12.21*/.message),format.raw/*12.29*/("""</dd>
    </dl>
    <p>以上の内容で登録します</p>
    <form action="/formapp/register/confirm" method="POST">
        """),_display_(/*16.10*/CSRF/*16.14*/.formField),format.raw/*16.24*/("""
        """),format.raw/*17.9*/("""<input type="submit" value="OK">
    </form>
""")))}))
      }
    }
  }

  def render(enquete:models.formapp.Enquete,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(enquete)(request)

  def f:((models.formapp.Enquete) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (enquete) => (request) => apply(enquete)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-17T11:48:45.950045
                  SOURCE: /Users/tsubasa/IdeaProjects/may_day_/app/views/formapp/confirm.scala.html
                  HASH: 1312e1b2875a8737b25b35cfd0cf5d1ecd86d5bd
                  MATRIX: 769->1|908->70|952->68|979->86|1006->88|1018->93|1052->119|1091->121|1122->126|1186->164|1201->171|1226->176|1292->215|1308->222|1336->229|1405->271|1421->278|1450->286|1585->394|1598->398|1629->408|1665->417
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|32->8|32->8|32->8|34->10|34->10|34->10|36->12|36->12|36->12|40->16|40->16|40->16|41->17
                  -- GENERATED --
              */
          