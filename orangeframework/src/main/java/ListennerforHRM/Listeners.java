package ListennerforHRM;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners implements ITestListener{

	public void onTestStart(ITestResult tr)
	{
	   System.out.println( " Test started"+  tr.getName() );	
	}
	
	public void onTestSuccess(ITestResult tr)
	{
	    System.out.println( " Test passed"+ tr.getName() );	
	}
	
	public void onFailure(ITestResult tr)
	{
	    System.out.println( " Test failed" + tr.getName() );	
	}
	
	
	public void onTestSkiped(ITestResult tr)
	{
	     System.out.println( " Test skiped" + tr.getName());	
	}
}
