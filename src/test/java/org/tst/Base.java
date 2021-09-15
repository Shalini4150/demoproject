package org.tst;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	static WebDriver driver;
	WebElement element;
	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public void loadUrl(String Url) {
		driver.get(Url);
	}
	public String  sendKeys(WebElement element,String value) {
	element.sendKeys(value);
	return value;
	}
	public void click(WebElement element) {
		element.click();
	}
	public static String getAttribute(WebElement element) {
		return element.getAttribute("value");
	}
	public void getAttribute(WebElement element, String data) {
		Select select=new Select(element);
		select.selectByValue(data);
		System.out.println(element);
	}
	public  void SelectOptionsIndex(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public  void SelectOptionsByVisibletext(WebElement element,String data) {
	Select select=new Select(element);
	select.selectByVisibleText(data);
	}
	public String getText(WebElement element) {
		return element.getText(); 
	}
	public  String gettingTitle() {
		String title = driver.getTitle();
		return title;
	}
	public String  gettingCurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public  void userName(String text,String pass) {
	WebElement txtusername = driver.findElement(By.id("username"));
	txtusername.sendKeys(text);
	WebElement txtpassword = driver.findElement(By.id("password"));
	txtpassword.sendKeys(pass);
	}
	public  void Login() {
		WebElement btnLogin = driver.findElement(By.id("login"));
        btnLogin.click();
	}
	public  void Select() {
		WebElement btnlocation = driver.findElement(By.xpath("//*[@id=\"location\"]"));
        btnlocation.click();
	}
	public String getData(int rownum,int cellnum) throws IOException {
		String Data = null;
		File file=new File("C:\\Users\\m.shalini\\eclipse-workspace\\Atactin\\Excel\\tamizh.xlsx");
		FileInputStream Stream = new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(Stream);
		Sheet sheet=workbook.getSheet("Sheet1");
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		int cellType = cell.getCellType();
		if (cellType==1) {
			 Data = cell.getStringCellValue();
			//Data  = cell.getStringCellValue();
			if (cellType==0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMM-yy");
					Data = dateFormat.format(date);
				}}
			}else {
				double d = cell.getNumericCellValue();
				long l =(long)d;
				Data = String.valueOf(l);
			}
		return Data;
	}
	public void dradAndDrop(WebElement sourse, WebElement destinaton) {
		Actions actions= new Actions(driver);
		actions.dragAndDrop(sourse, destinaton);
	}
	public void moveTo(WebElement target) {
		Actions actions=new Actions(driver);
		actions.moveToElement(target);
	}
	public void closeAllBrowser() {
		driver.quit();
	}
	public void workbook(int rownum,int cellnum,String data) throws IOException {
        File file=new File("C:\\Users\\m.shalini\\eclipse-workspace\\Atactin\\Excel\\tamizh.xlsx");
		FileInputStream Stream = new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(Stream);
		Sheet sheet=workbook.getSheet("Sheet1");
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream o = new FileOutputStream(file);
		workbook.write(o);
	}}

