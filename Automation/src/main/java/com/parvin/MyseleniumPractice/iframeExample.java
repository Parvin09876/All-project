package com.parvin.MyseleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class iframeExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/sayed/IdeaProjects/Automation/src/main/java/com/parvin/MyseleniumPractice/Iframe-Automation.html");

        //List<WebElement> allframe = driver.findElements(By.tagName("iframe"));
        List<WebElement> allframe = driver.findElements(By.xpath("//iframe"));
        System.out.println(allframe.size());
        WebElement thirdframe = driver.findElement(By.xpath("//iframe[@title='selenium_news']"));
        driver.switchTo().frame(thirdframe);
        //driver.switchTo().frame("selenium");
        //driver.switchTo().frame(2);

//
//       WebElement menu =driver.findElement(By.cssSelector("button.navbar-toggler"));
//       // WebElement menu = driver.findElement(By.cssSelector("button[type='button']"));
//        menu.click();
//        driver.switchTo().defaultContent();

    }
}
