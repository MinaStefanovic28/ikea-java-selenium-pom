package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    private By productNameInCart = By.cssSelector(".cart-ingka-product-identifier__title");
    private By checkoutBtn = By.xpath("//button[@class=\"cart-ingka-jumbo-btn\"]");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://www.ikea.com/rs/sr/shoppingcart/");
    }

    public String getProductName() {
        return readText(productNameInCart);
    }
    public void proceedToCheckout() {
        click(checkoutBtn);
    }
}