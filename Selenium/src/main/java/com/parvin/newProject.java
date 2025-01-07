package com.parvin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newProject{
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver","C:\\Users\\sayed\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.Facebook.com");
        WebElement emailId = driver.findElement(By.xpath("//input[@id='email']"));
        emailId.sendKeys("Ahmedrazu160@gmail.com");

        WebElement passWord =driver.findElement(By.xpath("//input[@id='pass']"));
        passWord.sendKeys("01715190355");

        WebElement logIn = driver.findElement( By.xpath("//button[@name='login']"));
        logIn.click();


    }
}

