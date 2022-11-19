package org.espn.tests;

import org.espn.pages.DeleteAccountModal;
import org.testng.annotations.Test;

public class DeactivateAccountTest extends BaseTest {
    @Test
    public void deactivateAccount() {
        homeESPNPage.clickUserIcon();
        homeESPNPage.clickOnLogInIndicator();
        homeESPNPage.watchIframe();
        homeESPNPage.typingEmailOnInput(email);
        homeESPNPage.typingPasswordOnInput(password);
        homeESPNPage.clickOnLogIn();
        homeESPNPage.clickUserIcon();
        deleteAccountModal.clickOnEspnProfile();
        homeESPNPage.watchIframe();
        deleteAccountModal.clickOnDeleteAccount();
        deleteAccountModal.clickOnDeleteConfirmation();

    }
}
