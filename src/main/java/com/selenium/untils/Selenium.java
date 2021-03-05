package com.selenium.untils;

import com.selenium.typeOffer.typeOfferUK;
import com.selenium.typeOffer.typeOfferUS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.selenium.pojo.Offer;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Selenium {

    public static void selenium(Offer offer, String ua, Offer param, List<Offer> offerList) throws InterruptedException {
        if (param.getTypeOffer() != null) {
            Thread.sleep(3000);
            //获取Ip
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\TestUtils\\chromedriver.exe");
//            System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
            System.out.println(getIp());
            DesiredCapabilities capabilities;
            ChromeOptions options = new ChromeOptions();
            WebDriver webDriver;
            if (ua.contains("mobile")) {
                Map<String, String> mobileEmulation = new HashMap<String, String>();
                mobileEmulation.put("deviceName", "Galaxy S5");
                ChromeOptions headlessOptions = new ChromeOptions();
                headlessOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
                capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability(ChromeOptions.CAPABILITY, headlessOptions);
                ChromeDriverService service = new ChromeDriverService.Builder()
                        .build();
                webDriver = new ChromeDriver(service, capabilities);
            } else {
                // 创建HashMap类的一个对象
                Map<String, Object> prefs = new HashMap<String, Object>();

                // 设置提醒的设置，2表示block
                prefs.put("profile.default_content_setting_values.notifications", 2);
                prefs.put("profile.default_content_setting_values.images", 2);
                options.setExperimentalOption("prefs", prefs);
                options.addArguments("User-Agent=" + ua);
                webDriver = new ChromeDriver(options);
            }
            //火狐浏览器
//        System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
//        WebDriver webDriver = new FirefoxDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().deleteAllCookies();
            // 与浏览器同步非常重要，必须等待浏览器加载完毕
            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //打开目标地址
            webDriver.get(param.getUrl());
            Thread.sleep(1000);
            offer.setId(param.getTypeOffer());
            if (param.getTypeOffer() == 143094) {
                typeOfferUS.typeOffer143094(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 145104) {
                typeOfferUS.UniversalType(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 145017 || param.getTypeOffer() == 145013) {
                typeOfferUS.UniversalType2(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 144869 || param.getTypeOffer() == 145815 || param.getTypeOffer() == 144868 || param.getTypeOffer() == 144435 || param.getTypeOffer() == 144096 || param.getTypeOffer() == 144489) {
                typeOfferUS.UniversalType3(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 145372 || param.getTypeOffer() == 145371) {
                typeOfferUS.UniversalType5(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 145376 || param.getTypeOffer() == 145375) {
                typeOfferUS.UniversalType4(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 144778 || param.getTypeOffer() == 146844) {
                typeOfferUS.UniversalType6(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 144498) {
                typeOfferUK.UniversalType2(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 144430) {
                typeOfferUS.UniversalType8(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 145650) {
                typeOfferUS.UniversalType9(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 145704) {
                typeOfferUK.UniversalType1(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 145793) {
                typeOfferUS.UniversalType12(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146011 || param.getTypeOffer() == 145605) {
                typeOfferUK.UniversalType4(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146012 || param.getTypeOffer() == 146013 || param.getTypeOffer() == 146014 || param.getTypeOffer() == 146015) {
                typeOfferUS.UniversalType13(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146024 || param.getTypeOffer() == 146023) {
                typeOfferUK.UniversalType5(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 144496) {
                typeOfferUK.UniversalType6(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 145810) {
                typeOfferUS.UniversalType14(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 144471 || param.getTypeOffer() == 144473) {
                typeOfferUS.UniversalType15(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 141074) {
                typeOfferUS.UniversalType1(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146022) {
                typeOfferUS.UniversalType16(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 137618) {
                typeOfferUK.UniversalType7(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146240 || param.getTypeOffer() == 146763) {
                typeOfferUS.UniversalType17(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146266) {
                typeOfferUK.UniversalType8(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146304 || param.getTypeOffer() == 146305 || param.getTypeOffer() == 146468) {
                typeOfferUK.UniversalType9(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146277 || param.getTypeOffer() == 146566) {
                typeOfferUK.UniversalType10(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 143067) {
                typeOfferUS.UniversalType18(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 140974 || param.getTypeOffer() == 146463 || param.getTypeOffer() == 146954) {
                typeOfferUS.UniversalType19(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146510) {
                typeOfferUS.UniversalType20(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146468) {
                typeOfferUS.UniversalType13(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146612) {
                typeOfferUK.UniversalType11(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146557) {
                typeOfferUS.UniversalType21(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146559) {
                typeOfferUS.UniversalType22(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146610) {
                typeOfferUS.UniversalType23(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146780 || param.getTypeOffer() == 146662) {
                typeOfferUK.UniversalType12(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146451 || param.getTypeOffer() == 146452) {
                typeOfferUS.UniversalType21(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146772 || param.getTypeOffer() == 146867) {
                typeOfferUS.UniversalType25(webDriver, offer, offerList);
            }
        }
    }

    public static String getIp() {
        try {
            InetAddress ia = InetAddress.getLocalHost();
            return ia.getHostAddress();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "500";
        }
    }
}