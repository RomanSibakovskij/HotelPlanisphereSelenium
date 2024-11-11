package dev.testplanisphere.hotel;

import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestMethods extends BaseTest{

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);
//    protected HomePage homePage;

    //navigate to 'Sign-up' page test method
    protected void navigateToSignUpPageTest(HomePage homePage){
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //click navbar 'Sign-up' link
        homePage.clickNavbarSignUpLink();
    }

    //homepage web element assert
    protected void isHomePageWebElementDisplayed(HomePage homePage) {
        //assert example codes section title is displayed
        assertTrue(homePage.isExampleCodesSectionTitleDisplayed(), "The example codes section title isn't displayed");
        //assert example codes section description is displayed
        assertTrue(homePage.isExampleCodesSectionDescriptionDisplayed(), "The example codes section description isn't displayed");
        //assert Selenide box title is displayed
        assertTrue(homePage.isSelenideBoxTitleDisplayed(), "The Selenide box title isn't displayed");
        //assert Selenide framework link is displayed
        assertTrue(homePage.isSelenideFrameworkLinkDisplayed(), "The Selenide framework link isn't displayed");
        //assert Selenide box JUnit5 link is displayed
        assertTrue(homePage.isSelenideBoxJUnit5LinkDisplayed(), "The Selenide box JUnit5 link isn't displayed");
        //assert Selenide box view codes link is displayed
        assertTrue(homePage.isSelenideBoxViewCodesLinkDisplayed(), "The Selenide box 'View Codes' link isn't displayed");
        //assert WebDriver.IO box title is displayed
        assertTrue(homePage.isWebdriverIoBoxTitleDisplayed(), "The WebDriver.IO box title isn't displayed");
        //assert WebDriver.IO link is displayed
        assertTrue(homePage.isWebdriverIoLinkDisplayed(), "The WebDriver.IO link isn't displayed");
        //assert WebDriver.IO box Mocha link is displayed
        assertTrue(homePage.isMochaLinkDisplayed(), "The WebDriver.IO box Mocha link isn't displayed");
        //assert WebDriver.IO box view codes link is displayed
        assertTrue(homePage.isSelenideBoxViewCodesLinkDisplayed(), "The WebDriver.IO box 'View Codes' link isn't displayed");
        //assert Capybara box title is displayed
        assertTrue(homePage.isCapybaraBoxTitleDisplayed(), "The Capybara box title isn't displayed");
        //assert Capybara link is displayed
        assertTrue(homePage.isSelenideFrameworkLinkDisplayed(), "The Capybara link isn't displayed");
        //assert Capybara RSpec link is displayed
        assertTrue(homePage.isRSpecLinkDisplayed(), "The Capybara RSpec link isn't displayed");
        //assert Capybara box view codes link is displayed
        assertTrue(homePage.isSelenideBoxViewCodesLinkDisplayed(), "The Capybara box 'View Codes' link isn't displayed");
        //assert Selenium 4 Java box title is displayed
        assertTrue(homePage.isSelenium4JavaBoxTitleDisplayed(), "The Selenium 4 Java box title isn't displayed");
        //assert Selenium 4 Java WebDriver framework link is displayed
        assertTrue(homePage.isSelenium4WebdriverLinkDisplayed(), "The Selenium 4 Java WebDriver framework link isn't displayed");
        //assert Selenium 4 Java box JUnit5 link is displayed
        assertTrue(homePage.isSelenium4JUnit5LinkDisplayed(), "The Selenium 4 Java box JUnit5 link isn't displayed");
        //assert Selenium 4 Java box view codes link is displayed
        assertTrue(homePage.isSelenium4JavaBoxViewCodesLinkDisplayed(), "The Selenium 4 Java box 'View Codes' link isn't displayed");
    }

    //general page web element assert
    protected void isGeneralPageWebElementDisplayed(HomePage homePage) {
        //assert home page title is displayed
        assertTrue(homePage.isHomePageTitleDisplayed(), "The homepage title isn't displayed");
        //assert navbar links are displayed (due to MyPage link being invisible as a guest user the assert fails, other links are displayed)
        //assertTrue(homePage.isHomePageNavbarLinkDisplayed(), "The homepage navbar links aren't displayed");
        //assert footer GitHub link is displayed
        assertTrue(homePage.isFooterGithubLinkDisplayed(), "The footer GitHub link isn't displayed");
        //assert footer copyright text is displayed
        assertTrue(homePage.isCopyrightTextDisplayed(), "The footer copyright text isn't displayed");
    }
}
