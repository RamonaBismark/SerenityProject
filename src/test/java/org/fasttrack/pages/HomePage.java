package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage{

    @FindBy(css = ".site-header-right-link")
    private WebElementFacade registerLink;

    @FindBy (css = ".site-header-right-link")
    private WebElementFacade loginLink;


    @FindBy(id = "search-2")
    private WebElementFacade searchField;

    @FindBy(css =".fa.fa-search.search-btn")
    private WebElementFacade searchIcon;

    @FindBy (css= ".fa.fa-shopping-cart")
    private WebElementFacade cartIcon;



    public void clickRegisterLink() {
        clickOn(registerLink);
    }

    public void clickLoginLink() {
        clickOn(loginLink);
    }

    public void setSearchField(String value){
        typeInto(searchField,value);
    }

    public void clickSearchIcon(){
        clickOn(searchIcon);
    }

    public void clickOnCartIcon() {
        clickOn(cartIcon);
    }
}

