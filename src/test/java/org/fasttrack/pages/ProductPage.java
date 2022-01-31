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




}
