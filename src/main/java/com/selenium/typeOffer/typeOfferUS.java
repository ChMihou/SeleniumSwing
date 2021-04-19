package com.selenium.typeOffer;

import com.selenium.pojo.Offer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class typeOfferUS {
    public static void UniversalType0(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-lg btn-success btn-block text-uppercase btnsubmit ']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cardNumber")).click();
            webDriver.findElement(new By.ByName("cardNumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByName("expires_year")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("csc")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("csc")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("csc")).sendKeys(offer.getCvv());
            }
            webDriver.findElement(new By.ByName("zip")).sendKeys(offer.getPostcode());
            Thread.sleep(3000);
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

    public static void UniversalType42(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn gradient radius btn-lg btn-success btn-block text-uppercase btnsubmit ']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cardNumber")).click();
            webDriver.findElement(new By.ByName("cardNumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByName("expires_year")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("csc")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("csc")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("csc")).sendKeys(offer.getCvv());
            }
            webDriver.findElement(new By.ByName("zip")).sendKeys(offer.getPostcode());
            Thread.sleep(3000);
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

    public static void UniversalType(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("address")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            if (offer.getPhone().startsWith("1")) {
                webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            } else {
                webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            }
            webDriver.findElement(new By.ByName("zipcode")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("state")).sendKeys(offer.getState());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-txt']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cc-cardnumber")).sendKeys(offer.getCardNumber());
            webDriver.findElement(new By.ByName("cc-expires-month")).click();
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByName("cc-expires-year")).sendKeys(offer.getYear().substring(2));
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cc-cvv2")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cc-cvv2")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cc-cvv2")).sendKeys(offer.getCvv());
            }
            webDriver.findElement(new By.ByName("terms")).click();
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='button gtw_default btn-txt']")).click();
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
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("cardexpiration")).sendKeys("0" + offer.getMonth() + offer.getYear());
            } else {
                webDriver.findElement(new By.ByName("cardexpiration")).sendKeys(offer.getMonth() + offer.getYear());
            }
            webDriver.findElement(new By.ByName("ccname")).sendKeys(offer.getName() + " " + offer.getLastName());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cardcvc")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cardcvc")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cardcvc")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-primary btn-block btn-lg formsubmit']")).click();
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

    public static void UniversalType3(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("msisdn")).click();
            if (offer.getPhone().startsWith("1")) {
                webDriver.findElement(new By.ByName("msisdn")).sendKeys(offer.getPhone());
            } else {
                webDriver.findElement(new By.ByName("msisdn")).sendKeys(offer.getPhone());
            }
            webDriver.findElement(new By.ByName("postal")).click();
            webDriver.findElement(new By.ByName("postal")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("email")).click();
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("buttonEmailMsisdn")).click();
            Thread.sleep(6000);
            webDriver.findElement(new By.ByName("cardnumber")).click();
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber());
            webDriver.findElement(new By.ByName("expirationdate")).click();
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("expirationdate")).sendKeys("0" + offer.getMonth() + offer.getYear().substring(2));
            } else {
                webDriver.findElement(new By.ByName("expirationdate")).sendKeys(offer.getMonth() + offer.getYear().substring(2));
            }
            webDriver.findElement(new By.ByName("cardname")).click();
            webDriver.findElement(new By.ByName("cardname")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ByName("securitycode")).click();
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("securitycode")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("securitycode")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("securitycode")).sendKeys(offer.getCvv());
            }
            Thread.sleep(3000);
            webDriver.findElement(new By.ById("buttonPaymentInfo")).click();
            Thread.sleep(90000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType4(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByXPath("//div[@id='firstName']/input")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByXPath("//div[@id='lastName']/input")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByXPath("//div[@id='phone']/input")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByXPath("//div[@id='email']/input")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByXPath("//div[@id='address1']/input")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByXPath("//div[@id='address2']/input")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByXPath("//div[@id='zip']/input")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByXPath("//div[@id='city']/input")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByXPath("//div[@id='state']/select")).sendKeys(offer.getState());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='master-button button pulse ']")).click();
            Thread.sleep(6000);
            webDriver.findElement(new By.ByXPath("//div[@id='cc']/input")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getYear().substring(2) + "']")).click();
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByXPath("//div[@id='cvv']/input")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByXPath("//div[@id='cvv']/input")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByXPath("//div[@id='cvv']/input")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='master-button button pulse ']")).click();
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
            webDriver.findElement(new By.ByName("creditCardNumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByName("expyear")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("CVV")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("CVV")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("CVV")).sendKeys(offer.getCvv());
            }
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

    public static void UniversalType6(WebDriver webDriver, Offer offer, List<Offer> offerList) throws InterruptedException {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("address")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("zipcodewithoutcountry")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("submit")).click();
            Thread.sleep(3000);
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("monthexpiredate")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ByName("monthexpiredate")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ByName("yearexpiredate")).sendKeys(offer.getYear().substring(2));
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("security")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("security")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("security")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            try {
                webDriver.findElement(new By.ByXPath("//input[@class='btn btn-primary']")).click();
            } catch (Exception e) {
                webDriver.findElement(new By.ById("submit")).click();
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(18000);
            Thread.sleep(18000);
            Thread.sleep(18000);
            offerList.add(offer);
            webDriver.quit();
        }
    }

    public static void UniversalType7(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("address")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("zipcodewithoutcountry")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("username")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("password")).sendKeys(offer.getPhone());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-warning btn-block']")).click();
            Thread.sleep(10000);
            webDriver.findElement(new By.ByName("cardholder")).clear();
            webDriver.findElement(new By.ByName("cardholder")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("monthexpiredate")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ByName("monthexpiredate")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ByName("yearexpiredate")).sendKeys(offer.getYear().substring(2));
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("security")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("security")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("security")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//input[@class='btn btn-primary']")).click();
            Thread.sleep(60000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType8(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("address")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("zip")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("state")).sendKeys(offer.getState());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='s-btn']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("billing-cc-number")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("billing-cc-exp")).sendKeys("0" + offer.getMonth() + offer.getYear().substring(2));
            } else {
                webDriver.findElement(new By.ByName("billing-cc-exp")).sendKeys(offer.getMonth() + offer.getYear().substring(2));
            }
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cvv")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cvv")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cvv")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//input[@class='btn sb-btn']")).click();
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

    public static void UniversalType9(WebDriver webDriver, Offer offer, List<Offer> offerList) throws InterruptedException {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='claim submit-button submit-button--emailandaddress']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cardholder")).clear();
            webDriver.findElement(new By.ByName("cardholder")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("monthexpiredate")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ByName("monthexpiredate")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ByName("yearexpiredate")).sendKeys(offer.getYear().substring(2));
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("security")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("security")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("security")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            try {
                webDriver.findElement(new By.ByXPath("//input[@class='btn btn-primary']")).click();
            } catch (Exception e) {
                webDriver.findElement(new By.ById("pay-cc")).click();
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(18000);
            Thread.sleep(18000);
            Thread.sleep(18000);
            offerList.add(offer);
            webDriver.quit();
        }
    }

    public static void UniversalType10(WebDriver webDriver, Offer offer, List<Offer> offerList) throws InterruptedException {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-lg btn-success btn-block text-uppercase btnsubmit']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cardholder")).clear();
            webDriver.findElement(new By.ByName("cardholder")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("monthexpiredate")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ByName("monthexpiredate")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ByName("yearexpiredate")).sendKeys(offer.getYear().substring(2));
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("security")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("security")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("security")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            try {
                webDriver.findElement(new By.ByXPath("//input[@class='btn btn-primary']")).click();
            } catch (Exception e) {
                webDriver.findElement(new By.ById("pay-cc")).click();
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(18000);
            Thread.sleep(18000);
            Thread.sleep(18000);
            offerList.add(offer);
            webDriver.quit();
        }
    }

    public static void UniversalType11(WebDriver webDriver, Offer offer, List<Offer> offerList) throws InterruptedException {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//input[@class='btn btn-primary']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cardholder")).clear();
            webDriver.findElement(new By.ByName("cardholder")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("monthexpiredate")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ByName("monthexpiredate")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ByName("yearexpiredate")).sendKeys(offer.getYear().substring(2));
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("security")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("security")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("security")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            try {
                webDriver.findElement(new By.ByXPath("//input[@class='btn btn-primary']")).click();
            } catch (Exception e) {
                webDriver.findElement(new By.ById("pay-cc")).click();
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(18000);
            Thread.sleep(18000);
            Thread.sleep(18000);
            offerList.add(offer);
            webDriver.quit();
        }
    }

    public static void UniversalType12(WebDriver webDriver, Offer offer, List<Offer> offerList) {
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
            webDriver.findElement(new By.ByXPath("//button[@class='button button-primary button-shadow button-block btn-txt']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cc-cardnumber")).sendKeys(offer.getCardNumber());
            webDriver.findElement(new By.ByName("cc-expires-month")).click();
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByName("cc-expires-year")).sendKeys(offer.getYear().substring(2));
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cc-cvv2")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cc-cvv2")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cc-cvv2")).sendKeys(offer.getCvv());
            }
            webDriver.findElement(new By.ByName("terms")).click();
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='button gtw_default btn-txt']")).click();
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

    public static void UniversalType13(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ById("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ById("age")).click();
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("submit-btn")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ById("cardOwner")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ById("cardNumber")).sendKeys(offer.getCardNumber());
            webDriver.findElement(new By.ById("cardMonthExpiration")).click();
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ById("cardMonthExpiration")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ById("cardMonthExpiration")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ById("cardYearExpiration")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ById("cvv")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ById("cvv")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ById("cvv")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("pay-btn")).click();
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

    public static void UniversalType14(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("username")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("password")).sendKeys(offer.getName() + offer.getLastName());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='button-1 Classname']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("password")).sendKeys(offer.getName() + offer.getLastName());
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("surname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("ccn")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getYear().substring(2) + "']")).click();
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cvv")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cvv")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cvv")).sendKeys(offer.getCvv());
            }
            Thread.sleep(3000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn--block']")).click();
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

    public static void UniversalType15(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstName")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastName")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("address1")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("phoneNumber")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("zip")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("state")).sendKeys(offer.getState());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-custom btn-lg btn-block animated infinite pulse']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cardNumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getYear().substring(2) + "']")).click();
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cardSecurityCode")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cardSecurityCode")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cardSecurityCode")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-checkout btn-custom btn-lg btn-block animated infinite pulse']")).click();
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

    public static void UniversalType1(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("username")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("password")).sendKeys(offer.getName() + offer.getLastName());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='button btn-txt']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("data[User][firstname]")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("data[User][lastname]")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("data[User][zip]")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("data[User][country]")).sendKeys("United States of America");
            webDriver.findElement(new By.ByName("data[User][cc]")).click();
            webDriver.findElement(new By.ByName("data[User][cc]")).sendKeys("" + offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("data[User][expirationMonth]")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ByName("data[User][expirationMonth]")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ByName("data[User][expirationYear]")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("data[User][cvv]")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("data[User][cvv]")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("data[User][cvv]")).sendKeys(offer.getCvv());
            }
            webDriver.findElement(new By.ByXPath("//div[@class='certify']/input")).click();
            Thread.sleep(3000);
            webDriver.findElement(new By.ById("btnCheckoutSubmit")).click();
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

    public static void UniversalType16(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            Random random = new Random();
            int i = random.nextInt(2);
            webDriver.findElement(new By.ById("registration_affiliate_form_billing_first_name")).sendKeys(offer.getName());
            webDriver.findElement(new By.ById("registration_affiliate_form_billing_last_name")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ById("registration_affiliate_form_address")).sendKeys(offer.getAddress());
            if (i > 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "man" + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "woman" + "']")).click();
            }
            webDriver.findElement(new By.ById("registration_affiliate_form_city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ById("registration_affiliate_form_phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ById("registration_affiliate_form_billing_zip")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ById("registration_affiliate_form_email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ById("registration_affiliate_form_state")).sendKeys(offer.getState());
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("registration_affiliate_form_register")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ById("registration_affiliate_form_billing_card_number")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ById("registration_affiliate_form_billing_expiry_month")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ById("registration_affiliate_form_billing_expiry_month")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ById("registration_affiliate_form_billing_expiry_year")).sendKeys(offer.getMonth());
            webDriver.findElement(new By.ById("registration_affiliate_form_billing_expiry_year")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ById("registration_affiliate_form_billing_cvv")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ById("registration_affiliate_form_billing_cvv")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ById("registration_affiliate_form_billing_cvv")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("registration_affiliate_form_register")).click();
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

    public static void UniversalType17(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByXPath("//a[@class='homeBtn']")).click();
            Thread.sleep(3000);
            webDriver.findElement(new By.ById("fields_email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ById("fields_fname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ById("fields_lname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ById("fields_address1")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ById("fields_city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ById("fields_zip")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ById("fields_state")).sendKeys(offer.getState());
            webDriver.findElement(new By.ByName("offers")).click();
            webDriver.findElement(new By.ById("billingFirstName")).sendKeys(offer.getName());
            webDriver.findElement(new By.ById("billingLastName")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ById("billingAddress1")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ById("billingCity")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ById("billingZip")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ById("billingState")).sendKeys(offer.getState());
            webDriver.findElement(new By.ById("fields_phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ById("cc_number")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ById("fields_expyear")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ById("cc_cvv")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ById("cc_cvv")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ById("cc_cvv")).sendKeys(offer.getCvv());
            }
            webDriver.findElement(new By.ByName("emag_subscription")).click();
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='frm-submit submit-btn']")).click();
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

    public static void UniversalType29(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("firstName")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastName")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("shippingCity")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("shippingAddress1")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("shippingZip")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("shippingState")).sendKeys(offer.getState());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("creditCardNumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByName("expyear")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("CVV")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("CVV")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("CVV")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("submit-button-order")).click();
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

    public static void UniversalType18(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("first_name")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("last_name")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("phone_number")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("zip")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("payButton")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByXPath("//a[@class='btn-arrow']")).click();
            webDriver.findElement(new By.ByName("cardnumber")).click();
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("exp-date")).sendKeys("0" + offer.getMonth() + offer.getYear().substring(2));
            } else {
                webDriver.findElement(new By.ByName("exp-date")).sendKeys(offer.getMonth() + offer.getYear().substring(2));
            }
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cvc")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cvc")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cvc")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-continue bounce']")).click();
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

    public static void UniversalType19(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("ship-first-name")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("ship-last-name")).sendKeys(offer.getLastName());
            if (offer.getPhone().startsWith("1")) {
                webDriver.findElement(new By.ByName("ship-phone")).sendKeys(offer.getPhone());
            } else {
                webDriver.findElement(new By.ByName("ship-phone")).sendKeys(offer.getPhone());
            }
            webDriver.findElement(new By.ByName("ship-email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("ship-address")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("ship-city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("ship-zip-code")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("ship-state")).sendKeys(offer.getState());
            Actions build = new Actions(webDriver);
            WebElement element = webDriver.findElement(new By.ByName("ship-check-terms"));
            build.moveToElement(element).moveByOffset(6, 0).click().build().perform();
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("ship-form-button")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("bill-card-number")).click();
            webDriver.findElement(new By.ByName("bill-card-number")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getYear().substring(2) + "']")).click();
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("bill-cvv")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("bill-cvv")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("bill-cvv")).sendKeys(offer.getCvv());
            }
            webDriver.findElement(new By.ByName("bill-full-name")).sendKeys(offer.getName() + " " + offer.getLastName());
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("bill-form-button")).click();
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

    public static void UniversalType20(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            Random random = new Random();
            int i = random.nextInt(2);
            webDriver.findElement(new By.ByXPath("//select[@id='registration_affiliate_form_gender']")).click();
            if (i > 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='man']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='woman']")).click();
            }
            webDriver.findElement(new By.ById("registration_affiliate_form_phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ById("registration_affiliate_form_email")).sendKeys(offer.getEmail());
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("registration_affiliate_form_register")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ById("registration_affiliate_form_billing_card_number")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ById("registration_affiliate_form_billing_expiry_month")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ById("registration_affiliate_form_billing_expiry_month")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ById("registration_affiliate_form_billing_expiry_year")).sendKeys(offer.getMonth());
            webDriver.findElement(new By.ById("registration_affiliate_form_billing_expiry_year")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ById("registration_affiliate_form_billing_cvv")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ById("registration_affiliate_form_billing_cvv")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ById("registration_affiliate_form_billing_cvv")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("registration_affiliate_form_register")).click();
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

    public static void UniversalType37(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("password")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("username")).sendKeys(offer.getEmail());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='button-1 Classname']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("ccname")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ByName("cardnumber")).click();
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ById("frmCCExp")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ById("frmCCExp")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ById("year")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cvc")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cvc")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cvc")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='ng-binding']")).click();
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

    public static void UniversalType21(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("data[User][email]")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("data[Customer][shipping_phone_number]")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("data[Customer][shipping_city]")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("data[Customer][shipping_firstname]")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("data[Customer][shipping_lastname]")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("data[Customer][shipping_address]")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("data[Customer][shipping_postal_code]")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("data[Customer][shipping_state_id]")).sendKeys(offer.getState());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-custom btn-primary btn-lg btn-block animated infinite pulse']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("data[CreditCard][cc_number]")).sendKeys(offer.getCardNumber());
            webDriver.findElement(new By.ByName("data[CreditCard][cc_exp_mo]")).click();
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByName("data[CreditCard][cc_exp_yr]")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("data[CreditCard][cc_cvv]")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("data[CreditCard][cc_cvv]")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("data[CreditCard][cc_cvv]")).sendKeys(offer.getCvv());
            }
            webDriver.findElement(new By.ById("checkTerms")).click();
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//div[@class='bigBtnTxt']")).click();
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

    public static void UniversalType28(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ById("ship-first-name")).sendKeys(offer.getName());
            webDriver.findElement(new By.ById("ship-last-name")).sendKeys(offer.getLastName());
            if (offer.getPhone().startsWith("1")) {
                webDriver.findElement(new By.ById("ship-phone")).sendKeys(offer.getPhone());
            } else {
                webDriver.findElement(new By.ById("ship-phone")).sendKeys(offer.getPhone());
            }
            webDriver.findElement(new By.ById("ship-email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ById("ship-address")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ById("ship-city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ById("ship-zip-code")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ById("ship-state")).sendKeys(offer.getState());
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("ship-form-button")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("Apidata[cardnum]")).click();
            webDriver.findElement(new By.ByName("Apidata[cardnum]")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getYear() + "']")).click();
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("Apidata[cvv]")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("Apidata[cvv]")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("Apidata[cvv]")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("bill-form-button")).click();
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

    public static void UniversalType22(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("Email_Address")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("Phone_Number")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("First_Name")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("Last_Name")).sendKeys(offer.getLastName());
            Actions build = new Actions(webDriver);
            WebElement element = webDriver.findElement(new By.ByName("terms"));
            build.moveToElement(element).moveByOffset(7, 9).click().build().perform();
            Thread.sleep(2000);
            webDriver.findElement(new By.ByName("apply")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cardholder")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber());
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
            Thread.sleep(38800);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType23(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByName("submit")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cardholder")).clear();
            webDriver.findElement(new By.ByName("cardholder")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("monthexpiredate")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ByName("monthexpiredate")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ByName("yearexpiredate")).sendKeys(offer.getYear().substring(2));
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("security")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("security")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("security")).sendKeys(offer.getCvv());
            }
            Thread.sleep(3000);
            webDriver.findElement(new By.ById("pay-cc")).click();
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

    public static void UniversalType24(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("firstName")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastName")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("address1")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("zip")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("state")).sendKeys(offer.getState());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-custom btn-primary btn-lg btn-block animated infinite pulse']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cardNumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByName("cardYear")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cardSecurityCode")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cardSecurityCode")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cardSecurityCode")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//input[@class='btn sb-btn']")).click();
            Thread.sleep(18000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType25(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByXPath("//div[@class='button scrollButton']")).click();
            Thread.sleep(5000);
            if (offer.getPhone().startsWith("1")) {
                webDriver.findElement(new By.ByName("tel")).sendKeys(offer.getPhone());
            } else {
                webDriver.findElement(new By.ByName("tel")).sendKeys(offer.getPhone());
            }
            webDriver.findElement(new By.ByName("zip")).click();
            webDriver.findElement(new By.ByName("zip")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("email")).click();
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("buttonEmailMsisdn")).click();
            Thread.sleep(6000);
            webDriver.findElement(new By.ByName("cc-name")).click();
            webDriver.findElement(new By.ByName("cc-name")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ByName("cc-number")).sendKeys(offer.getCardNumber());
            webDriver.findElement(new By.ByName("cc-exp")).click();
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("cc-exp")).sendKeys("0" + offer.getMonth() + offer.getYear().substring(2));
            } else {
                webDriver.findElement(new By.ByName("cc-exp")).sendKeys(offer.getMonth() + offer.getYear().substring(2));
            }
            webDriver.findElement(new By.ByName("cc-csc")).click();
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cc-csc")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cc-csc")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cc-csc")).sendKeys(offer.getCvv());
            }
            Thread.sleep(3000);
            webDriver.findElement(new By.ById("buttonPaymentInfo")).click();
            Thread.sleep(90000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType26(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("username")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("password")).sendKeys(offer.getName() + offer.getLastName());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='registration__submit btn btn--cta btn--cta--plus btn--cta--arrow col-12 sm-right']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("zipcode")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("creditcard")).click();
            webDriver.findElement(new By.ByName("creditcard")).sendKeys("" + offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("month")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ByName("month")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ByName("year")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cvv")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cvv")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cvv")).sendKeys(offer.getCvv());
            }
            Thread.sleep(3000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn--cta btn--cta--plus btn--cta--lock col-12 mx-auto mxw-20']")).click();
            Thread.sleep(18000);
            Thread.sleep(18000);
            Thread.sleep(10000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType27(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("address")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("zipcodewithoutcountry")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByName("submit")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cardholder")).clear();
            webDriver.findElement(new By.ByName("cardholder")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber());
            webDriver.findElement(new By.ByName("monthexpiredate")).click();
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByName("yearexpiredate")).sendKeys(offer.getYear().substring(2));
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("security")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("security")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("security")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByName("submit")).click();
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

    public static void UniversalType30(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ById("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ById("age")).click();
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='button-1']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ById("cardNumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ById("cardMonthExpiration")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ById("cardMonthExpiration")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ById("cardYearExpiration")).sendKeys(offer.getYear());
            webDriver.findElement(new By.ById("cardOwner")).sendKeys(offer.getName() + " " + offer.getLastName());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ById("cvv")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ById("cvv")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ById("cvv")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("pay-btn")).click();
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

    public static void UniversalType31(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByXPath("//button[@class='form-open ng-binding']")).click();
            Thread.sleep(3000);
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("password")).sendKeys(offer.getName() + offer.getLastName());
            Actions build = new Actions(webDriver);
            WebElement element = webDriver.findElement(new By.ByXPath("//button[@type='submit']"));
            build.moveToElement(element).moveByOffset(194, 17).click().build().perform();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ById("frmCCExp")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ById("frmCCExp")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ById("year")).sendKeys(offer.getYear());
            webDriver.findElement(new By.ByName("ccname")).sendKeys(offer.getName() + " " + offer.getLastName());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cardcvc")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cardcvc")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cardcvc")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='ng-binding']")).click();
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

    public static void UniversalType32(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByXPath("//a[@class='hero__btn i_do_btn']")).click();
            Thread.sleep(2000);
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("password")).sendKeys(offer.getName() + offer.getLastName());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn is-block form__btn']")).click();
            Thread.sleep(2000);
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("surname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("ccn")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getYear().substring(2) + "']")).click();
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cvv")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cvv")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cvv")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn is-block form__btn']")).click();
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

    public static void UniversalType33(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("password")).sendKeys(offer.getName() + offer.getLastName());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//input[@class='btn-lg']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("first_name")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("last_name")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("zip")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("address1")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("card_number")).click();
            webDriver.findElement(new By.ByName("card_number")).sendKeys("" + offer.getCardNumber());
            webDriver.findElement(new By.ByName("card_month")).sendKeys(offer.getMonth());
            webDriver.findElement(new By.ByName("card_year")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("card_cvv")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("card_cvv")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("card_cvv")).sendKeys(offer.getCvv());
            }
            Thread.sleep(3000);
            webDriver.findElement(new By.ByXPath("//button[@class='green-btn btn-lg text-uppercase']")).click();
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

    public static void UniversalType34(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("zipcode")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-lg btn-success btn-block text-uppercase btnsubmit ']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cardNumber")).click();
            webDriver.findElement(new By.ByName("cardNumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByName("expires_year")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("csc")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("csc")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("csc")).sendKeys(offer.getCvv());
            }
            webDriver.findElement(new By.ByName("zip")).sendKeys(offer.getPostcode());
            Thread.sleep(3000);
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

    public static void UniversalType35(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByXPath("//a[@class='call']")).click();
            Thread.sleep(2000);
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("firstName")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastName")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("address1")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("zip")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("state")).sendKeys(offer.getState());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("cardNumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByName("cardYear")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cardSecurityCode")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cardSecurityCode")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cardSecurityCode")).sendKeys(offer.getCvv());
            }
            webDriver.findElement(new By.ById("i2x582")).click();
            webDriver.findElement(new By.ById("bump_offer_2521386")).click();
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//input[@class='img-responsive']")).click();
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

    public static void UniversalType36(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("first_name")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("last_name")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("password")).sendKeys(offer.getName() + offer.getLastName());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("continuar")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("card_holder")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ById("s_cd_number")).click();
            webDriver.findElement(new By.ById("s_cd_number")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("card_exp_month")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ByName("card_exp_month")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ByName("card_exp_year")).sendKeys(offer.getYear().substring(2));
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cvv")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cvv")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cvv")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-lg btn-block continuar ']")).click();
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

    public static void UniversalType38(WebDriver webDriver, Offer offer, List<Offer> offerList) throws InterruptedException {
        try {
            webDriver.findElement(new By.ById("fields_fname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ById("fields_lname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ById("fields_email")).sendKeys(offer.getEmail());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-lg btn-success btn-block text-uppercase btnsubmit ']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ById("fields_phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ById("fields_address1")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ById("fields_city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ById("fields_state")).sendKeys(offer.getState());
            webDriver.findElement(new By.ById("fields_zip")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ById("cc_number")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ById("cc_expyear")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ById("cc_cvv")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ById("cc_cvv")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ById("cc_cvv")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='orderbutton order_btn']")).click();
            Thread.sleep(18000);
            Thread.sleep(18000);
            Thread.sleep(18000);
            offerList.add(offer);
            webDriver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType39(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("fields_email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("fields_phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("fields_city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("fields_fname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("fields_lname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("fields_address1")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("fields_zip")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("fields_state")).sendKeys(offer.getState());
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("ship-form-button")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cc_number")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ById("cc_expyear")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cc_cvv")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cc_cvv")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cc_cvv")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("bill-form-button")).click();
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

    public static void UniversalType40(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("username")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("password")).sendKeys(offer.getName() + offer.getLastName());
            webDriver.findElement(new By.ByName("customer[terms]")).click();
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-success btn-lg btn-block disabled']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("ccname")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ByName("cardnumber")).click();
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ById("frmCCExp")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ById("frmCCExp")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ById("year")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cvc")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cvc")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cvc")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='ng-binding']")).click();
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

    public static void UniversalType41(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ByName("address")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("zip")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("state")).sendKeys(offer.getState());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-lg btn-success btn-block text-uppercase btnsubmit  ']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cc")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("expm")).sendKeys("0" + offer.getMonth() + offer.getYear().substring(2));
            } else {
                webDriver.findElement(new By.ByName("expm")).sendKeys(offer.getMonth() + offer.getYear().substring(2));
            }
            webDriver.findElement(new By.ByName("expy")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cvv")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cvv")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cvv")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-lg btn-success btn-block text-uppercase btnsubmit ']")).click();
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
