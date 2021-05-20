package com.Phptravel.qa.testcase;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.phptravel.qa.base.Testbase;
import com.phptravel.qa.pages.HomePage;

public class HomepageTC extends Testbase {
	HomePage homepage;
	
	public HomepageTC() {
		super();
	}
	
	@BeforeTest
	public void Setup() throws InterruptedException{
		initialisation();
		// test
	}	
	
	@Test
	public void pricelinkclick(){
		homepage = new HomePage();
		homepage.price();
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(7000);
		driver.quit();
	}
	

}
