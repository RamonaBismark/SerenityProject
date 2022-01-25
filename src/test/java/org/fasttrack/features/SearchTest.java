package org.fasttrack.features;

import org.junit.Test;
import utils.EnvConstants;

public class SearchTest extends BaseTest {



    @Test
    public void searchTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL,EnvConstants.USER_PASSWORD);
        searchSteps.executeSearch("SUNGLASSES");

    }




}
