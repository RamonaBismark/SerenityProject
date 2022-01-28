package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class RegisterPage extends BasePage{


    @FindBy(id = "reg_email")
    private WebElementFacade emailField;

    @FindBy (id = "reg_password")
    private WebElementFacade passwordField;

    @FindBy (xpath = "//button[@class='woocommerce-Button button'][text()='Register']")
    private WebElementFacade registerButton;

    @FindBy (css = ".woocommerce-error")
    private WebElementFacade errorMessage;



    public void setEmailField(String email){
        waitFor(emailField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(emailField);
        typeInto(emailField, email);
    }

    public void setPasswordField(String pass){
        typeInto(passwordField, pass);
    }

    public void clickRegisterButton() {
        clickOn(registerButton);
    }

    public void checkErrorMessageAtRegister(String message) {
        errorMessage.shouldContainText(message);
    }








}
