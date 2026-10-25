package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SearchResultsPage extends BasePage {
    private By numberOfResults = By.xpath("//div[@class='search-summary__content']");
    private By prviProizvodXpath = By.xpath("(//div[@id='product-list']//a)[1]");
    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public String getSearchTitle() {
        return readText(numberOfResults);
    }

    public void clickOnFirstResult() {
        org.openqa.selenium.support.ui.WebDriverWait longWait =
                new org.openqa.selenium.support.ui.WebDriverWait(driver, Duration.ofSeconds(15));

        // Čeka da prvi proizvod iz rezultata bude klikabilan i odmah klikće na njega
        WebElement prviArtikal = longWait.until(ExpectedConditions.elementToBeClickable(prviProizvodXpath));
        prviArtikal.click();
    }
}