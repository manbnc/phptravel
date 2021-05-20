package com.phptravel.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravel.qa.base.Testbase;

public class HomePage extends Testbase {
	
	@FindBy(xpath = "//a[contains(text(),'Pricing')]")
	WebElement pricelink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void price() {
		pricelink.click();
		
	}
	
}
