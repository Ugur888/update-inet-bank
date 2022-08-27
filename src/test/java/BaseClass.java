import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    public String baseUrl = "https://demo.guru99.com/V4/index.php";
    public String username = "mngr432447";
    public String password = "vEtevuq";
    public static WebDriver driver;

    public static org.apache.log4j.Logger Logger;

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

}
