package tests;

import base.BaseTest;
import drivers.DriverFactory;
import org.testng.annotations.Test;
import utils.McpScriptExecutor;

public class McpExecutionTest extends BaseTest {

    @Test
    public void verifyMcpExecution() {

        McpScriptExecutor executor =
                new McpScriptExecutor(
                        DriverFactory.getDriver()
                );

        executor.executeScript(
                "src/test/resources/mcp-commands.json"
        );
    }
}