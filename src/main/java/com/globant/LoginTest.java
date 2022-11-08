package com.globant;

import org.testng.annotations.Test;

public class LoginTest extends DataBase {
    @Test(dataProvider = "validData", priority = 1)
        public void logIn(String email, String password) {
            System.out.println("Click on the user icon in navigation bar");
            System.out.println("Select Log In option");
            System.out.println("Type the required information:  " + email + "and " + password);
            System.out.println("Click on Log In button");
            System.out.println("Click on the user icon in navigation bar");
            System.out.println("Verify if your log In was correct");
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

