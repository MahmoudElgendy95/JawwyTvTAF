package com.website.BasePage;

import com.website.driver.WebDriverHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    public boolean elementIsDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void scrollTo(WebElement element) {
        Actions actionProvider = new Actions(WebDriverHandler.getWebDriver());
        final int xOffset = 300;
        final int yOffset = 0;
        do {
            if (elementIsDisplayed(element)) {
                actionProvider.moveToElement(element, xOffset, yOffset);
                actionProvider.perform();
                break;
            }
            actionProvider.sendKeys(Keys.ARROW_DOWN).build().perform();
        }
        while (true);
    }

    public static void waitUntilPageIsLoaded() {
        WebDriverWait wait = new WebDriverWait(WebDriverHandler.getWebDriver(), Duration.ofSeconds(30));
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public  void waitUntilElementIsClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(WebDriverHandler.getWebDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public WebElement findElement(By locator){
        WebDriverWait wait = new WebDriverWait(WebDriverHandler.getWebDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

        return WebDriverHandler.getWebDriver().findElement(locator);
    }
}
