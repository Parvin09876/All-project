package com.parvin.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class keywordAction {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Actions activate = new Actions(driver);

       activate.click(driver.findElement(By.xpath("//textarea[@class='gLFyf']")))
               .sendKeys("Naxxvali")
               .pause(Duration.ofSeconds(3))
               .sendKeys(Keys.ARROW_DOWN)
               .pause(Duration.ofSeconds(3))
               .sendKeys(Keys.ENTER)
               .build().perform();
    }
}
