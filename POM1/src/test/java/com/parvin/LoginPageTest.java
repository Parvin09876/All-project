package com.parvin;

import Utils.DataDrivenFile;
import com.parvin.Pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.imageio.IIOException;
import java.io.IOException;

public class LoginPageTest extends BaseTest{
    @Test(dataProvider = "login-data")
    public void testLogin(String username, String password) throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName(username);
        loginPage.enterPassword( password);
        loginPage.clickOnLoginButton();
        Thread.sleep(2000);
    }
    @DataProvider (name= "login-data")
    public Object[][] loginData() throws IOException {
        Object[][] data= DataDrivenFile.getDataFromExcel("New Spreadsheet 1.xlsx", "Sheet1", 2);
        return data;
    }
}
