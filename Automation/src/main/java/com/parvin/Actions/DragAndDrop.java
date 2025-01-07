package com.parvin.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
        driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@class='js-iframe active'])[1]")));

        Actions action = new Actions(driver);
        WebElement srce =driver.findElement(By.xpath("//span[text()='Magazines']"));
        WebElement deste =driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));

        action.dragAndDrop(srce,deste).perform();
    }
}
