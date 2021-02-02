package com.selenium.typeOffer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.selenium.pojo.Offer;

import java.util.List;

public class typeOffer {
    public static void typeOffer142395(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("address")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("phonenumber")).sendKeys(offer.getRealPhone() + "");
            webDriver.findElement(new By.ByName("zipcode")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("terms")).click();
            Thread.sleep(3000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-success btn-lg btn-block submit1']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByXPath("//input[@class='IFRAME_STYLE_1']")).sendKeys(offer.getCardNumber());
            webDriver.findElement(new By.ByName("cardSecurityCode")).sendKeys(offer.getCvv());
            webDriver.findElement(new By.ByName("card.cvv")).sendKeys(offer.getCvv());
            webDriver.findElement(new By.ByXPath("//input[@class='wpwl-control wpwl-control-expiry form-control form-control-lg']")).sendKeys(offer.getMonth() + offer.getYear().substring(2));
            Thread.sleep(3000);
            webDriver.findElement(new By.ByXPath("//button[@class='wpwl-button wpwl-button-pay btn btn-lg btn-success btn-block']")).click();
            Thread.sleep(30000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("address")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("zipcode")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("state")).sendKeys(offer.getState());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-txt']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cc-cardnumber")).sendKeys(offer.getCardNumber().substring(1));
            webDriver.findElement(new By.ByName("cc-expires-month")).sendKeys(offer.getMonth());
            webDriver.findElement(new By.ByName("cc-expires-year")).sendKeys(offer.getYear().substring(2));
            webDriver.findElement(new By.ByName("cc-cvv2")).sendKeys(offer.getCvv());
            webDriver.findElement(new By.ByName("terms")).click();
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='button gtw_default btn-txt']")).click();
            Thread.sleep(20000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType2(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstName")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastName")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("address")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("postcode")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("repeatSelect")).sendKeys(offer.getState());
            webDriver.findElement(new By.ByXPath("//input[@class='form-check-input mb-3']")).click();
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-primary step1button']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber().substring(1));
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("cardexpiration")).sendKeys("0" + offer.getMonth() + offer.getYear());
            } else {
                webDriver.findElement(new By.ByName("cardexpiration")).sendKeys(offer.getMonth() + offer.getYear());
            }
            webDriver.findElement(new By.ByName("ccname")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ByName("cardcvc")).sendKeys(offer.getCvv());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-primary btn-block btn-lg formsubmit']")).click();
            Thread.sleep(30000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType3(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("msisdn")).sendKeys(offer.getPhone().substring(1));
            webDriver.findElement(new By.ByName("postal")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("buttonEmailMsisdn")).click();
            Thread.sleep(6000);
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber().substring(1));
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("expirationdate")).sendKeys("0" + offer.getMonth() + offer.getYear().substring(2));
            } else {
                webDriver.findElement(new By.ByName("expirationdate")).sendKeys(offer.getMonth() + offer.getYear().substring(2));
            }
            webDriver.findElement(new By.ByName("cardname")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ByName("securitycode")).sendKeys(offer.getCvv());
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("buttonPaymentInfo")).click();
            Thread.sleep(50000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType4(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ById("firstName")).sendKeys(offer.getName());
            webDriver.findElement(new By.ById("lastName")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ById("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ById("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ById("address1")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ById("address2")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ById("zip")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ById("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ById("state")).sendKeys(offer.getState());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='master-button button pulse ']")).click();
            Thread.sleep(6000);
            webDriver.findElement(new By.ById("cc")).sendKeys(offer.getCardNumber().substring(1));
            webDriver.findElement(new By.ById("expMonth")).click();
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ById("expYear")).sendKeys(offer.getYear());
            webDriver.findElement(new By.ById("cvv")).sendKeys(offer.getCvv());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='master-button button pulse']")).click();
            Thread.sleep(20000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType5(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstName")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastName")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//a[@class='button-1 Classname']")).click();
            Thread.sleep(6000);
            webDriver.findElement(new By.ByName("shippingAddress1")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("shippingState")).sendKeys(offer.getState());
            webDriver.findElement(new By.ByName("shippingCity")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("shippingZip")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("creditCardNumber")).click();
            webDriver.findElement(new By.ByName("creditCardNumber")).sendKeys(offer.getCardNumber().substring(1));
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByName("expyear")).sendKeys(offer.getYear());
            webDriver.findElement(new By.ByName("CVV")).sendKeys(offer.getCvv());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='button-1']")).click();
            Thread.sleep(20000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }


}
