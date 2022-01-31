package org.fasttrack.features;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void validCheckoutForTheFirstTime(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASSWORD);
        searchSteps.searchAndSelectProduct("BELT");
        cartSteps.clickAddProductToCart();
        cartSteps.clickOnShoppingCart();
        cartSteps.clickOnProceedToCheckOutButton();

 //       --- incomplet
    }



 // checkoutasguest - fara login


 //logged in, dar checkout a 2a oara, sa verific daca raman datele completate
}
