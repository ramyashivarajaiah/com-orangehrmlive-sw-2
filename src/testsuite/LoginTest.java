package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    /**
     * 3. Write down the following test into ‘LoginTest’ class
     * 1. userSholdLoginSuccessfullyWithValidCredentials
     * <p>
     * * Enter “Admin” username
     * * Enter “admin123 password
     * * Click on ‘LOGIN’ button
     * * Verify the ‘Dashboard’ text is display
     */

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.linkText("Dashboard"));
        String expectedText = "Dashboard";
        String actualText = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        Assert.assertEquals(expectedText, actualText);


    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
