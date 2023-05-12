package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.basetest.BaseTest;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {

    HomePage homePage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"Sanity", "Regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickingOnRegisterLink();
        registerPage.isRegisterTextDisplayed();
    }

    @Test(groups = {"Smoke", "Regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
        homePage.clickingOnRegisterLink();
        registerPage.clickingOnRegisterButton();
        registerPage.isFirstNameRequiredTextDisplayed();
        registerPage.isLastNameRequiredTextDisplayed();
        registerPage.isEmailRequiredTextDisplayed();
        registerPage.isPasswordRequiredTextDisplayed();
        registerPage.isConfirmedPasswordRequiredTextDisplayed();
    }

    @Test(groups = "Regression")
    public void VerifyThatUserShouldCreateAccountSuccessfully() {
        homePage.clickingOnRegisterLink();
        registerPage.selectingFemaleRadioButton();
        registerPage.enteringFirstNameInToFirstNameField("Vibha");
        registerPage.enteringLastNameInToLastNameField("Patel");
        registerPage.selectingDayOfBirthFromDropDown("7");
        registerPage.selectingMonthOfBirthFromDropDown("June");
        registerPage.selectingYearOfBirthFromDropDown("1975");
        registerPage.enteringEmailToEmailField("vibha@gmail.com");
        registerPage.enteringPasswordToPasswordField("vpatel");
        registerPage.enteringPasswordToConfirmPasswordField("vpatel");
        registerPage.clickingOnRegisterButton(); 
        //registerPage.isYourRegistrationCompleteTextDisplayed(); // Verifying registration complete text
        //registerPage.clickingOnContinueButton(); // Clicking on continue button
    }
}
