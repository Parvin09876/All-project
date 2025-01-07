package com.parvin.TestNG;

import org.testng.annotations.Test;

public class DependenttestingMethod {
    @Test
    public void  login(){
        System.out.println("Login....");
    }
    @Test(dependsOnMethods = {"login"})
    public void search(){
        System.out.println("Search....");
    }
    @Test(dependsOnMethods = {"search","login"})
    public void logout(){
        System.out.println("Logout...");
    }




//    @Test(groups = {"login"})
//    public void login(){
//        System.out.println("Login");
//    }
//    @Test(groups = {"search"}, dependsOnGroups = {"login"})
//    public void search(){
//        System.out.println("Search");
//    }
//    @Test(dependsOnGroups = {"search"},alwaysRun = true)
//    public void logout(){
//        System.out.println("Logout");
//    }
}
