package com.parvin.MyseleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class iframe2 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("file:///C:/Users/sayed/IdeaProjects/Automation/src/main/java/com/parvin/MyseleniumPractice/Iframe-Automation.html");
        List<WebElement>allweb = driver.findElements(By.cssSelector("iframe"));
        System.out.println(allweb.size());

       //WebElement secondweb = driver.findElement(By.xpath("//iframe[@id='w3c']"));
     //driver.switchTo().frame(secondweb);
            driver.switchTo().frame(1);
           // driver.switchTo().frame("selenium");
        WebElement signbutton =driver.findElement(By.xpath("//button[@id='btn2']"));
        signbutton.click();

    }
}
