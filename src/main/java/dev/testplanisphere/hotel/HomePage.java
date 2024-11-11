package dev.testplanisphere.hotel;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    //homepage web elements
    @FindBy(xpath = "//h1")
    private WebElement homePageTitle;
    //navbar elements
    private List<WebElement> homePageNavLinkElements = driver.findElements(By.xpath("//div[@id='navbarNav']/ul/li/a"));
    //example codes section elements
    @FindBy(xpath = "//body[@class='bg-light']/div/div[3]//h3")
    private WebElement exampleCodesSectionTitle;
    @FindBy(xpath = "//body[@class='bg-light']/div/div[3]//p")
    private WebElement exampleCodesSectionDescription;
    //selenide box elements
    @FindBy(xpath = "//div[@class='col-12 col-md-4 col-lg-3'][1]//div[@class='card-body']/h5")
    private WebElement selenideBoxTitle;
    @FindBy(xpath = "//div[@class='col-12 col-md-4 col-lg-3'][1]//div[@class='card-body']//dd[1]/a")
    private WebElement selenideFrameworkLink;
    @FindBy(xpath = "//div[@class='col-12 col-md-4 col-lg-3'][1]//div[@class='card-body']//dd[3]/a")
    private WebElement jUnit5Link;
    @FindBy(xpath = "//div[@class='col-12 col-md-4 col-lg-3'][1]//div[@class='card-body']//a[@class='card-link']")
    private WebElement viewSelenideBoxCodesLink;
    //webdriver.io box elements
    @FindBy(xpath = "//div[@class='col-12 col-md-4 col-lg-3'][2]//div[@class='card-body']/h5")
    private WebElement webdriverIoBoxTitle;
    @FindBy(xpath = "//div[@class='col-12 col-md-4 col-lg-3'][2]//div[@class='card-body']//dd[1]/a")
    private WebElement webdriverIoLink;
    @FindBy(xpath = "//div[@class='col-12 col-md-4 col-lg-3'][2]//div[@class='card-body']//dd[3]/a")
    private WebElement mochaLink;
    @FindBy(xpath = "//div[@class='col-12 col-md-4 col-lg-3'][2]//div[@class='card-body']//a[@class='card-link']")
    private WebElement viewWebdriverIoBoxCodesLink;
    //capybara box elements
    @FindBy(xpath = "//div[@class='col-12 col-md-4 col-lg-3'][3]//div[@class='card-body']/h5")
    private WebElement capybaraBoxTitle;
    @FindBy(xpath = "//div[@class='col-12 col-md-4 col-lg-3'][3]//div[@class='card-body']//dd[1]/a")
    private WebElement capybaraLink;
    @FindBy(xpath = "//div[@class='col-12 col-md-4 col-lg-3'][3]//div[@class='card-body']//dd[3]/a")
    private WebElement rSpecLink;
    @FindBy(xpath = "//div[@class='col-12 col-md-4 col-lg-3'][3]//div[@class='card-body']//a[@class='card-link']")
    private WebElement viewCapybaraBoxCodesLink;
    //selenium-4-java box elements
    @FindBy(xpath = "//div[@class='col-12 col-md-4 col-lg-3'][4]//div[@class='card-body']/h5")
    private WebElement selenium4JavaBoxTitle;
    @FindBy(xpath = "//div[@class='col-12 col-md-4 col-lg-3'][4]//div[@class='card-body']//dd[1]/a")
    private WebElement webdriverLink;
    @FindBy(xpath = "//div[@class='col-12 col-md-4 col-lg-3'][4]//div[@class='card-body']//dd[3]/a")
    private WebElement jUnit5SeleniumLink;
    @FindBy(xpath = "//div[@class='col-12 col-md-4 col-lg-3'][4]//div[@class='card-body']//a[@class='card-link']")
    private WebElement viewSelenium4JavaBoxCodesLink;
    //footer elements
    @FindBy(xpath = "//footer/div[@class='container']//a")
    private WebElement footerGithubLink;
    @FindBy(xpath = "//p[@class='text-muted']")
    private WebElement copyrightText;

    public HomePage(WebDriver driver) {super(driver);}


    //homepage web element assert methods
    public boolean isHomPageTitleDisplayed(){return homePageTitle.isDisplayed();}
    public boolean isExampleCodesSectionTitleDisplayed(){return exampleCodesSectionTitle.isDisplayed();}
    public boolean isExampleCodesSectionDescriptionDisplayed(){return exampleCodesSectionDescription.isDisplayed();}
    public boolean isSelenideBoxTitleDisplayed(){return selenideBoxTitle.isDisplayed();}
    public boolean isSelenideFrameworkLinkDisplayed(){return selenideFrameworkLink.isDisplayed();}
    public boolean isSelenideBoxJUnit5LinkDisplayed(){return jUnit5Link.isDisplayed();}
    public boolean isSelenideBoxViewCodesLinkDisplayed(){return viewSelenideBoxCodesLink.isDisplayed();}
    public boolean isWebdriverIoBoxTitleDisplayed(){return webdriverIoBoxTitle.isDisplayed();}
    public boolean isWebdriverIoLinkDisplayed(){return webdriverIoLink.isDisplayed();}
    public boolean isMochaLinkDisplayed(){return mochaLink.isDisplayed();}
    public boolean isWebdriverIoBoxViewCodesLinkDisplayed(){return viewWebdriverIoBoxCodesLink.isDisplayed();}
    public boolean isCapybaraBoxTitleDisplayed(){return capybaraBoxTitle.isDisplayed();}
    public boolean isCapybaraLinkDisplayed(){return capybaraLink.isDisplayed();}
    public boolean isRSpecLinkDisplayed(){return rSpecLink.isDisplayed();}
    public boolean isCapybaraBoxViewCodesLinkDisplayed(){return viewCapybaraBoxCodesLink.isDisplayed();}
    public boolean isSelenium4JavaBoxTitleDisplayed(){return selenium4JavaBoxTitle.isDisplayed();}
    public boolean isSelenium4WebdriverLinkDisplayed(){return webdriverLink.isDisplayed();}
    public boolean isSelenium4JUnit5LinkDisplayed(){return jUnit5SeleniumLink.isDisplayed();}
    public boolean isSelenide4JavaBoxViewCodesLinkDisplayed(){return viewSelenium4JavaBoxCodesLink.isDisplayed();}
    public boolean isFooterGithubLinkDisplayed(){return footerGithubLink.isDisplayed();}
    public boolean isCopyrightTextDisplayed(){return copyrightText.isDisplayed();}

    public boolean isHomePageNavbarLinkDisplayed() {
        for (WebElement element : homePageNavLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
}
