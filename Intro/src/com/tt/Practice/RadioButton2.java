package com.tt.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sohel\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@value='Milk']")).click();
	    
		int count = driver.findElements(By.name("group1")).size();
		
		for(int i = 0;i<count;i++) {
			//driver.findElements(By.name("group1")).get(i).click();
			String text = driver.findElements(By.name("group1")).get(i).getAttribute("value");
			if(text.equals("Cheese")) {
				driver.findElements(By.name("group1")).get(i).click();
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
