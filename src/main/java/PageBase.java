import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {
    WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    public static void clicking(WebElement element) {
        element.click();
    }

    public static void sendText(WebElement element, String value) {
        element.sendKeys(value);
    }
}
