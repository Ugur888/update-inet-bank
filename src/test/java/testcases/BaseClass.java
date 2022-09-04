package testcases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.ReadConfig;

import java.io.File;
import java.io.IOException;

public class BaseClass {

    ReadConfig readconfig = new ReadConfig();

    public String baseUrl = readconfig.getApplicationURL();
    public String username = readconfig.getUsername();
    public String password = readconfig.getPassword();
    public static WebDriver driver;

    public static final String FILE_PATH_SEPARATOR = System.getProperty("file.separator");
    public static final String SYSTEM_USER_DIR = System.getProperty("user.dir");
    public static final String PATH_TO_DRIVERS = SYSTEM_USER_DIR + FILE_PATH_SEPARATOR + "drivers" + FILE_PATH_SEPARATOR;


    @BeforeClass
    public void setup() {

        if (System.getProperty("os.name").contains("Mac")) {
            System.setProperty("webdriver.chrome.driver", PATH_TO_DRIVERS + "chromedriver");
        } else if (System.getProperty("os.name").contains("Windows")) {
            System.setProperty("webdriver.chrome.driver", PATH_TO_DRIVERS + "chromedriver.exe");
        }
        driver = new ChromeDriver();

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public void captureScreen(WebDriver driver, String tname) throws IOException{
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "/screenshots/" + tname + ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot taken");
    }

}
