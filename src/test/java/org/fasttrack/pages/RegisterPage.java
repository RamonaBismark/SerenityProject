package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class RegisterPage extends BasePage{


    @FindBy(css = "reg_email")
    private WebElementFacade emailField;

    @FindBy (css = "reg_password")
    private WebElementFacade passwordField;

    @FindBy (css = ".woocommerce-Button .button")
    private WebElementFacade registerButton;



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











}
