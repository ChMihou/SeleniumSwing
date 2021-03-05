package com.selenium.typeOffer;

import com.selenium.pojo.Offer;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class typeOfferUK {
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
            webDriver.findElement(new By.ByName("data[User][country]")).sendKeys("United Kingdom of Great Britain and Northern Ireland");
            webDriver.findElement(new By.ByName("data[User][cc]")).click();
            webDriver.findElement(new By.ByName("data[User][cc]")).sendKeys("" + offer.getCardNumber());
            webDriver.findElement(new By.ByName("data[User][cc]")).clear();
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

    public static void UniversalType2(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("username")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("password")).sendKeys(offer.getName() + offer.getLastName());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-warning btn-block']")).click();
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

    public static void UniversalType4(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("address")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("country")).sendKeys("United Kingdom");
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("state")).sendKeys(offer.getState());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("zipcode")).sendKeys(offer.getPostcode());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='button btn-txt']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ById("numberCard")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ById("expirynew")).sendKeys("0" + offer.getMonth() + offer.getYear().substring(2));
            } else {
                webDriver.findElement(new By.ById("expirynew")).sendKeys(offer.getMonth() + offer.getYear().substring(2));
            }
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ById("cvcnew")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ById("cvcnew")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ById("cvcnew")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='button button-gtw gtw_default btn-txt']")).click();
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
            webDriver.findElement(new By.ByName("country")).clear();
            webDriver.findElement(new By.ByName("country")).sendKeys("United Kingdom");
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("city")).clear();
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("name")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("surname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("address")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("postal_code")).sendKeys(offer.getPostcode());
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
            Thread.sleep(38000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType6(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("username")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("password")).sendKeys(offer.getName() + offer.getLastName());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-warning btn-block']")).click();
            Thread.sleep(3000);
            webDriver.findElement(new By.ByName("username")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("password")).sendKeys(offer.getName() + offer.getLastName());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='btn btn-warning btn-block']")).click();
            Thread.sleep(3000);
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("zip")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("password")).sendKeys(offer.getName() + offer.getLastName());
            webDriver.findElement(new By.ByName("first_name")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("last_name")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("address1")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("state")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("country_id")).sendKeys("United Kingdom");
            webDriver.findElement(new By.ByName("card_number")).sendKeys(offer.getCardNumber());
            webDriver.findElement(new By.ByName("card_month")).sendKeys(offer.getMonth());
            webDriver.findElement(new By.ByName("card_year")).click();
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("card_cvv")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("card_cvv")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("card_cvv")).sendKeys(offer.getCvv());
            }
            Thread.sleep(3000);
            webDriver.findElement(new By.ByXPath("//button[@class='green-btn btn-lg text-uppercase']")).click();
            Thread.sleep(50000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType7(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("password")).sendKeys(offer.getName() + offer.getLastName());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='f-left button btn-txt']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("ccname")).sendKeys(offer.getName() + " " + offer.getLastName());
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
            webDriver.findElement(new By.ById("tnc")).click();
            Thread.sleep(3000);
            webDriver.findElement(new By.ByXPath("//button[@class='ng-binding']")).click();
            Thread.sleep(38000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType8(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            Random random = new Random();
            Integer i = random.nextInt(2);
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("city")).clear();
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("address")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("zip")).sendKeys(offer.getPostcode());
            if (i > 1) {
                webDriver.findElement(new By.ByName("gender")).sendKeys("m");
            } else {
                webDriver.findElement(new By.ByName("gender")).sendKeys("f");
            }
            webDriver.findElement(new By.ByName("acceptterms")).click();
            Thread.sleep(2000);
            webDriver.findElement(new By.ByName("submit_emailandaddress")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("card.number")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//input[@class='wpwl-control wpwl-control-expiry']")).sendKeys("0" + offer.getMonth() + offer.getYear().substring(2));
            } else {
                webDriver.findElement(new By.ByXPath("//input[@class='wpwl-control wpwl-control-expiry']")).sendKeys(offer.getMonth() + offer.getYear().substring(2));
            }
            webDriver.findElement(new By.ByName("card.holder")).sendKeys(offer.getName() + " " + offer.getLastName());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("card.cvv")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("card.cvv")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("card.cvv")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='wpwl-button wpwl-button-pay']")).click();
            Thread.sleep(38000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType9(WebDriver webDriver, Offer offer, List<Offer> offerList) {
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
            Thread.sleep(50000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType10(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("customer[email]")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("customer[city]")).clear();
            webDriver.findElement(new By.ByName("customer[city]")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("customer[first_name]")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("customer[last_name]")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("customer[address]")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("customer[postcode]")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("customer[phone]")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("customer[terms]")).click();
            Thread.sleep(2000);
            webDriver.findElement(new By.ByName("submit")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ById("credit_card[cardholder_name]")).click();
            webDriver.findElement(new By.ById("credit_card[cardholder_name]")).sendKeys(offer.getName() + " " + offer.getLastName());
            webDriver.findElement(new By.ById("credit_card_raw_number")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ById("credit_card_expiration_month")).sendKeys("0" + offer.getMonth());
            } else {
                webDriver.findElement(new By.ById("credit_card_expiration_month")).sendKeys(offer.getMonth());
            }


            webDriver.findElement(new By.ById("credit_card_expiration_year")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ById("credit_card_cvc")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ById("credit_card_cvc")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ById("credit_card_cvc")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ById("credit_card_submit_btn")).click();
            Thread.sleep(38000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType11(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByXPath("//a[@class='button popup-youtube']")).click();
            Thread.sleep(5000);
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("billingCity")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("firstName")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastName")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("billingAddress1")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("billingZip")).sendKeys(offer.getPostcode());
            webDriver.findElement(new By.ByName("billingState")).sendKeys(offer.getState());
            webDriver.findElement(new By.ByName("x_card_num")).sendKeys(offer.getCardNumber());
            if (offer.getMonth().length() == 1) {
                webDriver.findElement(new By.ByXPath("//option[@value='" + "0" + offer.getMonth() + "']")).click();
            } else {
                webDriver.findElement(new By.ByXPath("//option[@value='" + offer.getMonth() + "']")).click();
            }
            webDriver.findElement(new By.ByName("x_exp_year")).sendKeys(offer.getYear());
            if (offer.getCvv().length() == 1) {
                webDriver.findElement(new By.ByName("CVV")).sendKeys("00" + offer.getCvv());
            } else if (offer.getCvv().length() == 2) {
                webDriver.findElement(new By.ByName("CVV")).sendKeys("0" + offer.getCvv());
            } else {
                webDriver.findElement(new By.ByName("CVV")).sendKeys(offer.getCvv());
            }
            Thread.sleep(2000);
            webDriver.findElement(new By.ByXPath("//button[@class='button button-primary button-shadow button-block btn-txt']")).click();
            Thread.sleep(38000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static void UniversalType12(WebDriver webDriver, Offer offer, List<Offer> offerList) {
        try {
            webDriver.findElement(new By.ByName("firstname")).sendKeys(offer.getName());
            webDriver.findElement(new By.ByName("lastname")).sendKeys(offer.getLastName());
            webDriver.findElement(new By.ByName("address")).sendKeys(offer.getAddress());
            webDriver.findElement(new By.ByName("email")).sendKeys(offer.getEmail());
            webDriver.findElement(new By.ByName("phone")).sendKeys(offer.getPhone());
            webDriver.findElement(new By.ByName("city")).sendKeys(offer.getCountry());
            webDriver.findElement(new By.ByName("zipcodewithoutcountry")).sendKeys(offer.getPostcode());
            Thread.sleep(2000);
            webDriver.findElement(new By.ByName("submit")).click();
            Thread.sleep(5000);
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
            webDriver.findElement(new By.ByName("submit")).click();
            Thread.sleep(38000);
            offerList.add(offer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }
}
