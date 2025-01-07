package com.parvin.MyseleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {
    public static void main(String[] args) {
        ChromeOptions options =new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/upload-file-demo");

        WebElement chooseFile = driver.findElement(By.id("file"));
        chooseFile.sendKeys("C:\\Users\\sayed\\Downloads\\17995206-183a-4637-aa99-d2f351d541e6.JPG");

        String message = driver.findElement(By.id("error")).getText();
        System.out.println(message);

    }
}
