package pages;

import drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class NotesPage {

    private By addNoteButton =
            By.cssSelector("a.btn");

    private By titleField =
            By.cssSelector("input");

    private By descriptionField =
            By.cssSelector("textarea");

    private By createButton =
            By.xpath("//button[@type='submit']");

    public void clickAddNote() {

        WebElement addBtn =
                DriverFactory.getDriver()
                        .findElement(addNoteButton);

        JavascriptExecutor js =
                (JavascriptExecutor)
                        DriverFactory.getDriver();

        js.executeScript(
                "arguments[0].click();",
                addBtn);
    }

    public void enterTitle(String title) {

        DriverFactory.getDriver()
                .findElement(titleField)
                .sendKeys(title);
    }

    public void enterDescription(String description) {

        DriverFactory.getDriver()
                .findElement(descriptionField)
                .sendKeys(description);
    }

    public void clickCreateButton() {

        WebElement createBtn =
                DriverFactory.getDriver()
                        .findElement(createButton);

        JavascriptExecutor js =
                (JavascriptExecutor)
                        DriverFactory.getDriver();

        js.executeScript(
                "arguments[0].click();",
                createBtn);
    }

    public void createNewNote(
            String title,
            String description) {

        try {

            clickAddNote();

            Thread.sleep(2000);

            enterTitle(title);

            enterDescription(description);

            clickCreateButton();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}