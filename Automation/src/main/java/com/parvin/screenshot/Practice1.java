package com.parvin.screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class Practice1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://gmail.com");

        driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("jahanaraparvin09876@gmail.com");

        TakesScreenshot pictureOfGoogle = (TakesScreenshot) driver;
        File screenshotOfGoogle = pictureOfGoogle.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotOfGoogle, new File("./sc/sc.png"));
        }catch (IOException exception){
            System.out.println("Execption : " + exception.getMessage());


        }

    }
    }

