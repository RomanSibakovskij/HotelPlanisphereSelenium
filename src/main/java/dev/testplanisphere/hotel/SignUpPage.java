package dev.testplanisphere.hotel;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class SignUpPage extends BasePage{

    //signup page web elements
    @FindBy(xpath = "//div[@class='row'][1]//h2")
    private WebElement signUpPageTitle;
    //form elements (required)
    @FindBy(xpath = "//span[@class='badge badge-primary']")
    private WebElement requiredBadge;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailInputField;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInputField;
    @FindBy(xpath = "//small[.='Please lengthen this text to 8 characters.']")
    private WebElement passwordInputHint;
    @FindBy(xpath = "//input[@id='password-confirmation']")
    private WebElement confirmPasswordInputField;
    @FindBy(xpath = "//small[.='Please enter your password again to confirm.']")
    private WebElement confirmPasswordInputHint;
    @FindBy(xpath = "//input[@id='username']")
    private WebElement fullNameInputField;
    //form elements (optional)
    @FindBy(xpath = "//input[@id='rank-premium']")
    private WebElement premiumMembershipDotCircle;
    @FindBy(xpath = "//input[@id='rank-normal']")
    private WebElement membershipDotCircle;
    @FindBy(xpath = "//input[@id='address']")
    private WebElement addressInputField;
    @FindBy(xpath = "//input[@id='tel']")
    private WebElement phoneInputField;
    @FindBy(xpath = "//small[.='Please enter 11-digit number. Ex: 01133335555']")
    private WebElement phoneInputHint;
    @FindBy(xpath = "//select[@id='gender']")
    private WebElement genderDropdownMenu;
    @FindBy(xpath = "//input[@id='birthday']")
    private WebElement birthdateInputField;
    @FindBy(xpath = "//input[@id='notification']")
    private WebElement receiveNotificationCheckbox;
    //sign-up button web element
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signUpButton;

    //valid input data
    private String fullName;
    private String email;
    private String password;
    private String confirmPassword;
    private String address;
    private int phone;
    private String birthdate;

    public SignUpPage(WebDriver driver) {super(driver);}

    //valid input data getter (required input data only)
    public void validInputDataRequiredOnly(){
        email = TestDataGenerator.generateRandomEmailAddress(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;
        fullName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();

        System.out.println("Valid input data generated (required input only): " + "\n");
        logger.info("Email address: " + email);
        logger.info("Password: " + password);
        logger.info("Confirm password: " + confirmPassword);
        logger.info("Full Name: " + fullName);
        System.out.println("\n");
    }
    //valid data input methods
    public void inputValidEmailAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(email);
    }
    public void inputValidPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(password);
    }
    public void inputValidConfirmPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(confirmPasswordInputField));
        confirmPasswordInputField.sendKeys(confirmPassword);
    }
    public void inputValidFullName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(fullNameInputField));
        fullNameInputField.sendKeys(fullName);
    }

    //sign-up button click method
    public void clickSignUpButton(){signUpButton.click();}

    //sign-up page title getter
    public String getSignUpPageTitle(){return signUpPageTitle.getText();}
    //'Required' badge getter
    public String getRequiredBadge(){return requiredBadge.getText();}
    //password hint getter
    public String getPasswordInputHint(){return passwordInputHint.getText();}
    //confirm password hint getter
    public String getConfirmPasswordInputHint(){return confirmPasswordInputHint.getText();}
    //phone input hint
    public String getPhoneInputHint(){return phoneInputHint.getText();}

    //sign-up page web element assert methods
    public boolean isSignUpPageTitleDisplayed() {return signUpPageTitle.isDisplayed();}
    public boolean isRequiredBadgeDisplayed() {return requiredBadge.isDisplayed();}
    public boolean isEmailInputFieldDisplayed() {return emailInputField.isDisplayed();}
    public boolean isPasswordInputFieldDisplayed() {return passwordInputField.isDisplayed();}
    public boolean isPasswordInputHintDisplayed(){return passwordInputHint.isDisplayed();}
    public boolean isConfirmPasswordInputFieldDisplayed() {return confirmPasswordInputField.isDisplayed();}
    public boolean isConfirmPasswordInputHintDisplayed(){return confirmPasswordInputHint.isDisplayed();}
    public boolean isFullNameInputFieldDisplayed() {return fullNameInputField.isDisplayed();}
    public boolean isPremiumMembershipDotCircleDisplayed() {return premiumMembershipDotCircle.isDisplayed();}
    public boolean isMembershipDotCircleDisplayed() {return membershipDotCircle.isDisplayed();}
    public boolean isAddressInputFieldDisplayed() {return addressInputField.isDisplayed();}
    public boolean isPhoneInputFieldDisplayed() {return phoneInputField.isDisplayed();}
    public boolean isPhoneInputHintDisplayed(){return phoneInputHint.isDisplayed();}
    public boolean isGenderDropdownMenuDisplayed() {return genderDropdownMenu.isDisplayed();}
    public boolean isBirthdateInputFieldDisplayed() {return birthdateInputField.isDisplayed();}
    public boolean isReceiveNotificationCheckboxDisplayed() {return receiveNotificationCheckbox.isDisplayed();}
    public boolean isSignUpButtonDisplayed() {return signUpButton.isDisplayed();}


}
