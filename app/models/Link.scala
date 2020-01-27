package models

/**
  * Domain model of link
  * @param num
  * @param listId       リストID
  * @param userId       ユーザID
  */
case class Link(num: Int, listId: Int, userId: Int)

object Link extends DomainModel[Link] {
  import slick.jdbc.GetResult
  implicit def getResult: GetResult[Link] = GetResult(
    r => Link(r.nextInt, r.nextInt, r.nextInt)
  )

  def apply(listId: Int, userId: Int): Link = Link(0, listId, userId)
}
