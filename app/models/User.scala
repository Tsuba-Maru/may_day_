package models

import java.sql.Timestamp

/**
  * Domain model of task
  * @param userId      ID
  * @param userName    ユーザー名
  * @param password    パスワード
  * @param isActive    アクティブ状態
  * @param createdAt   作成日時
  */
case class User(userId: Int, userName: String, password: String, isActive: Boolean, createdAt: Timestamp)

object User extends DomainModel[User] {
  import slick.jdbc.GetResult
  implicit def getResult: GetResult[User] = GetResult(
    r => User(r.nextInt, r.nextString, r.nextString, r.nextBoolean, r.nextTimestamp)
  )

  def apply(userName: String, password: String, isActive: Boolean): User = User(0, userName, password, isActive, null)
}
