package com.parvin.MyseleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertBox {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");

        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();



        Alert alertbox = driver.switchTo().alert();
        System.out.println(alertbox.getText());
        alertbox.accept();
    }
}
