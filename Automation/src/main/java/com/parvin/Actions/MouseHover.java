package com.parvin.Actions;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MouseHover {
    public static void main(String[] args) {

//        WebElement hoverButton = driver.findElement(By.xpath("//button[text()='Automation Tools']"));
//        Actions act = new Actions(driver);
//        act.moveToElement(hoverButton).perform();
//
//        List<WebElement> links = driver.findElements(By.xpath("//div[@class='dropdown-content']/child::a"));
//        int total_count = links.size();
//        System.out.println(links.size());
//        for (int i = 0; i<total_count; i++){
//            WebElement element= links.get(i);
//            String text = element.getAttribute("href");
//            System.out.println("Link: " + text);

        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
        //driver.manage().window().maximize();
        WebElement hoverButton = driver.findElement(By.cssSelector("button[class='dropbtn']"));
        Actions act = new Actions(driver);
        act.moveToElement(hoverButton).perform();
        List<WebElement> links = driver.findElements(By.xpath("//div[@class='dropdown-content']/child::a"));
        int total_count = links.size();
        System.out.println(links.size());
        for (int i = 0; i < total_count; i++) {
            WebElement element = links.get(i);
            String text = element.getAttribute("href");
            System.out.println("Link: " + text);
        }


    }

}