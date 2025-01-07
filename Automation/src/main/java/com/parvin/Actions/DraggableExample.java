package com.parvin.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://jqueryui.com/draggable/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
        Actions active =new Actions(driver);
        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
        Thread.sleep(3000);

        active.dragAndDropBy(source,307,10).perform();
    }
}
