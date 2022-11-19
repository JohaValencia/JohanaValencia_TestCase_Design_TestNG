package org.espn.tests;

import org.espn.Driver;
import org.espn.pages.DeleteAccountModal;
import org.espn.pages.HomeESPNPage;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.*;
import reporting.Reporter;

import static java.lang.String.format;

public class BaseTest {

    private Driver driver;
    protected HomeESPNPage homeESPNPage;

    protected DeleteAccountModal deleteAccountModal;
    protected final String email = "amarillatalle@gmail.com";
    protected final String password = "Toña1234$";

    @Parameters({"url"})
    @BeforeClass
    public void testSetUp(String url) {
        driver = new Driver();
        Reporter.info("Deleting all cookies");
        driver.getDriver().manage().deleteAllCookies();
        Reporter.info(format("Navigating to %s", url));
        driver.getDriver().get(url);
        driver.getDriver().manage().window().maximize();
        homeESPNPage = new HomeESPNPage(driver.getDriver());
        homeESPNPage.closeBanner();
        deleteAccountModal = new DeleteAccountModal(driver.getDriver());
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

}
