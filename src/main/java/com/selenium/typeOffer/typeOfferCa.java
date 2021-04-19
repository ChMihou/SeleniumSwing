package com.selenium.typeOffer;

import com.selenium.pojo.Offer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class typeOfferCa {
    public static void UniversalType1(WebDriver webDriver, Offer offer, List<Offer> offerList) {
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

    public static void UniversalType2(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("address")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("zipcode")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn-txt']")).click();
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

    public static void UniversalType3(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='button btn-txt firstStepBtn']")).click();
            Thread.sleep(3000);
            webDriver.findElement(new By.ByName("address")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("zipcode")).sendKeys(offer.getPostcode());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='button btn-txt']")).click();
            Thread.sleep(3000);
            webDriver.findElement(new By.ByName("number")).sendKeys(offer.getCardNumber());
            webDriver.findElement(new By.ByName("expiry")).click();
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("expiry")).sendKeys('0' + offer.getMonth() + offer.getYear().substring(2));
            } else {
                webDriver.findElement(new By.ByName("expiry")).sendKeys(offer.getMonth() + offer.getYear().substring(2));
            }
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cvcnew")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cvcnew")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cvcnew")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='button button-gtw gtw_default btn-txt']")).click();
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

    public static void UniversalType4(WebDriver webDriver, Offer offer, List<Offer> offerList) {
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

    public static void UniversalType5(WebDriver webDriver, Offer offer, List<Offer> offerList) {
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

    public static void UniversalType6(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("uname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("sname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("address")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("cityCustom")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("postalcode")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("submitBtn")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("ccNumber")).sendKeys(offer.getCardNumber());
            webDriver.findElement(new By.ByName("monthexpiredate")).click();
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByName("ccYear")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("ccvCode")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("ccvCode")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("ccvCode")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByName("submit-cc-page")).click();
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

    public static void UniversalType7(WebDriver webDriver, Offer offer, List<Offer> offerList) {
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

    public static void UniversalType8(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstname")).click();
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("address")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("zipcode")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='button btn-txt']")).click();
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
}
