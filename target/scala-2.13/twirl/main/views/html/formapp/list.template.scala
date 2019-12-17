
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

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[models.formapp.Enquete],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(enquetes: Seq[models.formapp.Enquete]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._

def /*5.2*/entryRow/*5.10*/(entry: models.formapp.Enquete):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.45*/("""
    """),format.raw/*6.5*/("""<tr id=""""),_display_(/*6.14*/entry/*6.19*/.id),format.raw/*6.22*/("""">
        <td><a href="/formapp/messages/"""),_display_(/*7.41*/entry/*7.46*/.id),format.raw/*7.49*/("""">"""),_display_(/*7.52*/entry/*7.57*/.id),format.raw/*7.60*/("""</a></td>
        <td class="name">"""),_display_(/*8.27*/entry/*8.32*/.name),format.raw/*8.37*/("""</td>
        <td class="gender">"""),_display_(/*9.29*/entry/*9.34*/.gender),format.raw/*9.41*/("""</td>
        <td class="date">"""),_display_(/*10.27*/entry/*10.32*/.createdAt),format.raw/*10.42*/("""</td>
    </tr>
""")))};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*12.2*/("""

"""),_display_(/*14.2*/views/*14.7*/.html.formapp.main("")/*14.29*/ {_display_(Seq[Any](format.raw/*14.31*/("""
    """),format.raw/*15.5*/("""<div class="w3-row">
        <div class="w3-half">
            <h3>登録済みメッセージ</h3>
        </div>
        <div class="w3-right">
            <a href="/formapp/register"><span class="w3-button w3-green">新規入力</span></a>
        </div>
    </div>
    """),_display_(/*23.6*/if(enquetes.nonEmpty)/*23.27*/ {_display_(Seq[Any](format.raw/*23.29*/("""
    """),format.raw/*24.5*/("""<table id="formapp-message-list" class="w3-table w3-striped w3-border">
        <tr>
            <th></th>
            <th>投稿者</th>
            <th>性別</th>
            <th>投稿日時</th>
        </tr>
        """),_display_(/*31.10*/for(entry <- enquetes) yield /*31.32*/ {_display_(Seq[Any](format.raw/*31.34*/("""
            """),_display_(/*32.14*/entryRow(entry)),format.raw/*32.29*/("""
        """)))}),format.raw/*33.10*/("""
    """),format.raw/*34.5*/("""</table>
    """)))}/*35.7*/else/*35.12*/{_display_(Seq[Any](format.raw/*35.13*/("""
    """),format.raw/*36.5*/("""<p>登録されたメッセージはありません</p>
    """)))}),format.raw/*37.6*/("""
""")))}))
      }
    }
  }

  def render(enquetes:Seq[models.formapp.Enquete]): play.twirl.api.HtmlFormat.Appendable = apply(enquetes)

  def f:((Seq[models.formapp.Enquete]) => play.twirl.api.HtmlFormat.Appendable) = (enquetes) => apply(enquetes)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-17T11:48:46.014405
                  SOURCE: /Users/tsubasa/IdeaProjects/may_day_/app/views/formapp/list.scala.html
                  HASH: b5d4164210ec1fd207608f68f1a677c189227096
                  MATRIX: 757->1|869->43|897->61|913->69|1024->104|1055->109|1090->118|1103->123|1126->126|1195->169|1208->174|1231->177|1260->180|1273->185|1296->188|1358->224|1371->229|1396->234|1456->268|1469->273|1496->280|1555->312|1569->317|1600->327|1655->41|1682->59|1710->344|1739->347|1752->352|1783->374|1823->376|1855->381|2129->629|2159->650|2199->652|2231->657|2463->862|2501->884|2541->886|2582->900|2618->915|2659->925|2691->930|2723->945|2736->950|2775->951|2807->956|2866->985
                  LINES: 21->1|24->3|26->5|26->5|28->5|29->6|29->6|29->6|29->6|30->7|30->7|30->7|30->7|30->7|30->7|31->8|31->8|31->8|32->9|32->9|32->9|33->10|33->10|33->10|36->2|37->4|38->12|40->14|40->14|40->14|40->14|41->15|49->23|49->23|49->23|50->24|57->31|57->31|57->31|58->32|58->32|59->33|60->34|61->35|61->35|61->35|62->36|63->37
                  -- GENERATED --
              */
          