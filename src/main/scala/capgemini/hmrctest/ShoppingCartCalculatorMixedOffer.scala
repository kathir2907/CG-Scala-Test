package capgemini.hmrctest

trait ShoppingCartCalculatorMixedOffer {

  def calculateTotalCost(productOneTotal: Long, productTwoTotal:Long) : Double

  def countProductTwo( productList : List[String]) : Long

  def countProductOne( productList : List[String]) : Long

  def checkoutCart(productList : List[String]) : Double = {
    return calculateTotalCost(countProductOne(productList), countProductTwo(productList));
  }

}
