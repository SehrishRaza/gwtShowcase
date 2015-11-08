import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
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
    private WebDriver driver;
    Logger logger = LoggerFactory.getLogger(ScenarioCheckBox.class);

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        //initiate firefox
    }

    @Test
    public void checkBox() {
        ShowCase showCase = new ShowCase(driver);
        showCase.openShowCase();
        Widget widget = showCase.getWidget();
         widget.openWidget();
         widget.openCheckBox();
        CheckBox checkBox = new CheckBox(driver);
        checkBox.selectCheckBox(SelectCheckBoxDays.DAYS_MONDAY);
        Assert.assertTrue(checkBox.isSelected(SelectCheckBoxDays.DAYS_MONDAY));
        logger.info("Monday is clicked");
        //System.out.println("Monday is selected");
        checkBox.selectCheckBox(SelectCheckBoxDays.DAYS_SUNDAY);
        Assert.assertTrue(checkBox.isDisabled(SelectCheckBoxDays.DAYS_SUNDAY));
        logger.info("Sunday is disable");
        //System.out.println("Sunday is Disabled");
    }

    @After
    public void tearDown() {
        //driver.quit();
    }
}
