package utils;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.nio.file.Files;
import java.nio.file.Paths;

public class McpScriptExecutor {

    private WebDriver driver;

    public McpScriptExecutor(WebDriver driver) {

        this.driver = driver;
    }

    public void executeScript(String filePath) {

        try {

            String content = new String(
                    Files.readAllBytes(Paths.get(filePath))
            );

            JSONArray commands = new JSONArray(content);

            for (int i = 0; i < commands.length(); i++) {

                JSONObject command = commands.getJSONObject(i);

                String action = command.getString("action");

                switch (action) {

                    case "open":

                        driver.get(command.getString("value"));
                        break;

                    case "type":

                        driver.findElement(
                                By.name(command.getString("locator"))
                        ).sendKeys(command.getString("value"));

                        break;

                    case "click":

                        driver.findElement(
                                By.name(command.getString("locator"))
                        ).click();

                        break;

                    default:

                        System.out.println(
                                "Unknown action: " + action
                        );
                }
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}