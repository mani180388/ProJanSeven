package com.straive.stepdefinition;

import java.io.IOException;

import org.junit.Assert;

import com.straive.basepackage.BaseClass;
import com.straive.pagefactory.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class HomePageStepDefinition {
	@Given("Launch the chrome browser")
	public void launch_the_chrome_browser() {
	   BaseClass.browserLaunch();
	}

	@When("Navigate to the Cheap Air web application")
	public void navigate_to_the_Cheap_Air_site_url() {
		
	    try {
			BaseClass.launchURL(BaseClass.readProp("url"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("Confirm the site is launched")
	public void confirm_the_site_is_launched() {
		HomePage hp=new HomePage();
		Assert.assertTrue(BaseClass.isElementDisplayed(hp.getTitleLogo()));
		if(BaseClass.isElementDisplayed(hp.getTitleLogo())) {
			System.out.println("Site is launched successfully.");
		}
	   
	}

	


@Given("Select the FROM, TO and Pick the Departure and Arrival dates")
public void select_the_FROM_TO_and_Pick_the_Departure_and_Arrival_dates() {
	HomePage hp=new HomePage();


    try { 
    	
    	BaseClass.clearElement(hp.getFromLocation());

		  
		BaseClass.sendKeys(hp.getFromLocation(), BaseClass.readProp("from"));
		BaseClass.explicitWait(hp.getFromLocation());
		BaseClass.keyPress("enter");
		

	
		BaseClass.clearElement(hp.getToLocation());
		BaseClass.explicitWait(hp.getToLocation());

		BaseClass.sendKeys(hp.getToLocation(), BaseClass.readProp("to"));
		
		BaseClass.keyPress("enter");
		BaseClass.sendKeys(hp.getDepartDate(), BaseClass.readProp("departDate"));
		BaseClass.sendKeys(hp.getReturnDate(), BaseClass.readProp("returnDate"));
		
	} catch (IOException e) {
		System.out.println("THE ExCEPTION IS "+e);
		
	}
}

@When("Select the passengers count and travel seat type")
public void enter_the_passenger_details_and_travel_seat_type() {
	HomePage hp=new HomePage();
	try {
   BaseClass.click(hp.getTravelSeatOpt());
   BaseClass.explicitWait(hp.getAdultsIncreaseBtn());
   BaseClass.click(hp.getAdultsIncreaseBtn());
   BaseClass.click(hp.getAdultsIncreaseBtn());
   BaseClass.explicitWait(hp.getChildrensIncreaseBtn());
   BaseClass.click(hp.getChildrensIncreaseBtn());
   BaseClass.click(hp.getChildrensIncreaseBtn());
   BaseClass.click(hp.getChildrensIncreaseBtn());
   BaseClass.selectByValue(hp.getSeatTypeOpt(), BaseClass.readProp("premium"));
	}
	catch (Exception e) {
		System.out.println("The Exception is "+e);
	}
}

@Then("Search for flights")
public void search_for_flights() {
	HomePage hp=new HomePage();
	BaseClass.click(hp.getSearchFlightBtn());
	
    
}
@Then("Check window for showing prices")
public void check_window_for_showing_prices() {
	
	
	if(BaseClass.getPageTitle().contains("Flight Results")) {
		System.out.println("Flight results are shown");
	}
	
	
//	BaseClass.refreshBrwoser();
	
	
	   
	   
	   
    
}

	
	


}
