package com.straive.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.straive.basepackage.BaseClass;

public class PassengerDetail_PaymentDetail_Page extends BaseClass {
	
	public PassengerDetail_PaymentDetail_Page(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//button[@class='DismissibleFixedFooter__RoundButton-sc-704e26-1 fpvsKc']")
	private WebElement popUpClose;
	
	public WebElement getpopUpClose() {
		return popUpClose;
	}
	
	@FindBy (xpath="//input[@id='firstName1']")
	private WebElement firstName1;
	
	@FindBy (xpath="//input[@id='firstName2']")
	private WebElement firstName2;
	
	@FindBy (xpath="//input[@id='firstName3']")
	private WebElement firstName3;
	
	@FindBy (xpath="//input[@id='firstName4']")
	private WebElement firstName4;
	
	@FindBy (xpath="//input[@id='firstName5']")
	private WebElement firstName5;
	
	@FindBy (xpath="//input[@id='firstName6']")
	private WebElement firstName6;
	
	@FindBy (xpath="//input[@id='lastName1']")
	private WebElement lastName1;
	
	@FindBy (xpath="//input[@id='lastName2']")
	private WebElement lastName2;
	
	@FindBy (xpath="//input[@id='lastName3']")
	private WebElement lastName3;
	
	@FindBy (xpath="//input[@id='lastName4']")
	private WebElement lastName4;
	
	@FindBy (xpath="//input[@id='lastName5']")
	private WebElement lastName5;
	
	@FindBy (xpath="//input[@id='lastName6']")
	private WebElement lastName6;
	
	@FindBy (xpath="//select[@id='suffix1']")
	private WebElement suffix1;
	
	@FindBy (xpath="//select[@id='suffix2']")
	private WebElement suffix2;
	
	@FindBy (xpath="//select[@id='suffix3']")
	private WebElement suffix3;
	
	@FindBy (xpath="//select[@id='suffix4']")
	private WebElement suffix4;
	
	@FindBy (xpath="//select[@id='suffix5']")
	private WebElement suffix5;
	
	@FindBy (xpath="//select[@id='suffix6']")
	private WebElement suffix6;
	
	@FindBy (xpath="//select[@id='gender1']")
	private WebElement gender1;
	
	@FindBy (xpath="//select[@id='gender2']")
	private WebElement gender2;
	
	@FindBy (xpath="//select[@id='gender3']")
	private WebElement gender3;
	
	@FindBy (xpath="//select[@id='gender4']")
	private WebElement gender4;
	
	@FindBy (xpath="//select[@id='gender5']")
	private WebElement gender5;
	
	@FindBy (xpath="//select[@id='gender6']")
	private WebElement gender6;
	
	@FindBy (xpath="//select[@id='dobMonth1']")
	private WebElement dobMonth1;
	
	@FindBy (xpath="//select[@id='dobMonth2']")
	private WebElement dobMonth2;
	
	@FindBy (xpath="//select[@id='dobMonth3']")
	private WebElement dobMonth3;
	
	@FindBy (xpath="//select[@id='dobMonth4']")
	private WebElement dobMonth4;
	
	@FindBy (xpath="//select[@id='dobMonth5']")
	private WebElement dobMonth5;
	
	@FindBy (xpath="//select[@id='dobMonth6']")
	private WebElement dobMonth6;
	
	@FindBy (xpath="//input[@id='dobDay1']")
	private WebElement dobDay1;
	
	@FindBy (xpath="//input[@id='dobDay2']")
	private WebElement dobDay2;
	
	@FindBy (xpath="//input[@id='dobDay3']")
	private WebElement dobDay3;
	
	@FindBy (xpath="//input[@id='dobDay4']")
	private WebElement dobDay4;
	
	@FindBy (xpath="//input[@id='dobDay5']")
	private WebElement dobDay5;
	
	@FindBy (xpath="//input[@id='dobDay6']")
	private WebElement dobDay6;
	
	@FindBy (xpath="//input[@id='dobYear1']")
	private WebElement dobYear1;
	
	@FindBy (xpath="//input[@id='dobYear2']")
	private WebElement dobYear2;
	
	@FindBy (xpath="//input[@id='dobYear3']")
	private WebElement dobYear3;
	
	@FindBy (xpath="//input[@id='dobYear4']")
	private WebElement dobYear4;
	
	@FindBy (xpath="//input[@id='dobYear5']")
	private WebElement dobYear5;
	
	@FindBy (xpath="//input[@id='dobYear6']")
	private WebElement dobYear6;
	
	@FindBy (xpath="//div[@class='pay-option-type-group clearfix']//label[1]")
	private WebElement creditCardOpt;
	
	@FindBy (xpath="//input[@id='ccNum1']")
	private WebElement creditCardNum;
	
	@FindBy(xpath="//select[@id='expMonth1']")
	private WebElement ccExpMonth;
	
	@FindBy(xpath="//select[@id='expYear1']")
	private WebElement ccExpYear;
	
	@FindBy(xpath="//input[@id='cvv1']")
	private WebElement ccCVV;
	
	@FindBy(xpath="//input[@id='paymentName1']")
	private WebElement creditCardHolder;
	
	@FindBy(xpath="//select[@id='paymentCountry1']")
	private WebElement country;
	
	@FindBy(xpath="//input[@id='paymentAddress1']")
	private WebElement billingAddress;
	
	@FindBy (xpath="//button[@id='purchaseBtn']")
	private WebElement purchaseBtn;
	
	public WebElement getPurchaseBtn() {
		return purchaseBtn;
	}
	
	public WebElement getPopUpClose() {
		return popUpClose;
	}

	public WebElement getFirstName1() {
		return firstName1;
	}

	public WebElement getFirstName2() {
		return firstName2;
	}

	public WebElement getFirstName3() {
		return firstName3;
	}

	public WebElement getFirstName4() {
		return firstName4;
	}

	public WebElement getFirstName5() {
		return firstName5;
	}

	public WebElement getFirstName6() {
		return firstName6;
	}

	public WebElement getLastName1() {
		return lastName1;
	}

	public WebElement getLastName2() {
		return lastName2;
	}

	public WebElement getLastName3() {
		return lastName3;
	}

	public WebElement getLastName4() {
		return lastName4;
	}

	public WebElement getLastName5() {
		return lastName5;
	}

	public WebElement getLastName6() {
		return lastName6;
	}

	public WebElement getSuffix1() {
		return suffix1;
	}

	public WebElement getSuffix2() {
		return suffix2;
	}

	public WebElement getSuffix3() {
		return suffix3;
	}

	public WebElement getSuffix4() {
		return suffix4;
	}

	public WebElement getSuffix5() {
		return suffix5;
	}

	public WebElement getSuffix6() {
		return suffix6;
	}

	public WebElement getGender1() {
		return gender1;
	}

	public WebElement getGender2() {
		return gender2;
	}

	public WebElement getGender3() {
		return gender3;
	}

	public WebElement getGender4() {
		return gender4;
	}

	public WebElement getGender5() {
		return gender5;
	}

	public WebElement getGender6() {
		return gender6;
	}

	public WebElement getDobMonth1() {
		return dobMonth1;
	}

	public WebElement getDobMonth2() {
		return dobMonth2;
	}

	public WebElement getDobMonth3() {
		return dobMonth3;
	}

	public WebElement getDobMonth4() {
		return dobMonth4;
	}

	public WebElement getDobMonth5() {
		return dobMonth5;
	}

	public WebElement getDobMonth6() {
		return dobMonth6;
	}

	public WebElement getDobDay1() {
		return dobDay1;
	}

	public WebElement getDobDay2() {
		return dobDay2;
	}

	public WebElement getDobDay3() {
		return dobDay3;
	}

	public WebElement getDobDay4() {
		return dobDay4;
	}

	public WebElement getDobDay5() {
		return dobDay5;
	}

	public WebElement getDobDay6() {
		return dobDay6;
	}

	public WebElement getDobYear1() {
		return dobYear1;
	}

	public WebElement getDobYear2() {
		return dobYear2;
	}

	public WebElement getDobYear3() {
		return dobYear3;
	}

	public WebElement getDobYear4() {
		return dobYear4;
	}

	public WebElement getDobYear5() {
		return dobYear5;
	}

	public WebElement getDobYear6() {
		return dobYear6;
	}

	public WebElement getCreditCardOpt() {
		return creditCardOpt;
	}

	public WebElement getCreditCardNum() {
		return creditCardNum;
	}

	public WebElement getCcExpMonth() {
		return ccExpMonth;
	}

	public WebElement getCcExpYear() {
		return ccExpYear;
	}

	public WebElement getCcCVV() {
		return ccCVV;
	}

	public WebElement getCreditCardHolder() {
		return creditCardHolder;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getPaymentCity() {
		return paymentCity;
	}

	public WebElement getPaymentState() {
		return paymentState;
	}

	public WebElement getTelephone() {
		return telephone;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCreatePassword() {
		return createPassword;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}
	
	public WebElement getPaymentZipCode() {
		return paymentZipCode;
	}
	
	@FindBy (xpath="//input[@id='paymentZip1']")
	private WebElement paymentZipCode;
	
	
	@FindBy(xpath="//input[@id='paymanetCity1']")
	private WebElement paymentCity;
	
	@FindBy(xpath="//select[@id='paymentState1']")
	private WebElement paymentState;
	
	@FindBy (xpath="//div[@class='intl-tel-input']//input[@type='tel']")
	private WebElement telephone;
	
	@FindBy (xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement createPassword;
	
	@FindBy(xpath="//input[@id='confirmPassword']")
	private WebElement confirmPassword;
	
	
	
	
	
	
	
}
