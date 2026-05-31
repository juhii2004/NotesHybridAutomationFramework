package base;

import drivers.DriverFactory;
import org.openqa.selenium.WebDriver;

public class BasePage {

    WebDriver driver =
            DriverFactory.getDriver();

}