package capgemini.hmrctest

import org.scalatest.FlatSpec

class ShoppingCartCalculatorAppleBananaOfferTest extends FlatSpec {

  val shoppingCartCalculator = new ShoppingCartCalculatorAppleBananaOffer()

  "ShoppingCartCalculatorAppleBananaOffer" should "checkout shopping cart for 1 Apple" in {
    assert(shoppingCartCalculator.checkoutCart(List("Apple")) == 0.6)
  }

  "ShoppingCartCalculatorAppleBananaOffer" should "checkout shopping cart for 1 Banana" in {
    assert(shoppingCartCalculator.checkoutCart(List("Banana")) == 0.2)
  }

  "ShoppingCartCalculatorAppleBananaOffer" should "checkout shopping cart for 1 Apple and 1 Banana" in {
    assert(shoppingCartCalculator.checkoutCart(List("Apple","Banana")) == 0.6)
  }

  "ShoppingCartCalculatorAppleBananaOffer" should "checkout shopping cart for 2 Apples and 2 Banana" in {
    assert(shoppingCartCalculator.checkoutCart(List("Apple","Apple","Banana","Banana")) == 1.2)
  }

  "ShoppingCartCalculatorAppleBananaOffer" should "checkout shopping cart for 3 Apples and 2 Banana" in {
    assert(shoppingCartCalculator.checkoutCart(List("Apple","Apple","Apple","Banana","Banana")) == 1.8)
  }

  "ShoppingCartCalculatorAppleBananaOffer" should "checkout shopping cart for 2 Apples and 3 Banana" in {
    assert(shoppingCartCalculator.checkoutCart(List("Apple","Apple","Banana","Banana","Banana")) == 1.4)
  }
}
