package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.{DatabaseConfigProvider => DBConfigProvider}

import scala.concurrent.ExecutionContext

/**
  * link テーブルへの Accessor
  */
@Singleton
class Links @Inject()(dbcp: DBConfigProvider)(implicit ec: ExecutionContext) extends Dao(dbcp) {

  import profile.api._
  import utility.Await

  val table = "link"

  def save(link: Link): Int = link match { //新規追加
    case Link(0, listId, userId) =>
      Await.result(
        db.run(
          sqlu"INSERT INTO #$table (list_id, user_id) VALUES ('#$listId', '#$userId')"
        )
      )
    case Link(num, listId, userId) =>
      Await.result(
        db.run(
          sqlu"UPDATE #$table SET list_id=#$listId, user_id=#$userId WHERE num = #$num"
        )
      )
  }

  def findByUserId(userId: Int): Seq[Link] = Await.result(
    db.run(sql"SELECT num, list_id, user_id FROM #$table WHERE user_id=#$userId".as[Link])
  )

  def deleteList(listId: Int): Int = Await.result(
    db.run(sqlu"DELETE FROM #$table WHERE list_id=#$listId")
  )

  def deleteLink(listId: Int, userId: Int): Int = Await.result(
    db.run(sqlu"DELETE FROM #$table WHERE list_id=#$listId AND user_id=#$userId")
  )

}
