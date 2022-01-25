package org.fasttrack.features;

import org.junit.Test;
import utils.EnvConstants;

public class RegisterTest extends BaseTest{

    @Test
    public void registerWithEmailAndPasswordTest(){
        registerSteps.navigateToHomePage();
        registerSteps.enterCredentials(EnvConstants.USER_EMAIL, EnvConstants.USER_PASSWORD);
        registerSteps.clickRegister();
    }




}
