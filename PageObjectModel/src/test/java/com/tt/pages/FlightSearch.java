package com.tt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FlightSearch {

	WebDriver driver;
	public FlightSearch(WebDriver driver) {
			this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@value='oneway']") WebElement tType;
	public WebElement triptype() {
		return tType;
	}
	@FindBy(name="passCount") WebElement pCount;
	public WebElement passCount() {
	return pCount;
	}
	@FindBy(name="fromPort") WebElement fPort;
	public WebElement fromPort() {
		return fPort;
	}
	@FindBy(name="fromMonth") WebElement fMonth;
	public WebElement fromMonth() {
		return fMonth;
	}
	@FindBy(name="fromDay") WebElement fDay;
	public WebElement fromDay() {
		return fDay;
	}
	@FindBy(xpath="//select[@name='toPort']") WebElement tPort;
	public WebElement toPort() {
		return tPort;
	}
	@FindBy(name="toMonth") WebElement tMonth;
	public WebElement toMonth() {
		return tMonth;
	}
	@FindBy(name="toDay") WebElement tDay;
	public WebElement toDay() {
		return tDay;
	}
	@FindBy(how=How.CSS, using="select[name='airline']") WebElement airline;
	public WebElement airline() {
		return airline;
	}
	@FindBy(name="findFlights") WebElement fFlights;
	public WebElement findFlights() {
		return fFlights;
	}
		
		
	
}
