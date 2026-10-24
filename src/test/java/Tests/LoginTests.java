package Tests;

import Pages.*;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTests extends BaseTests {



    @Test
    public void testUspesanLogin() {
        loginPage.open();
        loginPage.login("mina@email.com", "lozinka123");

        Assert.assertTrue(driver.findElement(By.id("search-box")).isDisplayed());

    }

        @Test
    public void testNeispravnaLozinka() {
        loginPage.open();
        loginPage.login("mina@email.com", "pogresna_lozinka");

        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
    }

    @Test
    public void testLogout() {
        loginPage.open();
        loginPage.login("mina@email.com", "lozinka123");
        loginPage.logout();

        String trenutniUrl = driver.getCurrentUrl();
        Assert.assertTrue(trenutniUrl.contains("login"));
    }
}
