package dev.testplanisphere.hotel;

import org.junit.jupiter.api.*;

public class SignUpPageTest extends TestMethods{

    //Test 002 -> valid user account creation test (the required input only)
    @Test
    @DisplayName("Valid User Account Creation Test (required input only)")
    @Tag("Valid_User_Account_Creation")
    @Tag("Required_Input_Only")
    void validAccountRequiredInputOnlyCreationTest(){
        HomePage homePage = new HomePage(driver);
        navigateToSignUpPageTest(homePage);
        SignUpPage signUpPage = new SignUpPage(driver);
        //valid user account creation test (required only)
        createValidUserAccountRequiredOnlyInputTest(signUpPage);
    }

    //Test 002a -> valid user account creation test (all input)
    @Test
    @DisplayName("Valid User Account Creation Test (all input)")
    @Tag("Valid_User_Account_Creation")
    @Tag("All_Input_Only")
    void validAccountRequiredAllInputCreationTest(){
        HomePage homePage = new HomePage(driver);
        navigateToSignUpPageTest(homePage);
        SignUpPage signUpPage = new SignUpPage(driver);
        //valid user account creation test (all input)
        createValidUserAccountAllInputTest(signUpPage);
    }

    //Test 002b -> invalid user account creation test (all input - too short phone number)
    @Test
    @DisplayName("Invalid User Account Creation Test (all input - too short phone number)")
    @Tag("Invalid_User_Account_Creation")
    @Tag("All_Input_Only")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountRequiredAllInputTooShortPhoneCreationTest(){
        HomePage homePage = new HomePage(driver);
        navigateToSignUpPageTest(homePage);
        SignUpPage signUpPage = new SignUpPage(driver);
        //valid user account creation test (all input - too short phone number)
        createInvalidUserAccountAllInputTooShortPhoneTest(signUpPage);
    }
}
