package com.website.JawweyTV.tests;

import com.website.BaseTest.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class stepDefs extends BaseTest {

    @When("website is opened and user need it to be in language {string}")
    public void websiteIsOpenedAndUserNeedItToBeInLanguage(String preferredLanguage) {
        if(preferredLanguage.equals("en"))
            browser.jawwyTV.home.clickOnLanguageButton();
    }

    @When("click on country button")
    public void clickOnCountryButton() {
        browser.jawwyTV.home.clickOnCountryButton();
    }

    @When("select {string} from countries list")
    public void selectFromCountriesList(String country) {
        browser.jawwyTV.home.clickOnCountryIcon(countries.getProperty(country));

    }

    @Then("offer banner should be displayed")
    public void offerBannerShouldBeDisplayed() {
        Assert.assertTrue(browser.jawwyTV.home.getOfferBanner().isDisplayed());
    }

    @Then("offer currency should be in {string}")
    public void offerCurrencyShouldBeIn(String currency) {

        Assert.assertTrue(browser.jawwyTV.home.getOfferCurrency().getText().contains(currency));

    }

    @Then("the lite plan and its button should be displayed")
    public void theLitePlanAndItsButtonShouldBeDisplayed() {
        Assert.assertTrue(browser.jawwyTV.home.getLitePlanTitle().isDisplayed());
        Assert.assertTrue(browser.jawwyTV.home.getLitePlanButton().isDisplayed());
        
    }

    @Then("classic plan and its button should be displayed")
    public void classicPlanAndItsButtonShouldBeDisplayed() {
        Assert.assertTrue(browser.jawwyTV.home.getClassicPlanTitle().isDisplayed());
        Assert.assertTrue(browser.jawwyTV.home.getClassicPlanButton().isDisplayed());
        
    }

    @Then("premium plan and its button should be displayed")
    public void premiumPlanAndItsButtonShouldBeDisplayed() {
        Assert.assertTrue(browser.jawwyTV.home.getPremiumPlanTitle().isDisplayed());
        Assert.assertTrue(browser.jawwyTV.home.getPremiumPlanButton().isDisplayed());
    }

    @When("click on lite plan button")
    public void clickOnLitePlanButton() {
        browser.jawwyTV.checkout = browser.jawwyTV.home.clickOnLitePlanButton();
    }

    @When("click on classic plan button")
    public void clickOnClassicPlanButton() {
        browser.jawwyTV.checkout = browser.jawwyTV.home.clickOnClassicPlanButton();
    }

    @When("click on premium plan button")
    public void clickOnPremiumPlanButton() throws InterruptedException {
        Thread.sleep(3000);
        browser.jawwyTV.checkout = browser.jawwyTV.home.clickOnPremiumPlanButton();
    }

    @Then("Total amount in checkout page should be zero")
    public void totalAmountInCheckoutPageShouldBeZero() {
        Assert.assertTrue(browser.jawwyTV.checkout.getTotalAmountValue().getText().contains("0.0"));
    }

    @Then("checkout page should be displayed")
    public void checkoutPageShouldBeDisplayed() {
        Assert.assertTrue(browser.jawwyTV.checkout.getPaymentMethodsHeader().isDisplayed());
    }
}

