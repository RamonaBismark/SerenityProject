package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;

public class ShopSteps extends BaseSteps {

    @Step
    public void goToShop() {
        productPage.clickOnShopButton();
    }

    @Step
    public void sortBy() {
        productPage.clickOnSortByButton();
    }

    @Step
    public void clickOnReview() {
        productPage.clickOnReviewButton();
    }

    @Step
    public void writeReview(String review) {
        productPage.leaveReview(review);
    }

    @Step
    public void clickOnSubmit(){
        productPage.clickOnSubmitButton();
    }

    @Step
    public void checkReviewPostedMessage(String message){
        productPage.checkReviewIsSuccessfullyPosted(message);
    }

}
