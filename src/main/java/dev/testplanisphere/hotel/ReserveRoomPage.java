package dev.testplanisphere.hotel;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class ReserveRoomPage extends BasePage {

    //reserve room page web elements
    private WebElement reserveRoomPageHeaderTitle = driver.findElement(By.xpath("//div[@class='container bg-white py-5']//h2"));
    @FindBy(xpath = "//div[@class='container bg-white py-5']//h4[@id='plan-name']")
    private WebElement reserveRoomPageTitle;
    @FindBy(xpath = "//div[@class='container bg-white py-5']//h4[@id='plan-desc']")
    private WebElement reserveRoomDescriptorTitle;
    //form web elements
    @FindBy(xpath = "//div[@class='container bg-white py-5']//form[@id='reserve-form']//span[@class='badge badge-primary']")
    private WebElement reserveRoomRequiredBadge;
    @FindBy(xpath = "//input[@id='date']")
    private WebElement reserveRoomCheckInDateInputField;
    @FindBy(xpath = "//input[@id='term']")
    private WebElement reserveRoomStayInputField;
    @FindBy(xpath = "//input[@id='head-count']")
    private WebElement reserveRoomGuestsInputField;
    @FindBy(xpath = "//div[@class='container bg-white py-5']//div[@class='col-lg-6 ml-auto']/label")
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
    @FindBy(xpath = "//input[@id='contact']")
    private WebElement reserveRoomConfirmationDropdownMenu;
    //no confirmation option
    @FindBy(xpath = "//div[@class='container bg-white py-5']//select[@id='contact']/option[@value='no']")
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

    //reserve room page header title getter
    public String getReserveRoomPageHeaderTitle() {return reserveRoomPageHeaderTitle.getText();}
    //reserve room page title getter
    public String getReserveRoomPageTitle() {return reserveRoomPageTitle.getText();}
    //reserve room descriptor text getter
    public String getReserveRoomDescriptorTitle() {return reserveRoomDescriptorTitle.getText();}
    //reserve room required badge getter
    public String getReserveRoomRequiredBadge() {return reserveRoomRequiredBadge.getText();}
    //reserve room total price title getter
    public String getTotalPriceTitle() {return reserveRoomTotalTitle.getText();}
    //reserve room total price getter
    public String getTotalRoomReservationPrice() {return reserveRoomTotalPrice.getText();}
    //reserve room description text getter
    public void getReserveRoomDescriptionText() {
        //switch to the iframe by WebElement
        driver.switchTo().frame(reserveRoomDescription);
        //locate the target element inside the iframe and get its text
        WebElement roomInfoElement = driver.findElement(By.tagName("body")); //adjust this selector to target the specific element within the iframe
        String roomInfoText = roomInfoElement.getText();
        logger.info("Room Info: " + roomInfoText);
        //switch back to the main page
        driver.switchTo().defaultContent();
    }


    //reserve room page web element assert methods
    public boolean isPageHeaderTitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1150));
        wait.until(ExpectedConditions.visibilityOf(reserveRoomPageHeaderTitle));
        return reserveRoomPageHeaderTitle.isDisplayed();
    }
    public boolean isPageTitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1150));
        wait.until(ExpectedConditions.visibilityOf(reserveRoomPageTitle));
        return reserveRoomPageTitle.isDisplayed();
    }
    public boolean isDescriptorTitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1150));
        wait.until(ExpectedConditions.visibilityOf(reserveRoomDescriptorTitle));
        return reserveRoomDescriptorTitle.isDisplayed();
    }
    public boolean isRequiredBadgeDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1150));
        wait.until(ExpectedConditions.visibilityOf(reserveRoomRequiredBadge));
        return reserveRoomRequiredBadge.isDisplayed();
    }
    public boolean isCheckInInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1150));
        wait.until(ExpectedConditions.visibilityOf(reserveRoomCheckInDateInputField));
        return reserveRoomCheckInDateInputField.isDisplayed();
    }
    public boolean isStayInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1150));
        wait.until(ExpectedConditions.visibilityOf(reserveRoomStayInputField));
        return reserveRoomStayInputField.isDisplayed();
    }
    public boolean isGuestsInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1150));
        wait.until(ExpectedConditions.visibilityOf(reserveRoomGuestsInputField));
        return reserveRoomGuestsInputField.isDisplayed();
    }
    public boolean isAdditionalPlansTextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1150));
        wait.until(ExpectedConditions.visibilityOf(reserveRoomAdditionalPlansText));
        return reserveRoomAdditionalPlansText.isDisplayed();
    }
    public boolean isBreakfastCheckboxDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1150));
        wait.until(ExpectedConditions.visibilityOf(reserveRoomBreakfastCheckbox));
        return reserveRoomBreakfastCheckbox.isDisplayed();
    }
    public boolean isEarlyCheckInCheckboxDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1150));
        wait.until(ExpectedConditions.visibilityOf(reserveRoomEarlyCheckInCheckbox));
        return reserveRoomEarlyCheckInCheckbox.isDisplayed();
    }
    public boolean isSightseeingCheckboxDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1150));
        wait.until(ExpectedConditions.visibilityOf(reserveRoomSightseeingCheckbox));
        return reserveRoomSightseeingCheckbox.isDisplayed();
    }
    public boolean isNameInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1150));
        wait.until(ExpectedConditions.visibilityOf(reserveRoomNameInputField));
        return reserveRoomNameInputField.isDisplayed();
    }
    public boolean isConfirmationDropdownMenuDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1150));
        wait.until(ExpectedConditions.visibilityOf(reserveRoomConfirmationDropdownMenu));
        return reserveRoomConfirmationDropdownMenu.isDisplayed();
    }
    public boolean isTotalTitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1150));
        wait.until(ExpectedConditions.visibilityOf(reserveRoomTotalPrice));
        return reserveRoomTotalTitle.isDisplayed();
    }
    public boolean isTotalPriceDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1150));
        wait.until(ExpectedConditions.visibilityOf(reserveRoomTotalPrice));
        return reserveRoomTotalPrice.isDisplayed();
    }
    public boolean isConfirmationButtonDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1150));
        wait.until(ExpectedConditions.visibilityOf(reserveRoomConfirmationButton));
        return reserveRoomConfirmationButton.isDisplayed();
    }
    public boolean isReserveRoomDescriptionDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1150));
        wait.until(ExpectedConditions.visibilityOf(reserveRoomDescription));
        return reserveRoomDescription.isDisplayed();
    }
}
