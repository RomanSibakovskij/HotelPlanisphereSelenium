package dev.testplanisphere.hotel;

import org.junit.jupiter.api.*;

public class LoginPageTest extends TestMethods{

    //Test 003 -> valid user account logout test (the required input only)
    @Test
    @DisplayName("Valid User Account Logout Test (required input only)")
    @Tag("Valid_User_Logout")
    @Tag("Required_Input_Only")
    void validUserLogOutRequiredInputOnlyTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //navigate to sign-up page test
        navigateToSignUpPageTest(homePage);
        //valid user account creation test (required only)
        createValidUserAccountRequiredOnlyInputTest(signUpPage);
        //user logout test
        userLogOutTest(myAccountPage);
    }

    //Test 004 -> valid user account login test (the required input only)
    @Test
    @DisplayName("Valid User Account Login Test (required input only)")
    @Tag("Valid_User_Login")
    @Tag("Required_Input_Only")
    void validUserLoginRequiredInputOnlyTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //navigate to sign-up page test
        navigateToSignUpPageTest(homePage);
        //valid user account creation test (required only)
        createValidUserAccountRequiredOnlyInputTest(signUpPage);
        //user logout test
        userLogOutTest(myAccountPage);
        //valid user login test
        validUserLoginWithRequiredInputOnlyTest(signUpPage);
    }

    //negative user login tests

    //Test 004a -> invalid user account login test (the required input only - invalid email address)
    @Test
    @DisplayName("Invalid User Account Login Test (required input only - invalid email address)")
    @Tag("Invalid_User_Login")
    @Tag("Invalid_Singular_Input")
    @Tag("Required_Input_Only")
    void invalidUserLoginRequiredInputOnlyInvalidEmailTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //navigate to sign-up page test
        navigateToSignUpPageTest(homePage);
        //valid user account creation test (required only)
        createValidUserAccountRequiredOnlyInputTest(signUpPage);
        //user logout test
        userLogOutTest(myAccountPage);
        //invalid user login test - invalid email address
        invalidUserLoginWithRequiredInputOnlyInvalidEmailTest(signUpPage);
    }

    //Test 004b -> invalid user account login test (the required input only - invalid password)
    @Test
    @DisplayName("Invalid User Account Login Test (required input only - invalid password)")
    @Tag("Invalid_User_Login")
    @Tag("Invalid_Singular_Input")
    @Tag("Required_Input_Only")
    void invalidUserLoginRequiredInputOnlyInvalidPasswordTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //navigate to sign-up page test
        navigateToSignUpPageTest(homePage);
        //valid user account creation test (required only)
        createValidUserAccountRequiredOnlyInputTest(signUpPage);
        //user logout test
        userLogOutTest(myAccountPage);
        //invalid user login test - invalid password
        invalidUserLoginWithRequiredInputOnlyInvalidPasswordTest(signUpPage);
    }

    //no singular input tests

    //Test 004c -> invalid user account login test (the required input only - no email address)
    @Test
    @DisplayName("Invalid User Account Login Test (required input only - no email address)")
    @Tag("Invalid_User_Login")
    @Tag("No_Singular_Input")
    @Tag("Required_Input_Only")
    void invalidUserLoginRequiredInputOnlyNoEmailTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //navigate to sign-up page test
        navigateToSignUpPageTest(homePage);
        //valid user account creation test (required only)
        createValidUserAccountRequiredOnlyInputTest(signUpPage);
        //user logout test
        userLogOutTest(myAccountPage);
        //invalid user login test - no email address
        invalidUserLoginWithRequiredInputOnlyNoEmailTest(signUpPage);
    }
}
