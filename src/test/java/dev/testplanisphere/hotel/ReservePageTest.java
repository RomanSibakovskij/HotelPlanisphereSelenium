package dev.testplanisphere.hotel;

import org.junit.jupiter.api.*;

public class ReservePageTest extends TestMethods{

    //Test 006 -> navigate to reserve dashboard page test
    @Test
    @DisplayName("Navigate To Reserve Dashboard Page Test")
    @Tag("Navigate_To_Reserve_Dashboard_Page")
    @Tag("Required_Input_Only")
    void navigateToReserveDashboardPageTest(){
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

    //Test 007 -> reserve the room 'Plan with special offers' test
    @Test
    @DisplayName("Reserve The Room 'Plan With Special Offers' Test")
    @Tag("Reserve_Plan_With_Special_Offers")
    @Tag("Reserve_Singular_Room")
    @Tag("Required_Input_Only")
    void reservePlanWithSpecialOffersRoomTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        ReserveDashboardPage reserveDashboardPage = new ReserveDashboardPage(driver);
        //navigate to sign-up page test
        navigateToSignUpPageTest(homePage);
        //valid user account creation test (required only)
        createValidUserAccountRequiredOnlyInputTest(signUpPage);
        //navigate to reserve dashboard page test
        navigateToReserveDashboardPageTest(myAccountPage);
        //reserve the room 'Plan with special offers' test
        reservePlanWithSpecialOffersTest(reserveDashboardPage);
    }
}
