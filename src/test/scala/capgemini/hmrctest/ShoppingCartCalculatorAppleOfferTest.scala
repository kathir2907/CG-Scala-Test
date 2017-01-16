package capgemini.hmrctest

import org.scalatest._

class ShoppingCartCalculatorAppleOfferTest extends FlatSpec {

  val shoppingCartCalculator = new ShoppingCartCalculatorAppleOffer()

  "ShoppingCartCalculatorAppleOffer" should "checkout shopping cart for 1 Apple" in {
    assert(shoppingCartCalculator.checkoutCart(List("Apple")) == 60)
  }

  "ShoppingCartCalculatorAppleOffer" should "checkout shopping cart for 2 Apples" in {
    assert(shoppingCartCalculator.checkoutCart(List("Apple","Apple")) == 60)
  }

  "ShoppingCartCalculatorAppleOffer" should "checkout shopping cart for 3 Apples" in {
    assert(shoppingCartCalculator.checkoutCart(List("Apple","Apple","Apple")) == 120)
  }

  "ShoppingCartCalculatorAppleOffer" should "checkout shopping cart for 4 Apples" in {
    assert(shoppingCartCalculator.checkoutCart(List("Apple","Apple","Apple","Apple")) == 120)
  }

}
