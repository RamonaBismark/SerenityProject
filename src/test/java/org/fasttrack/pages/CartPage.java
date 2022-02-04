package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(css = ".product-subtotal .woocommerce-Price-amount")
    private List<WebElementFacade> listOfSubtotalPrices;

    @FindBy(css = ".cart-subtotal .woocommerce-Price-amount.amount")
    private WebElementFacade subtotalText;

    @FindBy(css = "tr.cart_item")
    private List<WebElementFacade> listOfProducts;


    public int getSubtotalPricesCalculated() {
        int sum = 0;
        for (WebElementFacade element : listOfSubtotalPrices) {
            sum += getIntFromPrice(element.getText());
        }
        return sum;
    }

    public boolean isSubtotalPriceCorrect() {
        return getSubtotalPricesCalculated() == getIntFromPrice(subtotalText.getText());
    }

    public boolean removeProduct(String name) {
        waitFor(listOfProducts.get(0));
        for (WebElementFacade element : listOfProducts) {
            if (element.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(name)) {
                element.findElement(By.cssSelector(".product-remove a")).click();
                return true;
            }
        }
        return false;
    }


}
