package com.parvin.test1;

import com.parvin.Alert.AlertBoxHomePage;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class AlertBoxTest extends BaseTest{

    @Test
    public void alertBoxTest() throws InterruptedException {
        AlertBoxHomePage alertBoxHomePage = new AlertBoxHomePage(driver);

        alertBoxHomePage.visitAlertBoxPage("https://demo.automationtesting.in/Alerts.html");
        Thread.sleep(2000);
        alertBoxHomePage.clickOnAlertBoxButton();
        Thread.sleep(2000);

//        String alertMessage = alertBoxHomePage.getAlertBoxText();
//        System.out.println(alertMessage);

        Alert alertElement = driver.switchTo().alert();
        System.out.println(driver.switchTo().alert().getText());
        alertElement.accept();
    }
}
