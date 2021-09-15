package org.tst;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Po2 extends Base {
	public Po2() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='submit'])[3]")
	private WebElement chooseflight;

	public WebElement getChooseflight() {
		return chooseflight;
	}
	
	

}
   