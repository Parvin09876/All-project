package com.parvin.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExample {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("http://www.facebook.com");
        JavascriptExecutor JavaScript = (JavascriptExecutor) driver;
        System.out.println(JavaScript.executeScript("return document.title"));
       // System.out.println(driver.getTitle());
        WebElement emailField = driver.findElement(By.cssSelector("input#email"));
        JavaScript.executeScript("arguments[0].setAttribute('style','background:green')",emailField);

        WebElement password = driver.findElement(By.cssSelector("div#passContainer"));
        JavaScript.executeScript("arguments[0].setAttribute('style','background:red')",password);


    }

}
