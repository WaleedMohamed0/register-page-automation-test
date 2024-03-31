import org.testng.annotations.Test;

public class RegisterPageTest extends PageBaseTest {
    private HomePage homePage;
    private RegisterPage registerPage;
    @Test
    public void validRegister()
    {
        homePage = new HomePage(driver);
        homePage.clickRegisterBtn();
        registerPage = new RegisterPage(driver);
        registerPage.clickOnGenderMale();
        registerPage.setFirstName("Waleed");
        registerPage.setLastName("Mohamed");
        registerPage.selectDayOfBirth("26");
        registerPage.selectMonthOfBirth("4");
        registerPage.selectYearOfBirth("2001");
        registerPage.setEmail("Waleed@gmail.com");
        registerPage.setPassword("123456");
        registerPage.setConfirmPassword("123456");
        registerPage.clickOnRegisterBtn();
    }
}
