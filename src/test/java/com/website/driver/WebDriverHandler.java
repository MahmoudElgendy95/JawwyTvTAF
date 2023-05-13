package com.website.driver;

import com.website.utilities.ConfigProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.io.IOException;

public class WebDriverHandler {

    private static WebDriver webDriver;

    private static String browserConfigPath = "./resources/config/configBrowser.properties";
    private String driverType = "drivertype";

    public WebDriverHandler() throws IOException {
        getDriverType();
    }

    private void getDriverType() throws IOException {
        ConfigProperties configBrowser = new ConfigProperties(browserConfigPath);
        driverType = configBrowser.getProperty(driverType);

        switch (driverType) {
            case "chromedriver":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("start-maximized"); // open Browser in maximized mode
                chromeOptions.addArguments("disable-infobars"); // disabling infobars
                chromeOptions.addArguments("--disable-extensions"); // disabling extensions
                chromeOptions.addArguments("--remote-allow-origins=*"); 
                chromeOptions.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
                chromeOptions.addArguments("--no-sandbox"); // Bypass OS security model

                webDriver = WebDriverManager.chromedriver().capabilities(chromeOptions).create();
                webDriver.manage().window().maximize();
                break;

            case "safaridriver":
                WebDriverManager.safaridriver().setup();
                webDriver = new SafariDriver();
                webDriver.manage().window().maximize();
                break;
        }

    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public void navigateTo(String link) {
        webDriver.navigate().to(link);
    }

    public void resetCache() {
        webDriver.manage().deleteAllCookies();
    }

    public static void close() {
        webDriver.quit();
    }

}
