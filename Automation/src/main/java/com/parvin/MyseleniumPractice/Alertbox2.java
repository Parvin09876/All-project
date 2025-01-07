package com.parvin.MyseleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html#CancelTab");

        WebElement dangerButton = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
        dangerButton.click();
        driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();

        Alert alertCase = driver.switchTo().alert();
        System.out.println(alertCase.getText());

        //Thread.sleep(2000);
        alertCase.accept();
        //alertCase.dismiss();
        WebElement text = driver.findElement(By.xpath("//p[@id='demo']"));
        System.out.println(text.getText());
        String message = text.getText();

        if(message.equalsIgnoreCase("You pressed ok")){
            System.out.println("You did ");
        }else {
            System.out.println("You didn't ");
        }
    }
}
