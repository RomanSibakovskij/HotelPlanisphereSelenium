package dev.testplanisphere.hotel;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class ReserveDashboardPage extends BasePage{

    //reserve dashboard page web elements
    @FindBy(xpath = "//h2")
    private WebElement reserveDashboardPageTitle;
    //list elements
    @FindBy(xpath = "//div[@class='card-header']")
    private List<WebElement> cardHeaderElements;
    @FindBy(xpath = "//h5[@class='card-title']")
    private List<WebElement> cardTitleElements;
    @FindBy(xpath = "//ul[@class='list-unstyled']")
    private List<WebElement> cardDescriptionElements;
    //reserve room button elements
    @FindBy(xpath = "//a[@href='./reserve.html?plan-id=0']")
    private WebElement reserveRoomOneButton;

    public ReserveDashboardPage(WebDriver driver) {super(driver);}

    //click 'reserve' button one method
    public void clickReserveButtonRoomOne(){reserveRoomOneButton.click();}

    //reserve dashboard page title getter
    public String getReserveDashboardPageTitle() {return reserveDashboardPageTitle.getText();}

    //card header getter
    public List<String> getCardHeader() {
        List<String> cardHeader = new ArrayList<>();
        for (WebElement element : cardHeaderElements) {
            cardHeader.add(element.getText());
        }
        return cardHeader;
    }
    //card title getter
    public List<String> getCardTitle() {
        List<String> cardTitle = new ArrayList<>();
        for (WebElement element : cardTitleElements) {
            cardTitle.add(element.getText());
        }
        return cardTitle;
    }
    //card description list getter
    public List<String> getCardDescription() {
        List<String> cardDescription = new ArrayList<>();
        for (WebElement element : cardDescriptionElements) {
            cardDescription.add(element.getText());
        }
        return cardDescription;
    }


    //reserve page dashboard web element assert methods
    public boolean isReserveDashboardPageTitleDisplayed(){return reserveDashboardPageTitle.isDisplayed();}

    public boolean isCardHeaderDisplayed() {
        for (WebElement element : cardHeaderElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCardTitleDisplayed() {
        for (WebElement element : cardTitleElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCardDescriptionDisplayed() {
        for (WebElement element : cardDescriptionElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    public boolean isReserveRoomOneButtonDisplayed() {return reserveRoomOneButton.isDisplayed();}

}
