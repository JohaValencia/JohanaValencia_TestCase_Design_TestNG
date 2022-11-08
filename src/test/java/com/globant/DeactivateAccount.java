package com.globant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class DeactivateAccount extends DataBase {
    private static final Logger log = LoggerFactory.getLogger(DeactivateAccount.class);

    @Test(dataProvider = "validData", priority = 4)
    public void logOut(String email, String password) {
        log.info("Click on the user icon in navigation bar");
        log.info("Select Log In option");
        log.info("Type the required information: {} and {} ",email, password);
        log.info("Click on Log In button");
        log.info("Click on ESPN Profile option");
        log.info("Choose Delete Account option");
        log.info("Click Yes, delete this account option");
        log.info("Verify if the account is deactivate");
        log.info("Click on the user icon in navigation bar");
        log.info("Select Log In option");
        log.info("Type the required information: {} and {} ",email, password);
        log.info("Click on Log In button");
        log.info("The account {} is not register ", email);
        System.out.println();
    }
}
