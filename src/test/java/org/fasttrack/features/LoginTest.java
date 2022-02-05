package org.fasttrack.features;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;


public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredentialsTest (){
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials(EnvConstants.USER_EMAIL, EnvConstants.USER_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.checkUserIsLoggedInOrRegisterSuccessfully(EnvConstants.USER_NAME);
    }

    @Test
    public void loginWithInvalidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials("ramoramoramo@mailinator.com", EnvConstants.USER_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.checkErrorMessage("ERROR: Invalid email address.");
    }

    @Test
    public void forgotPasswordTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.clickLostPassword();
        myAccountSteps.enterEmailAddress("sausausau@mailinator.com");
        myAccountSteps.clickResetPassword();
        myAccountSteps.checkDetailsMessage("Password reset email has been sent.");
    }

    @Test
    public void loginOnlyWithEmail(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterEmail("ramonaramona@mailinator.com");
        loginSteps.clickLogin();
        loginSteps.checkErrorMessage("ERROR: The password field is empty.");
    }

    @Test
    public void loginOnlyWithPassword(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterPassword("RamoRamo12345.");
        loginSteps.clickLogin();
        loginSteps.checkErrorMessage("Error: Username is required.");

    }






}
