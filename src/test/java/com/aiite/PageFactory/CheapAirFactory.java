package com.aiite.PageFactory;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aiite.BaseClass.BaseClass;

public class CheapAirFactory extends BaseClass{

	public CheapAirFactory(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="from1")
	public WebElement fromDes;
	
	@FindBy(id="to1")
	public WebElement toDes;
	
	@FindBy(id="departs")
	public WebElement fromDate;
	
	@FindBy(id="returns")
	public WebElement toDate;
	
	@FindBy(id="options")
	public WebElement options;
	
	@FindBy(xpath="//input[@id='adults']//following::button[2]")
	public WebElement adults;
	
	@FindBy(xpath="//input[@id='seniors']//following::button[2]")
	public WebElement senior;
	
	@FindBy(xpath="//input[@id='children']//following::button[2]")
	public WebElement children;
	
	@FindBy(xpath="//input[@id='infants']//following::button[2]")
	public WebElement infants;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement submit;
	
	@FindBy(xpath="//parent::div//span[@class='sc-hdWpuu eNhbTE']//child::span[text()='Economy']//following::div[1]//child::span[@class='sc-heFykY dnRYbf']//child::span")
	public List<WebElement> prizelist;
	
	@FindBy(xpath="//div[text()='Continue']")
	public WebElement Continue;
	
	@FindBy(xpath="//input[@id='firstName1']")
	public WebElement firstName1;
	
	@FindBy(xpath="//input[@id='lastName1']")
	public WebElement lastName1;
	
	@FindBy(xpath="//select[@id='gender1']")
	public WebElement gender1;
	
	@FindBy(xpath="//select[@id='dobMonth1']")
	public WebElement dobMonth1;
	
	@FindBy(xpath="//input[@id='dobDay1']")
	public WebElement dobDay1;
	
	@FindBy(xpath="//input[@id='dobYear1']")
	public WebElement dobYear1;
	
	@FindBy(xpath="//input[@id='firstName2']")
	public WebElement firstName2;
	
	@FindBy(xpath="//input[@id='lastName2']")
	public WebElement lastName2;
	
	@FindBy(xpath="//select[@id='gender2']")
	public WebElement gender2;
	
	@FindBy(xpath="//select[@id='dobMonth2']")
	public WebElement dobMonth2;
	
	@FindBy(xpath="//input[@id='dobDay2']")
	public WebElement dobDay2;
	
	@FindBy(xpath="//input[@id='dobYear2']")
	public WebElement dobYear2;
	
	@FindBy(xpath="//input[@id='firstName3']")
	public WebElement firstName3;
	
	@FindBy(xpath="//input[@id='lastName3']")
	public WebElement lastName3;
	
	@FindBy(xpath="//select[@id='gender3']")
	public WebElement gender3;
	
	@FindBy(xpath="//select[@id='dobMonth3']")
	public WebElement dobMonth3;
	
	@FindBy(xpath="//input[@id='dobDay3']")
	public WebElement dobDay3;
	
	@FindBy(xpath="//input[@id='dobYear3']")
	public WebElement dobYear3;
	
	@FindBy(xpath="//input[@id='firstName4']")
	public WebElement firstName4;
	
	@FindBy(xpath="//input[@id='lastName4']")
	public WebElement lastName4;
	
	@FindBy(xpath="//select[@id='gender4']")
	public WebElement gender4;
	
	@FindBy(xpath="//select[@id='dobMonth4']")
	public WebElement dobMonth4;
	
	@FindBy(xpath="//input[@id='dobDay4']")
	public WebElement dobDay4;
	
	@FindBy(xpath="//input[@id='dobYear4']")
	public WebElement dobYear4;
	

	@FindBy(xpath="//input[@id='firstName5']")
	public WebElement firstName5;
	
	@FindBy(xpath="//input[@id='lastName5']")
	public WebElement lastName5;
	
	@FindBy(xpath="//select[@id='gender5']")
	public WebElement gender5;
	
	@FindBy(xpath="//select[@id='dobMonth5']")
	public WebElement dobMonth5;
	
	@FindBy(xpath="//input[@id='dobDay5']")
	public WebElement dobDay5;
	
	@FindBy(xpath="//input[@id='dobYear5']")
	public WebElement dobYear5;
	

	@FindBy(xpath="//input[@id='firstName6']")
	public WebElement firstName6;
	
	@FindBy(xpath="//input[@id='lastName6']")
	public WebElement lastName6;
	
	@FindBy(xpath="//select[@id='gender6']")
	public WebElement gender6;
	
	@FindBy(xpath="//select[@id='dobMonth6']")
	public WebElement dobMonth6;
	
	@FindBy(xpath="//input[@id='dobDay6']")
	public WebElement dobDay6;
	
	@FindBy(xpath="//input[@id='dobYear6']")
	public WebElement dobYear6;
	
	@FindBy(xpath="//label[@class='pay-option-type active']")
	public WebElement CreditCard;
	
	@FindBy(xpath="//input[@id='ccNum1']")
	public WebElement CardDetails;
	
	@FindBy(xpath="//select[@id='expMonth1']")
	public WebElement expMonth;
	
	@FindBy(xpath="//select[@id='expYear1']")
	public WebElement expYear;
		
	@FindBy(xpath="//input[@id='cvv1']")
	public WebElement cvv1;
	
	@FindBy(xpath="//input[@id='paymentName1']")
	public WebElement paymentName;
	
	@FindBy(xpath="//select[@id='paymentCountry1']")
	public WebElement Country;
	
	@FindBy(xpath="//input[@id='paymentAddress1']")
	public WebElement Address;

	@FindBy(xpath="//input[@id='paymentAddress21']")
	public WebElement Address1;
	
	@FindBy(xpath="//input[@id='paymanetCity1']")
	public WebElement City;

	@FindBy(xpath="//input[@id='paymentState1']")
	public WebElement State;

	@FindBy(xpath="//input[@id='paymentZip1']")
	public WebElement Zipcode;

	@FindBy(xpath="//input[@id='paymentPhone1']")
	public WebElement PhoneNum;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement emailv;

	@FindBy(xpath="//input[@id='password']")
	public WebElement passw;
	
	@FindBy(xpath="//input[@id='confirmPassword']")
	public WebElement confpassw;
	
	@FindBy(xpath="//input[@id='termsCheck']")
	public WebElement clickbox;
	
	@FindBy(xpath="//input[@id='purchaseBtn']")
	public WebElement purchasclick;
	

	
	
	

}
