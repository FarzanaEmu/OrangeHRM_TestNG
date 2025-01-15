package ActualTestcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.DashboardPage;
import Pages.LeavePage;
import Pages.MyInfoPage;

public class LeaveTestcase {
	DashboardPage dp =new DashboardPage();
	MyInfoPage info;
	LeavePage lp;
	 LoginTestCase logintest;

	  //  @BeforeClass
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
