package com.globant;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.testng.annotations.Test;

public class LoginTest extends DataBase {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
    @Test(dataProvider = "validData", priority = 1)
        public void logIn(String email, String password) {
            System.out.println("Click on the user icon in navigation bar");
            System.out.println("Select Log In option");
            System.out.println("Type the required information:  " + email + "and " + password);
            System.out.println("Click on Log In button");
            System.out.println("Click on the user icon in navigation bar");
            System.out.println("Verify if your log In was correct");
            log.debug("prueba");
            System.out.println();

        }

        @Test(dataProvider = "invalidData", priority = 2)
    public void invalidLogIn(String email, String password) {
            System.out.println("Click on the user icon in navigation bar");
            System.out.println("Select Log In option");
            System.out.println("Type the required information:  " + email + "and " + password);
            System.out.println("Click on Log In button");
            System.out.println("Your credentials are not correct, try again please");
            System.out.println();
        }
    }

