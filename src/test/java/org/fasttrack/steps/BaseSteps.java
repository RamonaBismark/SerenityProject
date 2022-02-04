package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrack.pages.*;
import org.fasttrack.utils.EnvConstants;

public class BaseSteps extends ScenarioSteps {

    public ProductPage productPage;
    public HomePage homePage;
    public RegisterPage registerPage;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;
    public SearchResultsPage searchResultsPage;
    public CartPage cartPage;
    public CheckoutPage checkoutPage;
    public BlogPage blogPage;


    @Step
    public void navigateToHomePage (){
        getDriver().get(EnvConstants.BASE_URL);
    }

}
