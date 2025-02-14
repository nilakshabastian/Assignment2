package com.zone24x7.pages;

import com.zone24x7.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By banner_Txt = By.xpath("//h1[@class='heading']");
    private final By dropDown_Lnk = By.xpath("//a[contains(text(),'Dropdown')]");
    private final By jsAlert_Lnk = By.xpath("//a[contains(text(),'JavaScript Alerts')]");
    private final By iframe_Lnk = By.xpath("//a[contains(text(),'Frames')][1]");

    public HomePage(WebDriver uiDriver){
        super(uiDriver);
    }

    public void loadingBannerCheck(){
        super.waitForElementToBeVisible(banner_Txt);
    }

    public DropDownPage clickOnDropDownLink(){
        super.waitForElementToBeClickable(dropDown_Lnk).click();
        return new DropDownPage(uiDriver);
    }

    public JavaScriptAlertPage clickOnJavaScriptAlertLink(){
        super.waitForElementToBeClickable(jsAlert_Lnk).click();
        return new JavaScriptAlertPage(uiDriver);
    }

    public IframePage clickOnIframeLink(){
        super.waitForElementToBeClickable(iframe_Lnk).click();
        return new IframePage(uiDriver);
    }
}
