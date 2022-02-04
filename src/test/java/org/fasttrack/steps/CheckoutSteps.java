package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;


public class CheckoutSteps extends BaseSteps{

    @Step
    public void setFirstName(String firstName){
        checkoutPage.setFirstNameField(firstName);
    }

    @Step
    public void setLastName(String lastName){
        checkoutPage.setLastNameField(lastName);
    }

    @Step
    public void setAddress(String address){
        checkoutPage.setAddressField(address);
    }

    @Step
    public void setCity(String city){
        checkoutPage.setCityField(city);
    }


    @Step
    public void setPostcode(String postcode){
        checkoutPage.setPostcodeField(postcode);
    }


    @Step
    public void setPhone(String phone){
        checkoutPage.setPhoneField(phone);
    }


    @Step
    public void clickOnPlaceOrder(){
        checkoutPage.clickOnPlaceOrderButton();
    }

    @Step
    public void checkPlacedOrderMess(String message){
        checkoutPage.checkPlacedOrderMessage(message);
    }

    @Step
    public void enterEmail(String email) {
        checkoutPage.setEmailField(email);
    }

    @Step
    public void checkErrorMessage(String message){
        checkoutPage.checkErrorMessage(message);
    }
}
