package com.zone24x7.steps;

import com.zone24x7.base.BaseTest;
import com.zone24x7.pages.HomePage;
import com.zone24x7.pages.IframePage;
import com.zone24x7.pages.JavaScriptAlertPage;
import com.zone24x7.utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertSteps {

        HomePage homePage;
        JavaScriptAlertPage javaScriptAlertPage;
        IframePage iframepage;
        WebDriver  driver;

       @Given("I navigate to The Internet Herokuapp")
        public void iNavigateToTheInternetHerokuapp() {
            driver= DriverFactory.getDriver();
            driver.get("https://the-internet.herokuapp.com/");
            homePage = new HomePage(driver);
        }

        @When("I go to the {string} page")
        public void iGoToThePage(String pageName) {
            if (pageName.equals("JavaScriptAlert")) {
                System.out.println(">>>>>>");
                javaScriptAlertPage = homePage.clickOnJavaScriptAlertLink();
            } else if (pageName.equals("iframe")) {

                System.out.println(">>>>>>");
                iframepage = homePage.clickOnIframeLink();
                
            }
        }


        @Then("I click the JS Alert button")
        public void iClickTheJSAlertButton() {
           //
        }

        @Then("I accept the alert popup")
        public void iAcceptTheAlertPopup() {
            //
        }


    @And("I click on the iFrame link")
    public void iClickOnTheIFrameLink() {
        //
    }

    @Then("I should see the message Your content goes here")
    public void iShouldSeeTheMessageYourContentGoesHere() {
           //
    }
}
