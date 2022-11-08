package com.globant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;


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
    log.info("Starting Browser");
    System.out.println();
}
     @BeforeTest
     public void registerUser() {
     log.info("Start to https://www.espn.com.co/");
     log.info("Click the user icon");
     log.info("To create a new account, click on Log in option");
     log.info("To login with a existing account, click on Sign up option");
     System.out.println();
}

     @BeforeMethod
     public void cleanPage () {
     log.info("Start to https://www.espn.com.co/");
     log.info("Click on View site information button");
     log.info("Click on Cookies option");
     log.info("Remove cookies");
     System.out.println();
}
     @AfterTest
     public void closeBrowser () {
     log.info("Browser is closed");
     System.out.println();
}

}
