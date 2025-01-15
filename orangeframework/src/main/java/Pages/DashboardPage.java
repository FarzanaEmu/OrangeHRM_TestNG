package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.crm.Testbase.Testbase;

public class DashboardPage extends Testbase {

    public void verifyDashboardPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")));
        
        // Verify the title contains "OrangeHRM"
        Assert.assertTrue(driver.getTitle().contains("OrangeHRM"), "Dashboard page title does not contain 'OrangeHRM'");
    }

    public MyInfoPage clickMyInfoButton() {
        driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
        return new MyInfoPage();
    }

    public LeavePage clickLeaveButton() {
        driver.findElement(By.xpath("//span[normalize-space()='Leave']")).click();
        return new LeavePage();
    }
}

