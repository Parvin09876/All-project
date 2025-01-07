package com.parvin.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://api.jquery.com/dblclick/");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
        Actions actions = new Actions(driver);
        WebElement squareboxx = driver.findElement(By.xpath("//span[text()='Double click the block']/preceding-sibling::div"));
        Thread.sleep(3000);
        actions.doubleClick(squareboxx).perform();

        System.out.println("Yeeee I double clicked the element !!! ");
    }
}
