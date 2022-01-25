package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(css = "??????????")
    private List<WebElementFacade> listOfSubtotalPrices;

    @FindBy (css = "??????")
    private WebElementFacade subtotalText;


    public int getSubtotalPricesCalculated (){
        int sum = 0;
        for (WebElementFacade element: listOfSubtotalPrices){
            sum += getIntFromPrice(element.getText());
        }
        return sum;
    }

    public boolean isSubtotalPriceCorrect (){
        return getSubtotalPricesCalculated() == getIntFromPrice(subtotalText.getText());
    }
}
