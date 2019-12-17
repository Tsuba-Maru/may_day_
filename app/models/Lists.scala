package models

import javax.inject.{Inject, Singleton}
import scala.concurrent.ExecutionContext

import play.api.db.slick.{DatabaseConfigProvider => DBConfigProvider}

/**
  * list テーブルへの Accessor
  */
@Singleton
class Lists @Inject()(dbcp: DBConfigProvider)(implicit ec: ExecutionContext) extends Dao(dbcp) {

  import profile.api._
  import utility.Await

  val table = "list"

  /**
    * DB上に保存されている全てのタスクを取得する
    * @return
    */
  def list: Seq[List] = Await.result(
    db.run(sql"SELECT list_id, list_name, user_id, genre_id FROM #$table".as[List])
  )

}
