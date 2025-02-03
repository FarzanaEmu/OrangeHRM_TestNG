package ActualTestcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.Testbase.Testbase;

import Pages.DashboardPage;
import Pages.LeavePage;
import Pages.MyInfoPage;

public class LeaveTestcase  extends Testbase{
	DashboardPage dp =new DashboardPage();
	MyInfoPage info;
	LeavePage lp;
	 LoginTestCase logintest;
	 
	 

	    @BeforeMethod
	    public   void Background() throws InterruptedException {
	    	LoginTestCase logintest = new LoginTestCase();
	        logintest. entercredentials();   
	        logintest.cliclloginBtn(); 
	        logintest. DashboardPage();    
	        
	    }
	
	
	
		@Test(priority=1)
	public void  clickLeaveButton() {
			lp=dp. clickLeaveButton();
		}
		 
		@Test(priority=2)
		   public void verifyApplicationLeave() {
			lp.verifyApplicationLeave();
		}
		
}
