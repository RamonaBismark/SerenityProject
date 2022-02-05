package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;

public class MyAccountSteps extends BaseSteps {

    @Step
    public void clickOnMyAccount() {
        myAccountPage.clickOnMyAccountButton();
    }

    @Step
    public void clickOnOrders() {
        myAccountPage.clickOnOrdersButton();
    }

    @Step
    public void clickOnView() {
        myAccountPage.clickOnViewButton();
    }

    @Step
    public void clickOnAddresses(){
        myAccountPage.clickOnAddressesButton();
    }

    @Step
    public void clickOnEdit(){
        myAccountPage.clickOnEditButton();
    }

    @Step
    public void setNewCity(String city){
        myAccountPage.setNewCity(city);
    }

    @Step
    public void clickOnSaveAddress(){
        myAccountPage.clickOnSaveAddressButton();
    }

    @Step
    public void checkDetailsMessage(String message){
        myAccountPage.checkDetailsMessage(message);
    }

    @Step
    public void clickOnLogOutButton(){
        myAccountPage.clickOnLogOutButton();
    }

    @Step
    public void enterEmailAddress(String email){
        myAccountPage.enterEmailAddress(email);
    }
    @Step
    public void clickResetPassword(){
        myAccountPage.clickResetPasswordButton();
    }

    }
