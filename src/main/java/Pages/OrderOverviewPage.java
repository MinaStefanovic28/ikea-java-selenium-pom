package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderOverviewPage extends BasePage {
    private By finalPrice = By.cssSelector(".checkout-order-review__total-price");

    public OrderOverviewPage(WebDriver driver) {
        super(driver);
    }

    public String getFinalPrice() {
        return readText(finalPrice);
    }
}