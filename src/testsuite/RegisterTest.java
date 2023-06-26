package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void topmenu() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        String expectedtext = "Register";
        String actualText =driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        Assert.assertEquals("Register page is not working",expectedtext,actualText);

    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //get the gender radio button
        driver.findElement(By.xpath("//label[text()='Gender:'] ")).click();
        driver.findElement(By.xpath("//span[@class='female']")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Prime");
        driver.findElement(By.name("LastName")).sendKeys("Class");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("9");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("September");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1999");
        driver.findElement(By.id("Email")).sendKeys("Prime12345@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Prime123");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Prime123");
        driver.findElement(By.name("register-button")).click();
        String expectedresult = "Your registration completed";
       String actualresult =driver.findElement(By.className("Register")).getText();
        Assert.assertEquals("Registration message is not print",expectedresult,actualresult);




    }
@After
    public void tod(){
        closeBrowser();
}


}