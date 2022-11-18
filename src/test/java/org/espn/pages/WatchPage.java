package org.espn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class WatchPage extends BasePage {

    @FindBy(css = "section.Carousel")
    private List<WebDriver> carousel;

    @FindBy(css = "div.Carousel__Wrapper--canScrollRight ul.Carousel__Inner li:nth-child(2) > a")
    private WebElement secondCard;

    @FindBy(css = "section.lightbox__contentBox")
    private WebElement providerCard;

    @FindBy(css = ".lightbox__closebtn")
    private WebElement closeBtnCard;

    @FindBy(css = "section div:nth-child(2) .Carousel--watch li")
    private List<WebElement> cardsList;

    public WatchPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkTitleCards() {
        waitForPresenceOfElements("ul.Carousel__Inner li");
        AtomicBoolean isTitleOk = new AtomicBoolean(true);
        cardsList.forEach(element -> {
            if (!element.findElement(By.cssSelector("h2.WatchTile__Title")).isDisplayed() &&
                    element.findElement(By.cssSelector("h2.WatchTile__Title")).getText().equals("")) {
                isTitleOk.set(false);
            }
        });
        return isTitleOk.get();

    }

    public boolean checkDescriptionCards() {
        waitForPresenceOfElements("ul.Carousel__Inner li");
        AtomicBoolean isDescriptionOk = new AtomicBoolean(true);
        cardsList.forEach(element -> {
            if (!element.findElement(By.cssSelector(".WatchTile__Meta")).isDisplayed() &&
                    element.findElement(By.cssSelector(".WatchTile__Meta")).getText().equals("")) {
                isDescriptionOk.set(false);
            }
        });
        return isDescriptionOk.get();
    }

    public void clickSecondCard() {
        super.waitForVisibility(this.secondCard);
        super.clickElement(this.secondCard);
    }

    public void clickCloseButton() {
        super.waitForVisibility(this.closeBtnCard);
        super.clickElement(this.closeBtnCard);

    }

    public boolean closeBtnCardAppear() {
        super.waitForVisibility(this.providerCard);
        super.waitForVisibility(this.closeBtnCard);
        return this.closeBtnCard.isDisplayed();
    }

    public HomeESPNPage backToHomePage() {
        super.getDriver().navigate().back();
        return new HomeESPNPage(getDriver());
    }

}
