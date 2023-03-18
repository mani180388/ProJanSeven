package com.pagefactory.ticket;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.airticket.BaseClass;

public class CheapAir extends BaseClass {
	public CheapAir() {
		PageFactory.initElements(driver,this);
	}
		@FindBy(xpath="//input[@id='from1']")
		public WebElement fromDes;
		
		@FindBy(xpath="//input[@id='to1']")
		public WebElement toDes;
		
		@FindBy(xpath="//input[@id='departs']//following::a[5]")
		public WebElement departDate;
		
		@FindBy(xpath="//input[@id='departs']//following::a[7]")
		public WebElement returnDate;
		
		@FindBy(xpath="//input[@id='adults']//following::button[2]")
		public WebElement adult;
		@FindBy(xpath="//input[@id='seniors']//following::button[2]")
		public WebElement senior;
		@FindBy(xpath="//input[@id='children']//following::button[2]")
		public WebElement children;
		@FindBy(xpath="//input[@id='infants']//following::button[2]")
		public WebElement infants;
		@FindBy(xpath="//button[@type='submit']")
		public WebElement submit;
		
		@FindBy(xpath="//div[@class=\"sc-fnGiBr kCVmbb\"]")
		public WebElement popUp2;
		
		@FindBy(xpath="//div[@kind='light']//following::div[4]")
		public WebElement priceSortOrder;
		
		@FindBy(xpath="(//div[@class='src__Box-sc-1sbtrzs-0 imREpE']"
				+ "/following-sibling::span)[1]")
		public WebElement priceDropDown;
		
		@FindBy(xpath="(//span[@class='sc-heFykY dnRYbf']//span)[1]")
		public WebElement lowPriceFlight;
		
		@FindBy(xpath="//div[text()='Continue']")
		public WebElement tripDetail;
		
		@FindBy(xpath="//input[@id='firstName1']")
		public WebElement firstName1;
		
		@FindBy(xpath="//input[@id='lastName1']")
		public WebElement lastName1;
		
		@FindBy(xpath="//select[@id='suffix1']")
		public WebElement suffix1;
		
		@FindBy(xpath="//select[@id='gender1']")
		public WebElement gender1;
		
		@FindBy(xpath="//select[@id='dobMonth1']")
		public WebElement month1;
		
		@FindBy(xpath="//input[@id='dobDay1']")
		public WebElement day1;
		
		@FindBy(xpath="//input[@id='dobYear1']")
		public WebElement year1;
		
		@FindBy(xpath="//input[@id='firstName2']")
		public WebElement firstName2;
		
		@FindBy(xpath="//input[@id='lastName2']")
		public WebElement lastName2;
		
		@FindBy(xpath="//select[@id='suffix2']")
		public WebElement suffix2;
		
		@FindBy(xpath="//select[@id='gender2']")
		public WebElement gender2;
		
		@FindBy(xpath="//select[@id='dobMonth2']")
		public WebElement month2;
		
		@FindBy(xpath="//input[@id='dobDay2']")
		public WebElement day2;
		
		@FindBy(xpath="//input[@id='dobYear2']")
		public WebElement year2;
		
		@FindBy(xpath="//input[@id='firstName3']")
		public WebElement firstName3;
		
		@FindBy(xpath="//input[@id='lastName3']")
		public WebElement lastName3;
		
		@FindBy(xpath="//select[@id='suffix3']")
		public WebElement suffix3;
		
		@FindBy(xpath="//select[@id='gender1']")
		public WebElement gender3;
		
		@FindBy(xpath="//select[@id='dobMonth3']")
		public WebElement month3;
		
		@FindBy(xpath="//input[@id='dobDay3']")
		public WebElement day3;
		
		@FindBy(xpath="//input[@id='dobYear3']")
		public WebElement year3;
		
		@FindBy(xpath="//input[@id='firstName4']")
		public WebElement firstName4;
		
		@FindBy(xpath="//input[@id='lastName4']")
		public WebElement lastName4;
		
		@FindBy(xpath="//select[@id='suffix4']")
		public WebElement suffix4;
		
		@FindBy(xpath="//select[@id='gender4']")
		public WebElement gender4;
		
		@FindBy(xpath="//select[@id='dobMonth4']")
		public WebElement month4;
		
		@FindBy(xpath="//input[@id='dobDay4']")
		public WebElement day4;
		
		@FindBy(xpath="//input[@id='dobYear4']")
		public WebElement year4;
		
		@FindBy(xpath="//input[@id='firstName5']")
		public WebElement firstName5;
		
		@FindBy(xpath="//input[@id='lastName5']")
		public WebElement lastName5;
		
		@FindBy(xpath="//select[@id='suffix5']")
		public WebElement suffix5;
		
		@FindBy(xpath="//select[@id='gender5']")
		public WebElement gender5;
		
		@FindBy(xpath="//select[@id='dobMonth5']")
		public WebElement month5;
		
		@FindBy(xpath="//input[@id='dobDay5']")
		public WebElement day5;
		
		@FindBy(xpath="//input[@id='dobYear5']")
		public WebElement year5;
		
		@FindBy(xpath="//input[@id='firstName6']")
		public WebElement firstName6;
		
		@FindBy(xpath="//input[@id='lastName6']")
		public WebElement lastName6;
		
		@FindBy(xpath="//select[@id='suffix6']")
		public WebElement suffix6;
		
		@FindBy(xpath="//select[@id='gender6']")
		public WebElement gender6;
		
		@FindBy(xpath="//select[@id='dobMonth6']")
		public WebElement month6;
		
		@FindBy(xpath="//input[@id='dobDay6']")
		public WebElement day6;
		
		@FindBy(xpath="//input[@id='dobYear6']")
		public WebElement year6;
		
		@FindBy(xpath="//input[@id='firstName7']")
		public WebElement firstName7;
		
		@FindBy(xpath="//input[@id='lastName7']")
		public WebElement lastName7;
		
		@FindBy(xpath="//select[@id='suffix7']")
		public WebElement suffix7;
		
		@FindBy(xpath="//select[@id='gender7']")
		public WebElement gender7;
		
		@FindBy(xpath="//select[@id='dobMonth7']")
		public WebElement month7;
		
		@FindBy(xpath="//input[@id='dobDay7']")
		public WebElement day7;
		
		@FindBy(xpath="//input[@id='dobYear7']")
		public WebElement year7;
		
		@FindBy(xpath="//input[@id='ccNum1']")
		public WebElement creditNo;
		
		@FindBy(xpath="//select[@id='expMonth1']")
		public WebElement expMonth;
		
		@FindBy(xpath="//select[@id='expYear1']")
		public WebElement expYear;
		
		@FindBy(xpath="//input[@id='cvv1']")
		public WebElement cvv;
		
		@FindBy(xpath="//input[@id='paymentName1']")
		public WebElement cardHolder;
		
		@FindBy(xpath="//select[@id='paymentCountry1']")
		public WebElement country;//paymanetCity1
		
		@FindBy(xpath="//input[@id='paymentAddress1']")
		public WebElement billingAddress;
		
		@FindBy(xpath="//input[@id='paymanetCity1']")
		public WebElement paymentCity;
		
		@FindBy(xpath="//input[@id='paymentPhone1']")
		public WebElement paymentPhone;
		
		@FindBy(xpath="//input[@id='email']")
		public WebElement contactEmail;
		
		@FindBy(xpath="//input[@id='password']")
		public WebElement createPassword;
		
		@FindBy(xpath="//input[@id='confirmPassword']")
		public WebElement confirmPassword;
		
	}


