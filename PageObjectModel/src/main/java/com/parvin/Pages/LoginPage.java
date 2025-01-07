package com.parvin.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    private final By errorMassageLocator=By.cssSelector("h3[data-test='error']");

    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void visitPage(String websiteURL){
        pageIn(websiteURL);
    }
    @FindBy(id="user-name")
    private WebElement userNameInputLocator;

    @FindBy(id="password")
    private WebElement passwordInputLocator;
    @FindBy(id = "login-button")
    private WebElement loginButtonLocator;

    public  void enterUsername(String username){
        sendkey(userNameInputLocator ,username);
    }
    public void enterPassword(String password){
        sendkey(passwordInputLocator,password);
    }
    public void clickOnLoginButton(){
        click(loginButtonLocator);
    }
    public void errorMassage(){
        WebElement error =driver.findElement(errorMassageLocator);
        System.out.println("Error massage : "+ error.getText());

    }
}
