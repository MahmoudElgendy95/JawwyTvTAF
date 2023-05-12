package com.website.browser;

import com.website.JawweyTV.jawwyWebsite;
import com.website.driver.WebDriverHandler;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class Browser {

    private final WebDriver webDriver = WebDriverHandler.getWebDriver();

    public jawwyWebsite jawwyTV;

    public Browser() {
        jawwyTV = new jawwyWebsite();
    }

    public void sendLink(String link) {
        webDriver.get(link);
    }

    public void swipeTo(WebElement targetElement) {
        Actions action = new Actions(webDriver);
        action.dragAndDropBy(targetElement, 200, 0).build().perform();
    }

    public int getXCoordinate(WebElement element){
        Point elementPoint = element.getLocation();
        return elementPoint.getX();
    }

    public String getCurrentUrl(){
        return  webDriver.getCurrentUrl();
    }

    public void clickOnElementToOpenInNewTab(WebElement element){
        String clickArgument = Keys.chord(Keys.CONTROL,Keys.ENTER);
        element.sendKeys(clickArgument);
    }

    public String getCurrentHandle(){return webDriver.getWindowHandle();}

    public void switchToNewTab(String currentHandle)
    {
        Set<String> handles = webDriver.getWindowHandles();
        for (String handle:handles) {
            if(!handle.equalsIgnoreCase(currentHandle)){webDriver.switchTo().window(handle);}
        }
    }

    public void takeScreenShot() throws IOException {
        TakesScreenshot scrShot =((TakesScreenshot)webDriver);
        File sourceFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("D:\\mahmoud nabil\\Data\\automation\\eShopFramework\\Website-Framework\\resources\\screenshots");
        FileUtils.copyFileToDirectory(sourceFile, destinationFile);
    }
}
