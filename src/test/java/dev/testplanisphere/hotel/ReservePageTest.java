package dev.testplanisphere.hotel;

import org.junit.jupiter.api.*;

public class ReservePageTest extends TestMethods{

    //Test 006 -> navigate to reserve dashboard page test
    @Test
    @DisplayName("Navigate To Reserve Dashboard Page Test")
    @Tag("Navigate_To_Reserve_Dashboard_Page")
    @Tag("Required_Input_Only")
    void validAccountRequiredInputOnlyCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //navigate to sign-up page test
        navigateToSignUpPageTest(homePage);
        //valid user account creation test (required only)
        createValidUserAccountRequiredOnlyInputTest(signUpPage);
        //navigate to reserve dashboard page test
        navigateToReserveDashboardPageTest(myAccountPage);
    }
}
