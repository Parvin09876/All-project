package com.parvin.chips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zayan {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://qbek.github.io/selenium-exercises/en/");
       driver.findElement(By.cssSelector("a[href='radio_buttons.html']")).click();

       driver.findElement(By.cssSelector("input[type='radio']")).click();

       List<WebElement> SConcept = driver.findElements(By.cssSelector("input[type='radio']"));
        System.out.println(SConcept.size());
        SConcept.get(2).click();

        for (WebElement bumPer  : SConcept){
            String value = bumPer.getAttribute("value");
            System.out.println("value from radio buttons are ==> " + value);
            if ( value.equalsIgnoreCase("radiozet")){
                bumPer.click();
                
            }
        }

    }
}
