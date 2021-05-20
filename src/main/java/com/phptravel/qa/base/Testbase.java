package com.phptravel.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testbase {
	public static WebDriver driver;
	public static Properties prop;

public Testbase()  {
	
	prop = new Properties();
	try {
		
	FileInputStream fis = new FileInputStream("C:\\Users\\Manoj\\eclipse-workspace\\PHPTravels\\src\\main\\java\\com\\phptravel\\qa\\config\\config.properties");
	prop.load(fis);
	}

	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}

}
	
	public static void initialisation () {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manoj\\Downloads\\selenium jar\\Drivers\\chromedriver.exe" );
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
}
}
