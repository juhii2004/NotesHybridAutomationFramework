package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtils;

public class TestListener
        implements ITestListener {

    @Override

    public void onTestFailure(
            ITestResult result) {

        ScreenshotUtils.captureScreenshot(
                result.getName());
    }

    @Override

    public void onStart(
            ITestContext context) {

        System.out.println(
                "Execution started");
    }

    @Override

    public void onFinish(
            ITestContext context) {

        System.out.println(
                "Execution completed");
    }
}