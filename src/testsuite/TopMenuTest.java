package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void topmenu() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'] //a[text()='Computers ']")).click();
        String expectedresult = "Computers";
        String actualresult = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Computer yext is not display", expectedresult, actualresult);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
        String expectedElementname = "Electronics";
        String actualElementname = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Electronics is not dispaly",expectedElementname,actualElementname);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
        String expectedElementnamea = "Apparel";
        String actualElementnamea = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Apparel display",expectedElementnamea,actualElementnamea);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        String expectedElementname = "Digital downloads";
        String actualElementname = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Digital downloads is not display",expectedElementname,actualElementname);
    }
     @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
         driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
         String expectedElementname = "Books";
         String actualElementname = driver.findElement(By.tagName("h1")).getText();
         Assert.assertEquals("Books is not display",expectedElementname,actualElementname);
     }
     @Test
    public void  userShouldNavigateToJewelryPageSuccessfully() {
         driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
         String expectedElementname = "Jewelry";
         String actualElementname = driver.findElement(By.tagName("h1")).getText();
         Assert.assertEquals("Jewelry is not display",expectedElementname,actualElementname);
     }
     @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        String expectedElementname = "Gift Cards";
        String actualElementname =driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Gift Cards is not display",expectedElementname,actualElementname);
        }






    @After
    public void close() {
        closeBrowser();
    }

}
