package com.parvin.Alert;

import com.parvin.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertBoxHomePage extends BasePage {
  By alertBoxButton = By.xpath("//button[@class='btn btn-danger']");

    public AlertBoxHomePage(WebDriver driver) {
        super(driver);
    }
    public void visitAlertBoxPage(String url){
        pageIn(url);
    }
    public void clickOnAlertBoxButton(){
        WebElement alertBoxButtonElement =driver.findElement(alertBoxButton);
        click(alertBoxButtonElement);
    }
}
