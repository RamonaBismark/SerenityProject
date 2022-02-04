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
        cartSteps.clickOnProceedToCheckOut();
        checkoutSteps.setFirstName("Ramo");
        checkoutSteps.setLastName("Popescu");
        checkoutSteps.setAddress("Strada Test");
        checkoutSteps.setCity("Cluj-Napoca");
        checkoutSteps.setPostcode("407812");
        checkoutSteps.setPhone("0751000000");
        checkoutSteps.clickOnPlaceOrder();
        checkoutSteps.checkPlacedOrderMess("Thank you. Your order has been received.");
    }

    @Test
    public void checkoutForTheSecondTime(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASSWORD);
        searchSteps.searchAndSelectProduct("SUNGLASSES");
        cartSteps.clickAddProductToCart();
        cartSteps.clickOnShoppingCart();
        cartSteps.clickOnProceedToCheckOut();
        checkoutSteps.clickOnPlaceOrder();
        checkoutSteps.checkPlacedOrderMess("Thank you. Your order has been received.");
    }


    @Test
    public void checkoutAsGuestWithoutLogin(){
        searchSteps.searchAndSelectProduct("SUNGLASSES");
        cartSteps.clickAddProductToCart();
        cartSteps.clickOnShoppingCart();
        cartSteps.clickOnProceedToCheckOut();
        checkoutSteps.setFirstName("Ramo");
        checkoutSteps.setLastName("Popescu");
        checkoutSteps.setAddress("Strada Test");
        checkoutSteps.setCity("Cluj-Napoca");
        checkoutSteps.setPostcode("407812");
        checkoutSteps.setPhone("0751000000");
        checkoutSteps.enterEmail("testramo@mailinator.com");
        checkoutSteps.clickOnPlaceOrder();
        checkoutSteps.checkPlacedOrderMess("Thank you. Your order has been received.");
    }

    @Test
    public void checkoutWithoutMandatoryEmailField(){
        searchSteps.searchAndSelectProduct("SUNGLASSES");
        cartSteps.clickAddProductToCart();
        cartSteps.clickOnShoppingCart();
        cartSteps.clickOnProceedToCheckOut();
        checkoutSteps.setFirstName("Ramo");
        checkoutSteps.setLastName("Popescu");
        checkoutSteps.setAddress("Strada Test");
        checkoutSteps.setCity("Cluj-Napoca");
        checkoutSteps.setPostcode("407812");
        checkoutSteps.setPhone("0751000000");
        checkoutSteps.clickOnPlaceOrder();
        checkoutSteps.checkErrorMessage("Billing Email address is a required field.");
    }



}
