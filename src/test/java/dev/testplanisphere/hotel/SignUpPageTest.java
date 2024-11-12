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
        //invalid user account creation test (all input - too short phone number)
        createInvalidUserAccountAllInputTooShortPhoneTest(signUpPage);
    }

    //Test 002c -> invalid user account creation test (all input - too long phone number)
    @Test
    @DisplayName("Invalid User Account Creation Test (all input - too long phone number)")
    @Tag("Invalid_User_Account_Creation")
    @Tag("All_Input_Only")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountRequiredAllInputTooLongPhoneCreationTest(){
        HomePage homePage = new HomePage(driver);
        navigateToSignUpPageTest(homePage);
        SignUpPage signUpPage = new SignUpPage(driver);
        //invalid user account creation test (all input - too long phone number)
        createInvalidUserAccountAllInputTooLongPhoneTest(signUpPage);
    }

    //Test 002d -> invalid user account creation test (the required input only - invalid email address format) (with '@' input and omitting '.' the user account gets created though)
    @Test
    @DisplayName("Invalid User Account Creation Test (required input only - invalid email address format)")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Required_Input_Only")
    @Tag("Invalid_Singular_Input")
    void invalidAccountRequiredInputOnlyInvalidEmailFormatTest(){
        HomePage homePage = new HomePage(driver);
        navigateToSignUpPageTest(homePage);
        SignUpPage signUpPage = new SignUpPage(driver);
        //invalid user account creation test (the required input only - invalid email address format)
        createInvalidUserAccountRequiredOnlyInputInvalidEmailFormatTest(signUpPage);
    }

    //Test 002e -> invalid user account creation test (the required input only - too short password)
    @Test
    @DisplayName("Invalid User Account Creation Test (required input only - too short password)")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Required_Input_Only")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountRequiredInputOnlyTooShortPasswordTest(){
        HomePage homePage = new HomePage(driver);
        navigateToSignUpPageTest(homePage);
        SignUpPage signUpPage = new SignUpPage(driver);
        //invalid user account creation test (the required input only - too short password)
        createInvalidUserAccountRequiredOnlyTooShortPasswordTest(signUpPage);
    }

    //Test 002f -> invalid user account creation test (the required input only - mismatching confirm password)
    @Test
    @DisplayName("Invalid User Account Creation Test (required input only - mismatching confirm password)")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Required_Input_Only")
    @Tag("Mismatching_Singular_Input")
    void invalidAccountRequiredInputOnlyMismatchingConfirmPasswordTest(){
        HomePage homePage = new HomePage(driver);
        navigateToSignUpPageTest(homePage);
        SignUpPage signUpPage = new SignUpPage(driver);
        //invalid user account creation test (the required input only - mismatching confirm password)
        createInvalidUserAccountRequiredOnlyMismatchingConfirmPasswordTest(signUpPage);
    }
}
