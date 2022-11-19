package org.espn.pages;

import org.espn.tests.DeactivateAccountTest;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeESPNPage extends BasePage {

    @FindBy(id = "global-user-trigger")
    private WebElement userIcon;

    @FindBy(css = ".user.hover a[tref*='/login']")
    private WebElement logInIndicator;

    @FindBy(id = "sideLogin-left-rail")
    private WebElement loginView;

    @FindBy(id = "logo")
    private WebElement logoModal;

    @FindBy(id = "InputLoginValue")
    private WebElement userNameInput;

    @FindBy(id = "InputPassword")
    private WebElement passwordInput;

    @FindBy(id = "BtnSubmit")
    private WebElement logInButton;

    @FindBy(css = "div.PromoBanner__CloseBtn")
    private WebElement bannerCloseBtn;

    @FindBy(id = "button#BtnCreateAccount")
    private WebElement createAccountBtn;

    @FindBy(id = "InputFirstName")
    private WebElement firstNameInput;

    @FindBy(id = "InputLastName")
    private WebElement lastNameInput;

    @FindBy(id = "input#InputEmail")
    private WebElement emailInput;

    @FindBy(id = "input#password-new")
    private WebElement createPasswordInput;

    @FindBy(id = "BtnCreateAccount")
    private WebElement signUpButton;

    @FindBy(css = "div.global-user:last-child ul.account-management > li:last-child > a")
    private WebElement logOutBtn;

    @FindBy(css = ".promo-banner-container iframe")
    private WebElement iframeBanner;

    @FindBy(css = "section.PromoBanner")
    private WebElement banner;

    @FindBy(css = "li.pillar.watch > a")
    private WebElement watchLink;

    @FindBy(id = "oneid-iframe")
    private WebElement iframe;

    @FindBy(css = "div.global-user:last-child ul.account-management li.display-user")
    private WebElement welcome;






    public HomeESPNPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyBanner() {
        boolean isBanner = true;
        try {
            super.waitForPresenceOfElement(".promo-banner-container iframe");
        } catch (TimeoutException e) {
            isBanner = false;
        }
        return isBanner;
    }

    public void closeBanner() {
        if (this.verifyBanner()) {
            super.getDriver().switchTo().frame(this.iframeBanner);
            super.waitForVisibility(this.banner);
            super.clickElement(this.bannerCloseBtn);
            this.backToIframe();
        }
    }

    public void backToIframe() {
        super.getDriver().switchTo().defaultContent();
    }

    public void clickUserIcon() {
        clickElement(userIcon);
    }

    public void clickOnLogInIndicator() {
        super.clickElement(this.logInIndicator);
    }

    public boolean logInBtnIsShowing() {
        super.waitForVisibility(this.logInButton);
        return this.logInButton.isDisplayed();
    }

    public boolean logoIsShowing() {
        super.waitForVisibility(this.logoModal);
        return this.logoModal.isDisplayed();
    }

    public boolean sigUpBtnIsPresent() {
        super.waitForVisibility(this.signUpButton);
        return this.signUpButton.isDisplayed();
    }

    public void typingEmailOnInput(String text) {
        super.waitForVisibility(this.userNameInput);
        super.typeOnInput(this.userNameInput, text);
    }

    public void typingPasswordOnInput(String text) {
        super.waitForVisibility(this.passwordInput);
        super.typeOnInput(this.passwordInput, text);
    }

    public void clickOnLogIn() {
        super.clickElement(this.logInButton);
    }

    public void clickOnLogOut() {
        super.clickElement(this.logOutBtn);
    }

    public void watchIframe() {
        super.getDriver().switchTo().frame(this.iframe);
    }

    public WatchPage changeToWatchPage() {
        super.clickElement(this.watchLink);
        return new WatchPage(getDriver());
    }



    public String welcomeTextIsVisible() {
        super.waitForVisibility(this.welcome);
        return this.welcome.getText();
    }



}
