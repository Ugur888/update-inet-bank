package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerHomePage {

    WebDriver ldriver;

    public ManagerHomePage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath="//table//*[@style='color: green']")
    WebElement manager_id_number;

    public String getManagerIdNumber(){
        return manager_id_number.getText();
    }

}
