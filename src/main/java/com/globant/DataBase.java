package com.globant;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;


public class DataBase {
private static final Logger log = LoggerFactory.getLogger(DataBase.class);

@DataProvider (name = "validData")
    public Object [][] getValidData() {
return new Object[][] {{"dog@mail.com", "dog1"}, {"cat@mail.com", "cat1"}, {"rabbit@mail.com", "rabbit1"}};
}

@DataProvider (name = "invalidData")
    public Object [][] getInvalidData() {
    return new Object[][] {{"lion@mail.com", "lion1"}, {"tigger@mail.com", "tigger1"}, {"jaguar@mail.com", "jaguar1"}};
}

@BeforeSuite
    public void startBrowser() {
    System.out.println("Starting Browser");
    System.out.println();
}

@BeforeTest
public void registerUser() {
    System.out.println("Start to https://www.espn.com.co/");
    System.out.println("Click the user icon");
    System.out.println("To create a new account, click on Log in option");
    System.out.println("To login with a existing account, click on Sign up option");
    System.out.println();
}

@BeforeMethod
    public void cleanPage () {
    System.out.println("Start to https://www.espn.com.co/");
    System.out.println("Click on View site information button");
    System.out.println("Click on Cookies option");
    System.out.println("Remove cookies");
    log.debug("prueba");
    System.out.println();
}



}
