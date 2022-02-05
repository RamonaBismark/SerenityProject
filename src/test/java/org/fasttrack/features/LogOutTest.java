package org.fasttrack.features;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class LogOutTest extends BaseTest {

    @Test
    public void validLogOut(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASSWORD);
        myAccountSteps.clickOnMyAccount();
        myAccountSteps.clickOnLogOutButton();
        loginSteps.checkIfLoginButtonIsDisplayed();
    }
}
