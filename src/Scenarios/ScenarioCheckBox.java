import org.junit.*;
import org.junit.rules.TestRule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.FileHandler;

/**
 * Created by SehrishRaza on 07/11/2015.
 */
public class ScenarioCheckBox {
    private WebDriver driver = new FirefoxDriver();

    @Rule
    public TestRule screenshot = new ScreenshotOnFailRule(driver);

    Logger logger = LoggerFactory.getLogger(ScenarioCheckBox.class);

    @Before
    public void setUp() {
        //initiate firefox
    }

    @Test
    public void checkBox() {
        ShowCase showCase = new ShowCase(driver);
        showCase.openShowCase();

        Widget widget = showCase.getWidget();
        widget.openWidget();
        //Assert.assertTrue(false);   //Failure test
        widget.openCheckBox();
        CheckBox checkBox = new CheckBox(driver);
        checkBox.selectCheckBox(SelectCheckBoxDays.DAYS_MONDAY);
        Assert.assertTrue(checkBox.isSelected(SelectCheckBoxDays.DAYS_MONDAY));
        logger.info("Monday is clicked");
        checkBox.selectCheckBox(SelectCheckBoxDays.DAYS_SUNDAY);
        Assert.assertTrue(checkBox.isDisabled(SelectCheckBoxDays.DAYS_SUNDAY));
        logger.info("Sunday is disable");

    }

    @After
    public void tearDown() {
        //driver.quit();
    }
}
