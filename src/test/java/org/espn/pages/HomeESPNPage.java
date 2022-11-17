package org.espn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeESPNPage extends BasePage {

    @FindBy (id = "global-user-trigger")
    private WebElement userIcon;

    @FindBy (id = "global-header .tools .global-user-container>ul:first-child>li:last-child>a")
    private WebElement logInIndicator;

    @FindBy (id = "logo")
    private WebElement logoModal;

    @FindBy (id = "input#InputLoginValue")
    private WebElement userNameInput;

    @FindBy (id = "input#InputPassword")
    private WebElement passwordInput;

    @FindBy (id = "button#BtnSubmit")
    private WebElement logInButton;

    @FindBy (id = "button#BtnCreateAccount")
    private WebElement createAccountBtn;

    @FindBy (id = "InputFirstName")
    private WebElement firstNameInput;

    @FindBy (id = "InputLastName")
    private  WebElement lastNameInput;

    @FindBy (id = "input#InputEmail")
    private WebElement emailInput;

    @FindBy (id = "input#password-new")
    private WebElement createPasswordInput;

    @FindBy (id = "button#BtnSubmit")
    private WebElement signUpButton;

    public HomeESPNPage(WebDriver driver) {
        super(driver);
    }

    public void clickUserIcon() {
       clickElement(userIcon);
    }

    public void clickOnLogInIndicator(){
        super.clickElement(this.logInIndicator);
    }

    public boolean logInBtnIsShowing() {
        super.waitForVisibility(this.logInIndicator);
        return this.logInIndicator.isDisplayed();
    }

    public boolean logoIsShowing() {
        super.waitForVisibility(this.logoModal);
        return this.logoModal.isDisplayed();
    }

    public  boolean sigUpBtnIsPresent() {
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

    public void clickOnLogIn(){
        super.clickElement(this.logInButton);
    }

}
