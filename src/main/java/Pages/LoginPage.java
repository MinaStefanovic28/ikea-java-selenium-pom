package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    private By emailField = By.id("login-form-username");
    private By loginWithPasswordLink = By.xpath("//*[contains(text(),'Prijavi se lozinkom')]");
    private By passwordField = By.id("login-form-password");
    private By loginBtn = By.cssSelector(".loading-button");
    private By loginIcon = By.id("hnf-header-profile");
    private By logoutBtn = By.xpath("//*[contains(text(),'Odjavi se')]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void open() {
        driver.get("https://www.ikea.com/rs/sr/");
        wait.until(ExpectedConditions.elementToBeClickable(loginIcon)).click();

    }

    public void login(String email, String password) {
        wait.until(ExpectedConditions.elementToBeClickable(loginWithPasswordLink)).click();
        sendKeys(emailField, email);
        sendKeys(passwordField, password);
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }

    public void logout() {
        click(logoutBtn);
    }
}