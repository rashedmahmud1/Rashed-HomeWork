package com.tt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
WebDriver vince;

public RegistrationPage(WebDriver vince) {
	this.vince=vince;
	PageFactory.initElements(vince, this);
}//end of construction
@FindBy(linkText="REGISTER")
WebElement reg;
public WebElement register() {
	return reg;
}
@FindBy(how=How.NAME, using="firstName")
WebElement fName;
public WebElement firstName() {
	return fName;
}
@FindBy(how=How.XPATH, using="//input[@name='lastName']")
WebElement lName;
public WebElement lastName() {
	return lName;
}
@FindBy(how=How.CSS,using="input[name='phone']")
WebElement phone;
public WebElement phone() {
	return phone;
}
@FindBy(id="userName")
WebElement uName;
public WebElement email() {
	return uName;
}
@FindBy(how=How.NAME,using="address1")
WebElement add1;
public WebElement address1() {
	return add1;
}
@FindBy(name="address2")
WebElement add2;
public WebElement address2() {
	return add2;
	}
@FindBy(how=How.CSS, using="input[name='city']") 
WebElement city;
public WebElement city() {
	return city;
}
@FindBy(name="state") 
WebElement state;
public WebElement state() {
	return state;
}
@FindBy(xpath="//input[@name='postalCode']") 
WebElement pCode;
public WebElement postalCode() {
	return pCode;
}
@FindBy(name="country") WebElement country;
public WebElement country() {
	return country;
}
@FindBy(how=How.ID, using="email") WebElement usName;
public WebElement userName() {
	return usName;
}
@FindBy(name="password") WebElement pass;
public WebElement password() {
	return pass;
}
@FindBy(name="confirmPassword") WebElement cPass;
public WebElement confirmPass() {
	return cPass;
}
@FindBy(name="register") WebElement register;
public WebElement reg() {
	return register;
}

}//end of class
