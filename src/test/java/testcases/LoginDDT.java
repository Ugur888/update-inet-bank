package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDDT extends BaseClass {

    @Test
    public void loginDDT() {

    }

    @DataProvider(name = "LoginData")
    getData(){
        String path = System.getProperty("user dir") + "/src/test/java/testdata/LoginData.xlsx";
    }
}
