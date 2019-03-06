package com.tt.steps;

import org.openqa.selenium.support.ui.Select;

import com.tt.common.FlightsBase;
import com.tt.pages.HomePage;
import com.tt.pages.RegistrationPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserRegistration extends FlightsBase {
 

	@Before
	public void open() {
	openBrowser();
	}
	@After
	public void close() {
		//closeBrowser();
	}
	
	
	@Given("^as a user I am in registration page$")
	public void as_a_user_I_am_in_registration_page() throws Throwable {
	    
	}

	@When("^I enter first name, last name, user id, password, and confirm password$")
	public void i_enter_first_name_last_name_user_id_password_and_confirm_password() throws Throwable {
		RegistrationPage rp=new RegistrationPage(vince);
		rp.register().click();
		rp.firstName().sendKeys("Vincent");
		rp.lastName().sendKeys("Gomes");
		rp.phone().sendKeys("3472648541");
		rp.email().sendKeys("somongomes@yahoo.com");
		
		rp.address1().sendKeys("8448 manton st");
		rp.address2().sendKeys("B1");
		rp.city().sendKeys("Briarwood");
		rp.state().sendKeys("New York");
		rp.postalCode().sendKeys("11435");
		
		Select coun=new Select(rp.country());
		coun.selectByVisibleText("TAIWAN");
		
		rp.userName().sendKeys("eVince");
		rp.password().sendKeys("1234");
		rp.confirmPass().sendKeys("1234");
	}

	@When("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
		RegistrationPage rp=new RegistrationPage(vince);
		rp.reg().click();  
	}

	@Then("^I received a user registration confirmation$")
	public void i_received_a_user_registration_confirmation() throws Throwable {
	    
	}

	@When("^I enter first name, last name, user id, and password only$")
	public void i_enter_first_name_last_name_user_id_and_password_only() throws Throwable {
		RegistrationPage rp=new RegistrationPage(vince);
		rp.register().click();
		rp.firstName().sendKeys("Vincent");
		rp.lastName().sendKeys("Gomes");
		rp.phone().sendKeys("3472648541");
		rp.email().sendKeys("somongomes@yahoo.com");
		
		rp.address1().sendKeys("8448 manton st");
		rp.address2().sendKeys("B1");
		rp.city().sendKeys("Briarwood");
		rp.state().sendKeys("New York");
		rp.postalCode().sendKeys("11435");
		
		Select coun=new Select(rp.country());
		coun.selectByVisibleText("TAIWAN");
		
		rp.userName().sendKeys("eVince");
		rp.password().sendKeys("1234");
	
		rp.reg().click();
	}

	@Then("^I received a user registration failure$")
	public void i_received_a_user_registration_failure() throws Throwable {
	    }
}//end of class
