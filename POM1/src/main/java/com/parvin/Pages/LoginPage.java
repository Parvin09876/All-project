package com.parvin.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    private final By userNameLocator = By.xpath("//input[@data-test='username']");
    private final By passwordLocator = By.cssSelector("input[type='password']");
    private final By loginButtonLocator=By.id("login-button");
    private final By addProudctLocator =By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void enterUserName(String username){
        WebElement userNameInput = driver.findElement(userNameLocator);
        sendkey(userNameInput,username);
    }
    public void enterPassword(String password){
        WebElement passwordInput = driver.findElement(passwordLocator);
        sendkey(passwordInput,password);
    }
    public void clickOnLoginButton(){
        WebElement loginButton = driver.findElement(loginButtonLocator);
        click(loginButton);
    }
}
