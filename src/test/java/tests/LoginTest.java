package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ExcelUtils;
import utils.LoggerUtils;
import utils.WaitUtils;

public class LoginTest extends BaseTest {

    @Test

    public void verifyValidLogin() {

        try {

            LoggerUtils.logInfo(
                    "Login test started");

            String email =
                    ExcelUtils.getCellData(
                            "LoginData",
                            1,
                            0);

            String password =
                    ExcelUtils.getCellData(
                            "LoginData",
                            1,
                            1);

            LoginPage loginPage =
                    new LoginPage();

            loginPage.loginToApplication(
                    email,
                    password);

            WaitUtils.hardWait(3000);

            String currentUrl =
                    drivers.DriverFactory
                            .getDriver()
                            .getCurrentUrl();

            Assert.assertTrue(
                    currentUrl.contains("notes"));

            LoggerUtils.logInfo(
                    "Login successful");

        } catch (Exception e) {

            LoggerUtils.logError(
                    "Login test failed");

            e.printStackTrace();
        }
    }
}