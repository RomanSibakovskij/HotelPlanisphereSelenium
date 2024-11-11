package dev.testplanisphere.hotel;

import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods{

    //Test 001 -> user navigation to 'Sign-up' page test (guest)
    @Test
    @DisplayName("Navigate To Sign-up Page Test (as a guest)")
    @Tag("Navigate_To_Sign-up_Page")
    void navigateUserToSignUpPageTest(){
        HomePage homePage = new HomePage(driver);
        navigateToSignUpPageTest(homePage);
    }
}
