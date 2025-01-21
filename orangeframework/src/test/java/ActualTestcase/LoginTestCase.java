package ActualTestcase;

import org.testng.annotations.Test;

import com.crm.Testbase.Testbase;
import java.util.Properties;

import Pages.DashboardPage;
import Pages.LoginPage;

public class LoginTestCase extends Testbase{
	
	
     
  	LoginPage loginp = new LoginPage();
  	DashboardPage dp;
	
    @Test(priority=1)
	public void entercredentials() throws InterruptedException {
    	Thread.sleep(4000);
		loginp.entertheCredentails(Testbase.prop.getProperty("Username"),Testbase.prop.getProperty("Password") );
	}
	
	
	@Test(priority=2)
	public void  cliclloginBtn() {
		dp= loginp.cliclloginBtn();
	}


	
	@Test(priority=3)
	public void   DashboardPage()  {
		dp.verifyDashboardPage();
		System.out.println("Im in the Dashboard page");
	
	}
}
