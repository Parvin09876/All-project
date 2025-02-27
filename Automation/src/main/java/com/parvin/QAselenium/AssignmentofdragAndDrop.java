package com.parvin.QAselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class AssignmentofdragAndDrop {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Static.html");

        driver.findElement(By.xpath("(//div[@class='row'])[2]"));

        Actions assign = new Actions(driver);
       WebElement UpercaseS =driver.findElement(By.xpath("//img[@src='logo.png']"));
       WebElement logo =driver.findElement(By.xpath("//img[@id='mongo']"));
       WebElement last = driver.findElement(By.xpath("//img[@src='selenium.png'][@id='node']"));

        WebElement drop = driver.findElement(By.xpath("//div[@class='dragged']"));

        assign.dragAndDrop(logo,drop).perform();
        assign.dragAndDrop(last,drop).perform();

        assign.clickAndHold(UpercaseS)
                .pause(Duration.ofSeconds(2))
                .moveToElement(drop)
                .pause(Duration.ofSeconds(2))
                .release()
                .build()
                .perform();
    }
}
