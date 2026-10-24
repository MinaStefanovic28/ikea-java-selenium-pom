package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage extends BasePage {
    private By wishlistHeader = By.cssSelector("div[data-shoppinglist-icon=\"heart\"]");

    public WishListPage(WebDriver driver) { super(driver); }

    public String getWishlistTitle() {
        return readText(wishlistHeader);
    }

}