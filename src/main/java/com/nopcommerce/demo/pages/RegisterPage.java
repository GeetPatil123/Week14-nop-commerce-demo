package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;
    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement femaleRadioButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dayOfBirth;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthOfBirth;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearOfBirth;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameRequiredText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameRequiredText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailRequiredText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordRequiredText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordRequiredText;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompletedText;
    @CacheLookup
    @FindBy(xpath = "//a[@class='button-1 register-continue-button']")
    WebElement continueButton;

    public void isRegisterTextDisplayed() { // Method to verify that register text is displayed or not
        verifyThatElementIsDisplayed(registerText);
    }

    public void clickingOnRegisterButton() { // Method to click on register button
        clickOnElement(registerButton);
    }

    public void isFirstNameRequiredTextDisplayed() {
        verifyThatElementIsDisplayed(firstNameRequiredText);
    }

    public void isLastNameRequiredTextDisplayed() {
        verifyThatElementIsDisplayed(lastNameRequiredText);
    }

    public void isEmailRequiredTextDisplayed() {
        verifyThatElementIsDisplayed(emailRequiredText);
    }

    public void isPasswordRequiredTextDisplayed() {
        verifyThatElementIsDisplayed(passwordRequiredText);
    }

    public void isConfirmedPasswordRequiredTextDisplayed() {
        verifyThatElementIsDisplayed(confirmPasswordRequiredText);
    }

    public void selectingFemaleRadioButton() { // Method to select female radio button
        clickOnElement(femaleRadioButton);
    }

    public void enteringFirstNameInToFirstNameField(String fName) { // Method to send first name to first name field
        sendTextToElement(firstName, fName);
    }

    public void enteringLastNameInToLastNameField(String lName) { // Method to send last name to last name field
        sendTextToElement(lastName, lName);
    }

    public void enteringEmailToEmailField(String emailValue) { // Method to send email to email field
        sendTextToElement(email, emailValue);
    }

    public void enteringPasswordToPasswordField(String passwordValue) { // Method to send password to password field
        sendTextToElement(password, passwordValue);
    }

    public void enteringPasswordToConfirmPasswordField(String confirmPasswordValue) {
        sendTextToElement(confirmPassword, confirmPasswordValue);
    }

    public void selectingDayOfBirthFromDropDown(String day) {
        clickOnElement(dayOfBirth);
        selectByVisibleTextFromDropDown(dayOfBirth, day);
    }

    public void selectingMonthOfBirthFromDropDown(String month) {
        clickOnElement(monthOfBirth);
        selectByVisibleTextFromDropDown(monthOfBirth, month);
    }

    public void selectingYearOfBirthFromDropDown(String year) {
        clickOnElement(yearOfBirth);
        selectByVisibleTextFromDropDown(yearOfBirth, year);
    }

    public void isYourRegistrationCompleteTextDisplayed() {
        verifyThatElementIsDisplayed(registrationCompletedText);
    }

    public void clickingOnContinueButton() {
        clickOnElement(continueButton);
    }
}
