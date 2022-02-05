package org.fasttrack.pages;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.ElementNotVisibleException;

public class CheckoutPage extends BasePage {

    @FindBy(id = "billing_first_name")
    private WebElementFacade firstNameField;

    @FindBy(id = "billing_last_name")
    private WebElementFacade lastNameField;

    @FindBy(css = "#billing_address_1.input-text")
    private WebElementFacade addressField;

    @FindBy(css = "#billing_city.input-text")
    private WebElementFacade cityField;

    @FindBy(css = "#billing_postcode.input-text")
    private WebElementFacade postcodeField;

    @FindBy(css = "#billing_phone")
    private WebElementFacade phoneField;

    @FindBy(css = "#billing_email")
    private WebElementFacade emailField;

    @FindBy(id = "place_order")
    private WebElementFacade placeOrderButton;

    @FindBy(css = ".woocommerce-notice--success")
    private WebElementFacade placedOrderMessage;

    @FindBy(css = ".woocommerce-error")
    private WebElementFacade errorMessage;

    @FindBy(css = ".woocommerce-order-details")
    private WebElementFacade orderDetails;

    @FindBy (css = ".blockUI.blockOverlay")
    private WebElementFacade spinnerRow;

    public void setFirstNameField(String firstName) {
        typeInto(firstNameField, firstName);
    }

    public void setLastNameField(String lastName) {
        typeInto(lastNameField, lastName);
    }

    public void setAddressField(String address) {
        typeInto(addressField, address);
    }

    public void setCityField(String city) {
        typeInto(cityField, city);
    }

    public void setPostcodeField(String postcode) {
        typeInto(postcodeField, postcode);
    }

    public void setPhoneField(String phone) {
        typeInto(phoneField, phone);
    }

    public void setEmailField(String email) {
        typeInto(emailField, email);
    }

    public void clickOnPlaceOrderButton(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOn(placeOrderButton);
        if (!spinnerRowIsDisplayed()){
            clickOn(placeOrderButton);
        }
    }

    public boolean spinnerRowIsDisplayed(){
        try {
            return spinnerRow.isDisplayed();
        } catch (ElementNotVisibleException | ElementNotFoundException exception){
            return false;
        }
    }




    public void checkPlacedOrderMessage(String message) {
        placedOrderMessage.shouldContainText(message);
    }

    public void checkErrorMessage(String message) {
        errorMessage.shouldContainText(message);
    }

    public void waitForOrderDetails() {
        orderDetails.waitUntilVisible();

    }


}