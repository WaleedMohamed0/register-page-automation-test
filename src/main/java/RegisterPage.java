import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends PageBase {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    By genderMale = By.id("gender-male"),
            genderFemale = By.id("gender-female"),
            firstName = By.id("FirstName"),
            lastName = By.id("LastName"),
            email = By.id("Email"),
            password = By.id("Password"),
            confirmPassword = By.id("ConfirmPassword"),
            registerBtn = By.id("register-button"),
            dayOfBirth = By.name("DateOfBirthDay"),
            monthOfBirth = By.name("DateOfBirthMonth"),
            yearOfBirth = By.name("DateOfBirthYear");

    public void clickOnGenderMale() {
        WebElement genderMaleElement = driver.findElement(genderMale);
        clicking(genderMaleElement);
    }

    public void clickOnGenderFemale() {
        WebElement genderFemaleElement = driver.findElement(genderFemale);
        clicking(genderFemaleElement);
    }

    public void setFirstName(String fName) {
        WebElement firstNameElement = driver.findElement(firstName);
        sendText(firstNameElement, fName);
    }

    public void setLastName(String lName) {
        WebElement lastNameElement = driver.findElement(lastName);
        sendText(lastNameElement, lName);
    }

    public void setEmail(String mail) {
        WebElement emailElement = driver.findElement(email);
        sendText(emailElement, mail);
    }

    public void setPassword(String pass) {
        WebElement passwordElement = driver.findElement(password);
        sendText(passwordElement, pass);
    }

    public void setConfirmPassword(String cPass) {
        WebElement confirmPasswordElement = driver.findElement(confirmPassword);
        sendText(confirmPasswordElement, cPass);
    }

    public void selectDayOfBirth(String day) {
        selectFromDropDown(dayOfBirth, day);
    }

    public void selectMonthOfBirth(String month) {
        selectFromDropDown(monthOfBirth, month);
    }

    public void selectYearOfBirth(String year) {
        selectFromDropDown(yearOfBirth, year);
    }

    public void selectFromDropDown(By by, String value) {
        WebElement element = driver.findElement(by);
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void clickOnRegisterBtn() {
        WebElement registerBtnElement = driver.findElement(registerBtn);
        clicking(registerBtnElement);
    }


}
