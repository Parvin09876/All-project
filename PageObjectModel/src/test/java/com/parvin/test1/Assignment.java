package com.parvin.test1;

import com.parvin.Pages.LoginPage;
import org.testng.annotations.Test;

public class Assignment extends BaseTest{
    @Test
    public void testcase1 () throws InterruptedException {
        LoginPage logIn = new LoginPage(driver);
        logIn.visitPage("https://www.saucedemo.com/");
        logIn.enterUsername("standard_user");
        logIn.enterPassword("secret_sauce");
        logIn.clickOnLoginButton();
        Thread.sleep(2000);
    }
    @Test
    public  void testCase2 (){
        LoginPage logIn2 = new LoginPage(driver);

        logIn2.visitPage("https://www.saucedemo.com/");

        logIn2.enterPassword("admin123");
        logIn2.enterPassword("secret_sauce");
        logIn2.clickOnLoginButton();
        logIn2.errorMassage();

    }
}
