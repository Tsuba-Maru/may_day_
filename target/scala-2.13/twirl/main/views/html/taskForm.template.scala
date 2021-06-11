
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

object taskForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Int,Int,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(genreID: Int)(listID: Int)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._

def /*4.2*/items/*4.7*/(name1: String, name2: String, description: String, deadline: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.80*/("""
    """),format.raw/*5.5*/("""<form action="/lists/"""),_display_(/*5.27*/listID),format.raw/*5.33*/("""/add" method="post">
        """),_display_(/*6.10*/CSRF/*6.14*/.formField),format.raw/*6.24*/("""
        """),_display_(/*7.10*/name1),format.raw/*7.15*/("""<input type="text" name="name1" required><br>
        """),_display_(/*8.10*/if(name2!=null)/*8.25*/{_display_(Seq[Any](format.raw/*8.26*/("""
            """),_display_(/*9.14*/name2),format.raw/*9.19*/("""<input type="text" name="name2" required><br>
        """)))}/*10.10*/else/*10.14*/{_display_(Seq[Any](format.raw/*10.15*/("""
            """),format.raw/*11.13*/("""<input type="hidden" name="name2" value="">
        """)))}),format.raw/*12.10*/("""
        """),_display_(/*13.10*/description),format.raw/*13.21*/("""<textarea name="description" required></textarea><br>
        """),_display_(/*14.10*/if(deadline!=null)/*14.28*/{_display_(Seq[Any](format.raw/*14.29*/("""
        """),format.raw/*15.9*/("""<input name="year" type="text" class="js-changeYear" pattern="\d\d\d\d" required> 年

        <select name="month" class="js-changeMonth">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="10">10</option>
            <option value="11">11</option>
            <option value="12">12</option>
        </select> 月

        <select name="day" class="js-changeDay">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="10">10</option>
            <option value="11">11</option>
            <option value="12">12</option>
            <option value="13">13</option>
            <option value="14">14</option>
            <option value="15">15</option>
            <option value="16">16</option>
            <option value="17">17</option>
            <option value="18">18</option>
            <option value="19">19</option>
            <option value="20">20</option>
            <option value="21">21</option>
            <option value="22">22</option>
            <option value="23">23</option>
            <option value="24">24</option>
            <option value="25">25</option>
            <option value="26">26</option>
            <option value="27">27</option>
            <option value="28">28</option>
            <option value="29">29</option>
            <option value="30">30</option>
            <option value="31">31</option>
        </select> 日

        """)))}/*66.10*/else/*66.14*/{_display_(Seq[Any](format.raw/*66.15*/("""
            """),format.raw/*67.13*/("""<input type="hidden" name="year" value="0">
            <input type="hidden" name="month" value="0">
            <input type="hidden" name="day" value="0">
        """)))}),format.raw/*70.10*/("""
        """),format.raw/*71.9*/("""<input type="submit" value="登録"/><br>
    </form>
""")))};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*73.2*/("""

"""),_display_(/*75.2*/main("タスク登録")/*75.15*/{_display_(Seq[Any](format.raw/*75.16*/("""
    """),format.raw/*76.5*/("""<h2>タスク登録</h2>
    """),_display_(/*77.6*/genreID/*77.13*/ match/*77.19*/{/*78.9*/case 0 =>/*78.18*/ {_display_(Seq[Any](format.raw/*78.20*/("""
        """),format.raw/*79.9*/("""<!--TODO-->
            """),_display_(/*80.14*/items("名前", null, "詳細", "締切日")),format.raw/*80.44*/("""
        """)))}/*82.9*/case 1 =>/*82.18*/ {_display_(Seq[Any](format.raw/*82.20*/("""
        """),format.raw/*83.9*/("""<!--BOOK-->
            """),_display_(/*84.14*/items("書籍名", "著者名", "詳細", null)),format.raw/*84.45*/("""
        """)))}/*86.9*/case 2 =>/*86.18*/ {_display_(Seq[Any](format.raw/*86.20*/("""
        """),format.raw/*87.9*/("""<!--MAIL-->
            """),_display_(/*88.14*/items("件名", "送り先", "詳細", "締切日")),format.raw/*88.45*/("""
        """)))}/*90.9*/case 3 =>/*90.18*/ {_display_(Seq[Any](format.raw/*90.20*/("""
        """),format.raw/*91.9*/("""<!--SHOPPING-->
            """),_display_(/*92.14*/items("商品名", "売り場", "詳細", "行く日")),format.raw/*92.46*/("""
        """)))}/*94.9*/case 4 =>/*94.18*/ {_display_(Seq[Any](format.raw/*94.20*/("""
        """),format.raw/*95.9*/("""<!--FOOD-->
            """),_display_(/*96.14*/items("店名", "場所", "詳細", "行く日")),format.raw/*96.44*/("""
        """)))}/*98.9*/case 5 =>/*98.18*/ {_display_(Seq[Any](format.raw/*98.20*/("""
        """),format.raw/*99.9*/("""<!--HOMEWORK-->
            """),_display_(/*100.14*/items("課題名", "授業名", "詳細", "締切日")),format.raw/*100.46*/("""
        """)))}/*102.9*/case 6 =>/*102.18*/ {_display_(Seq[Any](format.raw/*102.20*/("""
        """),format.raw/*103.9*/("""<!--MOVIE-->
            """),_display_(/*104.14*/items("名前", "URL/チャンネル", "詳細", "放送日")),format.raw/*104.51*/("""
        """)))}}),format.raw/*106.6*/("""
""")))}))
      }
    }
  }

  def render(genreID:Int,listID:Int,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(genreID)(listID)(request)

  def f:((Int) => (Int) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (genreID) => (listID) => (request) => apply(genreID)(listID)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-27T16:52:02.672234
                  SOURCE: /Users/tsubasa/may_day_/app/views/taskForm.scala.html
                  HASH: ebfda7093738f1cf90ff6fecf41de0d026db90c4
                  MATRIX: 747->1|880->64|908->81|920->86|1069->159|1100->164|1148->186|1174->192|1230->222|1242->226|1272->236|1308->246|1333->251|1414->306|1437->321|1475->322|1515->336|1540->341|1614->396|1627->400|1666->401|1707->414|1791->467|1828->477|1860->488|1950->551|1977->569|2016->570|2052->579|4122->2630|4135->2634|4174->2635|4215->2648|4411->2813|4447->2822|4536->62|4564->2873|4593->2876|4615->2889|4654->2890|4686->2895|4732->2915|4748->2922|4763->2928|4772->2938|4790->2947|4830->2949|4866->2958|4918->2983|4969->3013|4997->3032|5015->3041|5055->3043|5091->3052|5143->3077|5195->3108|5223->3127|5241->3136|5281->3138|5317->3147|5369->3172|5421->3203|5449->3222|5467->3231|5507->3233|5543->3242|5599->3271|5652->3303|5680->3322|5698->3331|5738->3333|5774->3342|5826->3367|5877->3397|5905->3416|5923->3425|5963->3427|5999->3436|6056->3465|6110->3497|6139->3516|6158->3525|6199->3527|6236->3536|6290->3562|6349->3599|6391->3615
                  LINES: 21->1|24->3|26->4|26->4|28->4|29->5|29->5|29->5|30->6|30->6|30->6|31->7|31->7|32->8|32->8|32->8|33->9|33->9|34->10|34->10|34->10|35->11|36->12|37->13|37->13|38->14|38->14|38->14|39->15|90->66|90->66|90->66|91->67|94->70|95->71|98->2|99->73|101->75|101->75|101->75|102->76|103->77|103->77|103->77|103->78|103->78|103->78|104->79|105->80|105->80|106->82|106->82|106->82|107->83|108->84|108->84|109->86|109->86|109->86|110->87|111->88|111->88|112->90|112->90|112->90|113->91|114->92|114->92|115->94|115->94|115->94|116->95|117->96|117->96|118->98|118->98|118->98|119->99|120->100|120->100|121->102|121->102|121->102|122->103|123->104|123->104|124->106
                  -- GENERATED --
              */
          