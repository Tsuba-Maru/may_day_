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

  def save(enquete: List): Int = enquete match {
    case List(0, list_name, user_id, genre_id) =>
      Await.result(db.run(sqlu"INSERT INTO #$table (list_name, user_id, genre_id) VALUES('#$list_name', '#$user_id', '#$genre_id')"))
    case List(list_id, list_name, user_id, genre_id) =>
      Await.result(db.run(sqlu"UPDATE #$table SET list_name='#$list_name', user_id=#$user_id, genre_id=#$genre_id"))
  }

}