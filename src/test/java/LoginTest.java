import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import pageobjects.ManagerHomePage;

public class LoginTest extends BaseClass {

    @Test
    public void loginTest() {
        driver.get(baseUrl);

        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        lp.setPassword(password);
        lp.clickSubmit();

        if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
            Assert.assertTrue(true);

        } else {
            Assert.assertTrue(false);

        }
        ManagerHomePage managerPage = new ManagerHomePage(driver);
        Assert.assertEquals(managerPage.getManagerIdNumber(), "Manger Id : mngr432447");
        System.out.print("Ugur will be manager: " + managerPage.getManagerIdNumber());

    }
}
