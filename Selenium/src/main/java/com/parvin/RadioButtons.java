package com.parvin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class RadioButtons{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qbek.github.io/selenium-exercises/en/");
        Thread.sleep(2000);
     //   WebElement radioButtonLink = driver.findElement(By.xpath("//a[@href='radio_buttons.html']"));
        WebElement radioButtonLink = driver.findElement(By.cssSelector("a[href='radio_buttons.html']"));
        radioButtonLink.click();

       // WebElement radioButtonPage = driver.findElement(By.xpath("//input[@type='radio']"));
        WebElement radioButtonPage = driver.findElement(By.cssSelector("input[type='radio']"));
        radioButtonPage.click();
        Thread.sleep(2000);
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println(radioButtons.size());
        radioButtons.get(2).click();

        for (WebElement local_radio : radioButtons) {
            String value = local_radio.getAttribute("value");
            System.out.println("value from radio buttons are ==> " + value);
            if (value.equalsIgnoreCase("rmffm")){
                local_radio.click();
            }
            //for (int i = 0 ;i< radioButtons.size();i++ ) {
            // System.out.println(radioButtons.get(i).getAttribute("value"));
        }

    }
}

