package com.zone24x7.base;

import com.zone24x7.pages.IframePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class BasePage {

    public WebDriver uiDriver;
    public FluentWait<WebDriver> wait;

    public BasePage(WebDriver driver) {
        this.uiDriver = driver;
        this.wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
    }

    public void waitForElementToBeVisible(By locator) {
        this.wait.until(ExpectedConditions.visibilityOf(uiDriver.findElement(locator)));
    }

    public WebElement waitForElementToBeClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(uiDriver.findElement(locator)));
    }


}
