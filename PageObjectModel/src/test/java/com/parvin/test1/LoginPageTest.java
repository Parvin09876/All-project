package com.parvin.test1;

import com.parvin.Pages.BasePage;
import com.parvin.Pages.LoginPage;
import com.parvin.Utils.DataDrivenFile;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends BaseTest {

    @Test(dataProvider = "login-data")
    public void testLogin(String username, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.visitPage("https://www.saucedemo.com/");
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
        Thread.sleep(2000);
    }

    @DataProvider(name = "login-data")
    public Object[][] loginData() throws IOException {
        Object[][] data = DataDrivenFile.getDataFromExcel("New Spreadsheet 2.xlsx", "Sheet1", 2);
        return data;
    }


//        public void testlogin() throws InterruptedException {
//
//        LoginPage loginPage = new LoginPage(driver);
//
//        loginPage.enterUsername("standard_user");
//        loginPage.enterPassword("secret_sauce");
//        loginPage.clickOnLoginButton();
//}

}