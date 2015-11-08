import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by SehrishRaza on 07/11/2015.
 */
public class ShowCase {
    private final WebDriver driver;
    String url = "http://samples.gwtproject.org/samples/Showcase/Showcase.html";

    public ShowCase(WebDriver driver) {
        this.driver = driver;
    }
    public void openShowCase(){
        driver.get(url);

    }
    public Widget getWidget(){
        return new Widget(driver);
    }
}
