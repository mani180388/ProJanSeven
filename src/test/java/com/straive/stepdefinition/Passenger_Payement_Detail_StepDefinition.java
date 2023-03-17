package com.straive.stepdefinition;

import java.io.IOException;

import org.junit.Assert;

import com.straive.basepackage.BaseClass;
import com.straive.pagefactory.PassengerDetail_PaymentDetail_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Passenger_Payement_Detail_StepDefinition {
	public static PassengerDetail_PaymentDetail_Page pdf = new PassengerDetail_PaymentDetail_Page();

	@Given("Enter the passenger details")
	public void enter_the_passenger_details() {

		try{BaseClass.click(pdf.getpopUpClose());}
		catch (Exception e) {
			System.out.println("The Exception is"+e);
		}
		fillPassengerDetails();

	}

	@When("Enter the purchase details")
	public void enter_the_purchase_details() {
		BaseClass.scrollForElem(pdf.getCreditCardHolder());
		
		fillPaymentDetails();
		
	}

	@Then("Verify the purchse button")
	public void verify_the_purchse_button() {
		
		BaseClass.scrollForElem(pdf.getCreditCardHolder());
		Assert.assertTrue(BaseClass.isElementDisplayed(pdf.getPurchaseBtn()));
		
		
	}

	public static void fillPassengerDetails() {

		try {
			BaseClass.sendKeys(pdf.getFirstName1(), BaseClass.readProp("firstName1"));
			BaseClass.sendKeys(pdf.getLastName1(), BaseClass.readProp("lastName1"));
			BaseClass.selectByValue(pdf.getSuffix1(), BaseClass.readProp("suffix1"));
			BaseClass.selectByValue(pdf.getGender1(), BaseClass.readProp("gender1"));
			BaseClass.selectByValue(pdf.getDobMonth1(), BaseClass.readProp("dobMonth1"));
			BaseClass.sendKeys(pdf.getDobDay1(), BaseClass.readProp("dobDay1"));
			BaseClass.sendKeys(pdf.getDobYear1(), BaseClass.readProp("dobYear1"));

			BaseClass.scrollForElem(pdf.getDobMonth2());

			BaseClass.sendKeys(pdf.getFirstName2(), BaseClass.readProp("firstName2"));
			BaseClass.sendKeys(pdf.getLastName2(), BaseClass.readProp("lastName2"));
			BaseClass.selectByValue(pdf.getSuffix2(), BaseClass.readProp("suffix2"));
			BaseClass.selectByValue(pdf.getGender2(), BaseClass.readProp("gender2"));
			BaseClass.selectByValue(pdf.getDobMonth2(), BaseClass.readProp("dobMonth2"));
			BaseClass.sendKeys(pdf.getDobDay2(), BaseClass.readProp("dobDay2"));
			BaseClass.sendKeys(pdf.getDobYear2(), BaseClass.readProp("dobYear2"));

			BaseClass.scrollForElem(pdf.getDobMonth3());

			BaseClass.sendKeys(pdf.getFirstName3(), BaseClass.readProp("firstName3"));
			BaseClass.sendKeys(pdf.getLastName3(), BaseClass.readProp("lastName3"));
			BaseClass.selectByValue(pdf.getSuffix3(), BaseClass.readProp("suffix3"));
			BaseClass.selectByValue(pdf.getGender3(), BaseClass.readProp("gender3"));
			BaseClass.selectByValue(pdf.getDobMonth3(), BaseClass.readProp("dobMonth3"));
			BaseClass.sendKeys(pdf.getDobDay3(), BaseClass.readProp("dobDay3"));
			BaseClass.sendKeys(pdf.getDobYear3(), BaseClass.readProp("dobYear3"));


			BaseClass.scrollForElem(pdf.getDobMonth4());

			BaseClass.sendKeys(pdf.getFirstName4(), BaseClass.readProp("firstName4"));
			BaseClass.sendKeys(pdf.getLastName4(), BaseClass.readProp("lastName4"));
			BaseClass.selectByValue(pdf.getSuffix4(), BaseClass.readProp("suffix4"));
			BaseClass.selectByValue(pdf.getGender4(), BaseClass.readProp("gender4"));
			BaseClass.selectByValue(pdf.getDobMonth4(), BaseClass.readProp("dobMonth4"));
			BaseClass.sendKeys(pdf.getDobDay4(), BaseClass.readProp("dobDay4"));
			BaseClass.sendKeys(pdf.getDobYear4(), BaseClass.readProp("dobYear4"));

			BaseClass.scrollForElem(pdf.getDobMonth5());

			BaseClass.sendKeys(pdf.getFirstName5(), BaseClass.readProp("firstName5"));
			BaseClass.sendKeys(pdf.getLastName5(), BaseClass.readProp("lastName5"));
			BaseClass.selectByValue(pdf.getSuffix5(), BaseClass.readProp("suffix5"));
			BaseClass.selectByValue(pdf.getGender5(), BaseClass.readProp("gender5"));
			BaseClass.selectByValue(pdf.getDobMonth5(), BaseClass.readProp("dobMonth5"));
			BaseClass.sendKeys(pdf.getDobDay5(), BaseClass.readProp("dobDay5"));
			BaseClass.sendKeys(pdf.getDobYear5(), BaseClass.readProp("dobYear5"));

			BaseClass.scrollForElem(pdf.getDobMonth6());

			BaseClass.sendKeys(pdf.getFirstName6(), BaseClass.readProp("firstName6"));
			BaseClass.sendKeys(pdf.getLastName6(), BaseClass.readProp("lastName6"));
			BaseClass.selectByValue(pdf.getSuffix6(), BaseClass.readProp("suffix6"));
			BaseClass.selectByValue(pdf.getGender6(), BaseClass.readProp("gender6"));
			BaseClass.selectByValue(pdf.getDobMonth6(), BaseClass.readProp("dobMonth6"));
			BaseClass.sendKeys(pdf.getDobDay6(), BaseClass.readProp("dobDay6"));
			BaseClass.sendKeys(pdf.getDobYear6(), BaseClass.readProp("dobYear6"));

		
		
		
		
		} catch (IOException e) {
			System.out.println("The Exception is " + e);
		}

	}
	public static void fillPaymentDetails() {

		try {
			BaseClass.sendKeys(pdf.getCreditCardNum(), BaseClass.readProp("ccNum"));
			BaseClass.selectByValue(pdf.getCcExpMonth(), BaseClass.readProp("ccExpMonth"));
			BaseClass.selectByValue(pdf.getCcExpYear(), BaseClass.readProp("ccExpYear"));
			BaseClass.sendKeys(pdf.getCcCVV(), BaseClass.readProp("ccCVV"));
			BaseClass.sendKeys(pdf.getCreditCardHolder(), BaseClass.readProp("ccHolderName"));
			BaseClass.selectByValue(pdf.getCountry(),BaseClass.readProp("country"));
			BaseClass.sendKeys(pdf.getBillingAddress(), BaseClass.readProp("billingAddress"));
			BaseClass.sendKeys(pdf.getPaymentCity(), BaseClass.readProp("city"));
			BaseClass.selectByValue(pdf.getPaymentState(),BaseClass.readProp("state"));
			BaseClass.sendKeys(pdf.getPaymentZipCode(), BaseClass.readProp("pincode"));
			BaseClass.sendKeys(pdf.getTelephone(), BaseClass.readProp("telephone"));
			BaseClass.sendKeys(pdf.getEmail(), BaseClass.readProp("email"));
			BaseClass.sendKeys(pdf.getCreatePassword(), BaseClass.readProp("password"));
			BaseClass.sendKeys(pdf.getConfirmPassword(), BaseClass.readProp("password"));
			
			
			
		} catch (Exception e) {
			System.out.println("The Exception is " + e);
		}

	}
	}


