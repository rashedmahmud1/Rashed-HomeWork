package com.tt.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchBrowsers {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//launch Firefox
		System.setProperty("webdriver.gecko.driver", "/home/mahbub/WebDrivers/geckodriver_linux64/geckodriver");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
		//launch chrome
		
		System.setProperty("webdriver.chrome.driver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		

	}//end of main

}
