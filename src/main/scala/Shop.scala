object Shop extends App{
  def checkoutManager(shoppingList: List[String])= {
    orangeCost(shoppingList.count(_=="Orange")) + applesCost(shoppingList.count(_=="Apple"))
  }
  def applesCost(numberOfApples:Int):Double= (numberOfApples/2* 0.6) + (numberOfApples%2 * 0.6)

  def orangeCost(numberOfOranges:Int):Double= (numberOfOranges/3 *0.25*2) + (numberOfOranges%3*0.25)

  println(checkoutManager(List("Apple","Apple","Orange","Apple", "Orange", "Orange", "Orange")))
}