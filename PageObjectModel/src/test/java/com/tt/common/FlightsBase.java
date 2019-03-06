package com.tt.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightsBase {
	public static WebDriver vince;
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:/WebDrivers/chromedriver.exe");
		vince=new ChromeDriver();
		vince.get("http://www.newtours.demoaut.com/");
	}
	public static void closeBrowser() {
		vince.close();
	}

}
