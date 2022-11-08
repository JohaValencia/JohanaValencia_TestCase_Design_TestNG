package com.globant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class LoginTest extends DataBase {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
    @Test(dataProvider = "validData", priority = 1)
        public void logIn(String email, String password) {
            log.info("Click on the user icon in navigation bar");
            log.info("Select Log In option");
            log.info("Type the required information: {} and {} ",email, password);
            log.info("Click on Log In button");
            log.info("Click on the user icon in navigation bar");
            log.info("Your log in has been successful");
            System.out.println();

        }

        @Test(dataProvider = "invalidData", priority = 2)
    public void invalidLogIn(String email, String password) {
            log.info("Click on the user icon in navigation bar");
            log.info("Select Log In option");
            log.info("Type the required information: {} and {} ",email, password);
            log.info("Click on Log In button");
            log.info("Your credentials are not correct, try again please");
            System.out.println();
        }
    }

