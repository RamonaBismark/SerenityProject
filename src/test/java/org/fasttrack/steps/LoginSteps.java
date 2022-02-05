package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.yecht.Data;

public class LoginSteps extends BaseSteps {



    @Step
    public void navigateToLoginPage(){
        homePage.clickLoginLink();
    }

    @Step
    public void enterCredentials(String email, String pass){
        loginPage.setEmailField(email);
        loginPage.setPasswordField(pass);
    }

    @Step
    public void enterEmail(String email){
        loginPage.setEmailField(email);
    }

    @Step
    public void enterPassword(String password){
        loginPage.setPasswordField(password);
    }

    @Step
    public void clickLogin(){
        loginPage.clickLoginButton();
    }

    @Step
    public void checkUserIsLoggedInOrRegisterSuccessfully(String userName){
        myAccountPage.checkUserLoggedInOrRegister(userName);
    }


    @Step
    public void checkErrorMessage(String message){
        loginPage.checkErrorMessage(message);
    }

    @Step
    public void doLogin(String user, String pass){
        navigateToLoginPage();
        enterCredentials(user,pass);
        clickLogin();
    }

    @Step
    public void clickLostPassword(){
        loginPage.clickLostPasswordLink();
    }

    @Step
    public void checkIfLoginButtonIsDisplayed(){
        loginPage.checkIfLoginButtonIsDisplayed();
    }


}
