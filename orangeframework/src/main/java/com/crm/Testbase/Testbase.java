package com.crm.Testbase;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.FileInputStream;

public class Testbase {
	
	
   static protected Properties prop;
	 static protected WebDriver driver;

	public void lodProperty() throws IOException {
		prop=new Properties();
		FileInputStream fip=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/config.properties");
		prop.load(fip);

	}
	
	@BeforeClass
	public void GoogleSetUp() throws IOException
	{
		lodProperty();	
		System.setProperty("webriver.Chrome.driver","C:\\DRIverforSelenium\\chromedriver.exe");
	      driver= new ChromeDriver();
	      driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	   
	     System.out.println(prop.get("url")+"");
			
			driver.get(prop.get("url")+"");
}
	
	
		@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}

	
		
		
		

	


		
	


