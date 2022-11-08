package com.globant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class LogoutTest extends DataBase {
    private static final Logger log = LoggerFactory.getLogger(LogoutTest.class);
@Test(dataProvider = "validData", priority = 3)
    public void logOut(String email, String password){
    log.info("Click on the user icon in navigation bar");
    log.info("Select Log In option");
    log.info("Type the required information: {} and {}", email, password);
    log.info("Click on Log In button");
    log.info("Verify if your log In was correct");
    log.info("Click on the user icon in navigation bar");
    log.info("Click on logOut option");
    log.info("Verify if your log out was correct");
    System.out.println();
}
}
