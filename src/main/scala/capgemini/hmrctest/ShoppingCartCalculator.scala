package capgemini.hmrctest

trait ShoppingCartCalculator {

  def calculateTotalCost(totalProductCount: Long) : Double

  def countProduct( productList : List[String]) : Long

  def checkoutCart(productList : List[String]) : Double = {
    return calculateTotalCost(countProduct(productList));
  }

}
