
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

object createList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/views/*5.7*/.html.main("リスト登録")/*5.26*/{_display_(Seq[Any](format.raw/*5.27*/("""
    """),format.raw/*6.5*/("""<form action="/lists/create" method="post">
        """),_display_(/*7.10*/CSRF/*7.14*/.formField),format.raw/*7.24*/("""
    """),format.raw/*8.5*/("""<!--listName-->
        リスト名<br>
        <input type="text" name="listName"required/><br>
    <!--genreID-->
        ジャンル<br>
        <select name="genreId">
            <option value="0">TODOリスト</option>
            <option value="1">読書リスト</option>
            <option value="2">メールリスト</option>
            <option value="3">買い物リスト</option>
            <option value="4">食べ物リスト</option>
            <option value="5">課題リスト</option>
            <option value="6">動画リスト</option>
        </select>
        <input type="submit" value="登録"/>
    </form>
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
                  DATE: 2020-01-27T16:52:02.680745
                  SOURCE: /Users/tsubasa/may_day_/app/views/createList.scala.html
                  HASH: c8a691b7d0d08d3c75a22b72c5ce6953d6b84165
                  MATRIX: 741->1|847->37|891->35|918->53|945->55|957->60|984->79|1022->80|1053->85|1132->138|1144->142|1174->152|1205->157
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|31->7|31->7|31->7|32->8
                  -- GENERATED --
              */
          