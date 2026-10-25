package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeTests extends BaseTests {

    @Test
    public void testHomePageTitleAndLogo() {
        homePage.open();

        String actualTitle = driver.getTitle();
        Assert.assertTrue("Naslov stranice ne sadrži 'IKEA'!", actualTitle.contains("IKEA"));

        WebElement logo = driver.findElement(By.cssSelector("header svg, a.ikea-header-logo, [data-test='header-logo']"));
        Assert.assertTrue("IKEA logo nije vidljiv na stranici!", logo.isDisplayed());
    }

    @Test
    public void testSearchBoxIsPresent() {
        homePage.open();

        WebElement searchInput = driver.findElement(By.name("q"));
        Assert.assertTrue("Polje za pretragu nije pronađeno na stranici!", searchInput.isDisplayed());
    }
}