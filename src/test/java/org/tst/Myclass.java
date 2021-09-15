package org.tst;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Myclass {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Base a = new Base();
		WebDriver driver = a.getDriver();
		a.loadUrl("https://blazedemo.com/");
		     //pojo 1
		Po1 b = new Po1();
		WebElement depaturecity = b.getDepaturecity();
		String s1 = a.getData(1, 0);
		a.sendKeys(depaturecity, s1);
		WebElement destinationcity = b.getDestinationcity();
		String s2 = a.getData(1, 1);
		a.sendKeys(destinationcity, s2);
		WebElement find = b.getFind();
		a.click(find);
		//pojo2
       Po2 c = new Po2();
	     WebElement chooseflight = c.getChooseflight();
	     a.click(chooseflight);
	   //  pojo 3
	  Po3 d=new Po3();
	  WebElement firstname = d.getFirstname();
	  String s3 = a.getData(1, 2);
	  a.sendKeys(firstname, s3);
	  WebElement address = d.getAddress();
	  String s4 = a.getData(1, 3);
	  a.sendKeys(address, s4);
	  WebElement city = d.getCity();
	  String s5 = a.getData(1, 4);
	  a.sendKeys(city, s5);
	  WebElement state = d.getState();
	  String s6 = a.getData(1, 5);
	  a.sendKeys(state, s6);
	  WebElement zipcode = d.getZipcode();
	  String s7 = a.getData(1, 6);
	  a.sendKeys(zipcode, s7);
	  WebElement cardtype = d.getCardtype();
	  String s8 = a.getData(1, 7);
	  a.sendKeys(cardtype, s8);
	  WebElement creditcardno = d.getCreditcardno();
	  String s9 = a.getData(1, 8);
	  a.sendKeys(creditcardno, s9);
	  WebElement month = d.getMonth();
	  String s10 = a.getData(1, 9);
	  a.sendKeys(month, s10);
	  WebElement year = d.getYear();
	  String s11 = a.getData(1, 10);
	  a.sendKeys(year, s11);
	  WebElement nameoncard = d.getNameoncard();
	  String s12 = a.getData(1, 11);
	  a.sendKeys(nameoncard, s12);
	  WebElement submit = d.getSubmit();
	  a.click(submit);
	  
	 //get attribute
	  WebElement table = driver.findElement(By.xpath("//table//tr[1]//td[2]"));
	  String attribute = table.getText();
	  System.out.println(attribute);
	  
	  //write in excel
 a.workbook(1, 12, attribute );
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	    
		
		
		
		
		
	}

}
