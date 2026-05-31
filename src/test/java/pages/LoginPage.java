package pages;

import drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private By emailField =
            By.name("email");

    private By passwordField =
            By.name("password");

    private By loginButton =
            By.xpath("//button[@type='submit']");

    public void enterEmail(String email) {

        DriverFactory.getDriver()
                .findElement(emailField)
                .sendKeys(email);
    }

    public void enterPassword(String password) {

        DriverFactory.getDriver()
                .findElement(passwordField)
                .sendKeys(password);
    }

    public void clickLogin() {

        WebElement loginBtn =
                DriverFactory.getDriver()
                        .findElement(loginButton);

        JavascriptExecutor js =
                (JavascriptExecutor)
                        DriverFactory.getDriver();

        js.executeScript(
                "arguments[0].click();",
                loginBtn);
    }

    public void loginToApplication(
            String email,
            String password) {

        enterEmail(email);

        enterPassword(password);

        clickLogin();
    }
}