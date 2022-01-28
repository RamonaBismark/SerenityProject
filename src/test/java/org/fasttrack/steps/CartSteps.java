package org.fasttrack.steps;


import net.thucydides.core.annotations.Step;


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
    public void clickOnRemoveFromCartButton(){
        productPage.clickOnRemoveFromCartButton();
    }

    @Step
    public void clickOnViewShoppingCart(){
        productPage.clickOnViewShoppingCart();
    }


    @Step
    public void navigateToCart (){
        homePage.clickOnCartIcon ();
    }

//    @Step
//    public void checkSubtotalPriceIsDisplayedCorrectly(){
//        Assert.assertTrue("The subtotal price is not correct!" , cartPage.isSubtotalPriceCorrect());
//    }
}
