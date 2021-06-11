
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

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[models.List],Seq[models.Task],Seq[models.Task],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(entries: Seq[models.List])(nearDeadline: Seq[models.Task])(pastDeadline: Seq[models.Task])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import java.time.LocalTime

def /*4.2*/entryRow/*4.10*/(entry: models.List):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.34*/("""
    """),format.raw/*5.5*/("""<tr id=""""),_display_(/*5.14*/entry/*5.19*/.listId),format.raw/*5.26*/("""">
        <td class="listName"><a href="/lists/"""),_display_(/*6.47*/entry/*6.52*/.listId),format.raw/*6.59*/("""">"""),_display_(/*6.62*/entry/*6.67*/.listName),format.raw/*6.76*/("""</a></td>
        <td class="genre">
            """),_display_(/*8.14*/entry/*8.19*/.genreId/*8.27*/ match/*8.33*/{/*9.17*/case 0 =>/*9.26*/ {_display_(Seq[Any](format.raw/*9.28*/("""<i class="fas fa-list"></i>""")))}/*10.17*/case 1 =>/*10.26*/ {_display_(Seq[Any](format.raw/*10.28*/("""<i class="fas fa-book"></i>""")))}/*11.17*/case 2 =>/*11.26*/ {_display_(Seq[Any](format.raw/*11.28*/("""<i class="far fa-envelope"></i>""")))}/*12.17*/case 3 =>/*12.26*/ {_display_(Seq[Any](format.raw/*12.28*/("""<i class="fas fa-shopping-cart"></i>""")))}/*13.17*/case 4 =>/*13.26*/ {_display_(Seq[Any](format.raw/*13.28*/("""<i class="fas fa-utensils"></i>""")))}/*14.17*/case 5 =>/*14.26*/ {_display_(Seq[Any](format.raw/*14.28*/("""<i class="fas fa-school"></i>""")))}/*15.17*/case 6 =>/*15.26*/ {_display_(Seq[Any](format.raw/*15.28*/("""<i class="fas fa-video"></i>""")))}}),format.raw/*16.14*/("""
        """),format.raw/*17.9*/("""</td>
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
                            <a href="/lists/"""),_display_(/*28.46*/entry/*28.51*/.listId),format.raw/*28.58*/("""/delete" class="btn-close">削除</a>
                            <!-- ./ポップアップの中身　ここまで -->
                        </div>
<!--                        <label for="popup-on"><div class="btn-close">閉じる</div></label>-->
                    </div>
            </div>
        </td>
    </tr>
""")))};def /*38.2*/notificationRow/*38.17*/(notification: models.Task):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*38.48*/("""
    """),format.raw/*39.5*/("""<tr id=""""),_display_(/*39.14*/notification/*39.26*/.taskId),format.raw/*39.33*/("""">
        <td class="name1"><a href="/lists/"""),_display_(/*40.44*/notification/*40.56*/.listId),format.raw/*40.63*/("""/"""),_display_(/*40.65*/notification/*40.77*/.taskId),format.raw/*40.84*/("""/edit">"""),_display_(/*40.92*/notification/*40.104*/.name1),format.raw/*40.110*/("""</a></td>
        <td class="deadline">"""),_display_(/*41.31*/notification/*41.43*/.deadYear),format.raw/*41.52*/(""" """),format.raw/*41.53*/("""年 """),_display_(/*41.56*/notification/*41.68*/.deadMonth),format.raw/*41.78*/(""" """),format.raw/*41.79*/("""月 """),_display_(/*41.82*/notification/*41.94*/.deadDay),format.raw/*41.102*/(""" """),format.raw/*41.103*/("""日</td>
        <td class="isDone"><a href="/lists/"""),_display_(/*42.45*/notification/*42.57*/.listId),format.raw/*42.64*/("""/"""),_display_(/*42.66*/notification/*42.78*/.taskId),format.raw/*42.85*/("""/comp" class="btn-border-mini">やった</a></td>
    </tr>
""")))};def /*3.2*/userId/*3.8*/ = {{request.session.get("userId").getOrElse("")}};
Seq[Any](format.raw/*3.57*/("""
"""),format.raw/*36.2*/("""

"""),format.raw/*44.2*/("""

"""),_display_(/*46.2*/main("Mother")/*46.16*/{_display_(Seq[Any](format.raw/*46.17*/("""

"""),format.raw/*48.1*/("""<!--各ボタン-->
<!--退会-->
    <div class="button">
        <a href="/deactivate" id="deactivate" class="btn-border">退会</a>
    </div>

<!--ログアウト-->
    <div class="button">
        <a href="/" id="logout" class="btn-border">ログアウト</a>
    </div>

<!--アカウント設定-->
    <div class="button">
        <a href="/settings" class="btn-border">アカウント</a>
    </div>

<!--新規リスト登録-->
    <div class="button">
        <a href="/lists/create" class="btn-border">新規リスト作成</a>
    </div>

<!--通知欄-->
<div class="w3-row">
    <div class="w3-half">
        <h3>通知</h3>
    </div>
</div>
    """),_display_(/*75.6*/if(nearDeadline.nonEmpty)/*75.31*/{_display_(Seq[Any](format.raw/*75.32*/("""
        """),format.raw/*76.9*/("""<table id="nearDeadline" class="w3-table w3-striped w3-border">
            <tr>
                <th>タスク名</th>
                <th>締切日</th>
                <th>完了状態</th>
            </tr>
            """),_display_(/*82.14*/for(notification <- nearDeadline) yield /*82.47*/{_display_(Seq[Any](format.raw/*82.48*/("""
                """),_display_(/*83.18*/notificationRow(notification)),format.raw/*83.47*/("""
            """)))}),format.raw/*84.14*/("""
        """),format.raw/*85.9*/("""</table>
    """)))}/*86.6*/else/*86.10*/{_display_(Seq[Any](format.raw/*86.11*/("""
        """),format.raw/*87.9*/("""<p>新しい通知はありません</p>
    """)))}),format.raw/*88.6*/("""
"""),format.raw/*89.1*/("""<div class="w3-row">
    <div class="w3-half">
        <h3>締切超過</h3>
    </div>
</div>
    """),_display_(/*94.6*/if(pastDeadline.nonEmpty)/*94.31*/{_display_(Seq[Any](format.raw/*94.32*/("""
        """),format.raw/*95.9*/("""<table id="pastDeadline" class="w3-table w3-striped w3-border">
            <tr class="w3-red">
                <th>タスク名</th>
                <th>締切日</th>
                <th>完了状態</th>
            </tr>
            """),_display_(/*101.14*/for(notification <- pastDeadline) yield /*101.47*/{_display_(Seq[Any](format.raw/*101.48*/("""
                """),_display_(/*102.18*/notificationRow(notification)),format.raw/*102.47*/("""
            """)))}),format.raw/*103.14*/("""
        """),format.raw/*104.9*/("""</table>
    """)))}/*105.6*/else/*105.10*/{_display_(Seq[Any](format.raw/*105.11*/("""
        """),format.raw/*106.9*/("""<p>締切を過ぎたタスクはありません</p>
    """)))}),format.raw/*107.6*/("""


"""),format.raw/*110.1*/("""<!--リスト-->
<div class="w3-row">
    <div class="w3-half">
        <h3>登録済みリスト</h3>
    </div>
</div>
    """),_display_(/*116.6*/if(entries.nonEmpty)/*116.26*/{_display_(Seq[Any](format.raw/*116.27*/("""
        """),format.raw/*117.9*/("""<table id="lists-list" class="w3-table w3-striped w3-border">
            <tr>
                <th>リスト名</th>
                <th>ジャンル</th>
                <th></th>
            </tr>
            """),_display_(/*123.14*/for(entry <- entries) yield /*123.35*/{_display_(Seq[Any](format.raw/*123.36*/("""
                """),_display_(/*124.18*/entryRow(entry)),format.raw/*124.33*/("""
            """)))}),format.raw/*125.14*/("""
        """),format.raw/*126.9*/("""</table>
    """)))}/*127.6*/else/*127.10*/{_display_(Seq[Any](format.raw/*127.11*/("""
        """),format.raw/*128.9*/("""<p>登録されたリストはありません</p>
    """)))}),format.raw/*129.6*/("""
"""),format.raw/*130.1*/("""<!--お母さん表示-->

<div class="sticky">

    """),_display_(/*134.6*/if(userId.toInt % 3 == 0)/*134.31*/{_display_(Seq[Any](format.raw/*134.32*/("""
    """),format.raw/*135.5*/("""<img src=""""),_display_(/*135.16*/routes/*135.22*/.Assets.versioned("images/sidebar.png")),format.raw/*135.61*/("""" width="140px" height="240px">
    """),_display_(/*136.6*/Math/*136.10*/.floor(Math.random() * 2)/*136.35*/  match/*136.42*/{/*137.5*/case 0 =>/*137.14*/ {_display_(Seq[Any](format.raw/*137.16*/("""
    """),_display_(/*138.6*/if(nearDeadline.nonEmpty)/*138.31*/{_display_(Seq[Any](format.raw/*138.32*/("""
    """),format.raw/*139.5*/("""<p class="char2">通知があります！<br>確認しましょう！</p>
    """)))}/*140.6*/else/*140.10*/{_display_(Seq[Any](format.raw/*140.11*/("""
    """),_display_(/*141.6*/LocalTime/*141.15*/.now().getHour()/*141.31*/ match/*141.37*/{/*142.5*/case 8|9|10|11|12     =>/*142.29*/ {_display_(Seq[Any](format.raw/*142.31*/("""<p class="char2">こんにちは！<br>調子どうですか？</p>""")))}/*143.5*/case 13|14|15|16|17   =>/*143.29*/ {_display_(Seq[Any](format.raw/*143.31*/("""<p class="char2">今日の体調は<br>どうですか？</p>""")))}/*144.5*/case 18|19|20         =>/*144.29*/ {_display_(Seq[Any](format.raw/*144.31*/("""<p class="char2">おかえりなさい！<br>お疲れ様です！</p>""")))}/*145.5*/case _                =>/*145.29*/ {_display_(Seq[Any](format.raw/*145.31*/("""<p class="char">こんにちは！</p>""")))}}),format.raw/*146.6*/("""
    """)))}),format.raw/*147.6*/("""
    """)))}/*149.5*/case 1 =>/*149.14*/ {_display_(Seq[Any](format.raw/*149.16*/("""
    """),_display_(/*150.6*/LocalTime/*150.15*/.now().getHour()/*150.31*/ match/*150.37*/{/*151.5*/case 6|7|8|9|10        =>/*151.30*/ {_display_(Seq[Any](format.raw/*151.32*/("""<p class="char">あ！おはよう<br>ございます！</p>""")))}/*152.5*/case 12|13|14          =>/*152.30*/ {_display_(Seq[Any](format.raw/*152.32*/("""<p class="char2">もうお昼です！<br>出かけましょう！</p>""")))}/*153.5*/case 23|0|1|2|3        =>/*153.30*/ {_display_(Seq[Any](format.raw/*153.32*/("""<p class="char2">こんな時間！<br>もう寝ましょう！</p>""")))}/*154.5*/case _                 =>/*154.30*/ {_display_(Seq[Any](format.raw/*154.32*/("""<p class="char2">今日も一日、<br>頑張りましょう！</p>""")))}}),format.raw/*155.6*/("""
    """)))}}),format.raw/*157.6*/("""
    """)))}),format.raw/*158.6*/("""

    """),_display_(/*160.6*/if(userId.toInt % 3 == 1)/*160.31*/{_display_(Seq[Any](format.raw/*160.32*/("""
    """),format.raw/*161.5*/("""<img src=""""),_display_(/*161.16*/routes/*161.22*/.Assets.versioned("images/sidebar_a.png")),format.raw/*161.63*/("""" width="140px" height="240px">
    """),_display_(/*162.6*/Math/*162.10*/.floor(Math.random() * 2)/*162.35*/  match/*162.42*/{/*163.5*/case 0 =>/*163.14*/ {_display_(Seq[Any](format.raw/*163.16*/("""
    """),_display_(/*164.6*/if(nearDeadline.nonEmpty)/*164.31*/{_display_(Seq[Any](format.raw/*164.32*/("""
    """),format.raw/*165.5*/("""<p class="char2">通知あるわよ！<br>確認して！</br>
    """)))}/*166.6*/else/*166.10*/{_display_(Seq[Any](format.raw/*166.11*/("""
    """),_display_(/*167.6*/LocalTime/*167.15*/.now().getHour()/*167.31*/ match/*167.37*/{/*168.5*/case 8|9|10|11|12     =>/*168.29*/ {_display_(Seq[Any](format.raw/*168.31*/("""<p class="char">調子はどう？</p>""")))}/*169.5*/case 13|14|15|16|17   =>/*169.29*/ {_display_(Seq[Any](format.raw/*169.31*/("""<p class="char">ご飯食べた？</p>""")))}/*170.5*/case 18|19|20         =>/*170.29*/ {_display_(Seq[Any](format.raw/*170.31*/("""<p class="char">おかえり！</p>""")))}/*171.5*/case _                =>/*171.29*/ {_display_(Seq[Any](format.raw/*171.31*/("""<p class="char">何してるの？</p>""")))}}),format.raw/*172.6*/("""
    """)))}),format.raw/*173.6*/("""
    """)))}/*175.5*/case 1 =>/*175.14*/ {_display_(Seq[Any](format.raw/*175.16*/("""
    """),_display_(/*176.6*/LocalTime/*176.15*/.now().getHour()/*176.31*/ match/*176.37*/{/*177.5*/case 6|7|8|9|10        =>/*177.30*/ {_display_(Seq[Any](format.raw/*177.32*/("""<p class="char">おはよう！<br>遅刻しないでね！</p>""")))}/*178.5*/case 12|13|14          =>/*178.30*/ {_display_(Seq[Any](format.raw/*178.32*/("""<p class="char2">もうお昼よ！<br>遅刻しないでね！</p>""")))}/*179.5*/case 23|0|1|2|3        =>/*179.30*/ {_display_(Seq[Any](format.raw/*179.32*/("""<p class="char2">こんな時間！<br>そろそろ寝なさい！</p>""")))}/*180.5*/case _                 =>/*180.30*/ {_display_(Seq[Any](format.raw/*180.32*/("""<p class="char2">今日も一日、<br>頑張って！</p>""")))}}),format.raw/*181.6*/("""
    """)))}}),format.raw/*183.6*/("""
    """)))}),format.raw/*184.6*/("""


    """),_display_(/*187.6*/if(userId.toInt % 3 == 2)/*187.31*/{_display_(Seq[Any](format.raw/*187.32*/("""
    """),format.raw/*188.5*/("""<img src=""""),_display_(/*188.16*/routes/*188.22*/.Assets.versioned("images/sidebar_k.png")),format.raw/*188.63*/("""" width="140px" height="240px">
    """),_display_(/*189.6*/Math/*189.10*/.floor(Math.random() * 2)/*189.35*/  match/*189.42*/{/*190.5*/case 0 =>/*190.14*/ {_display_(Seq[Any](format.raw/*190.16*/("""
    """),_display_(/*191.6*/if(nearDeadline.nonEmpty)/*191.31*/{_display_(Seq[Any](format.raw/*191.32*/("""
    """),format.raw/*192.5*/("""<p class="char2">通知がきとるで！<br>確認しぃ！</p>
    　　 """)))}/*193.9*/else/*193.13*/{_display_(Seq[Any](format.raw/*193.14*/("""
    """),_display_(/*194.6*/LocalTime/*194.15*/.now().getHour()/*194.31*/ match/*194.37*/{/*195.5*/case 8|9|10           =>/*195.29*/ {_display_(Seq[Any](format.raw/*195.31*/("""<p class="char">おはようさん</p>""")))}/*196.5*/case 13|14|15|16|17   =>/*196.29*/ {_display_(Seq[Any](format.raw/*196.31*/("""<p class="char">掃除をせい！</p>""")))}/*197.5*/case 18|19|20         =>/*197.29*/ {_display_(Seq[Any](format.raw/*197.31*/("""<p class="char2">もう遅い時間<br>になるで！</p>""")))}/*198.5*/case _                =>/*198.29*/ {_display_(Seq[Any](format.raw/*198.31*/("""<p class="char">調子はどや？</p>""")))}}),format.raw/*199.6*/("""
    """)))}),format.raw/*200.6*/("""
    """)))}/*202.5*/case 1 =>/*202.14*/ {_display_(Seq[Any](format.raw/*202.16*/("""
    """),_display_(/*203.6*/LocalTime/*203.15*/.now().getHour()/*203.31*/ match/*203.37*/{/*204.5*/case 6|7|8|9|10        =>/*204.30*/ {_display_(Seq[Any](format.raw/*204.32*/("""<p class="char">アメちゃん<br>いるか？</p>""")))}/*205.5*/case 12|13|14          =>/*205.30*/ {_display_(Seq[Any](format.raw/*205.32*/("""<p class="char2">もう昼やで！<br>起きんかい！</p>""")))}/*206.5*/case 23|0|1|2|3        =>/*206.30*/ {_display_(Seq[Any](format.raw/*206.32*/("""<p class="char2">こんな時間！<br>もう寝んかい！</p>""")))}/*207.5*/case _                 =>/*207.30*/ {_display_(Seq[Any](format.raw/*207.32*/("""<p class="char2">今日もおかんに<br>任しとき！</p>""")))}}),format.raw/*208.6*/("""
    """)))}}),format.raw/*210.6*/("""
    """)))}),format.raw/*211.6*/("""
"""),format.raw/*212.1*/("""</div>
""")))}))
      }
    }
  }

  def render(entries:Seq[models.List],nearDeadline:Seq[models.Task],pastDeadline:Seq[models.Task],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(entries)(nearDeadline)(pastDeadline)(request)

  def f:((Seq[models.List]) => (Seq[models.Task]) => (Seq[models.Task]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (entries) => (nearDeadline) => (pastDeadline) => (request) => apply(entries)(nearDeadline)(pastDeadline)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-28T01:43:31.506965
                  SOURCE: /Users/tsubasa/may_day_/app/views/home.scala.html
                  HASH: 92aac88fbb830be9f3b6b225a740e2008180bc54
                  MATRIX: 786->1|983->127|1022->212|1038->220|1138->244|1169->249|1204->258|1217->263|1244->270|1319->319|1332->324|1359->331|1388->334|1401->339|1430->348|1506->398|1519->403|1535->411|1549->417|1558->435|1575->444|1614->446|1661->491|1679->500|1719->502|1766->547|1784->556|1824->558|1875->607|1893->616|1933->618|1989->672|2007->681|2047->683|2098->732|2116->741|2156->743|2205->790|2223->799|2263->801|2324->844|2360->853|2976->1442|2990->1447|3018->1454|3325->1741|3349->1756|3457->1787|3489->1792|3525->1801|3546->1813|3574->1820|3647->1866|3668->1878|3696->1885|3725->1887|3746->1899|3774->1906|3809->1914|3831->1926|3859->1932|3926->1972|3947->1984|3977->1993|4006->1994|4036->1997|4057->2009|4088->2019|4117->2020|4147->2023|4168->2035|4198->2043|4228->2044|4306->2095|4327->2107|4355->2114|4384->2116|4405->2128|4433->2135|4510->155|4523->161|4602->210|4630->1738|4659->2190|4688->2193|4711->2207|4750->2208|4779->2210|5372->2777|5406->2802|5445->2803|5481->2812|5709->3013|5758->3046|5797->3047|5842->3065|5892->3094|5937->3108|5973->3117|6005->3131|6018->3135|6057->3136|6093->3145|6147->3169|6175->3170|6293->3262|6327->3287|6366->3288|6402->3297|6646->3513|6696->3546|6736->3547|6782->3565|6833->3594|6879->3608|6916->3617|6949->3631|6963->3635|7003->3636|7040->3645|7099->3673|7130->3676|7263->3782|7293->3802|7333->3803|7370->3812|7594->4008|7632->4029|7672->4030|7718->4048|7755->4063|7801->4077|7838->4086|7871->4100|7885->4104|7925->4105|7962->4114|8020->4141|8049->4142|8118->4184|8153->4209|8193->4210|8226->4215|8265->4226|8281->4232|8342->4271|8406->4308|8420->4312|8455->4337|8472->4344|8482->4350|8501->4359|8542->4361|8575->4367|8610->4392|8650->4393|8683->4398|8749->4445|8763->4449|8803->4450|8836->4456|8855->4465|8881->4481|8897->4487|8907->4493|8941->4517|8982->4519|9041->4564|9075->4588|9116->4590|9173->4633|9207->4657|9248->4659|9308->4705|9342->4729|9383->4731|9442->4764|9479->4770|9504->4781|9523->4790|9564->4792|9597->4798|9616->4807|9642->4823|9658->4829|9668->4835|9703->4860|9744->4862|9800->4904|9835->4929|9876->4931|9936->4977|9971->5002|10012->5004|10071->5049|10106->5074|10147->5076|10219->5122|10257->5134|10294->5140|10328->5147|10363->5172|10403->5173|10436->5178|10475->5189|10491->5195|10554->5236|10618->5273|10632->5277|10667->5302|10684->5309|10694->5315|10713->5324|10754->5326|10787->5332|10822->5357|10862->5358|10895->5363|10958->5407|10972->5411|11012->5412|11045->5418|11064->5427|11090->5443|11106->5449|11116->5455|11150->5479|11191->5481|11237->5513|11271->5537|11312->5539|11358->5571|11392->5595|11433->5597|11478->5628|11512->5652|11553->5654|11612->5687|11649->5693|11674->5704|11693->5713|11734->5715|11767->5721|11786->5730|11812->5746|11828->5752|11838->5758|11873->5783|11914->5785|11971->5828|12006->5853|12047->5855|12106->5900|12141->5925|12182->5927|12242->5973|12277->5998|12318->6000|12387->6043|12425->6055|12462->6061|12497->6069|12532->6094|12572->6095|12605->6100|12644->6111|12660->6117|12723->6158|12787->6195|12801->6199|12836->6224|12853->6231|12863->6237|12882->6246|12923->6248|12956->6254|12991->6279|13031->6280|13064->6285|13130->6332|13144->6336|13184->6337|13217->6343|13236->6352|13262->6368|13278->6374|13288->6380|13322->6404|13363->6406|13409->6438|13443->6462|13484->6464|13530->6496|13564->6520|13605->6522|13661->6564|13695->6588|13736->6590|13795->6623|13832->6629|13857->6640|13876->6649|13917->6651|13950->6657|13969->6666|13995->6682|14011->6688|14021->6694|14056->6719|14097->6721|14150->6760|14185->6785|14226->6787|14283->6830|14318->6855|14359->6857|14417->6901|14452->6926|14493->6928|14563->6972|14601->6984|14638->6990|14667->6991
                  LINES: 21->1|24->2|26->4|26->4|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|30->6|30->6|30->6|32->8|32->8|32->8|32->8|32->9|32->9|32->9|32->10|32->10|32->10|32->11|32->11|32->11|32->12|32->12|32->12|32->13|32->13|32->13|32->14|32->14|32->14|32->15|32->15|32->15|32->16|33->17|44->28|44->28|44->28|52->38|52->38|54->38|55->39|55->39|55->39|55->39|56->40|56->40|56->40|56->40|56->40|56->40|56->40|56->40|56->40|57->41|57->41|57->41|57->41|57->41|57->41|57->41|57->41|57->41|57->41|57->41|57->41|58->42|58->42|58->42|58->42|58->42|58->42|60->3|60->3|61->3|62->36|64->44|66->46|66->46|66->46|68->48|95->75|95->75|95->75|96->76|102->82|102->82|102->82|103->83|103->83|104->84|105->85|106->86|106->86|106->86|107->87|108->88|109->89|114->94|114->94|114->94|115->95|121->101|121->101|121->101|122->102|122->102|123->103|124->104|125->105|125->105|125->105|126->106|127->107|130->110|136->116|136->116|136->116|137->117|143->123|143->123|143->123|144->124|144->124|145->125|146->126|147->127|147->127|147->127|148->128|149->129|150->130|154->134|154->134|154->134|155->135|155->135|155->135|155->135|156->136|156->136|156->136|156->136|156->137|156->137|156->137|157->138|157->138|157->138|158->139|159->140|159->140|159->140|160->141|160->141|160->141|160->141|160->142|160->142|160->142|160->143|160->143|160->143|160->144|160->144|160->144|160->145|160->145|160->145|160->146|161->147|162->149|162->149|162->149|163->150|163->150|163->150|163->150|163->151|163->151|163->151|163->152|163->152|163->152|163->153|163->153|163->153|163->154|163->154|163->154|163->155|164->157|165->158|167->160|167->160|167->160|168->161|168->161|168->161|168->161|169->162|169->162|169->162|169->162|169->163|169->163|169->163|170->164|170->164|170->164|171->165|172->166|172->166|172->166|173->167|173->167|173->167|173->167|173->168|173->168|173->168|173->169|173->169|173->169|173->170|173->170|173->170|173->171|173->171|173->171|173->172|174->173|175->175|175->175|175->175|176->176|176->176|176->176|176->176|176->177|176->177|176->177|176->178|176->178|176->178|176->179|176->179|176->179|176->180|176->180|176->180|176->181|177->183|178->184|181->187|181->187|181->187|182->188|182->188|182->188|182->188|183->189|183->189|183->189|183->189|183->190|183->190|183->190|184->191|184->191|184->191|185->192|186->193|186->193|186->193|187->194|187->194|187->194|187->194|187->195|187->195|187->195|187->196|187->196|187->196|187->197|187->197|187->197|187->198|187->198|187->198|187->199|188->200|189->202|189->202|189->202|190->203|190->203|190->203|190->203|190->204|190->204|190->204|190->205|190->205|190->205|190->206|190->206|190->206|190->207|190->207|190->207|190->208|191->210|192->211|193->212
                  -- GENERATED --
              */
          