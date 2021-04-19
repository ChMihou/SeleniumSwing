package com.selenium.untils;

import com.selenium.typeOffer.typeOfferCa;
import com.selenium.typeOffer.typeOfferFR;
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
            //配置自动化测试环境
            WebDriver webDriver = SeleniumEnvironment.seleniumAwsEnvironment(ua, param);
            Thread.sleep(1000);
            offer.setId(param.getTypeOffer());
            if (param.getTypeOffer() == 143094 || param.getTypeOffer() == 149094) {
                typeOfferUS.UniversalType0(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 149352) {
                typeOfferUS.UniversalType42(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 145104) {
                typeOfferUS.UniversalType(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 145017 || param.getTypeOffer() == 145013) {
                typeOfferUS.UniversalType2(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 144869 || param.getTypeOffer() == 145815 || param.getTypeOffer() == 144868
                    || param.getTypeOffer() == 144435) {
                typeOfferUS.UniversalType3(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 145372 || param.getTypeOffer() == 145371) {
                typeOfferUS.UniversalType5(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 145376 || param.getTypeOffer() == 145375) {
                typeOfferUS.UniversalType4(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 144778 || param.getTypeOffer() == 146844 || param.getTypeOffer() == 147555
                    || param.getTypeOffer() == 147554 || param.getTypeOffer() == 147553) {
                typeOfferUS.UniversalType6(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 144498) {
                typeOfferUK.UniversalType2(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 144430) {
                typeOfferUS.UniversalType8(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 145650) {
                typeOfferUS.UniversalType9(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 145704) {
                typeOfferUK.UniversalType1(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 145793 || param.getTypeOffer() == 148013 || param.getTypeOffer() == 148244 || param.getTypeOffer() == 149186) {
                typeOfferUS.UniversalType12(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146011 || param.getTypeOffer() == 145605) {
                typeOfferUK.UniversalType4(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146012 || param.getTypeOffer() == 146013 || param.getTypeOffer() == 146014
                    || param.getTypeOffer() == 146015) {
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
            } else if (param.getTypeOffer() == 146022 || param.getTypeOffer() == 148299) {
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
            } else if (param.getTypeOffer() == 140974 || param.getTypeOffer() == 146463 || param.getTypeOffer() == 146954
                    || param.getTypeOffer() == 146714 || param.getTypeOffer() == 148005 || param.getTypeOffer() == 148006
                    || param.getTypeOffer() == 148014 || param.getTypeOffer() == 147971 || param.getTypeOffer() == 147972
                    || param.getTypeOffer() == 148063 || param.getTypeOffer() == 148609 || param.getTypeOffer() == 149190
                    || param.getTypeOffer() == 149189
            ) {
                typeOfferUS.UniversalType19(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146510) {
                typeOfferUS.UniversalType20(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146468 || param.getTypeOffer() == 147490 || param.getTypeOffer() == 149396) {
                typeOfferUS.UniversalType13(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146612) {
                typeOfferUK.UniversalType11(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146557 || param.getTypeOffer() == 146608) {
                typeOfferUS.UniversalType28(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146558 || param.getTypeOffer() == 148148 || param.getTypeOffer() == 149381 || param.getTypeOffer() == 149177) {
                typeOfferUS.UniversalType27(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146559) {
                typeOfferUS.UniversalType22(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146610 || param.getTypeOffer() == 147716 || param.getTypeOffer() == 147159
                    || param.getTypeOffer() == 146158 || param.getTypeOffer() == 147157) {
                typeOfferUS.UniversalType23(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146780 || param.getTypeOffer() == 146662) {
                typeOfferUK.UniversalType12(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146451 || param.getTypeOffer() == 146452 || param.getTypeOffer() == 146607) {
                typeOfferUS.UniversalType21(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146772 || param.getTypeOffer() == 144096 || param.getTypeOffer() == 144489
                    || param.getTypeOffer() == 146867 || param.getTypeOffer() == 146588 || param.getTypeOffer() == 146587
                    || param.getTypeOffer() == 148769 || param.getTypeOffer() == 148770) {
                typeOfferUS.UniversalType25(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146909) {
                typeOfferUS.UniversalType26(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146854 || param.getTypeOffer() == 147900) {
                typeOfferUS.UniversalType24(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146961 || param.getTypeOffer() == 147921) {
                typeOfferFR.UniversalType1(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146959) {
                typeOfferFR.UniversalType2(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 147441 || param.getTypeOffer() == 147966) {
                typeOfferUS.UniversalType29(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 147650) {
                typeOfferUS.UniversalType31(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 147390 || param.getTypeOffer() == 147248) {
                typeOfferUS.UniversalType32(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 147389 || param.getTypeOffer() == 147934) {
                typeOfferUS.UniversalType33(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 147198 || param.getTypeOffer() == 149527) {
                typeOfferUS.UniversalType21(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 147576) {
                typeOfferUS.UniversalType11(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146952) {
                typeOfferFR.UniversalType4(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 147948) {
                typeOfferUS.UniversalType35(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 148012) {
                typeOfferUS.UniversalType36(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 147761 || param.getTypeOffer() == 147490|| param.getTypeOffer() == 149789 || param.getTypeOffer() == 148890) {
                typeOfferUS.UniversalType30(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 148151) {
                typeOfferUS.UniversalType37(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 148309) {
                typeOfferUS.UniversalType38(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 148308) {
                typeOfferUS.UniversalType39(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 148019) {
                typeOfferFR.UniversalType5(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 148030) {
                typeOfferFR.UniversalType6(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 147946) {
                typeOfferFR.UniversalType7(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 147473) {
                typeOfferFR.UniversalType8(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 146661) {
                typeOfferFR.UniversalType9(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 148626) {
                typeOfferUS.UniversalType40(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 149056) {
                typeOfferCa.UniversalType1(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 147963) {
                typeOfferCa.UniversalType2(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 148672) {
                typeOfferCa.UniversalType1(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 148531 || param.getTypeOffer() == 149394) {
                typeOfferUS.UniversalType41(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 142198) {
                typeOfferCa.UniversalType4(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 147468) {
                typeOfferCa.UniversalType5(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 147579) {
                typeOfferCa.UniversalType5(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 149056) {
                typeOfferCa.UniversalType5(webDriver, offer, offerList);
            } else if (param.getTypeOffer() == 148140) {
                typeOfferCa.UniversalType8(webDriver, offer, offerList);
            }
        }
    }
}