package com.selenium.untils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class getIp {

    public static void main(String args[]) throws Exception {


    }


    public static String getV4IP() {
        // Find public IP address
        String systemipaddress = "";
        try {
            URL url_name = new URL("http://bot.whatismyipaddress.com");

            BufferedReader sc = new BufferedReader(new InputStreamReader(url_name.openStream()));

            // reads system IPAddress
            systemipaddress = sc.readLine().trim();
        } catch (Exception e) {
            systemipaddress = "Cannot Execute Properly";
        }
        return systemipaddress;
    }

}
