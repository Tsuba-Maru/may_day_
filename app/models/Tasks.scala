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
    db.run(
      sql"SELECT task_id, list_id, name1, name2, description, dead_year, dead_month, dead_day, created_at, is_done FROM #$table"
        .as[Task]
    )
  )

  /**
    * 親リストのIDを引数にとり、親リストIDが一致するタスクのみを取得する
    * @param listId
    * @return
    */
  def listFromListID(listId: Int): Seq[Task] = Await.result(
    db.run(sql"SELECT * FROM #$table WHERE list_id='#$listId'".as[Task])
  )

  def findByID(taskId: Int): Option[Task] = Await.result(
    db.run(sql"SELECT * FROM #$table WHERE task_id='#$taskId'".as[Task].headOption)
  )

  def findByIsDone(listId: Int, isDone: Boolean): Seq[Task] = Await.result(
    db.run(sql"SELECT * FROM #$table WHERE list_id='#$listId' AND is_done='#$isDone'".as[Task])
  )

  def search(listId: Int, title: String, isDone: Boolean): Seq[Task] = Await.result(
    db.run(sql"SELECT * FROM #$table WHERE list_id='#$listId' AND name1='#$title' AND is_done='#$isDone'".as[Task])
  )

  def save(task: Task): Int = task match {
    case Task(0, listId, name1, name2, description, deadYear, deadMonth, deadDay, _, isDone) =>
      Await.result(
        db.run(
          sqlu"INSERT INTO #$table (list_id, name1, name2,  description, dead_year, dead_month, dead_day, is_done) VALUES ('#$listId', '#$name1', '#$name2', '#$description', '#$deadYear', '#$deadMonth', '#$deadDay', '#$isDone')"
        )
      )
    case Task(taskId, listId, name1, name2, description, deadYear, deadMonth, deadDay, _, isDone) =>
      Await.result(
        db.run(
          sqlu"UPDATE #$table SET name1='#$name1', name2='#$name2', description='#$description', dead_year='#$deadYear', dead_month='#$deadMonth', dead_day='#$deadDay', is_done='#$isDone' WHERE task_id = '#$taskId'"
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
      sqlu"UPDATE #$table SET is_done='#$isDone' WHERE task_id = '#$taskId'"
    )
  )

  def delete(taskId: Int): Int = Await.result(
    db.run(sqlu"DELETE FROM #$table WHERE task_id = '#$taskId'")
  )
 
   def deleteList(id: Int): Int = Await.result(
    db.run(sqlu"DELETE FROM #$table WHERE list_id=#$id")
  )
}
