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

    public SignUpPage(WebDriver driver) {super(driver);}

    //sign-up page title getter
    public String getSignUpPageTitle(){return signUpPageTitle.getText();}

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
