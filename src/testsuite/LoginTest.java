package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void user() {
        openBrowser(baseUrl);
    }


    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

        driver.findElement(By.linkText("Log in")).click();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        Assert.assertEquals("Welcome message display", expectedText, actualText);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        driver.findElement(By.linkText("Log in")).click();
        //Find the Email Field Enter Email address
        driver.findElement(By.id("Email")).sendKeys("prime123@gmail.com");
        //Find the password Field and Enter the password
        driver.findElement(By.name("Password")).sendKeys("Prime123");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String expectedresult ="Log out";
        String actuallogout = driver.findElement(By.xpath("//a[text()='Log out']")).getText();
        Assert.assertEquals("log out test", actuallogout,expectedresult);
    }


    @Test
    public void verifyTheErrorMessage() {
        driver.findElement(By.linkText("Log in")).click();
        //Find the Email Field Enter Email address
        driver.findElement(By.id("Email")).sendKeys("prime123@gmail.com");
        //Find the password Field and Enter the password
        driver.findElement(By.name("Password")).sendKeys("Prime123");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String expectedmessage ="login unsuccessfull";
        String actualMessage = driver.findElement(By.xpath(" //div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error message",expectedmessage,actualMessage);
    }



    @After
    public void close() {
        closeBrowser();
    }


}

