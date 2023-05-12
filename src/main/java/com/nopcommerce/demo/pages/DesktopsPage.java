package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopsText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortByDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement displayDropDown;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Grid']")
    WebElement gridIcon;
    @CacheLookup
    @FindBy(xpath = "//a[@title='List']")
    WebElement listIcon;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputer;

    // Defining Methods
    public void isDesktopsTextDisplayed() { // Method to verify that desktops text is displayed or not
        verifyThatElementIsDisplayed(desktopsText);
    }

    public void selectingOptionFromSortByDropDown(String sortOrder) {
        clickOnElement(sortByDropDown);
        selectByVisibleTextFromDropDown(sortByDropDown, sortOrder);
    }

    public void selectingOptionFromDisplayDropDown(String displayOrder) {
        clickOnElement(displayDropDown);
        selectByVisibleTextFromDropDown(displayDropDown, displayOrder);
    }

    public void clickingOnBuildYourOwnComputerLink() { // Method to click on build your own computer link
        clickOnElement(buildYourOwnComputer);
    }

    public void clickingOnGridIcon() { // Method to click on grid icon
        clickOnElement(gridIcon);
    }

    public void clickingOnListIcon() { // Method to click on list icon
        clickOnElement(listIcon);
    }
}
