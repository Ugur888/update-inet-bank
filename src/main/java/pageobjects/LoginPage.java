package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver ldriver;

    public LoginPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath="//*[@name='uid']")
    WebElement user_name_field;

    @FindBy(xpath="//*[@name='password']")
    WebElement password_field;

    @FindBy(xpath="//*[@name='btnLogin']")
    WebElement login_button;

    public void setUserName(String uname){
        user_name_field.sendKeys(uname);
    }

    public void setPassword(String pwd){
        password_field.sendKeys(pwd);
    }

    public void clickSubmit(){
        login_button.click();
    }
}
