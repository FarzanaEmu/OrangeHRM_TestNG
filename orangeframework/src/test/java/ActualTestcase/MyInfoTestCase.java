package ActualTestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.Testbase.Testbase;

import Pages.DashboardPage;

import Pages.MyInfoPage;

public class MyInfoTestCase extends Testbase {

	DashboardPage dp =new DashboardPage();
	MyInfoPage info;
	
	 LoginTestCase logintest;

	    @BeforeClass
	    public   void Background() throws InterruptedException {
	    	LoginTestCase logintest = new LoginTestCase();
	        logintest. entercredentials();   
	        logintest.cliclloginBtn(); 
	        logintest. DashboardPage();    
	        
	    }
	
	
	
		@Test(priority=1)
	public void clickMyInfoButton() {
			info=dp.clickMyInfoButton();
		}
		 
		@Test(priority=2)
		   public void verifyApplicationMyInfo() {
			info.verifyApplicationMyInfo();
		}
		
		
		@Test(priority=3)
				public void entertheCredentails() {
					info.entertheCredentails();
				}
				
		
		@Test(priority = 4)
		@Parameters({"EmPloyeeID", "OtherId"})
		public void putemployeeId(String EmPloyeeID, String OtherId) throws InterruptedException {
		    info.putemployeeId(EmPloyeeID, OtherId);
		}
	
		@Test(priority = 5)
		public void driverlicence() throws InterruptedException {
			info.driverlicence();
		}
       

       
       
        // Driver's License Number
       // WebElement licenseNumberField = driver.findElement(By.id("licenseNumber")); // Replace with actual locator
        //licenseNumberField.clear();
       // licenseNumberField.sendKeys("56788");

        // License Expiry Date
       // WebElement expiryDateField = driver.findElement(By.id("expiryDate")); // Replace with actual locator
       // expiryDateField.clear();
      //  expiryDateField.sendKeys("2023-10-18");

        // Submit the form (if applicable)
      //  WebElement submitButton = driver.findElement(By.id("submitButton")); // Replace with actual locator
       // submitButton.click();

       // System.out.println("Form filled and submitted successfully!");

		
		
		  

}
