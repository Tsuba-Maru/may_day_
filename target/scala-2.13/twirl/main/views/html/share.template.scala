
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

object share extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Int,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(listId: Int)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Mother")/*6.16*/{_display_(Seq[Any](format.raw/*6.17*/("""
"""),format.raw/*7.1*/("""<form action="/lists/"""),_display_(/*7.23*/listId),format.raw/*7.29*/("""/share" method="POST">
    """),_display_(/*8.6*/CSRF/*8.10*/.formField),format.raw/*8.20*/("""
    """),format.raw/*9.5*/("""ユーザー名<br>
    <input type="text" name="userName"><br>
    <input type="submit" value="共有"><br>
</form>
""")))}))
      }
    }
  }

  def render(listId:Int,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(listId)(request)

  def f:((Int) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (listId) => (request) => apply(listId)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-27T16:52:02.508505
                  SOURCE: /Users/tsubasa/may_day_/app/views/share.scala.html
                  HASH: 6fb0d73e00000921571df3dafc3904cfd14a4620
                  MATRIX: 740->2|859->51|903->49|930->67|957->69|979->83|1017->84|1044->85|1092->107|1118->113|1171->141|1183->145|1213->155|1244->160
                  LINES: 21->2|24->4|27->3|28->5|29->6|29->6|29->6|30->7|30->7|30->7|31->8|31->8|31->8|32->9
                  -- GENERATED --
              */
          