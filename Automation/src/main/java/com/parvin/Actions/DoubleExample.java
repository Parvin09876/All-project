package com.parvin.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://api.jquery.com/dblclick/");
        driver.manage().window().maximize();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
        Actions act = new Actions(driver);
        WebElement click = driver.findElement(By.xpath("//span[text()='Double click the block']/parent::body/div"));

        Thread.sleep(3000);
        act.doubleClick(click).perform();


    }

}
