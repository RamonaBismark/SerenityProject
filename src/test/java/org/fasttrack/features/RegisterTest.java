package org.fasttrack.features;

import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrack.utils.EnvConstants;
import org.junit.Test;


public class RegisterTest extends BaseTest{

    @Test
    public void registerWithEmailAndPasswordTest() {
        String username = "ramo" + RandomStringUtils.randomNumeric(3);
        String randomName = username + "@mailinator.com";
        registerSteps.navigateToRegisterPage();
        registerSteps.enterCredentials(randomName, EnvConstants.USER_PASSWORD);
        registerSteps.clickRegister();
        registerSteps.checkUserIsLoggedInOrRegisterSuccessfully(username);
    }

    @Test
    public void registerWithAlreadyUsedEmail(){
        registerSteps.navigateToRegisterPage();
        registerSteps.enterCredentials(EnvConstants.USER_EMAIL, EnvConstants.USER_PASSWORD);
        registerSteps.clickRegister();
        registerSteps.checkErrorMessageAtRegister("Error: An account is already registered with your email address. Please log in.");
    }




}
