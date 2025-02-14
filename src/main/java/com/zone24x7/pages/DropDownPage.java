package com.zone24x7.pages;

import com.zone24x7.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage extends BasePage {

    private final By dropDown_Txt = By.xpath("//h3[contains(text(),'Dropdown List')]");
    private final By dropDown_list = By.cssSelector("#dropdown");

    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    public void loadingBannerCheck(){
        super.waitForElementToBeVisible(dropDown_Txt);
    }

    // Method to select an option by value
    public void selectDropdownByValue(String value) {
        Select select = new Select(super.waitForElementToBeClickable(dropDown_list));
        select.selectByVisibleText(value);
    }
}
