package org.fasttrack.features;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class ShopTest extends BaseTest {

    @Test
    public void sortByTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASSWORD);
        shopSteps.goToShop();
        shopSteps.sortBy();
        shopSteps.clickOnSortByPrice();
    }


    @Test
    public void leaveAReviewTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASSWORD);
        searchSteps.searchAndSelectProduct("SUNGLASSES");
        shopSteps.clickOnReview();
        shopSteps.writeReview("The sunglasses are amazing.");
        shopSteps.clickOnSubmit();
        shopSteps.checkReviewPostedMessage("Your review is awaiting approval");
    }

}
