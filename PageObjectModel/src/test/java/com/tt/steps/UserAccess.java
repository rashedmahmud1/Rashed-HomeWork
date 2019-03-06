package com.tt.steps;

import com.tt.common.FlightsBase;
import com.tt.pages.HomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserAccess extends FlightsBase {
	
	@Before
	public static void open() {
		openBrowser();
	}

@Given("^I am on newtours homepage$")
public void i_am_on_newtours_homepage() throws Throwable {
    }

@When("^I enter \"([^\"]*)\" \"([^\"]*)\" and click submit$")
public void i_enter_and_click_submit(String arg1, String arg2) throws Throwable {
	HomePage hp=new HomePage(vince);
	hp.userName().sendKeys("eVince");
	hp.password().sendKeys("1234");
	hp.login().click();
}

@Then("^I login to flights page$")
public void i_login_to_flights_page() throws Throwable {
    }
}//end of class
