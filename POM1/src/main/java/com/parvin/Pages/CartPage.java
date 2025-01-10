package com.parvin.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    public final By productLocator = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    public final By product2ndLocator = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    public final By cartLocator = By.xpath("//span[@data-type='shopping-cart-badge']");

    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void addProductMethod (){
        WebElement addProduct = driver.findElement(productLocator);
        click(addProduct);
    }
    public void addProduct2ndMethod (){
        WebElement addProduct2nd = driver.findElement(product2ndLocator);
        click(addProduct2nd);
    }
    public void cartCheck(){
        WebElement cart = driver.findElement(cartLocator);
        click(cart);
    }
}


