
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

object genderForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._

def /*5.2*/gender/*5.8*/ = {{request.session.get("formapp::gender").getOrElse("")}};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*5.66*/("""

"""),_display_(/*7.2*/register("性別入力", "/formapp/register/gender")/*7.46*/ {_display_(Seq[Any](format.raw/*7.48*/("""
    """),_display_(/*8.6*/CSRF/*8.10*/.formField),format.raw/*8.20*/("""
    """),format.raw/*9.5*/("""<input type="radio" name="gender" value="male" """),_display_(/*9.53*/if(gender == "male")/*9.73*/{_display_(Seq[Any](format.raw/*9.74*/(""" """),format.raw/*9.75*/("""checked """)))}),format.raw/*9.84*/(""" """),format.raw/*9.85*/("""required>男性</input>
    <input type="radio" name="gender" value="female" """),_display_(/*10.55*/if(gender == "female")/*10.77*/{_display_(Seq[Any](format.raw/*10.78*/(""" """),format.raw/*10.79*/("""checked """)))}),format.raw/*10.88*/(""" """),format.raw/*10.89*/("""required>女性</input>
""")))}))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(request)

  def f:((RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (request) => apply(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-17T11:48:46.024825
                  SOURCE: /Users/tsubasa/IdeaProjects/may_day_/app/views/formapp/genderForm.scala.html
                  HASH: f89a9383228ee1d400fd4070adfad8118d4bd401
                  MATRIX: 749->1|855->37|883->55|896->61|983->35|1010->53|1038->119|1066->122|1118->166|1157->168|1188->174|1200->178|1230->188|1261->193|1335->241|1363->261|1401->262|1429->263|1468->272|1496->273|1597->347|1628->369|1667->370|1696->371|1736->380|1765->381
                  LINES: 21->1|24->3|26->5|26->5|27->2|28->4|29->5|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|33->9|33->9|33->9|33->9|34->10|34->10|34->10|34->10|34->10|34->10
                  -- GENERATED --
              */
          