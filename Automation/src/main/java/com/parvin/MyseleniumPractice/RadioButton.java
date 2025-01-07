package com.parvin.MyseleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qbek.github.io/selenium-exercises/en/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@href='radio_buttons.html']")).click();

        List<WebElement> radiobuttons = driver.findElements(By.cssSelector("input[type='radio']"));
        System.out.println(radiobuttons.size());
        radiobuttons.get(1).click();

        for(WebElement Local_radio: radiobuttons){
            String value = Local_radio.getAttribute("value");
            System.out.println("Value of Radio Buttons are ==> "+ value);
            if (value.equalsIgnoreCase("polskieradio")){
                Local_radio.click();
            }
        }
//        for (int i = 0; i< radiobuttons.size(); i++){
//           String Name = radiobuttons.get(i).getAttribute("name");
//            System.out.println("Name of RadioButtons is ==> "+ Name);
        }
    }

