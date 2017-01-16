package capgemini.hmrctest

class ShoppingCartCalculatorAppleOffer extends ShoppingCartCalculator {

  @Override
  def calculateTotalCost(totalApples : Long): Double = {
    ((totalApples/2) * FruitEnum.APPLE.getCost() ) + (totalApples % 2 * FruitEnum.APPLE.getCost() )
  }

  @Override
  def countProduct(productList : List[String]) : Long = {
    productList.filter(_.equalsIgnoreCase(FruitEnum.APPLE.getName())).length;
  }

}
