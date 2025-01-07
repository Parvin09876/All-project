package com.parvin.TestNG;

import org.testng.annotations.Test;

public class ExceptionHandling {
    @Test(expectedExceptions = {ArithmeticException.class})
    public void handling(){
        int a= 10/0;
        System.out.println("It is working... " + a);
    }
}
