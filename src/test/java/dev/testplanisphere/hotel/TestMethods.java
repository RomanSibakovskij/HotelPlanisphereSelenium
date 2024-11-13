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

    //negative user account creation tests

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
        signUpPage.invalidInputDataAllInputsTooShortPhone();
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
    //invalid user account creation test method (all input - too long phone number)
    protected void createInvalidUserAccountAllInputTooLongPhoneTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up page web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //assert the text displayed is valid
        isSignUpTextAsExpected(signUpPage);
        //invalid input data getter(all inputs - too long phone number)
        signUpPage.invalidInputDataAllInputsTooLongPhone();
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
        //input invalid phone number (too long)
        signUpPage.inputTooLongPhone();
        //click gender dropdown menu
        signUpPage.clickGenderDropdownMenu();
        //select 'male' gender
        signUpPage.selectMaleGenderOption();
        //input valid birthdate
        signUpPage.inputValidBirthdate();
        //click 'Receive notification' checkbox
        signUpPage.clickReceiveNotificationCheckbox();
        //click 'Sign-up' button
        signUpPage.clickSignUpButton();
        //assert the expected error message is displayed
        assertEquals("Please match the requested format.", signUpPage.getInvalidPhoneInputMessage(), "The expected invalid input message isn't displayed.");
    }
    //invalid user account creation test method (required only input - invalid email format) (with '@' input and omitting '.' the user account gets created though)
    protected void createInvalidUserAccountRequiredOnlyInputInvalidEmailFormatTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up page web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //assert the text displayed is valid
        isSignUpTextAsExpected(signUpPage);
        //invalid input data getter(the required input only - invalid email format)
        signUpPage.invalidInputDataRequiredOnlyInvalidEmailFormat();
        //input invalid email format
        signUpPage.inputInvalidEmailAddressFormat();
        //input valid password
        signUpPage.inputValidPassword();
        //input valid confirm password
        signUpPage.inputValidConfirmPassword();
        //input valid full name
        signUpPage.inputValidFullName();
        //click 'Sign-up' button
        signUpPage.clickSignUpButton();
        //assert the expected error is displayed
        assertEquals("Please enter a non-empty email address.", signUpPage.getInvalidEmailFormatMessage(), "The expected error message doesn't match expectations");
    }
    //invalid user account creation test method (required only input - too short password)
    protected void createInvalidUserAccountRequiredOnlyTooShortPasswordTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up page web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //assert the text displayed is valid
        isSignUpTextAsExpected(signUpPage);
        //invalid input data getter(the required input only - too short password)
        signUpPage.invalidInputDataRequiredOnlyWithTooShortPassword();
        //input valid email format
        signUpPage.inputValidEmailAddress();
        //input too short password
        signUpPage.inputTooShortPassword();
        //input too short confirm password
        signUpPage.inputTooShortConfirmPassword();
        //input valid full name
        signUpPage.inputValidFullName();
        //click 'Sign-up' button
        signUpPage.clickSignUpButton();
        //assert the expected error is displayed (for password and confirm password)
        assertEquals("Please lengthen this text to 8 characters or more.", signUpPage.getInvalidPasswordInputMessage(), "The expected error message doesn't match expectations");
    }
    //invalid user account creation test method (required only input - mismatching confirm password)
    protected void createInvalidUserAccountRequiredOnlyMismatchingConfirmPasswordTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up page web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //assert the text displayed is valid
        isSignUpTextAsExpected(signUpPage);
        //invalid input data getter(the required input only - mismatching confirm password)
        signUpPage.invalidInputDataRequiredOnlyWithMismatchingConfirmPassword();
        //input valid email format
        signUpPage.inputValidEmailAddress();
        //input password
        signUpPage.inputValidPassword();
        //input mismatching confirm password
        signUpPage.inputMismatchingConfirmPassword();
        //input valid full name
        signUpPage.inputValidFullName();
        //click 'Sign-up' button
        signUpPage.clickSignUpButton();
        //assert the expected error is displayed (for mismatching confirm password)
        assertEquals("Password doesn't match.", signUpPage.getMismatchingConfirmPasswordMessage(), "The expected error message doesn't match expectations");
    }

    //no singular input test methods
    //invalid user account creation test method (required only input - already used email address)
    protected void createInvalidUserAccountRequiredOnlyInputNoEmailFormatTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up page web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //assert the text displayed is valid
        isSignUpTextAsExpected(signUpPage);
        //invalid input data getter(the required input only - no email address)
        signUpPage.invalidInputDataRequiredOnlyNoEmail();
        //don't input email
        signUpPage.inputNoEmailAddress();
        //input valid password
        signUpPage.inputValidPassword();
        //input valid confirm password
        signUpPage.inputValidConfirmPassword();
        //input valid full name
        signUpPage.inputValidFullName();
        //click 'Sign-up' button
        signUpPage.clickSignUpButton();
        //assert the expected error is displayed
        assertEquals("Please fill out this field.", signUpPage.getMissingSingularInputMessage(), "The expected error message doesn't match expectations");
    }
    //invalid user account creation test method (required only input - no password and confirm password (since they're used together, they are both included into test method))
    protected void createInvalidUserAccountRequiredOnlyInputNoPasswordAndConfirm(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up page web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //assert the text displayed is valid
        isSignUpTextAsExpected(signUpPage);
        //invalid input data getter(the required input only - no password and confirm password)
        signUpPage.invalidInputDataRequiredOnlyNoPasswordAndNoConfirm();
        //input valid email
        signUpPage.inputValidEmailAddress();
        //don't input password
        signUpPage.inputNoPassword();
        //don't input confirm password
        signUpPage.inputNoConfirmPassword();
        //input valid full name
        signUpPage.inputValidFullName();
        //click 'Sign-up' button
        signUpPage.clickSignUpButton();
        //assert the expected error is displayed
        assertEquals("Please fill out this field.", signUpPage.getMissingSingularInputMessage(), "The expected error message doesn't match expectations");
    }
    //invalid user account creation test method (required only input - no full name)
    protected void createInvalidUserAccountRequiredOnlyInputNoFullNameTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up page web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //assert the text displayed is valid
        isSignUpTextAsExpected(signUpPage);
        //valid input data getter(required input only - no full name)
        signUpPage.invalidInputDataRequiredOnlyNoFullName();
        //input valid email
        signUpPage.inputValidEmailAddress();
        //input valid password
        signUpPage.inputValidPassword();
        //input valid confirm password
        signUpPage.inputValidConfirmPassword();
        //don't input full name
        signUpPage.inputNoFullName();
        //click 'Sign-up' button
        signUpPage.clickSignUpButton();
        //assert the expected error is displayed
        assertEquals("Please fill out this field.", signUpPage.getMissingSingularInputMessage(), "The expected error message doesn't match expectations");
    }
    //invalid user account creation test method (required only input - already used email beforehand)
    protected void invalidUserAccountWithAlreadyUsedEmail(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up page web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //assert the text displayed is valid
        isSignUpTextAsExpected(signUpPage);
        //invalid input data getter(required input only i with the already used email address)
        signUpPage.invalidInputDataRequiredOnlyUsedEmail(signUpPage);
        //input used email beforehand
        signUpPage.inputAlreadyUsedEmailAddress();
        //input valid password
        signUpPage.inputValidPassword();
        //input valid confirm password
        signUpPage.inputValidConfirmPassword();
        //input valid full name
        signUpPage.inputValidFullName();
        //click 'Sign-up' button
        signUpPage.clickSignUpButton();
        //assert the user gets the expected error message
        assertEquals("Email has already been taken.", signUpPage.getAlreadyUsedEmailMessage(), "The error message doesn't match expectations");
    }
    //re-navigate to 'Sign-up' page test method
    protected void returnToSignUpPageTest(HomePage homePage){
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //click navbar 'Sign-up' link
        homePage.clickSignUpLink();
        SignUpPage signUpPage = new SignUpPage(driver);
        //assert the user returns to sign-up page
        assertEquals("Sign up", signUpPage.getSignUpPageTitle(), "The 'Sign-up' page title doesn't match expectations or the user is on the wrong page");
    }

    //valid user logout test
    //logout test method
    protected void userLogOutTest(MyAccountPage myAccountPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //my account web element assert
        isMyAccountPageWebElementDisplayed(myAccountPage);
        //click 'Logout' navbar button
        myAccountPage.clickLogOutButton();
        //assert the user has returned to homepage
        assertEquals("This site is a sandbox to practice test automation.", homePage.getHomePageDescriptorTitle(), "The homepage descriptor title doesn't match expectations or the user hasn't returned to homepage");
    }

    //valid login test
    //valid user login test method(required input only)
    protected void validUserLoginWithRequiredInputOnlyTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //click 'Login' link
        homePage.clickNavbarLoginLink();
        //assert the user gets onto login page
        assertEquals("Login", loginPage.getLoginPageTitle(), "The login page title doesn't match expectations or the user isn't on the login page");
        //login page web element assert
        isLoginPageWebElementDisplayed(loginPage);
        //valid login input data getter
        loginPage.validLoginInputDataWithRequiredOnlyGetter(signUpPage);
        //input valid email
        loginPage.inputValidEmailAddress();
        //input valid password
        loginPage.inputValidPassword();
        //click 'Login' button
        loginPage.clickLoginButton();
        //assert the user gets on 'My account' page
        assertEquals("MyPage", myAccountPage.getMyAccountPageTitle(), "The 'My account' page title doesn't match expectations or the user is on the wrong page");
    }

    //invalid login tests
    //invalid user login test method(the required input only - invalid email address)
    protected void invalidUserLoginWithRequiredInputOnlyInvalidEmailTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //click 'Login' link
        homePage.clickNavbarLoginLink();
        //assert the user gets onto login page
        assertEquals("Login", loginPage.getLoginPageTitle(), "The login page title doesn't match expectations or the user isn't on the login page");
        //login page web element assert
        isLoginPageWebElementDisplayed(loginPage);
        //invalid login input data getter (invalid email address)
        loginPage.invalidLoginInputDataWithRequiredOnlyInvalidEmailGetter(signUpPage);
        //input invalid email
        loginPage.inputInvalidEmailAddress();
        //input valid password
        loginPage.inputValidPassword();
        //click 'Login' button
        loginPage.clickLoginButton();
        //assert the user gets the expected error message
        assertEquals("Email or password is invalid.", loginPage.getInvalidLoginInputMessage(), "The invalid login input error message doesn't match expectations");
    }
    //invalid user login test method(the required input only - invalid password)
    protected void invalidUserLoginWithRequiredInputOnlyInvalidPasswordTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //click 'Login' link
        homePage.clickNavbarLoginLink();
        //assert the user gets onto login page
        assertEquals("Login", loginPage.getLoginPageTitle(), "The login page title doesn't match expectations or the user isn't on the login page");
        //login page web element assert
        isLoginPageWebElementDisplayed(loginPage);
        //invalid login input data getter (invalid password)
        loginPage.invalidLoginInputDataWithRequiredOnlyInvalidPasswordGetter(signUpPage);
        //input valid email
        loginPage.inputValidEmailAddress();
        //input invalid password
        loginPage.inputInvalidPassword();
        //click 'Login' button
        loginPage.clickLoginButton();
        //assert the user gets the expected error message
        assertEquals("Email or password is invalid.", loginPage.getInvalidLoginInputMessage(), "The invalid login input error message doesn't match expectations");
    }

    //no singular input test methods
    //invalid user login test method(the required input only - no email address)
    protected void invalidUserLoginWithRequiredInputOnlyNoEmailTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //click 'Login' link
        homePage.clickNavbarLoginLink();
        //assert the user gets onto login page
        assertEquals("Login", loginPage.getLoginPageTitle(), "The login page title doesn't match expectations or the user isn't on the login page");
        //login page web element assert
        isLoginPageWebElementDisplayed(loginPage);
        //invalid login input data getter (no email address)
        loginPage.invalidLoginInputDataWithRequiredOnlyNoEmailGetter(signUpPage);
        //don't input email
        loginPage.inputNoEmailAddress();
        //input valid password
        loginPage.inputValidPassword();
        //click 'Login' button
        loginPage.clickLoginButton();
        //assert the user gets the expected error message
        assertEquals("Please fill out this field.", loginPage.getMissingSingularInputMessage(), "The invalid login input error message doesn't match expectations");
    }
    //invalid user login test method(the required input only - no password)
    protected void invalidUserLoginWithRequiredInputOnlyNoPasswordTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //click 'Login' link
        homePage.clickNavbarLoginLink();
        //assert the user gets onto login page
        assertEquals("Login", loginPage.getLoginPageTitle(), "The login page title doesn't match expectations or the user isn't on the login page");
        //login page web element assert
        isLoginPageWebElementDisplayed(loginPage);
        //invalid login input data getter (no password)
        loginPage.invalidLoginInputDataWithRequiredOnlyNoPasswordGetter(signUpPage);
        //input valid email
        loginPage.inputValidEmailAddress();
        //don't input password
        loginPage.inputNoPassword();
        //click 'Login' button
        loginPage.clickLoginButton();
        //assert the user gets the expected error message
        assertEquals("Please fill out this field.", loginPage.getMissingSingularInputMessage(), "The invalid login input error message doesn't match expectations");
    }

    //homepage web element assert test method
    protected void isHomePageWebElementDisplayed(HomePage homePage) {
        //assert homepage descriptor title is displayed
        assertTrue(homePage.isHomePageDescriptorTitleDisplayed(), "The homepage descriptor title isn't displayed");
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
        assertTrue(homePage.isWebdriverIoBoxViewCodesLinkDisplayed(), "The WebDriver.IO box 'View Codes' link isn't displayed");
        //assert Capybara box title is displayed
        assertTrue(homePage.isCapybaraBoxTitleDisplayed(), "The Capybara box title isn't displayed");
        //assert Capybara link is displayed
        assertTrue(homePage.isCapybaraLinkDisplayed(), "The Capybara link isn't displayed");
        //assert Capybara RSpec link is displayed
        assertTrue(homePage.isRSpecLinkDisplayed(), "The Capybara RSpec link isn't displayed");
        //assert Capybara box view codes link is displayed
        assertTrue(homePage.isCapybaraBoxViewCodesLinkDisplayed(), "The Capybara box 'View Codes' link isn't displayed");
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
        //assert 'Logout' button is displayed
        assertTrue(myAccountPage.isLogOutButtonDisplayed(), "The 'Logout' button isn't displayed");
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

    //login page web element assert test method
    protected void isLoginPageWebElementDisplayed(LoginPage loginPage) {
        //assert login page title is displayed
        assertTrue(loginPage.isLoginPageTitleDisplayed(), "The 'Login' page title isn't displayed");
        //assert email input field is displayed
        assertTrue(loginPage.isEmailInputDisplayed(), "The email input field isn't displayed");
        //assert password input field is displayed
        assertTrue(loginPage.isPasswordInputDisplayed(), "The password input field isn't displayed");
        //assert login button is displayed
        assertTrue(loginPage.isLoginButtonDisplayed(), "The login button isn't displayed");
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
