package Pages;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.Testbase.Testbase;


public class LoginPage extends Testbase{


      
	
	
	
	
	public void entertheCredentails(String Username, String Password) {
//Wait statement for the user id
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Username']")));
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Username);
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
	 

	}
	
	
	
	public DashboardPage  cliclloginBtn()
	{
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
		return new DashboardPage();
	}
	

	
	
}

	
