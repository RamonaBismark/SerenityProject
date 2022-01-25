package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

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
    


}
