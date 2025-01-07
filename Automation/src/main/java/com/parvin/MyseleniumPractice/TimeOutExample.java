package com.parvin.MyseleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TimeOutExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
            driver.get("https://learn-automation.com/selenium-webdriver-tutorial-for-beginners/");
        } catch (TimeoutException exception) {
            System.out.println(exception.getCause());
        }
      try {
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           driver.findElement(By.xpath("//span[text()='List of java topic for Selenium']")).click();
       }catch (TimeoutException exception) {
      System.out.println("Lots of exception ");
    }







        //driver.get("http://www.facebook.com");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebElement emailinput = driver.findElement(By.xpath("//input[@id='email']"));
//        emailinput.sendKeys("jahanaraparvin09876@gmail.com"); driver.get("http://www.facebook.com");
////        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
////        WebElement emailinput = driver.findElement(By.xpath("//input[@id='email']"));
////        emailinput.sendKeys("jahanaraparvin09876@gmail.com");

    }
}

