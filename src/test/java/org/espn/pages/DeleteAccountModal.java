package org.espn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAccountModal extends BasePage {

    public DeleteAccountModal(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.global-user:last-child ul.account-management > li:nth-child(5) > a")
    private WebElement espnProfile;

    @FindBy(id = "AccountDeleteLink")
    private WebElement deleteAccountLinkBox;

    @FindBy(id = "BtnCancel")
    private WebElement keepTheAccount;

    public void clickOnEspnProfile() {
        super.clickElement(this.espnProfile);
    }
    public void clickOnDeleteAccount() {
        super.clickElement(this.deleteAccountLinkBox);
    }
    public void clickOnKeepTheAccount () {
        super.clickElement(this.keepTheAccount);
    }

}
