package com.tt.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sohel\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.id("hp-widget__sfrom"));// Create a variable using  webelement.
		
		source.clear();
		source.sendKeys("MAA");
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);
		WebElement stop = driver.findElement(By.id("hp-widget__sTo"));
		
		stop.sendKeys("CCU");
		Thread.sleep(2000);
		stop.sendKeys(Keys.ENTER);
	    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) 
		//Actions ac = new Actions(driver);
		 
		
	}

}
