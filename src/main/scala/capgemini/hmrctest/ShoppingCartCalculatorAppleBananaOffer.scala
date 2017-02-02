package capgemini.hmrctest

class ShoppingCartCalculatorAppleBananaOffer extends ShoppingCartCalculatorMixedOffer {


  @Override
  def calculateTotalCost(productOneTotal: Long, productTwoTotal:Long): Double = {
    var totalCost = 0.0
    if (productOneTotal > 0 && productTwoTotal > 0){
      totalCost = productOneTotal * FruitEnum.APPLE.getCost().doubleValue()
      if( productTwoTotal > productOneTotal){
        totalCost += (productTwoTotal % productOneTotal) * FruitEnum.BANANA.getCost().doubleValue()
      }
    } else if (productOneTotal > 0 && productTwoTotal == 0){
      totalCost = (productOneTotal * FruitEnum.APPLE.getCost().doubleValue())
    } else if (productOneTotal == 0 && productTwoTotal > 0){
      totalCost = (productTwoTotal * FruitEnum.BANANA.getCost().doubleValue())
    }
    Math.round(totalCost*100)/100D
  }

  @Override
  def countProductOne(productList : List[String]) : Long = {
    productList.filter(_.equalsIgnoreCase(FruitEnum.APPLE.getName())).length;
  }

  @Override
  def countProductTwo(productList : List[String]) : Long = {
    productList.filter(_.equalsIgnoreCase(FruitEnum.BANANA.getName())).length;
  }

}

