
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

object signupConfirm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Int,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userName: String)(userId: Int)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/signup/*5.8*/{_display_(Seq[Any](format.raw/*5.9*/("""
"""),_display_(/*6.2*/CSRF/*6.6*/.formField),format.raw/*6.16*/("""
"""),format.raw/*7.1*/("""<dl>
    <dt>ユーザー名</dt>
    <dd>"""),_display_(/*9.10*/userName),format.raw/*9.18*/("""</dd>
</dl>
<dl>
    <dt>あなたのお母さん </dt>
    """),_display_(/*13.6*/(userId % 3)/*13.18*/ match/*13.24*/ {/*14.5*/case 0 =>/*14.14*/ {_display_(Seq[Any](format.raw/*14.16*/("""<dd><img src=""""),_display_(/*14.31*/routes/*14.37*/.Assets.versioned("images/icon.png")),format.raw/*14.73*/("""" width="150px" height="150px"></dd>""")))}/*15.5*/case 1 =>/*15.14*/ {_display_(Seq[Any](format.raw/*15.16*/("""<dd><img src=""""),_display_(/*15.31*/routes/*15.37*/.Assets.versioned("images/icon_a.png")),format.raw/*15.75*/("""" width="150px" height="150px"></dd>""")))}/*16.5*/case 2 =>/*16.14*/ {_display_(Seq[Any](format.raw/*16.16*/("""<dd><img src=""""),_display_(/*16.31*/routes/*16.37*/.Assets.versioned("images/icon_k.png")),format.raw/*16.75*/("""" width="150px" height="150px"></dd>""")))}}),format.raw/*17.6*/("""
"""),format.raw/*18.1*/("""</dl>
<div class="button">
    <a href="/signup/complete" class="btn-border">登録</a>
</div>
""")))}),format.raw/*22.2*/("""
"""))
      }
    }
  }

  def render(userName:String,userId:Int,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(userName)(userId)(request)

  def f:((String) => (Int) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (userName) => (userId) => (request) => apply(userName)(userId)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-27T16:52:02.612506
                  SOURCE: /Users/tsubasa/may_day_/app/views/signupConfirm.scala.html
                  HASH: 21a02e43a28fb27819c922560970f9a6727eb72c
                  MATRIX: 755->1|892->68|936->66|963->84|990->86|1003->92|1040->93|1067->95|1078->99|1108->109|1135->110|1194->143|1222->151|1293->196|1314->208|1329->214|1339->221|1357->230|1397->232|1439->247|1454->253|1511->289|1566->331|1584->340|1624->342|1666->357|1681->363|1740->401|1795->443|1813->452|1853->454|1895->469|1910->475|1969->513|2037->556|2065->557|2187->649
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|37->13|37->13|37->13|37->14|37->14|37->14|37->14|37->14|37->14|37->15|37->15|37->15|37->15|37->15|37->15|37->16|37->16|37->16|37->16|37->16|37->16|37->17|38->18|42->22
                  -- GENERATED --
              */
          