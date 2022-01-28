package org.fasttrack.features;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void addToCartTest (){
        loginSteps.doLogin(EnvConstants.USER_EMAIL,EnvConstants.USER_PASSWORD);
        searchSteps.searchAndSelectProduct("BELT");
        cartSteps.clickAddProductToCart();
    }

    @Test
    public void checkCartTotalSummaryTest (){
        loginSteps.doLogin(EnvConstants.USER_EMAIL,EnvConstants.USER_PASSWORD);
        searchSteps.searchAndSelectProduct("BELT");
        cartSteps.clickAddProductToCart();
        searchSteps.searchAndSelectProduct("SUNGLASSES");
        cartSteps.clickAddProductToCart();
  //      cartSteps.checkSubtotalPriceIsDisplayedCorrectly();

    }

    @Test
    public void removeFromCartProduct (){
        loginSteps.doLogin(EnvConstants.USER_EMAIL,EnvConstants.USER_PASSWORD);
        cartSteps.clickOnShoppingCart();
        cartSteps.clickOnRemoveFromCartButton();
    }


}
