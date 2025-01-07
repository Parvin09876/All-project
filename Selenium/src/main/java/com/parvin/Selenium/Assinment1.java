package com.parvin.Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Assinment1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        driver.findElement(By.cssSelector("textarea[class='gLFyf']")).sendKeys("Selenium WebDriver");

        driver.findElement(By.cssSelector("input[value='Google Search']")).click();
        WebElement firstsearch = driver.findElement(By.xpath("//cite[@role='text']"));
        firstsearch.click();

        }

    }
