package com.aiite.BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void browserLaunch(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void windowHandling() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>();
		for(String window:windowHandles) {
			list.add(window);
		}
		driver.switchTo().window(list.get(1));
	}
	public static void loadUrl(String url){
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public static String gurrentUrl(){
		return driver.getCurrentUrl();
	}

	public static String selectlocation(WebElement name,String value) {
		Select select=new Select(name);
		select.deselectByValue(value);
		return value;
	}

	public static void FindLowestPrize(List<WebElement> prizelist) throws InterruptedException {
		List<Integer> valueList = new ArrayList<Integer>();
		for (WebElement element : prizelist) {
			int value = Integer.parseInt(element.getText().replaceAll("\\$|,", ""));
			valueList.add(value);
		}
		int minValue = Collections.min(valueList);

		for (WebElement element : prizelist) {
			int value = Integer.parseInt(element.getText().replaceAll("\\$|,", ""));
			if (value == minValue) {
				element.click();
				break;
			}
		}

	}


	public static String ExcelFile(int row, int cell) throws IOException{
		File file=new File("F:\\Mani\\CheapAirProDetails.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wk=new XSSFWorkbook(fis);
		Sheet sheet=wk.getSheetAt(0);
		return sheet.getRow(row).getCell(cell).toString();
	}
	public static void robotMethod() throws AWTException {
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void esc() throws AWTException {
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_ESCAPE);
		ro.keyRelease(KeyEvent.VK_ESCAPE);
	}
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void Select(WebElement webelement, int index) {
		Select se = new Select(webelement);
		se.selectByIndex(index);
	
	}
	public static void Select1(WebElement webelement, String value) {
		Select se = new Select(webelement);
//		se.selectByValue(value);
		se.selectByVisibleText(value);
	
	}

}
