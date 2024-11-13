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
        //navigate to sign-up page test
        navigateToSignUpPageTest(homePage);
        SignUpPage signUpPage = new SignUpPage(driver);
        //valid user account creation test (required only)
        createValidUserAccountRequiredOnlyInputTest(signUpPage);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //user logout test
        userLogOutTest(myAccountPage);
    }
}
