package Tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SearchResultsPage;
import Pages.SingleProductPage;
import Pages.CartPage;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTests {
    public WebDriver driver;

    public HomePage homePage;
    public LoginPage loginPage;
    public SearchResultsPage searchResultsPage;
    public SingleProductPage singleProductPage;
    public CartPage cartPage;

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();

        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--disable-blink-features=AutomationControlled");

        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--start-maximized");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--remote-allow-origins=*");

        if ("true".equals(System.getProperty("headless"))) {
            options.addArguments("--headless=new");
        }

        driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        singleProductPage = new SingleProductPage(driver);
        cartPage = new CartPage(driver);
    }

    @After
    public void tearDown() {
            driver.quit();
        }
}