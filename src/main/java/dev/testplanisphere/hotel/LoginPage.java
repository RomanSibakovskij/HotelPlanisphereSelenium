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
    @FindBy(xpath = "//div[.='Email or password is invalid.']")
    private WebElement invalidLoginInputMessage;
    @FindBy(xpath = "//div[.='Please fill out this field.']")
    private WebElement missingSingularInputMessage;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInputField;
    @FindBy(xpath = "//button[@id='login-button']")
    private WebElement loginButton;

    //valid login data
    private String validLoginEmail;
    private String validLoginPassword;

    //invalid singular input data
    private String invalidLoginEmail;
    private String invalidLoginPassword;

    //missing singular input data
    private String noLoginEmail;

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

    //invalid login data input
    //invalid login input data getter - invalid email address
    public void invalidLoginInputDataWithRequiredOnlyInvalidEmailGetter(SignUpPage signUpPage) {
        invalidLoginEmail = "vb@example.com";
        validLoginPassword = signUpPage.getValidUserPassword();

        System.out.println("Invalid user login data (required only inputs - invalid login email): " + "\n");
        logger.info("Invalid user login email (required only inputs - invalid login email): " + invalidLoginEmail);
        logger.info("Valid user login password (required only inputs - invalid login email): " + validLoginPassword);
        System.out.println("\n");
    }
    //invalid user login email input method
    public void inputInvalidEmailAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(invalidLoginEmail);
    }

    //invalid login input data getter - invalid password
    public void invalidLoginInputDataWithRequiredOnlyInvalidPasswordGetter(SignUpPage signUpPage) {
        validLoginEmail = signUpPage.getValidUserEmail();
        invalidLoginPassword = "Karkgr##23";

        System.out.println("Invalid user login data (required only inputs - invalid login password): " + "\n");
        logger.info("Valid user login email (required only inputs - invalid login password): " + validLoginEmail);
        logger.info("Invalid user login password (required only inputs - invalid login password): " + invalidLoginPassword);
        System.out.println("\n");
    }
    //invalid user login password input method
    public void inputInvalidPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(invalidLoginPassword);
    }

    //no singular input
    //invalid login input data getter - no email address
    public void invalidLoginInputDataWithRequiredOnlyNoEmailGetter(SignUpPage signUpPage) {
        noLoginEmail = "";
        validLoginPassword = signUpPage.getValidUserPassword();

        System.out.println("Invalid user login data (required only inputs - no login email): " + "\n");
        logger.info("No user login email (required only inputs - no login email): " + noLoginEmail);
        logger.info("Valid user login password (required only inputs - no login email): " + validLoginPassword);
        System.out.println("\n");
    }
    //invalid user login email input method - no email address
    public void inputNoEmailAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(noLoginEmail);
    }

    //click 'Login' button method
    public void clickLoginButton(){loginButton.click();}

    //login page title getter
    public String getLoginPageTitle() {return loginPageTitle.getText();}

    //invalid singular input message getter
    public String getInvalidLoginInputMessage(){return invalidLoginInputMessage.getText();}
    //missing singular input message getter
    public String getMissingSingularInputMessage(){return missingSingularInputMessage.getText();}

    //login web element assert methods
    public boolean isLoginPageTitleDisplayed() {return loginPageTitle.isDisplayed();}
    public boolean isEmailInputDisplayed() {return emailInputField.isDisplayed();}
    public boolean isPasswordInputDisplayed() {return passwordInputField.isDisplayed();}
    public boolean isLoginButtonDisplayed() {return loginButton.isDisplayed();}

}
