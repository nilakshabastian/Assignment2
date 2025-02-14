package com.zone24x7.pages;

import com.zone24x7.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IframePage extends BasePage {

    private final By iframe_link = By.xpath("//*[@id=\"content\"]/ul/li[22]/a");


            public IframePage(WebDriver uDriver){

              super(uDriver);
            }
}
