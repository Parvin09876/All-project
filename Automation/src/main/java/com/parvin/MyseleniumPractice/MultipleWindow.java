package com.parvin.MyseleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MultipleWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
        driver.manage().window().maximize();
        String mainab =driver.getWindowHandle();
        System.out.println(mainab);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='http://www.yahoo.com']")).click();

        Set<String> allTabs = driver.getWindowHandles();
        System.out.println(allTabs);

        List<String> allatabList = new ArrayList<>(allTabs);
        driver.switchTo().window(allatabList.get(1));
        driver.get("https://google.com");

       // driver.switchTo().window(allatabList.get(0));
       // System.out.println(allTabs.size());
    }
}
