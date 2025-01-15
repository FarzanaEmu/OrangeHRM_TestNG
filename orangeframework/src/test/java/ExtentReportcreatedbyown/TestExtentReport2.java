package ExtentReportcreatedbyown;

import java.io.File;
import java.io.IOException;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.awt.Desktop;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
public class TestExtentReport2 {

	


		  public static void main(String[] args) throws IOException {
		        // Initialize ExtentReports
		        ExtentReports extentReports = new ExtentReports();

		        // Specify the report file location
		        String reportPath = "C:\\Users\\jabba\\Seleniumnew\\orangeframework\\src\\test\\java\\ExtentReportcreatedbyown\\spark.html";
		        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);

		        // Attach the reporter to ExtentReports
		        extentReports.attachReporter(sparkReporter);

		        // Create and log test details
		        ExtentTest test1 = extentReports.createTest("Test 1");
		       // test1.info("Starting Test 1");
		      //  test1.pass("Test 1 Passed Successfully");
		        test1.log(Status.INFO, "Starting Test 1");
		        test1.log(Status.PASS, "Test 1 Passed Successfully");

		        ExtentTest test2 = extentReports.createTest("Test 2");
		       // test2.info("Starting Test 2");
		       // test2.fail("Test 2 Failed");
		        test2.log(Status.INFO, "Starting Test 2");
		        test2.log(Status.FAIL, "Test 2 Failed");
		        
		        // Test 3: Skipped Test
		        ExtentTest test3 = extentReports.createTest("Test 3");
		       // test3.info("Starting Test 3");
		       // test3.skip("Test 3 Skipped");
		        test3.log(Status.INFO, "Starting Test 3");
		        test3.log(Status.SKIP, "Test 3 Skipped");

		        // Save the report
		        extentReports.flush();

		        // Automatically open the report in the default browser
		        File reportFile = new File(reportPath);
		        if (reportFile.exists()) {
		            java.awt.Desktop.getDesktop().browse(reportFile.toURI());
		        } else {
		            System.out.println("Report file not found.");
		        }
		    }

    

	}


