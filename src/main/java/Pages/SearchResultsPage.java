package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends BasePage {
    private By numberOfResults = By.xpath("//div[@class='search-summary__content']");
    private By firstResultTitle = By.cssSelector(".plp-fragment-wrapper:first-of-type .plp-product-name__title");

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public String getSearchTitle() {
        return readText(numberOfResults);
    }

    public void clickOnFirstResult() {
        click(firstResultTitle);
    }
}