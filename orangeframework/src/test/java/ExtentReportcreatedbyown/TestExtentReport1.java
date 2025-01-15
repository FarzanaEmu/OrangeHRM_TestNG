package ExtentReportcreatedbyown;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;

public class TestExtentReport1 {

	public static void main(String[] args) throws IOException {
		
		ExtentReports extentReports = new ExtentReports();
      File file =new File("spark.html");
		
		ExtentSparkReporter sparkReport = new ExtentSparkReporter("C:\\Users\\jabba\\Seleniumnew\\orangeframework\\src\\test\\java\\ExtentReportcreatedbyown\\spark.html");
   // ExtentSparkReporter sparkReport = new ExtentSparkReporter(file);
      
      extentReports.attachReporter(sparkReport);
        
        
        extentReports.flush();
       // Desktop.getDesktop().browse(new File("spark.html").toURI());

         extentReports.createTest("Test 1");
        
        // extentReports.createTest("ScreenCapture")
               // .addScreenCaptureFromPath("extent.png")
               // .pass(MediaEntityBuilder.createScreenCaptureFromPath("extent.png").build());

     //   extentReports.createTest("LogLevels")
              //  .info("info")
               // .pass("pass")
              // .warning("warn")
               // .skip("skip")
               // .fail("fail");
	}

}
