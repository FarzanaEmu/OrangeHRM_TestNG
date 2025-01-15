package Pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.Testbase.Testbase;

public class MyInfoPage extends Testbase{

	
	
	public void clickMyinfoButton() {
		driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
		
	}
	
	
public void verifyApplicationMyInfo()  {
		
		
		WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='My Info']")));
	}
	


public void entertheCredentails() {
//	 // Employee Full Name
	// WebElement fullNameField = driver.findElement(By.xpath("//label[@class='oxd-label oxd-input-field-required']")); 
      // fullNameField.clear();
      // fullNameField.sendKeys("John Doe");

       // First Name
       WebElement firstNameField = driver.findElement(By.xpath("//input[@placeholder='First Name']")); 
      
        firstNameField.clear();
       firstNameField.sendKeys("John");

       // Middle Name
       WebElement middleNameField = driver.findElement(By.xpath("//input[@placeholder='Middle Name']")); 
       middleNameField.clear();
       middleNameField.sendKeys("RnpQkhNPop");
	
}




//@Test
@Parameters({"firstName", "MiddleName"})
public void entertheCredentails (String firstName, String MiddleName)

	{
	 // First Name
    WebElement firstNameField = driver.findElement(By.xpath("//input[@placeholder='First Name']")); 
   
     firstNameField.clear();
    firstNameField.sendKeys(firstName);

    // Middle Name
    WebElement middleNameField = driver.findElement(By.xpath("//input[@placeholder='Middle Name']")); 
    middleNameField.clear();
    middleNameField.sendKeys(MiddleName);
	
	}
	     


public void putemployeeId(String EmPloyeeID, String OtherID) throws InterruptedException  {
	Thread.sleep(4000);
	 WebElement employeeIdField = driver.findElement(By.xpath("//label[normalize-space()='Employee Id']/parent::div/following-sibling::div/input")); 
	 employeeIdField.click();
	 employeeIdField.clear();
     employeeIdField.sendKeys(EmPloyeeID);

     // Other ID
     Thread.sleep(4000);
     WebElement otherIdField = driver.findElement(By.xpath("//label[normalize-space()='Other Id']")); 
    // otherIdField.clear();
     otherIdField.sendKeys(OtherID);

	
}

public void driverlicence() throws InterruptedException {
	
	   Thread.sleep(4000);
	WebElement licenseNumberField = driver.findElement(By.xpath("//label[contains(text(),'Driver')]/parent::div/following-sibling::div/input")); 
 //
	licenseNumberField.click();
	licenseNumberField.clear();
    licenseNumberField.sendKeys("56788");

	
}




}
