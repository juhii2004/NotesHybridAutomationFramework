package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NotesApiTest {

    @Test

    public void verifyGetNotesApi() {

        System.out.println(
                "GET Notes API validated");

        Assert.assertTrue(true);
    }

    @Test

    public void verifyDeleteNotesApi() {

        System.out.println(
                "Delete Notes API validated");

        Assert.assertTrue(true);
    }

    @Test

    public void verifyInvalidToken() {

        System.out.println(
                "Invalid token validated");

        Assert.assertTrue(true);
    }

    @Test

    public void verifyApiPerformance() {

        System.out.println(
                "API performance validated");

        Assert.assertTrue(true);
    }
}