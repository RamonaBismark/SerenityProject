package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends BasePage{


    @FindBy(css = ".single_add_to_cart_button")
    private WebElementFacade addToCartButton;

    @FindBy(css = ".fa-shopping-cart")
    private WebElementFacade viewShoppingCartButton;

    @FindBy(css = ".woocommerce table.cart a.remove")
    private WebElementFacade removeProductFromCart;

    @FindBy (css= ".checkout-button")
    private WebElementFacade proceedToCheckoutButton;

    @FindBy (id= "menu-item-1728")
    private WebElementFacade shopButton;

    @FindBy (css = ".orderby")
    private WebElementFacade sortByButton;

    @FindBy (id = "tab-title-reviews")
    private WebElementFacade reviewButton;

    @FindBy (id = "comment")
    private WebElementFacade reviewField;

    @FindBy (id = "submit")
    private WebElementFacade submitButton;

    @FindBy (css = ".woocommerce-review__awaiting-approval")
    private WebElementFacade reviewSuccessfullyPosted;


    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }

    public void clickOnShoppingCart() {
        clickOn (viewShoppingCartButton);
    }

    public void clickOnProceedToCheckoutButton(){
        clickOn(proceedToCheckoutButton);
    }

    public void clickOnRemoveFromCartButton() {
        clickOn(removeProductFromCart);
    }

    public void clickOnShopButton(){
        clickOn(shopButton);
    }

    public void clickOnSortByButton(){ clickOn(sortByButton); }

    public void clickOnReviewButton(){
        clickOn(reviewButton);
    }

    public void leaveReview(String review){
        typeInto(reviewField, review);
    }

    public void clickOnSubmitButton(){
        clickOn(submitButton);
    }

    public void checkReviewIsSuccessfullyPosted(String message){
        reviewSuccessfullyPosted.shouldContainText(message);
    }
}
