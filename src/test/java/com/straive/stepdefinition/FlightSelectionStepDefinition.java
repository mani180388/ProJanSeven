package com.straive.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.straive.basepackage.BaseClass;
import com.straive.pagefactory.FlightResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FlightSelectionStepDefinition {
	@Given("Sort the prices of flight tickets")
	public void sort_the_prices_of_flight_tickets() {
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BaseClass.switchWindow(1);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		BaseClass.refreshBrwoser();
		FlightResultPage fp=new FlightResultPage();
		
		
//		BaseClass.explicitWait(fp.getPopUpClose());
		BaseClass.click(fp.getPopUpClose());
		BaseClass.click(fp.getSortOpt());
		BaseClass.click(fp.getSortPriceOpt());
	}

	@When("Select the low price flights for round trip")
	public void select_the_low_price_flights_for_round_trip() {
		FlightResultPage fp=new FlightResultPage();
		
		BaseClass.click(fp.getPriceLowTo());
		BaseClass.click(fp.getPriceLowReturn());
	}

	@Then("Check the total fare")
	public void check_the_total_fare() {
		FlightResultPage fp=new FlightResultPage();
		
		System.out.println("Total Fare: "+fp.getTotalFare().get(0).getText()+" "+fp.getTotalFare().get(1).getText());
		BaseClass.scrollForElem(fp.getTotalFare().get(0));
	  
	}

	@Then("Continue to passenger detail page")
	public void continue_to_passenger_detail_page() {
		FlightResultPage fp=new FlightResultPage();
		
		BaseClass.click(fp.getContinueBtn());
	   }

public static void fareTable() {
	FlightResultPage fp=new FlightResultPage();
	
	List<WebElement> tHead = fp.fareTableHead;
	List<WebElement> tBody=fp.fareTableData;
	List<WebElement> tRow = fp.fareTableRow;
	for (WebElement webElement : tHead) {
		System.out.println(webElement.getText()+" ");
			}System.out.println();
			for (WebElement webElement : tBody) {
				System.out.println(webElement.getText()+" ");
					}System.out.println();
					for (WebElement webElement : tRow) {
						System.out.println(webElement.getText()+" ");
							}
}
	
	
}
