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

public class Practice2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        sc(driver,"Google");
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Software testing");
        sc(driver,"Sendkey");
    }
        static void sc(WebDriver driver, String scFile ){
            TakesScreenshot takesScreenshot =(TakesScreenshot) driver;
            File screenShotfolder = takesScreenshot.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenShotfolder, new File("./screenshotFolder/"+scFile+".png"));
            }catch (IOException exception){
                System.out.println("Exception : " +exception.getMessage());

            }
        }

}
