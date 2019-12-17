package models

import javax.inject.{Inject, Singleton}
import scala.concurrent.ExecutionContext

import play.api.db.slick.{DatabaseConfigProvider => DBConfigProvider}

/**
  * task テーブルへの Accessor
  */
@Singleton
class Users @Inject()(dbcp: DBConfigProvider)(implicit ec: ExecutionContext) extends Dao(dbcp) {

  import profile.api._
  import utility.Await

  val table = "user"

  /**
    * DB上に保存されている全てのタスクを取得する
    * @return
    */
  def list: Seq[User] = Await.result(
    db.run(sql"SELECT user_id, user_name, password, is_active, created_at FROM #$table".as[User])
  )

  def findByID(userId: Int): Option[User] = Await.result(
    db.run(
      sql"SELECT user_id, user_name, password, is_active, created_at FROM #$table WHERE userId=#$userId"
        .as[User]
        .headOption
    )
  )

  def findByName(userName: String): Option[User] = Await.result(   //名前で検索
    db.run(
      sql"SELECT user_id, user_name, password, is_active, created_at FROM #$table WHERE user_name LIKE '#$userName'"
        .as[User]
        .headOption
    )
  )

  def save(user: User): Int = user match {
    case User(0, userName, password, isActive, _) =>
      Await.result(
        db.run(
          sqlu"INSERT INTO #$table (user_name, password, is_active) VALUES ('#$userName', '#$password', '#$isActive')"
        )
      )
    case User(userId, userName, password, isActive, _) =>
      Await.result(
        db.run(
          sqlu"UPDATE #$table SET user_name='#$userName', password='#$password', is_active='#$isActive' WHERE user_id = #$userId"
        )
      )
  }
}
