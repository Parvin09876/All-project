package com.parvin.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataExample {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }
    @Test(dataProvider ="sauceLaData")
    public void login(String username, String password) throws InterruptedException {
      driver.findElement(By.id("user-name")).sendKeys(username);
      driver.findElement(By.id("password")).sendKeys(password);
      driver.findElement(By.cssSelector("input[id='login-button']")).click();
      Thread.sleep(2000);
      String actual = null;
      try{
          actual=driver.findElement(By.xpath("//span[@data-test='title']")).getAttribute("innerHTML");
          System.out.println(actual);
      }catch (Exception e){
          System.out.println(e.getMessage());
      }
        Assert.assertEquals(actual,"Products","Login not Successful.Maybe credentials are worng.");

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @DataProvider(name="sauceLaData")
    public Object[][] passdata(){
        Object[][] data = new Object[2][2];
        //1st Set
        data[0][0] = "standard_user";
        data[0][1] = "secret_sauce";
        //2nd Set
        data[1][0] = "problem_user";
        data[1][1] = "secret_sauce";
        //3rd Set
        data[2][0] = "admin2";
        data[2][1] = "demo1234";
        return data;
    }
}
