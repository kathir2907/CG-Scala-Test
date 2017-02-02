package capgemini.hmrctest

class ShoppingCartCalculatorAppleOffer extends ShoppingCartCalculator {

  @Override
  def calculateTotalCost(totalApples : Long): Double = {
    ((totalApples/2) * FruitEnum.APPLE.getCost().doubleValue() ) + (totalApples % 2 * FruitEnum.APPLE.getCost().doubleValue() )
  }

  @Override
  def countProduct(productList : List[String]) : Long = {
    productList.filter(_.equalsIgnoreCase(FruitEnum.APPLE.getName())).length;
  }

}

