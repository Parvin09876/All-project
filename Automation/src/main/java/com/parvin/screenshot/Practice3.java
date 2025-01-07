package com.parvin.screenshot;

import io.opentelemetry.semconv.SemanticAttributes;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Practice3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        driver.findElement(By.cssSelector("textarea[class='gLFyf']")).sendKeys("What is Automation ? ");
        driver.findElement(By.cssSelector("input[value='Google Search']")).click();
        TakesScreenshot takesScreenshot1 = (TakesScreenshot) driver;
        File screenpicture = takesScreenshot1.getScreenshotAs(OutputType.FILE);
         try{
             FileUtils.copyFile(screenpicture, new File("./screenshotFolder/sc.png" ));
         }catch (IOException e){
             System.out.println("Exception : " + e.getMessage());
         }


    }
}
