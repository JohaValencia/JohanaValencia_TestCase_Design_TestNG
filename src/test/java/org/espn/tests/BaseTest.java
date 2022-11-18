package org.espn.tests;

import org.espn.Driver;
import org.espn.pages.HomeESPNPage;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import reporting.Reporter;

import static java.lang.String.format;

public class BaseTest {

    private Driver driver;
    protected HomeESPNPage homeESPNPage;
    protected final String email = "amarillataller@gmail.com";
    protected final String password = "Toña1234$";

    @Parameters({"url"})
    @BeforeTest()
    public void testSetUp(String url) {
        driver = new Driver();
        Reporter.info("Deleting all cookies");
        driver.getDriver().manage().deleteAllCookies();
        Reporter.info(format("Navigating to %s", url));
        driver.getDriver().get(url);
        driver.getDriver().manage().window().maximize();
        homeESPNPage = new HomeESPNPage(driver.getDriver());
        homeESPNPage.closeBanner();
    }

    @AfterTest
    public void teardown() {
        driver.getDriver().quit();
    }

    protected <T> void checkThat(String description, T actualValue, Matcher<? super T> expectedValue) {
        Reporter.info(format("Checking that " + description.toLowerCase() + " [Expectation; %s]", expectedValue));
        try {
            MatcherAssert.assertThat(actualValue, expectedValue);
        } catch (AssertionError e) {
            Reporter.error(format("Assertion error: [%s]", e.getMessage().replaceAll("\n", "")));
        }
    }


    protected void logInSteps() {
        homeESPNPage.clickUserIcon();
        homeESPNPage.clickOnLogIn();
        homeESPNPage.logoIsShowing();
        homeESPNPage.sigUpBtnIsPresent();
        homeESPNPage.typingEmailOnInput(email);
        homeESPNPage.typingPasswordOnInput(password);
        homeESPNPage.logInBtnIsShowing();
    }
}
