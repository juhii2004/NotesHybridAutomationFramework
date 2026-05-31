package utils;

import drivers.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class ScreenshotUtils {

    public static void captureScreenshot(
            String fileName) {

        try {

            if(DriverFactory.getDriver() == null) {
                return;
            }

            File src =
                    ((TakesScreenshot)
                            DriverFactory.getDriver())
                            .getScreenshotAs(
                                    OutputType.FILE);

            File dest =
                    new File(
                            "screenshots/"
                                    + fileName
                                    + ".png");

            FileUtils.copyFile(src, dest);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}