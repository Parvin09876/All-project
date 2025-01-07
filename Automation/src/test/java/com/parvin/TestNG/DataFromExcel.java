package com.parvin.TestNG;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataFromExcel {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "sauceLaData")
    public void login(String username, String password) throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(1000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @DataProvider(name = "sauceLaData")
    public Object[][] passData() throws IOException {
        Object[][] data = new Object[0][0];
        try (FileInputStream inputStream = new FileInputStream(new File("New Spreadsheet 1.xlsx"))) {
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheet("Sheet1");

            int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
            data = new Object[rowCount][2];
            for (int i = 1; i < rowCount; i++) {
                Row row = sheet.getRow(i);

                for (int j = 0; j < 2; j++) {
                    data[i - 1][j] = row.getCell(j).toString();
                    System.out.println(row.getCell(j));
                }
            }

        } catch (IOException e) {
            System.out.println("Exception");
        }
        return data;
    }
}
