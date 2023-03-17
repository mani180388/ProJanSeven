package com.aiite.StepDefinition;
import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import com.aiite.BaseClass.BaseClass;
import com.aiite.PageFactory.CheapAirFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheapAirStepDefini extends BaseClass {
	public int prize;
	
	@Given("Launch Browser and Load URL")
	public void launch_Browser_and_Load_URL() {
	    BaseClass.browserLaunch();
	    BaseClass.loadUrl("https://www.cheapair.com/");
	}

	@When("Enter itinerary details")
	public void enter_itinerary_details() throws AWTException, InterruptedException {
	    CheapAirFactory cf= new CheapAirFactory();
	    cf.fromDes.clear();
	    cf.fromDes.sendKeys("Chennai Intl. Airport (MAA) Madras, India");
	    BaseClass.robotMethod();
	    Thread.sleep(3000);
	    cf.toDes.sendKeys("Goa Airport (GOI) Goa, India");
	    BaseClass.robotMethod();
	    BaseClass.implicitWait();
	    cf.fromDate.sendKeys("Jul 8");
	    cf.toDate.sendKeys("Jul 10");
	    cf.options.click();
	    Thread.sleep(3000);
	    	    
	}

	@When("Add number of Passengers")
	public void add_number_of_Passengers() {
		CheapAirFactory cf = new CheapAirFactory();
		cf.adults.click();
//		cf.adults.click();
//		cf.adults.click();
		cf.senior.click();
		cf.senior.click();
		cf.children.click();
		cf.infants.click();
	}

	@Then("Search for flights")
	public void search_for_flights() throws AWTException, InterruptedException {
		CheapAirFactory cf = new CheapAirFactory();
		cf.submit.click();
		Thread.sleep(3000);
		BaseClass.windowHandling();
		Thread.sleep(20000);
		BaseClass.esc();
	}
	@Then("select the lowest prize from list")
	public void select_the_lowest_prize_from_list() throws InterruptedException {
		CheapAirFactory cf = new CheapAirFactory();
		
		BaseClass.FindLowestPrize(cf.prizelist);
		BaseClass.FindLowestPrize(cf.prizelist);
		cf.Continue.click();

	}
	
	@Then("Enter pasenger and payment details and submit")
	public void enter_pasenger_and_payment_details_and_submit() throws IOException, InterruptedException {
	    CheapAirFactory cf = new CheapAirFactory();
	    cf.firstName1.sendKeys(BaseClass.ExcelFile(1, 0));
	    cf.lastName1.sendKeys(BaseClass.ExcelFile(1, 1));
	    BaseClass.Select1(cf.gender1, "Male");
	    BaseClass.Select(cf.dobMonth1, 3);
	    cf.dobDay1.sendKeys(BaseClass.ExcelFile(1, 2));
	    cf.dobYear1.sendKeys(BaseClass.ExcelFile(1, 3));
	    
	    cf.firstName2.sendKeys(BaseClass.ExcelFile(2, 0));
	    cf.lastName2.sendKeys(BaseClass.ExcelFile(2, 1));
	    BaseClass.Select1(cf.gender2, "Male");
	    Thread.sleep(2000);
	    BaseClass.Select(cf.dobMonth2, 12);
	    cf.dobDay2.sendKeys(BaseClass.ExcelFile(2, 2));
	    cf.dobYear2.sendKeys(BaseClass.ExcelFile(2, 3));
	    
	    cf.firstName3.sendKeys(BaseClass.ExcelFile(3, 0));
	    cf.lastName3.sendKeys(BaseClass.ExcelFile(3, 1));
	    BaseClass.Select1(cf.gender3, "Male");
	    Thread.sleep(2000);
	    BaseClass.Select(cf.dobMonth3, 11);
	    cf.dobDay3.sendKeys(BaseClass.ExcelFile(3, 2));
	    cf.dobYear3.sendKeys(BaseClass.ExcelFile(3, 3));

	    cf.firstName4.sendKeys(BaseClass.ExcelFile(4, 0));
	    cf.lastName4.sendKeys(BaseClass.ExcelFile(4, 1));
	    BaseClass.Select1(cf.gender4, "Male");
	    Thread.sleep(2000);
	    BaseClass.Select(cf.dobMonth4, 11);
	    cf.dobDay4.sendKeys(BaseClass.ExcelFile(4, 2));
	    cf.dobYear4.sendKeys(BaseClass.ExcelFile(4, 3));

	    cf.firstName5.sendKeys(BaseClass.ExcelFile(5, 0));
	    cf.lastName5.sendKeys(BaseClass.ExcelFile(5, 1));
	    BaseClass.Select1(cf.gender5, "Male");
	    Thread.sleep(2000);
	    BaseClass.Select(cf.dobMonth5, 11);
	    cf.dobDay5.sendKeys(BaseClass.ExcelFile(5, 2));
	    cf.dobYear5.sendKeys(BaseClass.ExcelFile(5, 3));

	    cf.firstName6.sendKeys(BaseClass.ExcelFile(6, 0));
	    cf.lastName6.sendKeys(BaseClass.ExcelFile(6, 1));
	    BaseClass.Select1(cf.gender6, "Female");
	    Thread.sleep(2000);
	    BaseClass.Select(cf.dobMonth6, 9);
	    cf.dobDay6.sendKeys(BaseClass.ExcelFile(6, 2));
	    cf.dobYear6.sendKeys(BaseClass.ExcelFile(6, 1));
	    
	   // cf.CreditCard.sendKeys(BaseClass.ExcelFile(1, 4));
	    cf.CardDetails.sendKeys(BaseClass.ExcelFile(1, 4));
	    BaseClass.Select(cf.expMonth, 2);
	    BaseClass.Select(cf.expYear, 3);
	    cf.cvv1.sendKeys(BaseClass.ExcelFile(1, 5));
	    cf.paymentName.sendKeys(BaseClass.ExcelFile(1, 6));
	    BaseClass.Select1(cf.Country, "India");
	    cf.Address.sendKeys(BaseClass.ExcelFile(1, 7));
	    cf.Address1.sendKeys(BaseClass.ExcelFile(1, 8));
	    cf.City.sendKeys(BaseClass.ExcelFile(1, 9));
	    cf.PhoneNum.sendKeys(BaseClass.ExcelFile(1, 10));
	    cf.emailv.sendKeys(BaseClass.ExcelFile(1, 11));
	    cf.passw.sendKeys(BaseClass.ExcelFile(1, 12));
	    cf.confpassw.sendKeys(BaseClass.ExcelFile(1, 13));
	    cf.clickbox.click();
	    cf.purchasclick.click();

	}

	
	
}