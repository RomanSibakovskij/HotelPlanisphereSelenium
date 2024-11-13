package dev.testplanisphere.hotel;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class MyAccountPage extends BasePage{

    //my account page web elements
    @FindBy(xpath = "//div[@class='row'][1]//h2")
    private WebElement myAccountPageTitle;
    //logout button element
    @FindBy(xpath = "//div[@id='navbarNav']/ul/li//button")
    private WebElement logOutButton;
    //my account page data table elements
    @FindBy(xpath = "//ul[@class='list-group']/li")
    private List<WebElement> myAccountDataTableElements;
    //my account page button web elements
    @FindBy(xpath = "//a[@role='button']")
    private WebElement iconSettingButton;
    @FindBy(xpath = "//button[.='Delete Account']")
    private WebElement deleteAccountButton;
    //google modal 'OK' button element
    @FindBy(xpath = "//button[contains(text(), 'OK')]")
    private WebElement modalOKButton;

    public MyAccountPage(WebDriver driver) {super(driver);}

    //my account page title getter
    public String getMyAccountPageTitle() {return myAccountPageTitle.getText();}
    //my account page table data elements getter
    public List<String> getMyAccountTableData() {
        List<String> myAccountTableData = new ArrayList<>();
        for (WebElement element : myAccountDataTableElements) {
            myAccountTableData.add(element.getText());
        }
        return myAccountTableData;
    }

    //logout button click method
    public void clickLogOutButton() {logOutButton.click();}

    //'Delete account' button click method
    public void clickDeleteAccountButton() {deleteAccountButton.click();}
    //click Google modal 'OK' button method (to confirm account deletion)
    public void clickModalOKButton() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    //my account page web element assert method
    public boolean isMyAccountPageTitleDisplayed(){return myAccountPageTitle.isDisplayed();}
    public boolean isLogOutButtonDisplayed(){return logOutButton.isDisplayed();}
    public boolean isIconSettingButtonDisplayed(){return iconSettingButton.isDisplayed();}
    public boolean isDeleteAccountButtonDisplayed(){return deleteAccountButton.isDisplayed();}
    public boolean isMyAccountDataTableElementDisplayed() {
        for (WebElement element : myAccountDataTableElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
}
