package tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class PerformanceTest extends BaseTest {

    @Test
    public void loginPerformanceTest() {

        System.out.println(
                "Login performance");
    }

    @Test
    public void createNotePerformanceTest() {

        System.out.println(
                "Create note performance");
    }

    @Test
    public void apiResponseTimeTest() {

        System.out.println(
                "API response time");
    }
}