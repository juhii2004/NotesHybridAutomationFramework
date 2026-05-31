package base;

import drivers.DriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod

    public void setup() {

        DriverFactory.initDriver();

        DriverFactory.getDriver().get(
                "https://practice.expandtesting.com/notes/app/login"
        );
    }

    @AfterMethod

    public void tearDown() {

        DriverFactory.quitDriver();
    }
}