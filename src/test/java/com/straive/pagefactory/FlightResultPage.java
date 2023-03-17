package com.straive.pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.straive.basepackage.BaseClass;

public class FlightResultPage extends BaseClass{
	
	public FlightResultPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"body\"]/div[9]/div/div/div/div/div/div/div/button")
	private WebElement popUpClose;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailPop;
	
	@FindBy (xpath="//span[@class='sc-bTTELM fLPeYw']")
	private WebElement sortOpt;
	
	@FindBy (xpath="//div[@class='src__Box-sc-1sbtrzs-0 gA-dsgf']//div[5]")
	private WebElement sortPriceOpt;
	
	
	@FindBy (xpath="//*[@id=\"flightResultsTarget\"]/div/div[2]/div/div/div/div[2]/div[3]/div[2]/div[1]/div/div/div[2]/div[2]")
	private WebElement priceLowTo;
	
	@FindBy (xpath="//*[@id=\"flightResultsTarget\"]/div/div[2]/div/div/div/div[2]/div[3]/div[2]/div[1]/div/div/div[2]/div[2]/div/div[2]/div[3]")
	private WebElement priceLowReturn;
	
	
	@FindBy (xpath="//table//tfoot//td[3]//span//span")
	private List<WebElement> totalFare;
	
	@FindBy (xpath="//table[@class='table__Table-sc-9iy587-0 dxOsdV']//child::th")
	public List<WebElement> fareTableHead;
	
	@FindBy (xpath="//table[@class='table__Table-sc-9iy587-0 dxOsdV']//child::td")
	public List<WebElement> fareTableData;
	
@FindBy (xpath="//table[@class='table__Table-sc-9iy587-0 dxOsdV']//child::tr")
public List<WebElement> fareTableRow;

@FindBy (xpath="//div[@class='sc-fnGiBr bJsruJ']")
private WebElement continueBtn;

public WebElement getContinueBtn(){
	return continueBtn;
}

	
	
	public List<WebElement> getTotalFare(){
		return totalFare;
	}
	
	
	
	public WebElement getPriceLowReturn(){
		return priceLowReturn;
	}
	
	public WebElement getPriceLowTo(){
		return priceLowTo;
	}
	
	
	
	public WebElement getSortOpt(){
		return sortOpt;
	}
	
	public WebElement getSortPriceOpt(){
		return sortPriceOpt;
	}
	
	
	public WebElement getEmailPop(){
		return emailPop;
	}
	
	
	public WebElement getPopUpClose(){
		return popUpClose;
	}
	
}
