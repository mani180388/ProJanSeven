package com.baseclass.airticket;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static	WebDriver driver;
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void urlLaunch(String url) {
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static WebElement getElementById(String Id) {
		return driver.findElement(By.id(Id));
	}
	public static WebElement getElementByXpath(String Xpath) {
		return driver.findElement(By.xpath(Xpath));
	}
	public static WebElement getElementByLinkText(String LinkText) {
		return driver.findElement(By.linkText(LinkText));
	}
	public static WebElement getElementByTagName(String TagName) {
		return driver.findElement(By.tagName(TagName));
	}

	public static String getProperty(String value) throws IOException {
		File file=new File("C:\\Users\\monap\\eclipse-workspace2\\CucumberProject\\src\\test\\resources\\Test.Properties\\Test.Prop");
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
		String property = prop.getProperty(value);
		return property;
	}
	public static String getExcel(int rowNumber,int columnNumber) throws IOException {
		File file=new File("C:\\Users\\Admin\\Downloads\\FlightBooking.xlsx");//if file path not given add string path in parameter
		FileInputStream fis=new FileInputStream(file);
		Workbook wk=new XSSFWorkbook(fis);
		Sheet sheet = wk.getSheet("Sheet1");//if file name not given add string name in parameter
		Row row = sheet.getRow(rowNumber);
		Cell cell=row.getCell(columnNumber);
		String value=cell.getStringCellValue();
		return value;
	}
	public static void takeScreenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File screenshot=new File("C:\\Users\\monap\\OneDrive\\Pictures\\Screenshots\\"+name+".png");
		FileHandler.copy(screenshotAs, screenshot);
	}
	public static void selectByValue(WebElement ele , String value) {
		Select ss = new Select (ele);
		ss.selectByValue(value);
	}

	public static void selectByIndex(WebElement ele , int index) {
		Select ss = new Select (ele);
		ss.selectByIndex(index);
	}
	public static void getwindow() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> list=new ArrayList<String>(allWindows);
//		for (String Windows : allWindows) {
//			list.add(Windows);
//		}
		driver.switchTo().window(list.get(1));
	}
	public static void browserClose() {
		driver.quit();
	}

}



