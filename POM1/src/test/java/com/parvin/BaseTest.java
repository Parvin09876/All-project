package com.parvin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
