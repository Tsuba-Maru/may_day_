package models

import javax.inject.{Inject, Singleton}
import scala.concurrent.ExecutionContext

import play.api.db.slick.{DatabaseConfigProvider => DBConfigProvider}

/**
  * task テーブルへの Accessor
  */
@Singleton
class Tasks @Inject()(dbcp: DBConfigProvider)(implicit ec: ExecutionContext) extends Dao(dbcp) {

  import profile.api._
  import utility.Await

  val table = "task"

  /**
    * DB上に保存されている全てのタスクを取得する
    * @return
    */
  def list: Seq[Task] = Await.result(
    db.run(sql"SELECT task_id, list_id, name1, name2, description, deadline, created_at, is_done FROM #$table".as[Task])
  )

  /**
    * 親リストのIDを引数にとり、親リストIDが一致するタスクのみを取得する
    * @param listId
    * @return
    */
  def listFromListID(listId: Int): Seq[Task] = Await.result(
    db.run(sql"SELECT * FROM #$table WHERE list_id='#$listId'".as[Task])
  )

  def findByID(listId: Int): Option[Task] = Await.result(
    db.run(sql"SELECT * FROM #$table WHERE lits_id=#$listId".as[Task].headOption)
  )

  def save(task: Task): Int = task match {
    case Task(0, listId, name1, name2, description, deadline, _, isDone) =>
      Await.result(
        db.run(sqlu"INSERT INTO #$table (listId, name1, name2,  description, deadline, is_done) VALUES ('#$listId', '#$name1', '#$name2', '#$description', '#$deadline', '#$isDone')")
      )
    case Task(taskId, listId, name1, name2, description, deadline, _, isDone) =>
      Await.result(
        db.run(
          sqlu"UPDATE #$table SET name1='#$name1', name2='#$name2', description='#$description', deadline='#$deadline', is_done='#$isDone' WHERE task_id = #$taskId"
        )
      )
  }

  /**
    * 完了状態のみを変える
    * @param taskId
    * @param isDone
    * @return
    */
  def switchIsDone(taskId: Int, isDone: Boolean): Int = Await.result(
    db.run(
      sqlu"UPDATE #$table SET is_done='#$isDone' WHERE task_id = #$taskId"
    )
  )

  def delete(taskId: Int): Int = Await.result(
    db.run(sqlu"DELETE FROM #$table WHERE task_id = #$taskId")
  )
}
