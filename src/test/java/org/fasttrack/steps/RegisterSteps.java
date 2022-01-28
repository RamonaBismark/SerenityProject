package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;


public class RegisterSteps extends BaseSteps {


    @Step
    public void navigateToRegisterPage (){
        homePage.clickRegisterLink();
    }

    @Step
    public void enterCredentials(String email, String pass){
        registerPage.setEmailField(email);
        registerPage.setPasswordField(pass);
    }

    @Step
    public void clickRegister() {
        registerPage.clickRegisterButton();
    }

    @Step
    public void checkUserIsLoggedInOrRegisterSuccessfully(String userName){
        myAccountPage.checkUserLoggedInOrRegister(userName);
    }


    @Step
    public void checkErrorMessageAtRegister (String message){
        registerPage.checkErrorMessageAtRegister(message);
    }

}
