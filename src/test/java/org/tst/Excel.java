package org.tst;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Excel extends Base {
	public static void main(String[] args) throws IOException, InterruptedException  {
	     Base a = new Base();
	     a.getDriver();
	   a.loadUrl("https://adactinhotelapp.com/");
	   a.userName("Gokul2109", "gokul@2109");
	   a.Login();
	   WebElement location = driver.findElement(By.id("location"));
	   String s1 = a.getData(1, 0);
	   a.sendKeys(location, s1);
	   WebElement hotel = driver.findElement(By.id("hotels"));
       String s2 = a.getData(1, 1);
       a.sendKeys(hotel, s2);
      WebElement roomType = driver.findElement(By.id("room_type"));
      String s3 = a.getData(1, 2);
      a.sendKeys(roomType, s3);
      WebElement roomNumber = driver.findElement(By.id("room_nos"));
      String s4 = a.getData(1, 3);
      a.sendKeys(roomNumber, s4);
      WebElement inDate = driver.findElement(By.id("datepick_in"));
      inDate.sendKeys("08-09-2021");
      WebElement outDate = driver.findElement(By.id("datepick_out"));
      outDate.sendKeys("09-09-2021");
      WebElement adultsRoom = driver.findElement(By.id("adult_room"));
      String s7 = a.getData(1, 6);
      a.sendKeys(adultsRoom, s7);
      WebElement childRoom = driver.findElement(By.id("child_room"));
      String s8 = a.getData(1, 7);
      a.sendKeys(childRoom, s8);
      WebElement submit = driver.findElement(By.id("Submit"));
      a.click(submit);
      WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
      a.click(btnRadio);
      WebElement btnContinue = driver.findElement(By.id("continue"));
      a.click(btnContinue);
      WebElement firstName = driver.findElement(By.id("first_name"));
      a.sendKeys(firstName," Shalini");
      //WebElement lastName = driver.findElement(By.id("last_name"));
      WebElement lastName = driver.findElement(By.id("last_name"));
      a.sendKeys(lastName, " Thiyagu");
      WebElement address = driver.findElement(By.id("address"));
      a.sendKeys(address, "Chennai");
      WebElement creditCard = driver.findElement(By.id("cc_num"));
      a.sendKeys(creditCard, "1526348759685890");
      WebElement creditCard_Type = driver.findElement(By.id("cc_type"));
      a.SelectOptionsByVisibletext(creditCard_Type, a.getData(1, 9));
      WebElement selectMonth = driver.findElement(By.id("cc_exp_month"));
      a.SelectOptionsByVisibletext(selectMonth, a.getData(1, 10));
      WebElement selectYear = driver.findElement(By.id("cc_exp_year"));
      a.SelectOptionsByVisibletext(selectYear, a.getData(1, 11));
      WebElement cardCvv = driver.findElement(By.id("cc_cvv"));
      a.sendKeys(cardCvv, "456");
      WebElement bookNow = driver.findElement(By.id("book_now"));
      a.click(bookNow);
      Thread.sleep(5000);
      
      WebElement orderId = driver.findElement(By.id("order_no"));
      String attribute = a.getAttribute(orderId);
      System.out.println(attribute);
      a.workbook(1, 12, attribute);
     
      
	}

}
