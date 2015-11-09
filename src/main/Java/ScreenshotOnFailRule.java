import org.apache.commons.io.FileUtils;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by SehrishRaza on 08/11/2015.
 */
public class ScreenshotOnFailRule extends TestWatcher {

    private WebDriver driver;
    public ScreenshotOnFailRule(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void failed(Throwable e, Description d) {
        try {
            takeScreenshot(driver, "Failure");
        } catch (IOException ioe) {
            System.exit(0);
        }
        System.exit(0);
    }

    public static void takeScreenshot(WebDriver driver, String name) throws IOException {
        File tempFile = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(tempFile, new File(String.format("screenshots/%s.png", name)));
    }
}

