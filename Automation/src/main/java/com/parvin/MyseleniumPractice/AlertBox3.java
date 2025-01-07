package com.parvin.MyseleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");

        WebElement dengerbutton = driver.findElement(By.cssSelector("a[href='#Textbox']"));
        dengerbutton.click();

        driver.findElement(By.cssSelector("button[class='btn btn-info']")).click();
//        Thread.sleep(3000);

        Alert alertThread = driver.switchTo().alert();
        alertThread.sendKeys("Hello Zayan");
        System.out.println(alertThread.getText());
        Thread.sleep(3000);
        alertThread.accept();
    }
}
