package capgemini.hmrctest

class ShoppingCartCalculatorOrangeOffer extends ShoppingCartCalculator {

  @Override
  def calculateTotalCost(totalApples : Long): Double = {
    ((totalApples/3) * 2 * FruitEnum.ORANGE.getCost().doubleValue() ) + (totalApples % 3 * FruitEnum.ORANGE.getCost().doubleValue() )
  }

  @Override
  def countProduct(productList : List[String]) : Long = {
    productList.filter(_.equalsIgnoreCase(FruitEnum.ORANGE.getName())).length;
  }

}



