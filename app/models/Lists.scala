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
      Await.result(db.run(sqlu"UPDATE #$table SET list_name='#$list_name', user_id=#$user_id, genre_id=#$genre_id WHERE list_id = #$list_id"))
  }

  def findByListId(id: Int): Option[List] = Await.result(
    db.run(
      sql"SELECT list_id, list_name, user_id, genre_id FROM #$table WHERE list_id=#$id".as[List].headOption
    )
  )

  def findByUserId(userId: Int): Seq[List] = Await.result(
    db.run(sql"SELECT list_id, list_name, user_id, genre_id FROM #$table WHERE user_id=#$userId".as[List])
  )

  def deleteList(id: Int): Int = Await.result(
    db.run(sqlu"DELETE FROM #$table WHERE list.id=#$id")
  )

  def editListName(listName: String)(listId: Int): Int = Await.result(
    db.run(sqlu"UPDATE #$table SET list_name='#$listName' WHERE list_id=#$listId")
  )

}