
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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, target: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/views/*3.7*/.html.main(title)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
"""),format.raw/*4.1*/("""<h4>"""),_display_(/*4.6*/title),format.raw/*4.11*/("""</h4>
<form action=""""),_display_(/*5.16*/target),format.raw/*5.22*/("""" method="POST">
    """),_display_(/*6.6*/content),format.raw/*6.13*/("""
    """),format.raw/*7.5*/("""<input type="submit" value="next">
</form>

""")))}))
      }
    }
  }

  def render(title:String,target:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,target)(content)

  def f:((String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,target) => (content) => apply(title,target)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-17T11:51:47.734332
                  SOURCE: /Users/tsubasa/IdeaProjects/may_day_/app/views/register.scala.html
                  HASH: 659ad59de4bd2552684633ef7143504ff7fc9a9e
                  MATRIX: 744->1|884->48|911->50|923->55|948->72|987->74|1014->75|1044->80|1069->85|1116->106|1142->112|1189->134|1216->141|1247->146
                  LINES: 21->1|26->2|27->3|27->3|27->3|27->3|28->4|28->4|28->4|29->5|29->5|30->6|30->6|31->7
                  -- GENERATED --
              */
          