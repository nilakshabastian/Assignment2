package com.zone24x7.test;

import com.zone24x7.base.BaseTest;
import com.zone24x7.pages.DropDownPage;
import com.zone24x7.pages.HomePage;
import org.testng.annotations.Test;

public class TestOne extends BaseTest {

    HomePage homePage;
    DropDownPage dropDownPage;

    @Test
    public void TestClientSideDelay() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.loadingBannerCheck();
        dropDownPage = homePage.clickOnDropDownLink();
        dropDownPage.loadingBannerCheck();
        dropDownPage.selectDropdownByValue("Option 2");
        Thread.sleep(5000);
    }
}
