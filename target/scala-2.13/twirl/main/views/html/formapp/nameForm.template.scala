
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

object nameForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._

def /*5.2*/name/*5.6*/ = {{request.session.get("formapp::name").getOrElse("")}};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*5.62*/("""

"""),_display_(/*7.2*/register("名前入力", "/formapp/register/name")/*7.44*/ {_display_(Seq[Any](format.raw/*7.46*/("""
    """),_display_(/*8.6*/CSRF/*8.10*/.formField),format.raw/*8.20*/("""
    """),format.raw/*9.5*/("""<input type="text" name="name" value=""""),_display_(/*9.44*/name),format.raw/*9.48*/("""">
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
                  DATE: 2019-12-17T11:48:46.003103
                  SOURCE: /Users/tsubasa/IdeaProjects/may_day_/app/views/formapp/nameForm.scala.html
                  HASH: 29f3783c1c1c341a2d5547822e33a32dc1090e24
                  MATRIX: 747->1|853->37|881->55|892->59|977->35|1004->53|1032->115|1060->118|1110->160|1149->162|1180->168|1192->172|1222->182|1253->187|1318->226|1342->230
                  LINES: 21->1|24->3|26->5|26->5|27->2|28->4|29->5|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9
                  -- GENERATED --
              */
          