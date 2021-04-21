package com.selenium.untils;

import com.selenium.pojo.Offer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SeleniumEnvironment {

    public static WebDriver seleniumAwsEnvironment(String ua, Offer param) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\TestUtils\\chromedriver.exe");
//            System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver webDriver;
        // 创建HashMap类的一个对象
        Map<String, Object> prefs = new HashMap<>();

        // 设置提醒的设置，2表示block,无图浏览
        prefs.put("profile.default_content_setting_values.notifications", 2);
        prefs.put("profile.default_content_setting_values.images", 2);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("User-Agent=" + ua);
        webDriver = new ChromeDriver(options);
        //火狐浏览器
//        System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
//        WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        // 与浏览器同步非常重要，必须等待浏览器加载完毕
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //打开目标地址
        webDriver.get(param.getUrl());
        return webDriver;
    }
}