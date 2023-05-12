package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.basetest.BaseTest;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @Test(groups = {"Sanity", "Regression"})
    public void userShouldNavigateToLoginPageSuccessFully() {
        homePage.clickingOnLoginLinkFromTheHomePage();
        loginPage.isWelcomeTextDisplayed();
    }

    @Test(groups = {"Smoke", "Regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {
        homePage.clickingOnLoginLinkFromTheHomePage();
        loginPage.enteringEmailInToEmailField("prime123@gmail.com");
        loginPage.enteringPasswordInToPasswordField("prime123");
        loginPage.clickingOnTheLoginButton();
        loginPage.isErrorMessageDisplayed();
    }

    @Test(groups = {"Smoke", "Regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        homePage.clickingOnLoginLinkFromTheHomePage();
        loginPage.enteringEmailInToEmailField("vibha@gmail.com");
        loginPage.enteringPasswordInToPasswordField("vpatel");
        loginPage.clickingOnTheLoginButton();
        homePage.isLogoutLinkDisplayed();
    }

    @Test(groups = "Regression")
    public void VerifyThatUserShouldLogOutSuccessFully() {
        homePage.clickingOnLoginLinkFromTheHomePage();
        loginPage.enteringEmailInToEmailField("vibha@gmail.com");
        loginPage.enteringPasswordInToPasswordField("vpatel");
        loginPage.clickingOnTheLoginButton();
        homePage.clickingOnTheLogoutLink();
        homePage.isLoginLinkDisplayed();
    }
}
