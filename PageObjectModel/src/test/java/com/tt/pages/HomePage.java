package com.tt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(name="userName") WebElement uName;
public WebElement userName() {
	return uName;
}
@FindBy(how=How.XPATH, using="//input[@name='password']")WebElement pass;
public WebElement password() {
	return pass;
}
@FindBy(css="input[value='Login']") WebElement log;
public WebElement login() {
	return log;
}
	
}
