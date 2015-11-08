import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by SehrishRaza on 07/11/2015.
 */
public class CheckBox {
    private final WebDriver driver;

    public CheckBox(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCheckBox(SelectCheckBoxDays selectCheckBoxDays) {
        getCheckBox(selectCheckBoxDays).click();
    }
    public WebElement getCheckBox(SelectCheckBoxDays selectCheckBoxDays){
        return driver.findElement(By.id(selectCheckBoxDays.getId()));
    }
    public boolean isSelected(SelectCheckBoxDays selectCheckBoxDays){
        return getCheckBox(selectCheckBoxDays).isSelected();
    }
    public boolean isDisabled(SelectCheckBoxDays selectCheckBoxDays){
        return !getCheckBox(selectCheckBoxDays).isEnabled();
    }
}
