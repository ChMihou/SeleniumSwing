package com.selenium.untils;

import com.selenium.pojo.Offer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.*;
import java.util.Random;

import org.apache.http.HttpHost;
import org.apache.http.auth.*;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.*;
import org.apache.http.impl.conn.BasicHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;

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

//    static class Client {
//        public static final String username = "lum-customer- hl_fc805dc9 -zone- static_res";
//        public static final String password = "n80hdqxvu6ph";
//        public static final int port = 22225;
//        public static final String user_agent =
//                "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36";
//        public String session_id = Integer.toString(new Random().nextInt(Integer.MAX_VALUE));
//        public CloseableHttpClient client;
//
//        public Client(String country) {
//            String login = username + (country != null ? "-country-" + country : "")
//                    + "-dns-remote-session-" + session_id;
//            HttpHost super_proxy = new HttpHost("zproxy.lum-superproxy.io", port);
//            CredentialsProvider cred_provider = new BasicCredentialsProvider();
//            cred_provider.setCredentials(new AuthScope(super_proxy),
//                    new UsernamePasswordCredentials(login, password));
//            client = HttpClients.custom()
//                    .setConnectionManager(new BasicHttpClientConnectionManager())
//                    .setProxy(super_proxy)
//                    .setDefaultCredentialsProvider(cred_provider)
//                    .build();
//        }
//
//        public String request(String url) throws IOException {
//            HttpGet request = new HttpGet(url);
//            request.setHeader("User-Agent", user_agent);
//            CloseableHttpResponse response = client.execute(request);
//            try {
//                return EntityUtils.toString(response.getEntity());
//            } finally {
//                response.close();
//            }
//        }
//
//        public void close() throws IOException {
//            client.close();
//        }
//    }
//
//    public static class Example {
//        public static void main(String[] args) throws IOException {
//            System.out.println("To enable your free eval account and get "
//                    + "CUSTOMER, YOURZONE and YOURPASS, please contact "
//                    + "sales@luminati.io");
//            System.out.println("Performing request(s)");
//            Client client = new Client("us");
//            try {
//                // Put complete scraping sequence below:
//                System.out.println(client.request("http://lumtest.com/myip.json"));
//                // System.out.println(client.request(...second request...));
//            } finally {
//                client.close();
//            }
//        }
//    }
//
//    public static WebDriver seleniumLuminatiEnvironment(String ua, Offer param) {
//        WebDriver webDriver;
//        String host = "127.0.0.1";
//        String port = "24000";
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments(String.format("--proxy-server=http://%s:%s", host, port));
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\TestUtils\\chromedriver.exe");
////            System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
//        DesiredCapabilities capabilities;
//        ChromeOptions options = new ChromeOptions();
//        if (ua.contains("mobile")) {
//            Map<String, String> mobileEmulation = new HashMap<>();
//            mobileEmulation.put("deviceName", "Galaxy S5");
//            ChromeOptions headlessOptions = new ChromeOptions();
//            headlessOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
//            capabilities = DesiredCapabilities.chrome();
//            capabilities.setCapability(ChromeOptions.CAPABILITY, headlessOptions);
//            ChromeDriverService service = new ChromeDriverService.Builder()
//                    .build();
//            webDriver = new ChromeDriver(service, capabilities);
//        } else {
//            // 创建HashMap类的一个对象
//            Map<String, Object> prefs = new HashMap<String, Object>();
//
//            // 设置提醒的设置，2表示block
//            prefs.put("profile.default_content_setting_values.notifications", 2);
//            prefs.put("profile.default_content_setting_values.images", 2);
//            options.setExperimentalOption("prefs", prefs);
//            options.addArguments("User-Agent=" + ua);
//            webDriver = new ChromeDriver(options);
//        }
//        //火狐浏览器
////        System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
////        WebDriver webDriver = new FirefoxDriver();
//        webDriver.manage().window().maximize();
//        webDriver.manage().deleteAllCookies();
//        // 与浏览器同步非常重要，必须等待浏览器加载完毕
//        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        //打开目标地址
//        webDriver.get(param.getUrl());
//        return webDriver;
//    }
}
