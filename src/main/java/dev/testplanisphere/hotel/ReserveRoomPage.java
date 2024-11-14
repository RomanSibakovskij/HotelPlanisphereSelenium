package dev.testplanisphere.hotel;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class ReserveRoomPage extends BasePage {

    //reserve room page web elements
    @FindBy(xpath = "//h2")
    private WebElement reserveRoomPageHeaderTitle;
    @FindBy(xpath = "//h4")
    private WebElement reserveRoomPageTitle;
    @FindBy(xpath = "//p[@id='plan-desc']")
    private WebElement reserveRoomDescriptorTitle;
    //form web elements
    @FindBy(xpath = "//form[@id='reserve-form']//span[@class='badge badge-primary']")
    private WebElement reserveRoomRequiredBadge;
    @FindBy(xpath = "//input[@id='date']")
    private WebElement reserveRoomCheckInDateInputField;
    @FindBy(xpath = "//input[@id='term']")
    private WebElement reserveRoomStayInputField;
    @FindBy(xpath = "//input[@id='head-count']")
    private WebElement reserveRoomGuestsInputField;
    @FindBy(xpath = "//div[@class='col-lg-6 ml-auto']/label")
    private WebElement reserveRoomAdditionalPlansText;
    //checkbox web elements
    @FindBy(xpath = "//input[@id='breakfast']")
    private WebElement reserveRoomBreakfastCheckbox;
    @FindBy(xpath = "//input[@id='early-check-in']")
    private WebElement reserveRoomEarlyCheckInCheckbox;
    @FindBy(xpath = "//input[@id='sightseeing']")
    private WebElement reserveRoomSightseeingCheckbox;
    @FindBy(xpath = "//input[@id='username']")
    private WebElement reserveRoomNameInputField;
    //confirmation dropdown menu web element
    @FindBy(xpath = "//select[@id='contact']")
    private WebElement reserveRoomConfirmationDropdownMenu;
    //no confirmation option
    @FindBy(xpath = "//select[@id='contact']/option[@value='no']")
    private WebElement reserveRoomNoneOption;
    @FindBy(xpath = "//input[@id='comment']")
    private WebElement reserveRoomCommentInputField;
    //aside form web elements
    @FindBy(xpath = "//h3")
    private WebElement reserveRoomTotalTitle;
    @FindBy(xpath = "//output[@id='total-bill']")
    private WebElement reserveRoomTotalPrice;
    @FindBy(xpath = "//button[@id='submit-button']")
    private WebElement reserveRoomConfirmationButton;
    @FindBy(css = "iframe.embed-responsive-item")
    private WebElement reserveRoomDescription;

    public ReserveRoomPage(WebDriver driver) {super(driver);}

    //reserve room page web element assert methods
    public boolean isPageHeaderTitleDisplayed(){return reserveRoomPageHeaderTitle.isDisplayed();}
    public boolean isPageTitleDisplayed(){return reserveRoomPageTitle.isDisplayed();}
    public boolean isDescriptorTitleDisplayed(){return reserveRoomDescriptorTitle.isDisplayed();}
    public boolean isRequiredBadgeDisplayed() {return reserveRoomRequiredBadge.isDisplayed();}
    public boolean isCheckInInputFieldDisplayed(){return reserveRoomCheckInDateInputField.isDisplayed();}
    public boolean isStayInputFieldDisplayed(){return reserveRoomStayInputField.isDisplayed();}
    public boolean isGuestsInputFieldDisplayed(){return reserveRoomGuestsInputField.isDisplayed();}
    public boolean isAdditionalPlansDisplayed(){return reserveRoomAdditionalPlansText.isDisplayed();}
    public boolean isBreakfastCheckboxDisplayed(){return reserveRoomBreakfastCheckbox.isDisplayed();}
    public boolean isEarlyCheckInCheckboxDisplayed(){return reserveRoomEarlyCheckInCheckbox.isDisplayed();}
    public boolean isSightseeingCheckboxDisplayed(){return reserveRoomSightseeingCheckbox.isDisplayed();}
    public boolean isNameInputFieldDisplayed(){return reserveRoomNameInputField.isDisplayed();}
    public boolean isConfirmationDropdownMenuDisplayed(){return reserveRoomConfirmationDropdownMenu.isDisplayed();}
    public boolean isTotalTitleDisplayed(){return reserveRoomTotalTitle.isDisplayed();}
    public boolean isTotalPriceDisplayed(){return reserveRoomTotalPrice.isDisplayed();}
    public boolean isConfirmationButtonDisplayed(){return reserveRoomConfirmationButton.isDisplayed();}
    public boolean isDescriptionDisplayed(){return reserveRoomDescription.isDisplayed();}
}
