
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

object settings extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Int,models.User,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(i:Int)(user: models.User)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._

def /*5.2*/userName/*5.10*/ = {{request.session.get("userName").getOrElse("")}};def /*6.2*/password/*6.10*/ = {{request.session.get("password").getOrElse("")}};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*5.61*/("""
"""),format.raw/*6.61*/("""

"""),_display_(/*8.2*/main("設定")/*8.12*/{_display_(Seq[Any](format.raw/*8.13*/("""
    """),_display_(/*9.6*/if(i==1)/*9.14*/{_display_(Seq[Any](format.raw/*9.15*/("""
        """),format.raw/*10.9*/("""<p>このユーザ名は既に使われています</p>
    """)))}),format.raw/*11.6*/("""
    """),format.raw/*12.5*/("""<form action="/settings/confirm" method="post">
        """),_display_(/*13.10*/CSRF/*13.14*/.formField),format.raw/*13.24*/("""
        """),format.raw/*14.9*/("""名前 <br>
        <input type="text" name="userName" value="""),_display_(/*15.51*/user/*15.55*/.userName),format.raw/*15.64*/(""" """),format.raw/*15.65*/("""required/><br>
        パスワード <br>
        <input type="password" name="password"  required/><br>
        <input type="submit" value="編集"/><br><br>
    </form>
    <div class="w3-left">
        <a href="/lists"><span class="w3-button w3-green">戻る</span></a>
    </div>
""")))}))
      }
    }
  }

  def render(i:Int,user:models.User,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(i)(user)(request)

  def f:((Int) => (models.User) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (i) => (user) => (request) => apply(i)(user)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-27T16:52:02.697297
                  SOURCE: /Users/tsubasa/may_day_/app/views/settings.scala.html
                  HASH: 0e9acd3a15ccf8f3275901aa75353aa4f0643d99
                  MATRIX: 755->1|887->63|915->81|931->89|995->142|1011->150|1091->61|1118->79|1146->140|1174->201|1202->204|1220->214|1258->215|1289->221|1305->229|1343->230|1379->239|1438->268|1470->273|1554->330|1567->334|1598->344|1634->353|1719->411|1732->415|1762->424|1791->425
                  LINES: 21->1|24->3|26->5|26->5|26->6|26->6|27->2|28->4|29->5|30->6|32->8|32->8|32->8|33->9|33->9|33->9|34->10|35->11|36->12|37->13|37->13|37->13|38->14|39->15|39->15|39->15|39->15
                  -- GENERATED --
              */
          