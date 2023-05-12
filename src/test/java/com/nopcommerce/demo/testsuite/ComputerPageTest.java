package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.basetest.BaseTest;
import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends BaseTest {

    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    @Test(groups = {"Sanity", "Regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        homePage.clickingOnComputersMenu();
        computerPage.isComputersTextDisplayed();
    }

    @Test(groups = {"Smoke", "Regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.clickingOnComputersMenu();
        computerPage.clickingOnDesktopsLink();
        desktopsPage.isDesktopsTextDisplayed();
    }

    @Test(groups = "Regression", dataProvider = "dataSet", dataProviderClass = TestData.class)
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram,
                                                                                    String hdd, String os, String software) {
        homePage.clickingOnComputersMenu();
        homePage.clickingOnDesktopsLink();
        desktopsPage.clickingOnBuildYourOwnComputerLink();
        buildYourOwnComputerPage.selectingProcessorOptionFromDropDown(processor);
        buildYourOwnComputerPage.selectingRAMOptionFromDropDown(ram);
        buildYourOwnComputerPage.selectingHDDOption(hdd);
        buildYourOwnComputerPage.selectingWindowsOption(os);
        buildYourOwnComputerPage.selectingSoftwareOption(software);
        buildYourOwnComputerPage.clickingOnAddToCartButton();
        buildYourOwnComputerPage.isProductAddedTextDisplayed();
    }
}
