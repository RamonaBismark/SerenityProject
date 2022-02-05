package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountPage extends BasePage {

    @FindBy(css = ".woocommerce-MyAccount-content")
    private WebElementFacade loginHelloMessageElement;

    @FindBy(id = "menu-item-1730")
    private WebElementFacade myAccountButton;

    @FindBy(css = ".woocommerce-MyAccount-navigation-link--orders")
    private WebElementFacade ordersButton;

    @FindBy(css = ".woocommerce-button")
    private WebElementFacade viewButton;

    @FindBy(css = ".woocommerce-MyAccount-navigation-link--edit-address")
    private WebElementFacade addressesButton;

    @FindBy(css = ".u-column2.col-2.woocommerce-Address .edit")
    private WebElementFacade editButton;

    @FindBy(css = "#shipping_city.input-text")
    private WebElementFacade cityField;

    @FindBy(css = ".button")
    private WebElementFacade saveAddressButton;

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade detailsMessage;

    @FindBy (css = ".woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--customer-logout")
    private WebElementFacade logOutButton;

    @FindBy (id = "user_login")
    private WebElementFacade usernameForgotPassField;

    @FindBy (css = ".woocommerce-Button.button")
    private WebElementFacade resetPasswordButton;


    public void checkUserLoggedInOrRegister(String userName) {
        loginHelloMessageElement.shouldContainText("Hello " + userName);}

    public void clickOnMyAccountButton() {
        clickOn(myAccountButton);
    }

    public void clickOnOrdersButton() {
        clickOn(ordersButton);
    }

    public void clickOnAddressesButton() {
        clickOn(addressesButton);
    }

    public void clickOnViewButton() {
        clickOn(viewButton);
    }

    public void clickOnEditButton() {
        clickOn(editButton);
    }

    public void setNewCity(String city) {
        typeInto(cityField, city);
    }

    public void clickOnSaveAddressButton() {
        clickOn(saveAddressButton);
    }

    public void checkDetailsMessage(String message) {
        detailsMessage.shouldContainText(message);
    }
    public void clickOnLogOutButton(){
        clickOn(logOutButton);
    }

    public void enterEmailAddress(String email){
        typeInto(usernameForgotPassField, email);
    }
    public void clickResetPasswordButton() {
        clickOn(resetPasswordButton);
    }

}
