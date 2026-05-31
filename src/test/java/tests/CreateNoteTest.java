package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.NotesPage;
import utils.ExcelUtils;
import utils.LoggerUtils;
import utils.WaitUtils;

public class CreateNoteTest extends BaseTest {

    @Test

    public void verifyNoteCreation() {

        try {

            LoggerUtils.logInfo(
                    "Create note test started");

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

            String title =
                    ExcelUtils.getCellData(
                            "NotesData",
                            1,
                            0);

            String description =
                    ExcelUtils.getCellData(
                            "NotesData",
                            1,
                            1);

            LoginPage loginPage =
                    new LoginPage();

            loginPage.loginToApplication(
                    email,
                    password);

            WaitUtils.hardWait(3000);

            NotesPage notesPage =
                    new NotesPage();

            notesPage.createNewNote(
                    title,
                    description);

            WaitUtils.hardWait(3000);

            LoggerUtils.logInfo(
                    "Note created successfully");

        } catch (Exception e) {

            LoggerUtils.logError(
                    "Create note test failed");

            e.printStackTrace();
        }
    }
}