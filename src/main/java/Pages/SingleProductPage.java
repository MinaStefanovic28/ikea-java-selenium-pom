package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingleProductPage extends BasePage {
    private By productTitle = By.xpath("//span[@class=\"pipcom-price-module__name-decorator notranslate\"]");
    private By addToCartBtn = By.xpath("//button[@aria-label=\"Dodaj u korpu\"]");
    private By wishlistHeartBtn = By.cssSelector("button[aria-label=\"Dodaj na listu želja\"]");
    private By openStockBtn = By.cssSelector(".pip-stock-check-status-container button");
    private By stockStatusText = By.cssSelector(".pip-stock-check__available-for-delivery--text");
    private By closeStockBtn = By.xpath("//button[@aria-label=\"Zatvori modal\"]");


    public SingleProductPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName() {
        return readText(productTitle);
    }

    public void openStockDetails() {
        click(openStockBtn);
    }

    public String getStockInfo() {
        return readText(stockStatusText);
    }

    public void addToWishlist() {
        click(wishlistHeartBtn);
    }

    public void addProductToCart() {
        click(addToCartBtn);
    }

    public void closeStockDetails() {
        click(closeStockBtn);
    }

}










