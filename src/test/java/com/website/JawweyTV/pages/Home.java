package com.website.JawweyTV.pages;

import com.website.BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Home extends BasePage {

    private final By languageButton = By.id("translation-btn");

    private final By countryButton = By.id("country-btn");

    private final By offerBanner = By.cssSelector(".giftcard.small.trial-card");

    private final By offerCurrency = By.className("trial-cost");

    private final By  litePlanTitle = By.id("name-lite");

    private final By classicPlanTitle = By.id("name-classic");

    private final By premiumPlanTitle = By.id("name-premium");

    private final By litePlanButton = By.id("lite-selection");

    private final By classicPlanButton = By.id("classic-selection");

    private final By premiumPlanButton = By.id("premium-selection");

    private By formCountryLocator(String country){return By.xpath("//span[contains(text(),'"+country+"')]");}


    public WebElement getOfferBanner(){return findElement(offerBanner);}

    public WebElement getOfferCurrency(){return findElement(offerCurrency);}

    public WebElement getLanguageButton(){return findElement(languageButton);}

    public WebElement getLitePlanTitle(){return findElement(litePlanTitle);}

    public WebElement getClassicPlanTitle(){return findElement(classicPlanTitle);}

    public WebElement getPremiumPlanTitle(){return findElement(premiumPlanTitle);}

    public WebElement getLitePlanButton(){return findElement(litePlanButton);}

    public WebElement getClassicPlanButton(){return findElement(classicPlanButton);}

    public WebElement getPremiumPlanButton(){return findElement(premiumPlanButton);}

    public void clickOnCountryButton(){findElement(countryButton).click();}

    public void clickOnLanguageButton(){findElement(languageButton).click();}

    public void clickOnCountryIcon(String country) {findElement(formCountryLocator(country)).click();}

    public CheckOut clickOnLitePlanButton(){
        findElement(litePlanButton).click();
        return new CheckOut();
    }

    public CheckOut clickOnClassicPlanButton(){
        findElement(classicPlanButton).click();
        return new CheckOut();
    }

    public CheckOut clickOnPremiumPlanButton(){
        findElement(premiumPlanButton);
        return new CheckOut();
    }




}