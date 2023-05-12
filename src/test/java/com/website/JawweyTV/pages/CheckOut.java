package com.website.JawweyTV.pages;

import com.website.BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckOut extends BasePage {

    private final By paymentMethodsHeader = By.className("payment-header");

    private final By TotalAmountValue = By.id("order-total-price");

    public WebElement getPaymentMethodsHeader(){return findElement(paymentMethodsHeader);}

    public WebElement getTotalAmountValue(){return findElement(TotalAmountValue);}

}
