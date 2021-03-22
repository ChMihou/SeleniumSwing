package com.selenium.typeOffer;

import com.selenium.pojo.Offer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class typeOfferFR {
    public static void UniversalType1(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ById("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("terms")).click();
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("register")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ById("fieldcardowner")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ById("fieldcbnumber")).sendKeys(offer.getCardNumber());
            webDriver.findElement(new By.ById("fieldvaliditymonth")).click();
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ById("fieldvaliditymonth")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ById("fieldvaliditymonth")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ById("fieldvalidityyear")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ById("fieldcvv")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ById("fieldcvv")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ById("fieldcvv")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("formvalidate")).click();
            Thread.sleep(50000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType2(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("zipcode")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-lg btn-success btn-block text-uppercase btnsubmit ']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cardNumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByName("expires_year")).sendKeys(offer.getYear().substring(2));
            webDriver.findElement(new By.ByName("zip")).sendKeys(offer.getPostcode());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("csc")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("csc")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("csc")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-success btn-lg  btn-block']")).click();
            Thread.sleep(18000);
            Thread.sleep(18000);
            Thread.sleep(18000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }
}
