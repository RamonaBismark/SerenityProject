package org.fasttrack.features;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class MyAccountTest extends BaseTest {

    @Test
    public void viewMyOrdersTest() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASSWORD);
        myAccountSteps.clickOnMyAccount();
        myAccountSteps.clickOnOrders();
        myAccountSteps.clickOnView();
    }

    @Test
    public void changeMyAddressTest() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASSWORD);
        myAccountSteps.clickOnMyAccount();
        myAccountSteps.clickOnAddresses();
        myAccountSteps.clickOnEdit();
        myAccountSteps.setNewCity("Feleac");
        myAccountSteps.clickOnSaveAddress();
        myAccountSteps.checkDetailsMessage("Address changed successfully.");
    }


}
