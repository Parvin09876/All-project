package com.parvin.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.Arrays;
import java.util.List;

public class CheckBottun {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qbek.github.io/selenium-exercises/en/");
        driver.manage().window().maximize();

       // driver.findElement(By.cssSelector("a[href=\"check_boxes.html\"]")).click();
        driver.findElement(By.xpath("//a[@href='check_boxes.html']")).click();

        List<WebElement> checkBoxs = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
        System.out.println(checkBoxs.size());
        checkBoxs.get(2).click();
        checkBoxs.get(1).click();
        checkBoxs.get(0).click();

     //   for(int i = 0 ; i < checkBoxs.size();i++){
         //   System.out.println(checkBoxs.get(i).getAttribute("name"));

        for (WebElement local_check : checkBoxs){
            String name = local_check.getAttribute("name");
            System.out.println("Value from check boxes are ==> "+ name);
            if (name.equalsIgnoreCase("blue")){
                local_check.click();
            }

        }


    }
}
