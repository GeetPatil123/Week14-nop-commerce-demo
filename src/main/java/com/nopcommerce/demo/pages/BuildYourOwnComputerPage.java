package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement rAMDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement HDD320GB;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement HDD400GB;
    @CacheLookup
    @FindBy(xpath = "//label[@for='product_attribute_5_10']")
    WebElement mSOfficeCheckBox;
    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_5']//li[1]")
    WebElement acrobatReaderCheckBox;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement totalCommanderCheckBox;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement productAddedText;
    @CacheLookup
    @FindBy(xpath = "//label[@for='product_attribute_4_8']")
    WebElement vistaOption;
    @CacheLookup
    @FindBy(xpath = "//label[@for='product_attribute_4_9']")
    WebElement vistaPremiumOption;

    public void isBuildYourOwnComputerTextDisplayed() {
        verifyThatElementIsDisplayed(buildYourOwnComputerText);
    }

    public void selectingProcessorOptionFromDropDown(String processor) {
        clickOnElement(processorDropDown);
        selectByVisibleTextFromDropDown(processorDropDown, processor);
    }

    public void selectingRAMOptionFromDropDown(String rAM) {
        clickOnElement(rAMDropDown);
        selectByVisibleTextFromDropDown(rAMDropDown, rAM);
    }

    public void selectingHDDOption(String hDD) {
        if (hDD == "320GB")
            clickOnElement(HDD320GB);
        else clickOnElement(HDD400GB);
    }

    public void selectingWindowsOption(String winOption) {
        if (winOption == "Vista Home [+$50.00]") {
            clickOnElement(vistaOption);
        } else clickOnElement(vistaPremiumOption);
    }

    public void selectingSoftwareOption(String sWOption) {
        if (sWOption == "Microsoft Office [+$50.00]")
            clickOnElement(mSOfficeCheckBox);
        else if (sWOption == "Acrobat Reader [+$10.00]") {
            clickOnElement(acrobatReaderCheckBox);
        } else clickOnElement(totalCommanderCheckBox);
    }

    public void clickingOnAddToCartButton() { // Method to click on add to cart button
        clickOnElement(addToCartButton);
    }

    public void isProductAddedTextDisplayed() { // Method to verify the product added successfully text
        verifyThatElementIsDisplayed(productAddedText);
    }
}
