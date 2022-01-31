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
        loginSteps.enterEmail(EnvConstants.USER_EMAIL);
        loginSteps.clickResetPassword();

    }




}
