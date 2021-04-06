package com.selenium.typeOffer;

import com.selenium.pojo.Offer;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class typeOfferFR {
    public static void UniversalType1(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ById("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("terms")).click();
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("register")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cardNumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ById("select2-expirationMonth-ti-container")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ById("select2-expirationMonth-ti-container")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ById("select2-expirationYear-4i-container")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ById("cvc")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ById("cvc")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ById("cvc")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("cardSubmit")).click();
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
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType3(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("username")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("password")).sendKeys(offer.getName() + offer.getLastName());
            webDriver.findElement(new By.ByName("shipping")).sendKeys(offer.getAddress());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-warning btn-block font-semibold btn-md']")).click();
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

    public static void UniversalType4(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("zipcodewithoutcountry")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("address")).sendKeys(offer.getAddress());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//input[@class='btn btn-primary']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ById("cardnumber")).sendKeys(offer.getCardNumber());
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
            webDriver.findElement(new By.ByXPath("//input[@class='btn btn-primary']")).click();
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
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("kformSubmit")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ById("cardNumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("cardMonthYear")).sendKeys("0" + offer.getMonth() + offer.getYear().substring(2));
            } else {
                webDriver.findElement(new By.ByName("cardMonthYear")).sendKeys(offer.getMonth() + offer.getYear().substring(2));
            }
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ById("cardSecurityCode")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ById("cardSecurityCode")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ById("cardSecurityCode")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("kformSubmit2")).click();
            Thread.sleep(28000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType6(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("zipcode")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("address")).sendKeys(offer.getAddress());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='submit-button btn-txt']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cc-cardnumber")).sendKeys(offer.getCardNumber());
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
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType7(WebDriver webDriver, Offer offer, List<Offer> offerList) {
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

    public static void UniversalType8(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByXPath("//input[@class='form-control formfield nameInput']")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByXPath("//input[@class='form-control formfield surnameInput']")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByXPath("//input[@class='form-control formfield mailInput']")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByXPath("//input[@class='form-control formfield addressInput']")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByXPath("//input[@class='form-control formfield cityInput']")).clear();
            webDriver.findElement(new By.ByXPath("//input[@class='form-control formfield cityInput']")).sendKeys(offer.getCountry());
            Thread.sleep(2000);
            WebElement element = webDriver.findElement(new By.ByXPath("//input[@class='btn btn-primary']"));
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            js.executeScript("arguments[0].click();", element);
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("cardnumber")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByName("ccmonth")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ByName("ccmonth")).sendKeys(offer.getMonth());
            }
            webDriver.findElement(new By.ByName("ccyear")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("cvc")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("cvc")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("cvc")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-success send-btn']")).click();
            Thread.sleep(18000);
            Thread.sleep(18000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType9(WebDriver webDriver, Offer offer, List<Offer> offerList) {
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
