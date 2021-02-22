package com.selenium.typeOffer;

import org.openqa.selenium.*;
import com.selenium.pojo.Offer;

import java.util.List;

public class typeOfferUS {
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
            Thread.sleep(38800);
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
                webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone().substring(1));
            } else {
                webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            }
            webDriver.findElement(new By.ByName("zipcode")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("state")).sendKeys(offer.getState());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-txt']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cc-cardnumber")).sendKeys(offer.getCardNumber().substring(1));
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
            Thread.sleep(60000);
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
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cardcvc")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cardcvc")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cardcvc")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-primary btn-block btn-lg formsubmit']")).click();
            Thread.sleep(50000);
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
                webDriver.findElement(new By.ByName("msisdn")).sendKeys(offer.getPhone().substring(1));
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
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber().substring(1));
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
            webDriver.findElement(new By.ByXPath("//div[@id='cc']/input")).sendKeys(offer.getCardNumber().substring(1));
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
            Thread.sleep(38000);
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
            Thread.sleep(10000);
            webDriver.findElement(new By.ByName("cardholder")).clear();
            webDriver.findElement(new By.ByName("cardholder")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber().substring(1));
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
            Thread.sleep(50000);
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
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber().substring(1));
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
            webDriver.findElement(new By.ByName("billing-cc-number")).sendKeys(offer.getCardNumber().substring(1));
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
            Thread.sleep(50000);
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
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber().substring(1));
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
            Thread.sleep(50000);
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
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber().substring(1));
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
            Thread.sleep(50000);
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
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-lg btn-success btn-block text-uppercase btnsubmit']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cardholder")).clear();
            webDriver.findElement(new By.ByName("cardholder")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber().substring(1));
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
            Thread.sleep(50000);
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
            webDriver.findElement(new By.ByName("cc-cardnumber")).sendKeys(offer.getCardNumber().substring(1));
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
            Thread.sleep(50000);
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
            webDriver.findElement(new By.ById("cardNumber")).sendKeys(offer.getCardNumber().substring(1));
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
            Thread.sleep(50000);
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
            webDriver.findElement(new By.ByXPath("//button")).click();
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
            Thread.sleep(50000);
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
            webDriver.findElement(new By.ByName("cardNumber")).sendKeys(offer.getCardNumber().substring(1));
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
            Thread.sleep(38000);
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
            Thread.sleep(50000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }
}
