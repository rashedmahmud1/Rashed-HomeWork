package com.tt.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.tt.common.FlightsBase;
import com.tt.pages.FlightSearch;
import com.tt.pages.HomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flights extends FlightsBase{
	
	@Before
	public void open() {
		openBrowser();
	}
public static void access() {
	HomePage hp=new HomePage(vince);
	hp.userName().sendKeys("eVince");
	hp.password().sendKeys("1234");
	hp.login().click();
	}
	

@When("^I select flight type, no of passengers, origin, flight date, flight month, destinnation, return date, return month, service class, Airline$")
public void i_select_flight_type_no_of_passengers_origin_flight_date_flight_month_destinnation_return_date_return_month_service_class_Airline() throws Throwable {
		WebElement flight=vince.findElement(By.xpath("//input[@value='oneway']"));
		flight.click();
	
		FlightSearch fs = new FlightSearch(vince);
			
		Select pc=new Select(fs.passCount());
		pc.selectByValue("3");
		
		Select fp = new Select(fs.fromPort());
		fp.selectByVisibleText("New York");
		
		Select fm = new Select(fs.fromMonth());
		fm.selectByValue("2");
		
		Select fd = new Select(fs.fromDay());
		fd.selectByVisibleText("6");
		
		Select tp=new Select (fs.toPort());
		tp.selectByValue("Zurich");
		
		Select tm=new Select (fs.toMonth());
		tm.selectByValue("2");
		
		Select td=new Select (fs.toDay());
		td.selectByValue("14");

		WebElement cla =vince.findElement(By.xpath("//input[@value='Business']"));
		cla.click();
		
		Select al=new Select(fs.airline());
		al.selectByVisibleText("Unified Airlines");
		
		}

@When("^I click on continue$")
public void i_click_on_continue() throws Throwable {
		FlightSearch fs = new FlightSearch(vince);
		fs.findFlights().click();
    }

@Then("^I see select flight page$")
public void i_see_select_flight_page() throws Throwable {
		String varify = vince.getTitle();
		String expected="Select a Flight: Mercury Tours";
		System.out.println("Varify : "+varify);
		Assert.assertEquals(varify, expected);
}


}//end of class
