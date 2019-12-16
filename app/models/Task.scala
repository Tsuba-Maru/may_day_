package models

import java.sql.Timestamp

/**
  * Domain model of task
  * @param taskId      タスクID
  * @param listId      親リストのID
  * @param name1       名前１
  * @param name2       名前２
  * @param description 詳細
  * @param deadline    締切
  * @param createdAt   作成日時
  * @param isDone      完了状態
  */
case class Task(taskId: Int, listId: Int, name1: String, name2: String, description: String, deadline: String, createdAt: Timestamp, isDone: Boolean)

object Task extends DomainModel[Task] {
  import slick.jdbc.GetResult
  implicit def getResult: GetResult[Task] = GetResult(
    r => Task(r.nextInt, r.nextInt, r.nextString, r.nextString, r.nextString, r.nextString, r.nextTimestamp, r.nextBoolean)
  )

  def apply(listId: Int, name1: String, name2: String, description: String, deadline: String, isDone: Boolean): Task = Task(0, listId, name1, name2, description, deadline, null, isDone)
}
