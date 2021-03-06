package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class LoginPage extends BasePage {


    @FindBy(id = "username")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(xpath = "//button[@class='woocommerce-Button button'][text()='Login']")
    private WebElementFacade loginButton;

    @FindBy(css = ".woocommerce-error")
    private WebElementFacade errorMessage;

    @FindBy(xpath = "//p[@class='woocommerce-LostPassword lost_password']/a")
    private WebElementFacade lostPasswordLink;


    public void setEmailField(String email) {
        waitFor(emailField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(emailField);
        typeInto(emailField, email);
    }

    public void setPasswordField(String pass) {
        typeInto(passwordField, pass);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }

    public void checkErrorMessage(String message) {
        errorMessage.shouldContainText(message);
    }

    public void clickLostPasswordLink() {
        clickOn(lostPasswordLink);
    }

    public void checkIfLoginButtonIsDisplayed(){
        loginButton.isDisplayed();
    }


}
