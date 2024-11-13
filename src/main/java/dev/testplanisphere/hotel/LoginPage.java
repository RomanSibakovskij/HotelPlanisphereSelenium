package dev.testplanisphere.hotel;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class LoginPage extends BasePage{

    //login page web elements
    @FindBy(xpath = "//h2")
    private WebElement loginPageTitle;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailInputField;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInputField;
    @FindBy(xpath = "//button[@id='login-button']")
    private WebElement loginButton;

    //valid login data
    private String validLoginEmail;
    private String validLoginPassword;

    public LoginPage(WebDriver driver) {super(driver);}

    //valid login input data
    public void validLoginInputDataWithRequiredOnlyGetter(SignUpPage signUpPage) {
        validLoginEmail = signUpPage.getValidUserEmail();
        validLoginPassword = signUpPage.getValidUserPassword();

        System.out.println("Valid user login data (required only inputs): " + "\n");
        logger.info("Valid user login email (required only inputs): " + validLoginEmail);
        logger.info("Valid user login password (required only inputs): " + validLoginPassword);
        System.out.println("\n");
    }

    //valid user login data input methods
    public void inputValidEmailAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(validLoginEmail);
    }
    public void inputValidPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(validLoginPassword);
    }

    //click 'Login' button method
    public void clickLoginButton(){loginButton.click();}

    //login page title getter
    public String getLoginPageTitle() {return loginPageTitle.getText();}

    //login web element assert methods
    public boolean isLoginPageTitleDisplayed() {return loginPageTitle.isDisplayed();}
    public boolean isEmailInputDisplayed() {return emailInputField.isDisplayed();}
    public boolean isPasswordInputDisplayed() {return passwordInputField.isDisplayed();}
    public boolean isLoginButtonDisplayed() {return loginButton.isDisplayed();}

}
