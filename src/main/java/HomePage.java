import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By registerBtn = By.className("ico-register"),
            loginBtn = By.className("ico-login");
    WebElement registerBtnElement, loginBtnElement;

    public void clickRegisterBtn() {
        registerBtnElement = driver.findElement(registerBtn);
        clicking(registerBtnElement);
    }

    public void clickLoginBtn() {
        loginBtnElement = driver.findElement(loginBtn);
        clicking(loginBtnElement);
    }
}
