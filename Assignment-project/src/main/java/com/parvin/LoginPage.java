package com.parvin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
       PageFactory.initElements(driver, this);
        }

    public void visitPage(String websiteUrl){
        pageIn(websiteUrl);
    }

    @FindBy(id = "user-name")
    private WebElement usernameLocator;
    public void enterUsername(String userName){
        sendKeys(usernameLocator, userName);
    }

    @FindBy(id = "password")
    private WebElement passwordLocator;
    public void  enterPassword (String password){
        sendKeys(passwordLocator,password);
    }

    @FindBy(id = "login-button")
     private WebElement loginButtonLocator;
    public void loginbutton(){
        click(loginButtonLocator);
    }

    @FindBy(xpath = "//span[@data-test='title']")
    private WebElement products;
    public  void productsLocator(){
        System.out.println(products.getText());
    }
}
