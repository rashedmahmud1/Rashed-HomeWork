package com.tt.selenium;

import org.openqa.selenium.WebDriver;

public class clickButtons {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//launch chrome
		
		System.setProperty("webdriver.chrome.driver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
		driver.get("http://www.google.com");
		try {
			Thread.sleep(10000);
			} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.quit();

	}

}
