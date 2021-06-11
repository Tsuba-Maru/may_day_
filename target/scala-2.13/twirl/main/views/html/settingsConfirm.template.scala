
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

object settingsConfirm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.User,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("設定")/*5.12*/{_display_(Seq[Any](format.raw/*5.13*/("""
        """),format.raw/*6.9*/("""<p>ユーザ情報を変更します</p>
        <form action="/settings/complete" method="post">
        """),_display_(/*8.10*/CSRF/*8.14*/.formField),format.raw/*8.24*/("""
        """),format.raw/*9.9*/("""名前 <br>
        <input type="text" value="""),_display_(/*10.35*/user/*10.39*/.userName),format.raw/*10.48*/(""" """),format.raw/*10.49*/("""disabled/><br>
        パスワード <br>
        <input type="password" value="""),_display_(/*12.39*/user/*12.43*/.password),format.raw/*12.52*/(""" """),format.raw/*12.53*/("""disabled/><br>
        <input type="submit" value="登録" />
        </form>
""")))}))
      }
    }
  }

  def render(user:models.User,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(user)(request)

  def f:((models.User) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (user) => (request) => apply(user)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-27T16:52:02.646208
                  SOURCE: /Users/tsubasa/may_day_/app/views/settingsConfirm.scala.html
                  HASH: 9102e7c4bee4acee147483c0b524738225534af0
                  MATRIX: 758->1|883->56|927->54|954->72|981->74|999->84|1037->85|1072->94|1183->179|1195->183|1225->193|1260->202|1329->244|1342->248|1372->257|1401->258|1500->330|1513->334|1543->343|1572->344
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|30->6|32->8|32->8|32->8|33->9|34->10|34->10|34->10|34->10|36->12|36->12|36->12|36->12
                  -- GENERATED --
              */
          