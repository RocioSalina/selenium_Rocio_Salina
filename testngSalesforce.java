package clase12;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngSalesforce {
    public static final String SALESFORCE_URL="https://login.salesforce.com/";
    public WebDriver driver;


    @Test(priority=1,groups = {"Failed"})
    public void validateSalesforceLogoTest(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(SALESFORCE_URL);
        WebElement logo=driver.findElement(By.id("logo"));
        System.out.println(logo.getTagName());
        System.out.println(logo.getAttribute("alt"));
    }

    @Test(priority=4,groups = {"Success"})
    public void RememberMeIsSelected(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=eu");
        driver.findElement(By.xpath("//input[@id='rememberUn']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='rememberUn']")).isSelected());

    }

    @Test(priority = 2,groups ={"Success"})
    public void FooterIsValid(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=eu");
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='footer']")).getText().contains("All rights reserved"));

    }

    @Test(priority = 3)
    public void LoginFailureTest() throws InterruptedException {
        WebElement logo = driver.findElement(By.id("logo"));
        org.testng.Assert.assertTrue(logo.isEnabled());

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123466");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.id("error")).getText());

    }
}
