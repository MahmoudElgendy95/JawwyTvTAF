package com.website.StcTV.tests;

import com.website.BaseTest.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class stepDefs extends BaseTest {

    @When("website is opened and user need it to be in language {string}")
    public void websiteIsOpenedAndUserNeedItToBeInLanguage(String preferredLanguage) {
        if(preferredLanguage.equals("en"))
            browser.stcTV.home.clickOnLanguageButton();
    }

    @When("click on country button")
    public void clickOnCountryButton() {
        browser.stcTV.home.clickOnCountryButton();
    }

    @When("select {string} from countries list")
    public void selectFromCountriesList(String country) {
        browser.stcTV.home.clickOnCountryIcon(countries.getProperty(country));

    }

    @Then("offer banner should be displayed")
    public void offerBannerShouldBeDisplayed() {
        Assert.assertTrue(browser.stcTV.home.getOfferBanner().isDisplayed());
    }

    @Then("offer currency should be in {string}")
    public void offerCurrencyShouldBeIn(String currency) {

        Assert.assertTrue(browser.stcTV.home.getOfferCurrency().getText().contains(currency));

    }

    @Then("the lite plan and its button should be displayed")
    public void theLitePlanAndItsButtonShouldBeDisplayed() {
        Assert.assertTrue(browser.stcTV.home.getLitePlanTitle().isDisplayed());
        Assert.assertTrue(browser.stcTV.home.getLitePlanButton().isDisplayed());
        
    }

    @Then("classic plan and its button should be displayed")
    public void classicPlanAndItsButtonShouldBeDisplayed() {
        Assert.assertTrue(browser.stcTV.home.getClassicPlanTitle().isDisplayed());
        Assert.assertTrue(browser.stcTV.home.getClassicPlanButton().isDisplayed());
        
    }

    @Then("premium plan and its button should be displayed")
    public void premiumPlanAndItsButtonShouldBeDisplayed() {
        Assert.assertTrue(browser.stcTV.home.getPremiumPlanTitle().isDisplayed());
        Assert.assertTrue(browser.stcTV.home.getPremiumPlanButton().isDisplayed());
    }

    @When("click on lite plan button")
    public void clickOnLitePlanButton() {
        browser.stcTV.checkout = browser.stcTV.home.clickOnLitePlanButton();
    }

    @When("click on classic plan button")
    public void clickOnClassicPlanButton() {
        browser.stcTV.checkout = browser.stcTV.home.clickOnClassicPlanButton();
    }

    @When("click on premium plan button")
    public void clickOnPremiumPlanButton()  {
        browser.stcTV.checkout = browser.stcTV.home.clickOnPremiumPlanButton();
    }

    @Then("Total amount in checkout page should be zero")
    public void totalAmountInCheckoutPageShouldBeZero() {
        Assert.assertTrue(browser.stcTV.checkout.getTotalAmountValue().getText().contains("0.0"));
    }

    @Then("checkout page should be displayed")
    public void checkoutPageShouldBeDisplayed() {
        Assert.assertTrue(browser.stcTV.checkout.getPaymentMethodsHeader().isDisplayed());
    }

    @Then("lite plan price should be in country local currency {string}")
    public void litePlanPriceShouldBeInCountryLocalCurrency(String currency) {
        Assert.assertTrue(browser.stcTV.home.getLitePriceCurrency().getText().contains(currency));
    }

    @Then("classic plan price should be in country local currency {string}")
    public void classicPlanPriceShouldBeInCountryLocalCurrency(String currency) {
        Assert.assertTrue(browser.stcTV.home.getClassicPriceCurrency().getText().contains(currency));
    }

    @Then("premium plan price should be in country local currency {string}")
    public void premiumPlanPriceShouldBeInCountryLocalCurrency(String currency) {
        Assert.assertTrue(browser.stcTV.home.getPremiumPriceCurrency().getText().contains(currency));
    }
}

