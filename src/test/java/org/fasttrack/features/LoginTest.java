package org.fasttrack.features;

import org.junit.Test;
import utils.EnvConstants;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredentialsTest (){
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials(EnvConstants.USER_EMAIL, EnvConstants.USER_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.checkUserIsLoggedIn(EnvConstants.USER_NAME);
    }

    @Test
    public void loginWithInvalidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials("ramoramoramo@mailinator.com", EnvConstants.USER_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.checkUserIsLoggedIn(EnvConstants.USER_NAME);
    }
}
