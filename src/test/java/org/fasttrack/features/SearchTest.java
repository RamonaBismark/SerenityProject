package org.fasttrack.features;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class SearchTest extends BaseTest {



    @Test
    public void searchTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL,EnvConstants.USER_PASSWORD);
        searchSteps.executeSearch("SUNGLASSES");

    }




}
