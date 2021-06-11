
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

object editTask extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.Task,Int,Int,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(task: models.Task)(genreID: Int)(listID: Int)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._
/*4.2*/import scala.util.matching.Regex

def /*7.2*/items/*7.7*/(name1: String, name2: String, description: String, deadline: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.80*/("""


"""),format.raw/*10.1*/("""<form action="/lists/"""),_display_(/*10.23*/listID),format.raw/*10.29*/("""/"""),_display_(/*10.31*/task/*10.35*/.taskId),format.raw/*10.42*/("""/edit" method="post">
    """),_display_(/*11.6*/CSRF/*11.10*/.formField),format.raw/*11.20*/("""

    """),format.raw/*13.5*/("""<div class="w3-left">
        <a href="/lists/"""),_display_(/*14.26*/listID),format.raw/*14.32*/(""""><span class="w3-button w3-green">リストへ戻る</span></a>
    </div>
    <br><br><br>
    """),_display_(/*17.6*/name1),format.raw/*17.11*/("""<input type="text" name="name1" value="""),_display_(/*17.50*/task/*17.54*/.name1),format.raw/*17.60*/(""" """),format.raw/*17.61*/("""><br>

    """),_display_(/*19.6*/if(name2!=null)/*19.21*/{_display_(Seq[Any](format.raw/*19.22*/("""
        """),_display_(/*20.10*/name2),format.raw/*20.15*/("""<input type="text" name="name2" value="""),_display_(/*20.54*/task/*20.58*/.name2),format.raw/*20.64*/(""" """),format.raw/*20.65*/("""><br>
    """)))}/*21.6*/else/*21.10*/{_display_(Seq[Any](format.raw/*21.11*/("""
        """),format.raw/*22.9*/("""<input type="hidden" name="name2" value="">
    """)))}),format.raw/*23.6*/("""

    """),_display_(/*25.6*/description),format.raw/*25.17*/("""<textarea name="description" value="""),_display_(/*25.53*/task/*25.57*/.description),format.raw/*25.69*/(""" """),format.raw/*25.70*/("""></textarea><br>
        """),_display_(/*26.10*/if(deadline!=null)/*26.28*/{_display_(Seq[Any](format.raw/*26.29*/("""
            """),_display_(/*27.14*/deadline),format.raw/*27.22*/(""" """),_display_(/*27.24*/task/*27.28*/.deadYear),format.raw/*27.37*/(""" """),format.raw/*27.38*/("""年 """),_display_(/*27.41*/task/*27.45*/.deadMonth),format.raw/*27.55*/(""" """),format.raw/*27.56*/("""月 """),_display_(/*27.59*/task/*27.63*/.deadDay),format.raw/*27.71*/(""" """),format.raw/*27.72*/("""日 <a href="#" class="btn-border-mini" id="edit-deadline">"""),_display_(/*27.130*/deadline),format.raw/*27.138*/(""" """),format.raw/*27.139*/("""編集</a>
        """)))}),format.raw/*28.10*/("""

        """),format.raw/*30.9*/("""<div class="year-month-day"></div>
        <div class="default-date">
            <input type="hidden" name="year" value="""),_display_(/*32.53*/task/*32.57*/.deadYear),format.raw/*32.66*/(""">
            <input type="hidden" name="month" value="""),_display_(/*33.54*/task/*33.58*/.deadMonth),format.raw/*33.68*/(""">
            <input type="hidden" name="day" value="""),_display_(/*34.52*/task/*34.56*/.deadDay),format.raw/*34.64*/(""">
        </div>
    完了状態<a href="/lists/"""),_display_(/*36.26*/listID),format.raw/*36.32*/("""/"""),_display_(/*36.34*/task/*36.38*/.taskId),format.raw/*36.45*/("""/comp" class="btn-border-mini">完了</a><br>
    <input type="submit" value="編集終了"/><br>
</form>

<script>
        $('#edit-deadline').click(function()"""),format.raw/*41.45*/("""{"""),format.raw/*41.46*/("""
            """),format.raw/*42.13*/("""$('div.default-date').html("");
            $('div.year-month-day').html("<input name='year' type='text' class='js-changeYear' pattern='\d\d\d\d' required> 年"
                +"<select name='month' class='js-changeMonth'>"
                +"<option value='1'>1</option>"
                +"<option value='2'>2</option>"
                +"<option value='3'>3</option>"
                +"<option value='4'>4</option>"
                +"<option value='5'>5</option>"
                +"<option value='6'>6</option>"
                +"<option value='7'>7</option>"
                +"<option value='8'>8</option>"
                +"<option value='9'>9</option>"
                +"<option value='10'>10</option>"
                +"<option value='11'>11</option>"
                +"<option value='12'>12</option>"
                +"</select> 月"
                +"<select name='day' class='js-changeDay'>"
                +"<option value='1'>1</option>"
                +"<option value='2'>2</option>"
                +"<option value='3'>3</option>"
                +"<option value='4'>4</option>"
                +"<option value='5'>5</option>"
                +"<option value='6'>6</option>"
                +"<option value='7'>7</option>"
                +"<option value='8'>8</option>"
                +"<option value='9'>9</option>"
                +"<option value='10'>10</option>"
                +"<option value='11'>11</option>"
                +"<option value='12'>12</option>"
                +"<option value='13'>13</option>"
                +"<option value='14'>14</option>"
                +"<option value='15'>15</option>"
                +"<option value='16'>16</option>"
                +"<option value='17'>17</option>"
                +"<option value='18'>18</option>"
                +"<option value='19'>19</option>"
                +"<option value='20'>20</option>"
                +"<option value='21'>21</option>"
                +"<option value='22'>22</option>"
                +"<option value='23'>23</option>"
                +"<option value='24'>24</option>"
                +"<option value='25'>25</option>"
                +"<option value='26'>26</option>"
                +"<option value='27'>27</option>"
                +"<option value='28'>28</option>"
                +"<option value='29'>29</option>"
                +"<option value='30'>30</option>"
                +"<option value='31'>31</option>"
                +"</select> 日");
        """),format.raw/*91.9*/("""}"""),format.raw/*91.10*/(""");
    </script>
""")))};
Seq[Any](format.raw/*2.1*/("""<!--タスク編集画面-->
"""),format.raw/*5.1*/("""

"""),format.raw/*93.2*/("""

"""),_display_(/*95.2*/main("タスク登録")/*95.15*/{_display_(Seq[Any](format.raw/*95.16*/("""
"""),format.raw/*96.1*/("""<h2>タスク登録</h2>
"""),_display_(/*97.2*/genreID/*97.9*/ match/*97.15*/{/*98.1*/case 0 =>/*98.10*/ {_display_(Seq[Any](format.raw/*98.12*/("""
"""),format.raw/*99.1*/("""<!--TODO-->
"""),_display_(/*100.2*/items("名前", null, "詳細", "締切日")),format.raw/*100.32*/("""
""")))}/*102.1*/case 1 =>/*102.10*/ {_display_(Seq[Any](format.raw/*102.12*/("""
"""),format.raw/*103.1*/("""<!--BOOK-->
"""),_display_(/*104.2*/items("書籍名", "著者名", "詳細", null)),format.raw/*104.33*/("""
""")))}/*106.1*/case 2 =>/*106.10*/ {_display_(Seq[Any](format.raw/*106.12*/("""
"""),format.raw/*107.1*/("""<!--MAIL-->
"""),_display_(/*108.2*/items("件名", "送り先", "詳細", "締切日")),format.raw/*108.33*/("""
""")))}/*110.1*/case 3 =>/*110.10*/ {_display_(Seq[Any](format.raw/*110.12*/("""
"""),format.raw/*111.1*/("""<!--SHOPPING-->
"""),_display_(/*112.2*/items("商品名", "売り場", "詳細", "行く日")),format.raw/*112.34*/("""
""")))}/*114.1*/case 4 =>/*114.10*/ {_display_(Seq[Any](format.raw/*114.12*/("""
"""),format.raw/*115.1*/("""<!--FOOD-->
"""),_display_(/*116.2*/items("店名", "場所", "詳細", "行く日")),format.raw/*116.32*/("""
""")))}/*118.1*/case 5 =>/*118.10*/ {_display_(Seq[Any](format.raw/*118.12*/("""
"""),format.raw/*119.1*/("""<!--HOMEWORK-->
"""),_display_(/*120.2*/items("課題名", "授業名", "詳細", "締切日")),format.raw/*120.34*/("""
""")))}/*122.1*/case 6 =>/*122.10*/ {_display_(Seq[Any](format.raw/*122.12*/("""
"""),format.raw/*123.1*/("""<!--MOVIE-->
"""),_display_(/*124.2*/items("名前", "URL/チャンネル", "詳細", "放送時間")),format.raw/*124.40*/("""
""")))}}),format.raw/*126.2*/("""
""")))}))
      }
    }
  }

  def render(task:models.Task,genreID:Int,listID:Int,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(task)(genreID)(listID)(request)

  def f:((models.Task) => (Int) => (Int) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (task) => (genreID) => (listID) => (request) => apply(task)(genreID)(listID)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-27T16:52:02.575641
                  SOURCE: /Users/tsubasa/may_day_/app/views/editTask.scala.html
                  HASH: f37391e9ba3ffbfde46c62ff3f4f27b2f0c41c3a
                  MATRIX: 759->1|911->97|934->114|979->150|991->155|1140->228|1170->231|1219->253|1246->259|1275->261|1288->265|1316->272|1369->299|1382->303|1413->313|1446->319|1520->366|1547->372|1659->458|1685->463|1751->502|1764->506|1791->512|1820->513|1858->525|1882->540|1921->541|1958->551|1984->556|2050->595|2063->599|2090->605|2119->606|2148->617|2161->621|2200->622|2236->631|2315->680|2348->687|2380->698|2443->734|2456->738|2489->750|2518->751|2571->777|2598->795|2637->796|2678->810|2707->818|2736->820|2749->824|2779->833|2808->834|2838->837|2851->841|2882->851|2911->852|2941->855|2954->859|2983->867|3012->868|3098->926|3128->934|3158->935|3205->951|3242->961|3391->1083|3404->1087|3434->1096|3516->1151|3529->1155|3560->1165|3640->1218|3653->1222|3682->1230|3751->1272|3778->1278|3807->1280|3820->1284|3848->1291|4024->1439|4053->1440|4094->1453|6590->3922|6619->3923|6675->81|6716->147|6745->3941|6774->3944|6796->3957|6835->3958|6863->3959|6905->3975|6920->3982|6935->3988|6944->3990|6962->3999|7002->4001|7030->4002|7070->4015|7122->4045|7143->4048|7162->4057|7203->4059|7232->4060|7272->4073|7325->4104|7346->4107|7365->4116|7406->4118|7435->4119|7475->4132|7528->4163|7549->4166|7568->4175|7609->4177|7638->4178|7682->4195|7736->4227|7757->4230|7776->4239|7817->4241|7846->4242|7886->4255|7938->4285|7959->4288|7978->4297|8019->4299|8048->4300|8092->4317|8146->4349|8167->4352|8186->4361|8227->4363|8256->4364|8297->4378|8357->4416|8391->4420
                  LINES: 21->1|24->3|25->4|27->7|27->7|29->7|32->10|32->10|32->10|32->10|32->10|32->10|33->11|33->11|33->11|35->13|36->14|36->14|39->17|39->17|39->17|39->17|39->17|39->17|41->19|41->19|41->19|42->20|42->20|42->20|42->20|42->20|42->20|43->21|43->21|43->21|44->22|45->23|47->25|47->25|47->25|47->25|47->25|47->25|48->26|48->26|48->26|49->27|49->27|49->27|49->27|49->27|49->27|49->27|49->27|49->27|49->27|49->27|49->27|49->27|49->27|49->27|49->27|49->27|50->28|52->30|54->32|54->32|54->32|55->33|55->33|55->33|56->34|56->34|56->34|58->36|58->36|58->36|58->36|58->36|63->41|63->41|64->42|113->91|113->91|116->2|117->5|119->93|121->95|121->95|121->95|122->96|123->97|123->97|123->97|123->98|123->98|123->98|124->99|125->100|125->100|126->102|126->102|126->102|127->103|128->104|128->104|129->106|129->106|129->106|130->107|131->108|131->108|132->110|132->110|132->110|133->111|134->112|134->112|135->114|135->114|135->114|136->115|137->116|137->116|138->118|138->118|138->118|139->119|140->120|140->120|141->122|141->122|141->122|142->123|143->124|143->124|144->126
                  -- GENERATED --
              */
          