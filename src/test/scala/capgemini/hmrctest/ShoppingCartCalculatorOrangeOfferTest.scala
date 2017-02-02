package capgemini.hmrctest

import org.scalatest._

class ShoppingCartCalculatorOrangeOfferTest extends FlatSpec {

  val shoppingCartCalculator = new ShoppingCartCalculatorOrangeOffer()

  "ShoppingCartCalculatorOrangeOffer" should "checkout shopping cart for 1 Orange" in {
    assert(shoppingCartCalculator.checkoutCart(List("Orange")) == 0.25)
  }

  "ShoppingCartCalculatorOrangeOffer" should "checkout shopping cart for 2 Oranges" in {
    assert(shoppingCartCalculator.checkoutCart(List("Orange","Orange")) == 0.5)
  }

  "ShoppingCartCalculatorOrangeOffer" should "checkout shopping cart for 3 Oranges" in {
    assert(shoppingCartCalculator.checkoutCart(List("Orange","Orange","Orange")) == 0.5)
  }

  "ShoppingCartCalculatorOrangeOffer" should "checkout shopping cart for 4 Oranges" in {
    assert(shoppingCartCalculator.checkoutCart(List("Orange","Orange","Orange","Orange")) == 0.75)
  }

}
