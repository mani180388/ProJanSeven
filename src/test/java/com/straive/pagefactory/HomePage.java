package com.straive.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.straive.basepackage.BaseClass;

public class HomePage extends BaseClass {
	public HomePage() {
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy (xpath="//a[text()=\"CheapAir.com\"]")
	private WebElement titleLogo;

	@FindBy (id="from1")
	private WebElement fromLocation;
	
	
	@FindBy (id="to1")
	private WebElement toLocation;
	
	
	@FindBy (id="departs")
	private WebElement departDate;
	
	
	@FindBy (id="returns")
	private WebElement returnDate;
	
	
	@FindBy (xpath="//div[@tabindex='4']")
	private WebElement travelSeatOpt;
	
	
	@FindBy (xpath="//button[@tabindex='6']")
	private WebElement adultsIncreaseBtn;
	
	@FindBy (xpath="//button[@tabindex='10']")
	private WebElement childrensIncreaseBtn;
	
	@FindBy (xpath="//button[@tabindex='51']")
	private WebElement searchFlightBtn;
	
	@FindBy (id="cabin")
	private WebElement seatTypeOpt;
	
	public WebElement getSearchFlightBtn() {
		return searchFlightBtn;
	}
	
	public WebElement getSeatTypeOpt() {
		return seatTypeOpt;
	}
	
	public WebElement getChildrensIncreaseBtn() {
		return childrensIncreaseBtn;
	}
	
	public WebElement getAdultsIncreaseBtn() {
		return adultsIncreaseBtn;
	}
	
	
	
	public WebElement getTravelSeatOpt() {
		return travelSeatOpt;
	}
	
	
	public WebElement getDepartDate() {
		return departDate;
	}
	
	public WebElement getReturnDate() {
		return returnDate;
	}
	
	
	
	
	public WebElement getToLocation() {
		return toLocation;
	}
	
	public WebElement getFromLocation() {
		return fromLocation;
	}
	
	
	public WebElement getTitleLogo() {
		return titleLogo;
	}
	
	
	
	
	

}
