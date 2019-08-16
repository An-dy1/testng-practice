package com.testng.tutorial;

import org.testng.annotations.Test;

public class TestNgPriority2 {

    @Test
    public void WebLoginBreck() {
        System.out.println("Web Breckenridge logged in");
        // Selenium code
    }

    @Test
    public void MobileLoginBreck() {
        System.out.println("Mobile Breckenridge logged in");
        // Appium code
    }

    @Test
    public void ApiLoginBreck() {
        System.out.println("API Breckenridge logged in");
        // REST API code
    }
}
