object Shop extends App{
  def checkout(shoppingList:List[String]):Double={
    var price = 0.0
    shoppingList.foreach(element => {
      if(element=="Apple") price+=0.6
      else if(element=="Orange") price+=0.25
    })
    price
  }
  println(checkout(List("Apple","Apple","Orange","Apple")))
}
