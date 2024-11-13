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
    @FindBy(xpath = "//div[.='Please fill out this field.']")
    private WebElement missingSingularInput;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailInputField;
    @FindBy(xpath = "//div[.='Please enter a non-empty email address.']")
    private WebElement invalidEmailFormatInput;
    @FindBy(xpath = "//div[.='Email has already been taken.']")
    private WebElement alreadyUsedEmailInput;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInputField;
    @FindBy(xpath = "//small[.='Please lengthen this text to 8 characters.']")
    private WebElement passwordInputHint;
    @FindBy(xpath = "//div[.='Please lengthen this text to 8 characters or more.']")
    private WebElement invalidPasswordInput;
    @FindBy(xpath = "//input[@id='password-confirmation']")
    private WebElement confirmPasswordInputField;
    @FindBy(xpath = "//div[contains(text(), \"Password doesn't match.\")]")
    private WebElement mismatchingConfirmPasswordInput;
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
    @FindBy(xpath = "//div[.='Please match the requested format.']")
    private WebElement invalidPhoneInput;
    @FindBy(xpath = "//select[@id='gender']")
    private WebElement genderDropdownMenu;
    //gender options
    @FindBy(xpath = "//option[@value='1']")
    private WebElement maleGenderOption;
    @FindBy(xpath = "//option[@value='2']")
    private WebElement femaleGenderOption;

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
    private String phone;
    private String birthdate;

    //invalid singular input data (too short)
    private String tooShortPhone;
    private String tooShortPassword;
    //invalid singular input data (too long)
    private String tooLongPhone;
    //invalid singular input data (invalid email format)
    private String invalidEmailFormat;
    //invalid singular input data (already used meail beforehand)
    private String usedEmail;
    //invalid singular input data (mismatching confirm password)
    private String mismatchingConfirmPassword;
    //missing singular input data
    private String noEmail;
    private String noPassword;
    private String noConfirmPassword;
    private String noFullName;

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

    //valid input data getter (with all input data)
    public void validInputDataAllInputs(){
        email = TestDataGenerator.generateRandomEmailAddress(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;
        fullName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        address = TestDataGenerator.generateRandomAddress(6);
        phone = "011" + TestDataGenerator.generatePhoneNumber(8);
        birthdate = TestDataGenerator.generateBirthdate();

        System.out.println("Valid input data generated (all input): " + "\n");
        logger.info("Email address (all input): " + email);
        logger.info("Password (all input): " + password);
        logger.info("Confirm password (all input): " + confirmPassword);
        logger.info("Full Name (all input): " + fullName);
        logger.info("Address (all input): " + address);
        logger.info("Phone number (all input): " + phone);
        logger.info("Birthdate (all input): " + birthdate);
        System.out.println("\n");
    }

    //invalid input data getter (with all input data - too short phone number)
    public void invalidInputDataAllInputsTooShortPhone(){
        email = TestDataGenerator.generateRandomEmailAddress(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;
        fullName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        address = TestDataGenerator.generateRandomAddress(6);
        tooShortPhone = "011" + TestDataGenerator.generatePhoneNumber(7);
        birthdate = TestDataGenerator.generateBirthdate();

        System.out.println("Valid input data generated (all input - too short phone number): " + "\n");
        logger.info("Email address (all input - too short phone number): " + email);
        logger.info("Password (all input - too short phone number): " + password);
        logger.info("Confirm password (all input - too short phone number): " + confirmPassword);
        logger.info("Full Name (all input - too short phone number): " + fullName);
        logger.info("Address (all input - too short phone number): " + address);
        logger.info("Too short phone number (all input - too short phone number): " + tooShortPhone);
        logger.info("Birthdate (all input - too short phone number): " + birthdate);
        System.out.println("\n");
    }
    //invalid input data getter (with all input data - too long phone number)
    public void invalidInputDataAllInputsTooLongPhone(){
        email = TestDataGenerator.generateRandomEmailAddress(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;
        fullName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        address = TestDataGenerator.generateRandomAddress(6);
        tooLongPhone = "011" + TestDataGenerator.generatePhoneNumber(9);
        birthdate = TestDataGenerator.generateBirthdate();

        System.out.println("Valid input data generated (all input - too long phone number): " + "\n");
        logger.info("Email address (all input - too long phone number): " + email);
        logger.info("Password (all input - too long phone number): " + password);
        logger.info("Confirm password (all input - too long phone number): " + confirmPassword);
        logger.info("Full Name (all input - too long phone number): " + fullName);
        logger.info("Address (all input - too long phone number): " + address);
        logger.info("Too long phone number (all input - too long phone number): " + tooLongPhone);
        logger.info("Birthdate (all input - too long phone number): " + birthdate);
        System.out.println("\n");
    }
    //invalid input data getter (required input data only - invalid email format)
    public void invalidInputDataRequiredOnlyInvalidEmailFormat(){
        invalidEmailFormat = "m991example.com";
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;
        fullName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();

        System.out.println("Invalid input data generated (required input only - invalid email format): " + "\n");
        logger.info("Invalid email address (required input only - invalid email format): " + invalidEmailFormat);
        logger.info("Password (required input only - invalid email format): " + password);
        logger.info("Confirm password (required input only - invalid email format): " + confirmPassword);
        logger.info("Full Name (required input only - invalid email format): " + fullName);
        System.out.println("\n");
    }
    //invalid input data getter (required input data only - too short password)
    public void invalidInputDataRequiredOnlyWithTooShortPassword(){
        email = TestDataGenerator.generateRandomEmailAddress(5);
        tooShortPassword = "StkR##y";
        confirmPassword = tooShortPassword;
        fullName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();

        System.out.println("Invalid input data generated (required input only - too short password): " + "\n");
        logger.info("Email address (required input only - too short password): " + email);
        logger.info("Too short password (required input only - too short password): " + password);
        logger.info("Confirm password (required input only - too short password): " + confirmPassword);
        logger.info("Full Name (required input only - too short password): " + fullName);
        System.out.println("\n");
    }
    //invalid input data getter (required input data only - mismatching confirm password)
    public void invalidInputDataRequiredOnlyWithMismatchingConfirmPassword(){
        email = TestDataGenerator.generateRandomEmailAddress(5);
        password = TestDataGenerator.generateRandomPassword();
        mismatchingConfirmPassword = "GbhjhnHjyyg#$2";
        fullName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();

        System.out.println("Invalid input data generated (required input only - mismatching confirm password): " + "\n");
        logger.info("Email address (required input only - mismatching confirm password): " + email);
        logger.info("Password (required input only - mismatching confirm password): " + password);
        logger.info("Mismatching confirm password (required input only - mismatching confirm password): " + mismatchingConfirmPassword);
        logger.info("Full Name (required input only - mismatching confirm password): " + fullName);
        System.out.println("\n");
    }

    //no singular input data getters

    //invalid input data getter (required input data only - no email address)
    public void invalidInputDataRequiredOnlyNoEmail(){
        noEmail = "";
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;
        fullName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();

        System.out.println("Invalid input data generated (required input only - no email address): " + "\n");
        logger.info("No email address (required input only - no email address): " + noEmail);
        logger.info("Password (required input only - no email address): " + password);
        logger.info("Confirm password (required input only - no email address): " + confirmPassword);
        logger.info("Full Name (required input only - no email address): " + fullName);
        System.out.println("\n");
    }
    //invalid input data getter (required input data only - no password and confirm password)
    public void invalidInputDataRequiredOnlyNoPasswordAndNoConfirm(){
        email = TestDataGenerator.generateRandomEmailAddress(5);
        noPassword = "";
        noConfirmPassword = noPassword;
        fullName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();

        System.out.println("Invalid input data generated (required input only - no password and confirm password): " + "\n");
        logger.info("Email address (required input only - no password and confirm password): " + email);
        logger.info("No password (required input only - no password and confirm password): " + noPassword);
        logger.info("No confirm password (required input only - no password and confirm password): " + noConfirmPassword);
        logger.info("Full Name (required input only - no password and confirm password): " + fullName);
        System.out.println("\n");
    }
    //invalid input data getter (required input data only - no full name)
    public void invalidInputDataRequiredOnlyNoFullName(){
        email = TestDataGenerator.generateRandomEmailAddress(5);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;
        noFullName = "";

        System.out.println("Invalid input data generated (required input only - no full name): " + "\n");
        logger.info("Email address (required input only - no full name): " + email);
        logger.info("Password (required input only - no full name): " + password);
        logger.info("Confirm password (required input only - no full name): " + confirmPassword);
        logger.info("No full Name (required input only - no full name): " + noFullName);
        System.out.println("\n");
    }
    //invalid input data getter (required input data only - with already used email beforehand)
    public void invalidInputDataRequiredOnlyUsedEmail(SignUpPage signUpPage){
        usedEmail = signUpPage.getValidUserEmail();
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;
        fullName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();

        System.out.println("Invalid input data generated (required input only - with already used email address): " + "\n");
        logger.info("Used email address (required input only - with already used email address): " + email);
        logger.info("Password (required input only - with already used email address): " + password);
        logger.info("Confirm password (required input only - with already used email address): " + confirmPassword);
        logger.info("Full Name (required input only - with already used email address): " + fullName);
        System.out.println("\n");
    }

    //valid address input method(this input field has no restrictions)
    public void inputValidAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(addressInputField));
        addressInputField.sendKeys(address);
    }
    //valid phone input method
    public void inputValidPhone(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(phoneInputField));
        phoneInputField.sendKeys(phone);
    }
    //valid birthdate format input method
    public void inputValidBirthdate(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(birthdateInputField));
        birthdateInputField.sendKeys(birthdate);
    }

    //invalid phone input method - too short phone number
    public void inputTooShortPhone(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(phoneInputField));
        phoneInputField.sendKeys(tooShortPhone);
    }
    //invalid phone input method - too long phone number
    public void inputTooLongPhone(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(phoneInputField));
        phoneInputField.sendKeys(tooLongPhone);
    }
    //invalid data input method - invalid email address format
    public void inputInvalidEmailAddressFormat(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(invalidEmailFormat);
    }
    //invalid data input method - already used email address format
    public void inputAlreadyUsedEmailAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(usedEmail);
    }
    //invalid data input method - too short password
    public void inputTooShortPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(tooShortPassword);
    }
    //invalid data input method - too short confirm password
    public void inputTooShortConfirmPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(confirmPasswordInputField));
        confirmPasswordInputField.sendKeys(tooShortPassword);
    }
    //invalid data input method - mismatching confirm password
    public void inputMismatchingConfirmPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(confirmPasswordInputField));
        confirmPasswordInputField.sendKeys(mismatchingConfirmPassword);
    }
    //no singular input
    //invalid data input method - no email address
    public void inputNoEmailAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(noEmail);
    }
    //invalid data input method - no password
    public void inputNoPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(noPassword);
    }
    //invalid data input method - no confirm password
    public void inputNoConfirmPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(confirmPasswordInputField));
        confirmPasswordInputField.sendKeys(noConfirmPassword);
    }
    //invalid data input method - no full name
    public void inputNoFullName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(fullNameInputField));
        fullNameInputField.sendKeys(noFullName);
    }

    //'Premium membership' click method
    public void selectPremiumMembership(){premiumMembershipDotCircle.click();}
    //click gender dropdown menu method
    public void clickGenderDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(genderDropdownMenu));
        genderDropdownMenu.click();
    }
    //select male gender method
    public void selectMaleGenderOption(){maleGenderOption.click();}
    //select female gender method
    public void selectFemaleGenderOption(){femaleGenderOption.click();}
    //click 'Receive notification' method
    public void clickReceiveNotificationCheckbox(){receiveNotificationCheckbox.click();}

    //invalid phone input getter
    public String getInvalidPhoneInputMessage(){return invalidPhoneInput.getText();}
    //invalid email format getter
    public String getInvalidEmailFormatMessage(){return invalidEmailFormatInput.getText();}
    //invalid password input message getter (same for confirm password)
    public String getInvalidPasswordInputMessage(){return invalidPasswordInput.getText();}
    //mismatching confirm password input message getter
    public String getMismatchingConfirmPasswordMessage(){return mismatchingConfirmPasswordInput.getText();}
    //missing singular input message getter
    public String getMissingSingularInputMessage(){return missingSingularInput.getText();}
    //already used email message getter
    public String getAlreadyUsedEmailMessage(){return alreadyUsedEmailInput.getText();}

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

    //valid sign-up data getters(for login)
    public String getValidUserEmail(){return email;}
    public String getValidUserPassword(){return password;}

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
