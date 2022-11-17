package org.espn.tests;

import org.testng.annotations.Test;

import static org.hamcrest.core.Is.is;

public class LoginTest extends BaseTest {

    @Test
    public void runningLogIn() {
        homeESPNPage.clickUserIcon();
        homeESPNPage.clickOnLogInIndicator();
        checkThat("ESPN logo is visible", homeESPNPage.logoIsShowing(), is(true));
        checkThat("Log in button is visible", homeESPNPage.logInBtnIsShowing(), is(true));
        checkThat("Sign up button is visible", homeESPNPage.sigUpBtnIsPresent(), is(true));
        homeESPNPage.typingEmailOnInput(email);
        homeESPNPage.typingPasswordOnInput(password);
        homeESPNPage.clickOnLogIn();
    }

}
