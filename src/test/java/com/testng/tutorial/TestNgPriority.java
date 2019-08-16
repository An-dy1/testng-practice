package com.testng.tutorial;

import org.testng.annotations.Test;

public class TestNgPriority {

    @Test
    public void WebLogin() {
        System.out.println("Web logged in");
        // Selenium code
    }

    @Test
    public void MobileLogin() {
        System.out.println("Mobile logged in");
        // Appium code
    }

    @Test
    public void ApiLogin() {
        System.out.println("API logged in");
        // REST API code
    }
}
