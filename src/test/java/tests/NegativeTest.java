package tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class NegativeTest extends BaseTest {

    @Test
    public void invalidLoginTest() {

        System.out.println(
                "Invalid login test");
    }

    @Test
    public void emptyEmailTest() {

        System.out.println(
                "Empty email validation");
    }

    @Test
    public void emptyPasswordTest() {

        System.out.println(
                "Empty password validation");
    }

    @Test
    public void invalidPasswordTest() {

        System.out.println(
                "Invalid password validation");
    }
}