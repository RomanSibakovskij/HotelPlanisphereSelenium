package dev.testplanisphere.hotel;

import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestMethods extends BaseTest{

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

    //navigate to 'Sign-up' page test method
    protected void navigateToSignUpPageTest(HomePage homePage){
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //click navbar 'Sign-up' link
        homePage.clickNavbarSignUpLink();
        SignUpPage signUpPage = new SignUpPage(driver);
        //assert the user gets on sign-up page
        assertEquals("Sign up", signUpPage.getSignUpPageTitle(), "The 'Sign-up' page title doesn't match expectations or the user is on the wrong page");
    }

    //valid user account creation test method (required only input)
    protected void createValidUserAccountRequiredOnlyInputTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up page web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //assert the text displayed is valid
        isSignUpTextAsExpected(signUpPage);
        //valid input data getter(required input only)
        signUpPage.validInputDataRequiredOnly();
        //input valid email
        signUpPage.inputValidEmailAddress();
        //input valid password
        signUpPage.inputValidPassword();
        //input valid confirm password
        signUpPage.inputValidConfirmPassword();
        //input valid full name
        signUpPage.inputValidFullName();
        //click 'Sign-up' button
        signUpPage.clickSignUpButton();
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //assert the user gets on 'My account' page
        assertEquals("MyPage", myAccountPage.getMyAccountPageTitle(), "The 'My account' page title doesn't match expectations or the user is on the wrong page");
        //my account web element assert
        isMyAccountPageWebElementDisplayed(myAccountPage);
        //log the displayed 'My account' table data
        logMyAccountDisplayedData(myAccountPage);
    }
    //valid user account creation test method (all input)
    protected void createValidUserAccountAllInputTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up page web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //assert the text displayed is valid
        isSignUpTextAsExpected(signUpPage);
        //valid input data getter(all inputs)
        signUpPage.validInputDataAllInputs();
        //input valid email
        signUpPage.inputValidEmailAddress();
        //input valid password
        signUpPage.inputValidPassword();
        //input valid confirm password
        signUpPage.inputValidConfirmPassword();
        //input valid full name
        signUpPage.inputValidFullName();
        //select 'Premium membership' radio button
        signUpPage.selectPremiumMembership();
        //input valid address (this input field will have no further testing due to it not having any input restrictions)
        signUpPage.inputValidAddress();
        //input valid phone number
        signUpPage.inputValidPhone();
        //click gender dropdown menu
        signUpPage.clickGenderDropdownMenu();
        //select 'female' gender
        signUpPage.selectFemaleGenderOption();
        //input valid birthdate
        signUpPage.inputValidBirthdate();
        //click 'Receive notification' checkbox
        signUpPage.clickReceiveNotificationCheckbox();
        //click 'Sign-up' button
        signUpPage.clickSignUpButton();
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //assert the user gets on 'My account' page
        assertEquals("MyPage", myAccountPage.getMyAccountPageTitle(), "The 'My account' page title doesn't match expectations or the user is on the wrong page");
        //my account web element assert
        isMyAccountPageWebElementDisplayed(myAccountPage);
        //log the displayed 'My account' table data
        logMyAccountDisplayedData(myAccountPage);
    }
    //invalid user account creation test method (all input - too short phone number)
    protected void createInvalidUserAccountAllInputTooShortPhoneTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up page web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //assert the text displayed is valid
        isSignUpTextAsExpected(signUpPage);
        //valid input data getter(all inputs - too short phone number)
        signUpPage.validInputDataAllInputsTooShortPhone();
        //input valid email
        signUpPage.inputValidEmailAddress();
        //input valid password
        signUpPage.inputValidPassword();
        //input valid confirm password
        signUpPage.inputValidConfirmPassword();
        //input valid full name
        signUpPage.inputValidFullName();
        //select 'Premium membership' radio button
        signUpPage.selectPremiumMembership();
        //input valid address (this input field will have no further testing due to it not having any input restrictions)
        signUpPage.inputValidAddress();
        //input invalid phone number (too short)
        signUpPage.inputTooShortPhone();
        //click gender dropdown menu
        signUpPage.clickGenderDropdownMenu();
        //select 'female' gender
        signUpPage.selectFemaleGenderOption();
        //input valid birthdate
        signUpPage.inputValidBirthdate();
        //click 'Receive notification' checkbox
        signUpPage.clickReceiveNotificationCheckbox();
        //click 'Sign-up' button
        signUpPage.clickSignUpButton();
        //assert the expected error message is displayed
        assertEquals("Please match the requested format.", signUpPage.getInvalidPhoneInputMessage(), "The expected invalid input message isn't displayed.");
    }

    //homepage web element assert test method
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

    //sign-up page web element assert test method
    protected void isSignUpPageWebElementDisplayed(SignUpPage signUpPage) {
        //assert 'Sign-up' page title is displayed
        assertTrue(signUpPage.isSignUpPageTitleDisplayed(), "The 'Sign-up' page title isn't displayed");
        //assert required badge is displayed
        assertTrue(signUpPage.isRequiredBadgeDisplayed(), "The 'Sign-up' page 'Required' badge isn't displayed");
        //assert email input field is displayed
        assertTrue(signUpPage.isEmailInputFieldDisplayed(), "The email input field isn't displayed");
        //assert password input field is displayed
        assertTrue(signUpPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        //assert password input hint is displayed
        assertTrue(signUpPage.isPasswordInputHintDisplayed(), "The password input hint isn't displayed");
        //assert confirm password input field is displayed
        assertTrue(signUpPage.isConfirmPasswordInputFieldDisplayed(), "The confirm password input field isn't displayed");
        //assert confirm password input hint is displayed
        assertTrue(signUpPage.isConfirmPasswordInputHintDisplayed(), "The confirm password input hint isn't displayed");
        //assert full name input field is displayed
        assertTrue(signUpPage.isFullNameInputFieldDisplayed(), "The full name input field isn't displayed");
        //assert premium membership radio button is displayed
        assertTrue(signUpPage.isPremiumMembershipDotCircleDisplayed(), "The premium membership radio button isn't displayed");
        //assert membership radio button is displayed
        assertTrue(signUpPage.isMembershipDotCircleDisplayed(), "The membership radio button isn't displayed");
        //assert address input field is displayed
        assertTrue(signUpPage.isAddressInputFieldDisplayed(), "The address input field isn't displayed");
        //assert phone input field is displayed
        assertTrue(signUpPage.isPhoneInputFieldDisplayed(), "The phone input field isn't displayed");
        //assert phone input hint is displayed
        assertTrue(signUpPage.isPhoneInputHintDisplayed(), "The phone input hint isn't displayed");
        //assert gender dropdown menu is displayed
        assertTrue(signUpPage.isGenderDropdownMenuDisplayed(), "The gender dropdown menu isn't displayed");
        //assert birthdate input field is displayed
        assertTrue(signUpPage.isBirthdateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        //assert 'Receive notification' checkbox is displayed
        assertTrue(signUpPage.isReceiveNotificationCheckboxDisplayed(), "The 'Receive notification' checkbox isn't displayed");
        //assert 'Sign-up' button is displayed
        assertTrue(signUpPage.isSignUpButtonDisplayed(), "The 'Sign-up input field isn't displayed");
    }
    //sign-up text assert method
    protected void isSignUpTextAsExpected(SignUpPage signUpPage) {
        //assert 'Required' badge is as expected
        assertEquals("required", signUpPage.getRequiredBadge(), "The 'Required' badge text doesn't match expectations");
        //assert password hint is as expected
        assertEquals("Please lengthen this text to 8 characters.", signUpPage.getPasswordInputHint(), "The password input hint text doesn't match expectations");
        //assert confirm password hint is as expected
        assertEquals("Please enter your password again to confirm.", signUpPage.getConfirmPasswordInputHint(), "The confirm password input hint text doesn't match expectations");
        //assert phone input hint is as expected
        assertEquals("Please enter 11-digit number. Ex: 01133335555", signUpPage.getPhoneInputHint(), "The phone input hint text doesn't match expectations");
    }

    //my account page web element assert test method
    protected void isMyAccountPageWebElementDisplayed(MyAccountPage myAccountPage) {
        //assert 'My account' page title displayed
        assertTrue(myAccountPage.isMyAccountPageTitleDisplayed(), "The 'My Account' page title isn't displayed");
        //assert 'Icon setting' button is displayed
        assertTrue(myAccountPage.isIconSettingButtonDisplayed(), "The 'Icon setting' button isn't displayed");
        //assert 'Delete account' button is displayed
        assertTrue(myAccountPage.isDeleteAccountButtonDisplayed(), "The 'Delete account' button isn't displayed");
        //assert 'My account' data table elements are displayed
        assertTrue(myAccountPage.isMyAccountDataTableElementDisplayed(), "The 'My account' data table elements aren't displayed");
    }
    //'My account' logger method
    protected void logMyAccountDisplayedData(MyAccountPage myAccountPage) {
        System.out.println("My account displayed data: " + "\n");
        logger.info(String.valueOf(myAccountPage.getMyAccountTableData()));
        System.out.println("\n");
    }

    //general page web element assert test method
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
