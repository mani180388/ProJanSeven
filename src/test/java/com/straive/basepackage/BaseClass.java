package com.straive.basepackage;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static void browserLaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			}
		else if (browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			}
			}
	
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void launchURL(String URL) {
		driver.navigate().to(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	public static String readProp(String key) throws IOException {
		Properties po=new Properties();
		File fl=new File("C:\\Users\\Peter Praveen\\eclipse-workspace\\CheapAir_WebApp\\src\\test\\resources\\Credentials.properties");
		FileInputStream fis=new FileInputStream(fl);
		po.load(fis);
		return po.getProperty(key);
	}
	public static String readExcel(int x, int y) throws IOException {
		File fl=new File("D:\\Automation Testing\\Project\\CheapAirProject\\UserDetails.xlsx");
		FileInputStream fis=new FileInputStream(fl);
		Workbook wk=new XSSFWorkbook(fis);
		Sheet sht=wk.getSheetAt(0);
		int rowsNo=sht.getPhysicalNumberOfRows();
		
		
			Row row=sht.getRow(x);
			int colNo=row.getPhysicalNumberOfCells();
			Cell cel=row.getCell(y);		
			
		return cel.getStringCellValue();
	}
	
	
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
			
	}
	
	public static String getPageTitle() {
		return driver.getTitle();
	}
	
	public static void sendKeys(WebElement elem, String keys) {
		elem.sendKeys(keys);		
	}
	
	
	
	public static void click(WebElement elem) {
		elem.click();
	}
	public static void submit(WebElement elem) {
		elem.submit();
	}
	
	public static boolean isElementDisplayed(WebElement elem) {
		return elem.isDisplayed();
	}
	
	public static boolean isElementEnabled(WebElement elem) {
		return elem.isEnabled();
	}
	
	public static void scrollForElem(WebElement elem) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", elem);
		}
	
	public static void clickJS(WebElement elem) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", elem);
		}
	public static void closeBrowser() {
		driver.quit();
	}
	public static void refreshBrwoser() {
		driver.navigate().refresh();
	}
	
	public static void takeScreenShot() throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File ssFile = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ssFile, new File("D:\\Automation Testing\\Project\\CheapAirProject\\Screenshot"+LocalDateTime.now()+".png"));
		System.out.println("Screenshot is saved");
	}
	
	public static void selectByValue(WebElement elem, String value) {
		Select slc=new Select(elem);
		slc.selectByValue(value);
		
	}
	
	public static void selectByIndex(WebElement elem, int index) {
		Select slc=new Select(elem);
		slc.selectByIndex(index);	
		
	}
	
	public static void clearElement(WebElement elem) {
		elem.clear();
	}
public static void explicitWait(WebElement elem) {
	WebDriverWait wait = new WebDriverWait(driver,3);
	wait.until(ExpectedConditions.elementToBeClickable(elem));
}

public static void keyPress(String key) {
	if(key.equalsIgnoreCase("tab")) {
	try {
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);

		rb.keyRelease(KeyEvent.VK_TAB);
		
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}else if(key.equalsIgnoreCase("enter")){
		try {
			Robot rb=new Robot();
			rb.keyPress(KeyEvent.VK_ENTER);

			rb.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


public static void switchWindow(int n) {
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> windows=new ArrayList<>();
	for (String string : windowHandles) {
		windows.add(string);
		
	}
	
	driver.switchTo().window(windows.get(n));
}

}



