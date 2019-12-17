package models

/**
  * Domain model of list
  * @param listId       リストID
  * @param listName     リスト名
  * @param userId       ユーザID
  * @param genreId      ジャンルID
  */
case class List(listId: Int, listName: String, userId: Int, genreId: Int)

object List extends DomainModel[List] {
  import slick.jdbc.GetResult
  implicit def getResult: GetResult[List] = GetResult(
    r => List(r.nextInt, r.nextString, r.nextInt, r.nextInt)
  )

  def apply(listName: String, userId: Int, genreId: Int): List = List(0, listName, userId, genreId)
}
