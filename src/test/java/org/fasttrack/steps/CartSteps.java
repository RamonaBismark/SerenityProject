package org.fasttrack.steps;


import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class CartSteps extends BaseSteps {
    @Step
    public void clickAddProductToCart(){
        productPage.clickAddToCartButton();
    }

    @Step
    public void clickOnShoppingCart(){
        productPage.clickOnShoppingCart();
    }



    @Step
    public void clickOnViewShoppingCart(){
        productPage.clickOnShoppingCart();
    }

    @Step
    public void clickOnProceedToCheckOut(){
        productPage.clickOnProceedToCheckoutButton();
    }



    @Step
    public void checkSubtotalPriceIsDisplayedCorrectly(){
        Assert.assertTrue("The subtotal price is not correct!" , cartPage.isSubtotalPriceCorrect());
    }

    @Step
    public void removeProductFromCart (String productName){
        Assert.assertTrue(cartPage.removeProduct(productName));
    }


}
