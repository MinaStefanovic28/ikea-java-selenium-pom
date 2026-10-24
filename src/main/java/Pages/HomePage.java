package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By cookieAcceptBtn = By.id("onetrust-accept-btn-handler");
    private By searchInputField = By.id("ikea-search-input");
    private By searchBtn = By.xpath("//button[@type=\"submit\"]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://www.ikea.com/rs/sr/");
    }

    public void acceptCookies() {
        try {
            click(cookieAcceptBtn);
        } catch (Exception e) {
            System.out.println("Kolacici se nisu pojavili.");
        }
    }

    public void searchForProduct(String productName) {
        sendKeys(searchInputField, productName);
        click(searchBtn);
    }


}