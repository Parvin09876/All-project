package com.parvin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver ;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void pageIn(String url){
        driver.get(url);
    }
    public void sendKeys(WebElement element, String input){
        element.sendKeys(input);
    }
    public void click(WebElement element){
        element.click();
    }

}
