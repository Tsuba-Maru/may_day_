
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

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[models.Task],Int,Int,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tasks: Seq[models.Task])(genreID: Int)(listID: Int)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._

def /*5.2*/entryRow/*5.10*/(entry: models.Task):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.34*/("""
    """),format.raw/*6.5*/("""<tr id=""""),_display_(/*6.14*/entry/*6.19*/.taskId),format.raw/*6.26*/("""">
        <td class="name1"><a href="/lists/"""),_display_(/*7.44*/listID),format.raw/*7.50*/("""/"""),_display_(/*7.52*/entry/*7.57*/.taskId),format.raw/*7.64*/("""/edit">"""),_display_(/*7.72*/entry/*7.77*/.name1),format.raw/*7.83*/("""</a></td>
        """),_display_(/*8.10*/if(entry.name2!="")/*8.29*/{_display_(Seq[Any](format.raw/*8.30*/("""
            """),format.raw/*9.13*/("""<td class="name2">"""),_display_(/*9.32*/entry/*9.37*/.name2),format.raw/*9.43*/("""</td>
        """)))}),format.raw/*10.10*/("""
        """),format.raw/*11.9*/("""<td class="description">"""),_display_(/*11.34*/entry/*11.39*/.description),format.raw/*11.51*/("""</td>
        """),_display_(/*12.10*/if(genreID!=1)/*12.24*/{_display_(Seq[Any](format.raw/*12.25*/("""
            """),format.raw/*13.13*/("""<td class="deadline">"""),_display_(/*13.35*/entry/*13.40*/.deadYear),format.raw/*13.49*/(""" """),format.raw/*13.50*/("""年 """),_display_(/*13.53*/entry/*13.58*/.deadMonth),format.raw/*13.68*/(""" """),format.raw/*13.69*/("""月 """),_display_(/*13.72*/entry/*13.77*/.deadDay),format.raw/*13.85*/(""" """),format.raw/*13.86*/("""日</td>
        """)))}),format.raw/*14.10*/("""
        """),format.raw/*15.9*/("""<td class="isDone">
            """),_display_(/*16.14*/if(entry.isDone.toString=="true")/*16.47*/{_display_(Seq[Any](format.raw/*16.48*/("""
                """),format.raw/*17.17*/("""やった
            """)))}/*18.14*/else/*18.18*/{_display_(Seq[Any](format.raw/*18.19*/("""
                """),format.raw/*19.17*/("""まだ
            """)))}),format.raw/*20.14*/("""
        """),format.raw/*21.9*/("""</td>
        <td>
            <div class="pop-box">
                <label for="popup-on"><label for="popup-on"><div class="btn-open"><i class="fas fa-trash-alt"></i></div></label>
                    <input type="checkbox" id="popup-on">
                    <div class="popup">
                        <label for="popup-on" class="icon-close">×</label>
                        <div class="popup-content">
                            <!-- ポップアップの中身 -->
                            <h3>リスト削除</h3>
                            本当に削除しますか?<br><br>
                            <a href="/lists/"""),_display_(/*32.46*/entry/*32.51*/.listId),format.raw/*32.58*/("""/"""),_display_(/*32.60*/entry/*32.65*/.taskId),format.raw/*32.72*/("""/delete" class="btn-close">削除</a>
                            <!-- ./ポップアップの中身　ここまで -->
                        </div>
                        <!--                        <label for="popup-on"><div class="btn-close">閉じる</div></label>-->
                    </div>
            </div>
        </td>

    </tr>
""")))};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*41.2*/("""

"""),_display_(/*43.2*/main("Mother")/*43.16*/{_display_(Seq[Any](format.raw/*43.17*/("""

    """),format.raw/*45.5*/("""<!--タスク検索-->
    <div class="w3-row">
        <div class="w3-half">
            <h4>タスク検索</h4>
        </div>
    </div>
    <table id="task-search" class="w3-table w3-border">
        <tr>
            <th>タスク名</th>
            <td>
                <form action="/lists/"""),_display_(/*55.39*/listID),format.raw/*55.45*/("""" method="post">
                    """),_display_(/*56.22*/CSRF/*56.26*/.formField),format.raw/*56.36*/("""
                    """),format.raw/*57.21*/("""<input type="text" name="title"/>
            </td>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <th>完了状態</th>
            <td>
                """),_display_(/*65.18*/CSRF/*65.22*/.formField),format.raw/*65.32*/("""
                """),format.raw/*66.17*/("""まだ<input type="radio" name="isDone" value="true" required/>
                やった<input type="radio" name="isDone" value="false" required/>
            </td>
            <td>
                """),_display_(/*70.18*/CSRF/*70.22*/.formField),format.raw/*70.32*/("""
                """),format.raw/*71.17*/("""<input type="submit" value="検索"/>
                </form>
            </td>
            <td>
                <div class="btn-border-mini">
                    <a href="/lists/"""),_display_(/*76.38*/listID),format.raw/*76.44*/("""">全タスク</a>
                </div>
            </td>
        </tr>
    </table>

    <br>
    <br>
    <div class="w3-row">
        <div class="w3-half">
            <h3>登録済みタスク</h3>
        </div>
        <div class="w3-left">
            <a href="/lists/"""),_display_(/*89.30*/listID),format.raw/*89.36*/("""/add"><span class="w3-button w3-green">新規登録</span></a>
        </div>
        <div class="w3-right">
            <a href="/lists/"""),_display_(/*92.30*/listID),format.raw/*92.36*/("""/share"><span class="w3-button w3-green">共有</span></a>
        </div>
    </div>
    """),_display_(/*95.6*/if(tasks.nonEmpty)/*95.24*/ {_display_(Seq[Any](format.raw/*95.26*/("""
    """),format.raw/*96.5*/("""<table id="tasks-list" class="w3-table w3-striped w3-border">
        <tr>
            """),_display_(/*98.14*/genreID/*98.21*/ match/*98.27*/ {/*99.17*/case 0 =>/*99.26*/{_display_(Seq[Any](format.raw/*99.27*/("""
                    """),format.raw/*100.21*/("""<!--TODO-->
                    <th>名前</th>
                    <th>詳細</th>
                    <th>締切日</th>
                """)))}/*105.17*/case 1 =>/*105.26*/ {_display_(Seq[Any](format.raw/*105.28*/("""
                    """),format.raw/*106.21*/("""<!--BOOK-->
                    <th>書籍名</th>
                    <th>著者名</th>
                    <th>詳細</th>
                """)))}/*111.17*/case 2 =>/*111.26*/ {_display_(Seq[Any](format.raw/*111.28*/("""
                    """),format.raw/*112.21*/("""<!--MAIL-->
                    <th>件名</th>
                    <th>送り先</th>
                    <th>詳細</th>
                    <th>締切日</th>
                """)))}/*118.17*/case 3 =>/*118.26*/ {_display_(Seq[Any](format.raw/*118.28*/("""
                    """),format.raw/*119.21*/("""<!--SHOPPING-->
                    <th>商品名</th>
                    <th>売り場</th>
                    <th>詳細</th>
                    <th>行く日</th>
                """)))}/*125.17*/case 4 =>/*125.26*/ {_display_(Seq[Any](format.raw/*125.28*/("""
                    """),format.raw/*126.21*/("""<!--FOOD-->
                    <th>店名</th>
                    <th>場所</th>
                    <th>詳細</th>
                    <th>行く日</th>
                """)))}/*132.17*/case 5 =>/*132.26*/ {_display_(Seq[Any](format.raw/*132.28*/("""
                    """),format.raw/*133.21*/("""<!--REPORT-->
                    <th>課題名</th>
                    <th>授業名</th>
                    <th>詳細</th>
                    <th>締切日</th>
                """)))}/*139.17*/case 6 =>/*139.26*/ {_display_(Seq[Any](format.raw/*139.28*/("""
                    """),format.raw/*140.21*/("""<!--MOVIE-->
                    <th>名前</th>
                    <th>URL/チャンネル</th>
                    <th>詳細</th>
                    <th>放送日</th>
                """)))}}),format.raw/*146.14*/("""
            """),format.raw/*147.13*/("""<th>完了状態</th>
            <th></th>
        </tr>
        """),_display_(/*150.10*/for(entry <- tasks) yield /*150.29*/ {_display_(Seq[Any](format.raw/*150.31*/("""
            """),_display_(/*151.14*/entryRow(entry)),format.raw/*151.29*/("""
        """)))}),format.raw/*152.10*/("""
    """),format.raw/*153.5*/("""</table>
    """)))}/*154.7*/else/*154.12*/{_display_(Seq[Any](format.raw/*154.13*/("""
    """),format.raw/*155.5*/("""<p>登録されたタスクはありません</p>
    """)))}),format.raw/*156.6*/("""
    """),format.raw/*157.5*/("""<div class="w3-left">
        <a href="/lists" class="w3-button w3-green">戻る</a>
    </div>
""")))}))
      }
    }
  }

  def render(tasks:Seq[models.Task],genreID:Int,listID:Int,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(tasks)(genreID)(listID)(request)

  def f:((Seq[models.Task]) => (Int) => (Int) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (tasks) => (genreID) => (listID) => (request) => apply(tasks)(genreID)(listID)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-27T16:52:02.604317
                  SOURCE: /Users/tsubasa/may_day_/app/views/list.scala.html
                  HASH: 3f96b9262eda3fd7969799fe3d5553a2cbfd906b
                  MATRIX: 760->1|918->89|946->107|962->115|1062->139|1093->144|1128->153|1141->158|1168->165|1240->211|1266->217|1294->219|1307->224|1334->231|1368->239|1381->244|1407->250|1452->269|1479->288|1517->289|1557->302|1602->321|1615->326|1641->332|1687->347|1723->356|1775->381|1789->386|1822->398|1864->413|1887->427|1926->428|1967->441|2016->463|2030->468|2060->477|2089->478|2119->481|2133->486|2164->496|2193->497|2223->500|2237->505|2266->513|2295->514|2342->530|2378->539|2438->572|2480->605|2519->606|2564->623|2600->640|2613->644|2652->645|2697->662|2744->678|2780->687|3396->1276|3410->1281|3438->1288|3467->1290|3481->1295|3509->1302|3856->87|3883->105|3911->1611|3940->1614|3963->1628|4002->1629|4035->1635|4333->1906|4360->1912|4425->1950|4438->1954|4469->1964|4518->1985|4728->2168|4741->2172|4772->2182|4817->2199|5034->2389|5047->2393|5078->2403|5123->2420|5326->2596|5353->2602|5636->2858|5663->2864|5820->2994|5847->3000|5959->3086|5986->3104|6026->3106|6058->3111|6173->3199|6189->3206|6204->3212|6215->3231|6233->3240|6272->3241|6322->3262|6468->3405|6487->3414|6528->3416|6578->3437|6725->3581|6744->3590|6785->3592|6835->3613|7014->3789|7033->3798|7074->3800|7124->3821|7308->4002|7327->4011|7368->4013|7418->4034|7596->4209|7615->4218|7656->4220|7706->4241|7888->4420|7907->4429|7948->4431|7998->4452|8197->4632|8239->4645|8326->4704|8362->4723|8403->4725|8445->4739|8482->4754|8524->4764|8557->4769|8590->4784|8604->4789|8644->4790|8677->4795|8735->4822|8768->4827
                  LINES: 21->1|24->3|26->5|26->5|28->5|29->6|29->6|29->6|29->6|30->7|30->7|30->7|30->7|30->7|30->7|30->7|30->7|31->8|31->8|31->8|32->9|32->9|32->9|32->9|33->10|34->11|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|36->13|36->13|36->13|36->13|36->13|36->13|36->13|36->13|36->13|36->13|37->14|38->15|39->16|39->16|39->16|40->17|41->18|41->18|41->18|42->19|43->20|44->21|55->32|55->32|55->32|55->32|55->32|55->32|65->2|66->4|67->41|69->43|69->43|69->43|71->45|81->55|81->55|82->56|82->56|82->56|83->57|91->65|91->65|91->65|92->66|96->70|96->70|96->70|97->71|102->76|102->76|115->89|115->89|118->92|118->92|121->95|121->95|121->95|122->96|124->98|124->98|124->98|124->99|124->99|124->99|125->100|129->105|129->105|129->105|130->106|134->111|134->111|134->111|135->112|140->118|140->118|140->118|141->119|146->125|146->125|146->125|147->126|152->132|152->132|152->132|153->133|158->139|158->139|158->139|159->140|164->146|165->147|168->150|168->150|168->150|169->151|169->151|170->152|171->153|172->154|172->154|172->154|173->155|174->156|175->157
                  -- GENERATED --
              */
          