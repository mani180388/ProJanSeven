package com.stepdefinition.ticket;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import com.baseclass.airticket.BaseClass;
import com.pagefactory.ticket.CheapAir;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheapAirStepDefinition {
	public static CheapAir ca;
	@Given("launch the browser and load url")
	public void launch_the_browser_and_load_url() throws IOException {
		BaseClass.browserLaunch();
		BaseClass.urlLaunch(BaseClass.getExcel(1, 0));
	  
	}

	@When("enter the flight and passenger count")
	public void enter_the_flight_and_passenger_count() throws InterruptedException, AWTException {
		ca= new CheapAir();
		ca.fromDes.clear();
		ca.fromDes.sendKeys("Chennai");
		Thread.sleep(2000);
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		ca.toDes.clear();
		ca.toDes.sendKeys("coimbatore");
		Robot roe = new Robot();
		roe.keyPress(KeyEvent.VK_ENTER);
		roe.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		ca.departDate.click();
		ca.returnDate.click();
		Thread.sleep(3000);
		ca.adult.click();
		ca.senior.click();
		ca.submit.click();
		Thread.sleep(1500);
		BaseClass.getwindow();
		ca.popUp2.click();	
	}

	@Then("validate the given details")
	public void validate_the_given_details() {
	System.out.println("validated");
	BaseClass.browserClose();
	   
	}

	@When("click on the lowest fare flight and continue")
	public void click_on_the_lowest_fare_flight_and_continue() {
		ca= new CheapAir();
		BaseClass.getwindow();
		ca.priceDropDown.click();
		ca.priceSortOrder.click();
		ca.lowPriceFlight.click();
		ca= new CheapAir();
		ca.lowPriceFlight.click();
		ca.tripDetail.click();
	}

	@When("enter the passenger details")
	public void enter_the_passenger_details() throws IOException {
		ca= new CheapAir();
		ca.firstName1.sendKeys(BaseClass.getExcel(1, 1));
		ca.lastName1.sendKeys(BaseClass.getExcel(1, 2));
		BaseClass.selectByValue(ca.suffix1, "Jr");
		BaseClass.selectByValue(ca.gender1, "M");
		BaseClass.selectByValue(ca.month1, "12");
		ca.day1.sendKeys(BaseClass.getExcel(1, 3));
		ca.year1.sendKeys(BaseClass.getExcel(1, 4));
		
		ca.firstName2.sendKeys(BaseClass.getExcel(2, 1));
		ca.lastName2.sendKeys(BaseClass.getExcel(2, 2));
		BaseClass.selectByValue(ca.suffix2, "Jr");
		BaseClass.selectByValue(ca.gender2, "F");
		BaseClass.selectByValue(ca.month2, "09");
		ca.day2.sendKeys(BaseClass.getExcel(2, 3));
		ca.year2.sendKeys(BaseClass.getExcel(2, 4));
		
		ca.firstName3.sendKeys(BaseClass.getExcel(3, 1));
		ca.lastName3.sendKeys(BaseClass.getExcel(3, 2));
		BaseClass.selectByValue(ca.suffix3, "Jr");
		BaseClass.selectByValue(ca.gender3, "F");
		BaseClass.selectByValue(ca.month3, "10");
		ca.day3.sendKeys(BaseClass.getExcel(3, 3));
		ca.year3.sendKeys(BaseClass.getExcel(3, 4));
	  
	}

	@When("enter the card details for payment")
	public void enter_the_card_details_for_payment() throws IOException {
		ca= new CheapAir();
		ca.creditNo.sendKeys(BaseClass.getExcel(1, 5));
		BaseClass.selectByValue(ca.expMonth, "07");
		BaseClass.selectByValue(ca.expYear, "2025");
		ca.cvv.sendKeys(BaseClass.getExcel(1, 6));
		ca.cardHolder.sendKeys(BaseClass.getExcel(1, 7));
		BaseClass.selectByValue(ca.country, "IN");
		ca.billingAddress.sendKeys(BaseClass.getExcel(1, 8));
		ca.paymentCity.sendKeys(BaseClass.getExcel(1, 9));
		ca.paymentPhone.sendKeys(BaseClass.getExcel(1, 10));
		ca.contactEmail.sendKeys(BaseClass.getExcel(1, 11));
		ca.createPassword.sendKeys(BaseClass.getExcel(1, 12));
		ca.confirmPassword.sendKeys(BaseClass.getExcel(1, 13)); 
	}


}
