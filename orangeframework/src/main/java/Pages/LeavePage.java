package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.Testbase.Testbase;

public class LeavePage extends Testbase {
	public void clickLeaveButton()  {
		driver.findElement(By.xpath("//span[normalize-space()='Leave']")).click();
		
	}
	
	
public void verifyApplicationLeave()  {
		
		
		WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Leave']")));
	}
}
