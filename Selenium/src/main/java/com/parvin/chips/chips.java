package com.parvin.chips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.List;

public class chips {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://qbek.github.io/selenium-exercises/en/");

        driver.findElement(By.cssSelector("a[href='selects.html']")).click();

        WebElement selectElement= driver.findElement(By.cssSelector(".custom-select.mb-3"));

        Select select = new Select(selectElement);

        select.selectByValue("4");
        select.selectByVisibleText("5");
        select.selectByIndex(1);

        List<WebElement> options = select.getOptions();
        System.out.println(options.size());




    }
}