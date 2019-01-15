object Shop extends App{
  def checkout2(shoppingList:List[String]):Double={
    var price = 0.0
    val apples = shoppingList.groupBy(identity).mapValues(_.size)("Apple")
    val oranges = shoppingList.groupBy(identity).mapValues(_.size)("Orange")
    price+= (apples/2* 0.6) + (apples%2 * 0.6) + (oranges/3 *0.25*2) + (oranges%3*0.25)
    price
  }
  println(checkout2(List("Apple","Apple","Orange","Apple", "Orange", "Orange", "Orange")))
}
