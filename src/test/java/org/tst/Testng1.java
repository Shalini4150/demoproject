package org.tst;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng1 {
    
	WebDriver driver;


     @BeforeClass
     private void getdat() {
    	 WebDriverManager.chromedriver().setup();
    	  driver = new ChromeDriver();
    	  driver.get("https://adactinhotelapp.com/");
    	  
 }
     @Parameters({"username","password"})
     @Test(priority=1)
     private void username(String s,String s1) {
 
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(s);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(s1);
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
}
     @Test(priority=2)
     private void location() {
		WebElement location = driver.findElement(By.id("location"));
		Select select = new Select(location);
		select.selectByIndex(3);
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select select2 =new Select(hotel);
		select2.selectByIndex(2);
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select select3=new Select(roomtype);
		select3.selectByIndex(3);
		WebElement roomno = driver.findElement(By.id("room_nos"));
		Select select4=new Select(roomno);
		select4.selectByIndex(2);
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select select5=new Select(adultroom);
		select5.selectByIndex(2);
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select select6=new Select(childroom);
		select6.selectByIndex(1);
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
	}
     @Test(priority=3)
     private void Select() {
	WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
	radiobtn.click();
     WebElement countinue = driver.findElement(By.id("continue"));
     countinue.click();
	
	}
     
   
     




	
}






	
	
	
	
