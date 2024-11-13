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
        //navigate to sign-up page test
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
        //navigate to sign-up page test
        navigateToSignUpPageTest(homePage);
        SignUpPage signUpPage = new SignUpPage(driver);
        //valid user account creation test (all input)
        createValidUserAccountAllInputTest(signUpPage);
    }

    //negative user account creation tests

    //Test 002b -> invalid user account creation test (all input - too short phone number)
    @Test
    @DisplayName("Invalid User Account Creation Test (all input - too short phone number)")
    @Tag("Invalid_User_Account_Creation")
    @Tag("All_Input_Only")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountRequiredAllInputTooShortPhoneCreationTest(){
        HomePage homePage = new HomePage(driver);
        //navigate to sign-up page test
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
        //navigate to sign-up page test
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
        //navigate to sign-up page test
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
        //navigate to sign-up page test
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
        //navigate to sign-up page test
        navigateToSignUpPageTest(homePage);
        SignUpPage signUpPage = new SignUpPage(driver);
        //invalid user account creation test (the required input only - mismatching confirm password)
        createInvalidUserAccountRequiredOnlyMismatchingConfirmPasswordTest(signUpPage);
    }

    //no singular input tests

    //Test 002g -> invalid user account creation test (the required input only - no email address)
    @Test
    @DisplayName("Invalid User Account Creation Test (required input only - no email address)")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Required_Input_Only")
    @Tag("No_Singular_Input")
    void invalidAccountRequiredInputOnlyNoEmailFormatTest(){
        HomePage homePage = new HomePage(driver);
        //navigate to sign-up page test
        navigateToSignUpPageTest(homePage);
        SignUpPage signUpPage = new SignUpPage(driver);
        //invalid user account creation test (the required input only - missing email address)
        createInvalidUserAccountRequiredOnlyInputNoEmailFormatTest(signUpPage);
    }

    //Test 002h -> invalid user account creation test (the required input only - no password and confirm password (since they're used together, they are both included into test method))
    @Test
    @DisplayName("Invalid User Account Creation Test (required input only - no password and confirm password)")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Required_Input_Only")
    @Tag("No_Singular_Input")
    void invalidAccountRequiredInputOnlyNoPasswordAndConfirmTest(){
        HomePage homePage = new HomePage(driver);
        //navigate to sign-up page test
        navigateToSignUpPageTest(homePage);
        SignUpPage signUpPage = new SignUpPage(driver);
        //invalid user account creation test (the required input only - no password and confirm password)
        createInvalidUserAccountRequiredOnlyInputNoPasswordAndConfirm(signUpPage);
    }

    //Test 002i -> invalid user account creation test (the required input only - no full name)
    @Test
    @DisplayName("Invalid User Account Creation Test (required input only - no full name)")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Required_Input_Only")
    @Tag("No_Singular_Input")
    void invalidAccountRequiredInputOnlyNoFullNameTest(){
        HomePage homePage = new HomePage(driver);
        //navigate to sign-up page test
        navigateToSignUpPageTest(homePage);
        SignUpPage signUpPage = new SignUpPage(driver);
        //invalid user account creation test (the required input only - no full name)
        createInvalidUserAccountRequiredOnlyInputNoFullNameTest(signUpPage);
    }
}
