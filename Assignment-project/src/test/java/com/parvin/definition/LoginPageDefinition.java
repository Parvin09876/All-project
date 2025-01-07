package com.parvin.definition;

import com.parvin.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageDefinition {
   public WebDriver driver;
    LoginPage loginPage ;
    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("User is on the login page")
    public void user_is_on_the_login_page(){
        loginPage = new LoginPage(driver);
        loginPage.visitPage("https://www.saucedemo.com/");

    }
    @When("User enters userName {string} and password as {string}")
    public void User_enters_username_and_password_as(String userName,String password) throws InterruptedException {
        loginPage.enterUsername(userName);
        loginPage.enterPassword(password);
        loginPage.loginbutton();
        Thread.sleep(2000);
    }
    @Then("User should be logged in successfully")
    public void User_should_be_logged_in_successfully(){
       loginPage.productsLocator();

    }
    @After
    public void close(){
        driver.quit();
    }
}
