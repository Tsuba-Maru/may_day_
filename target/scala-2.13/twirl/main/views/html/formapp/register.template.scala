
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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, target: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/views/*3.7*/.html.formapp.main(title)/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""
    """),format.raw/*4.5*/("""<h3>新規登録</h3>
    <h4>"""),_display_(/*5.10*/title),format.raw/*5.15*/("""</h4>
    <form action=""""),_display_(/*6.20*/target),format.raw/*6.26*/("""" method="POST">
        """),_display_(/*7.10*/content),format.raw/*7.17*/("""
        """),format.raw/*8.9*/("""<input type="submit" value="next">
    </form>

""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(title:String,target:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,target)(content)

  def f:((String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,target) => (content) => apply(title,target)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-17T11:48:45.994810
                  SOURCE: /Users/tsubasa/IdeaProjects/may_day_/app/views/formapp/register.scala.html
                  HASH: 4d358d06c14de62d2a181100464f316513ada5b7
                  MATRIX: 752->1|892->48|919->50|931->55|964->80|1003->82|1034->87|1083->110|1108->115|1159->140|1185->146|1237->172|1264->179|1299->188|1378->237
                  LINES: 21->1|26->2|27->3|27->3|27->3|27->3|28->4|29->5|29->5|30->6|30->6|31->7|31->7|32->8|35->11
                  -- GENERATED --
              */
          