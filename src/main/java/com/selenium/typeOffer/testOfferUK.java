package com.selenium.typeOffer;

import com.selenium.pojo.Offer;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class testOfferUK {
    public static void typeOffer143094(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("First_Name")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("Last_Name")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("Email_Address")).sendKeys(offer.getEmail());
            WebElement element = webDriver.findElement(new By.ByXPath("//input[@class='custom-control-input']"));
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            js.executeScript("arguments[0].click();", element);
            Thread.sleep(3000);
            webDriver.findElement(new By.ByName("apply")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cardholder")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber().substring(1));
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("cardendm")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ByName("cardendm")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ByName("cardendy")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cvv")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cvv")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cvv")).sendKeys(offer.getCvv());
            }
            Thread.sleep(3000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-pay-submit']")).click();
            Thread.sleep(50000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }
}
