package dev.testplanisphere.hotel;

import org.junit.jupiter.api.*;

public class SignUpPageTest extends TestMethods{

    //Test 002 -> valid user account creation test
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
}
