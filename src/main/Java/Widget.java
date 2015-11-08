import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by SehrishRaza on 07/11/2015.
 */
public class Widget {
    private final WebDriver driver;
    WebElement widget;

    public Widget(WebDriver driver) {
        this.driver = driver;
       widget = new WebDriverWait(driver, 15).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div[aria-expanded]"))).get(0);
    }

    public void openWidget(){
        if(widget.getAttribute("aria-expanded").equalsIgnoreCase("false") ){
            widget.findElement(By.cssSelector(".GNHGC04CIF.GNHGC04CAG")).click();
        }


    }
    public void openCheckBox(){
       widget.findElements(By.cssSelector("div[aria-selected]")).get(0);
        new WebDriverWait(driver , 10).until(ExpectedConditions.presenceOfElementLocated(By.className("gwt-CheckBox")));
    }
    public  void openRadioButton(){
        widget.findElements(By.cssSelector("div[aria-selected]")).get(1);
        new WebDriverWait(driver , 10).until(ExpectedConditions.presenceOfElementLocated(By.className("gwt-RadioButton")));
    }

}
