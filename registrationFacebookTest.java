package clase10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class registrationFacebookTest {
    @Test
    public void fullRegistrationTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        Thread.sleep(6000);

        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("5555555");
        driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");

        WebElement dias= driver.findElement(By.name("birthday_day"));
        Select dia=new Select(dias);
        dia.selectByValue("26");

        WebElement meses= driver.findElement(By.name("birthday_month"));
        Select mes=new Select(meses);
        mes.selectByVisibleText("jun");

        WebElement años= driver.findElement(By.name("birthday_year"));
        Select año=new Select(años);
        año.selectByIndex(41);

        List<WebElement> listaSexos=driver.findElements(By.name("sex"));
        WebElement sexoMasc=listaSexos.get(1);
        sexoMasc.click();
            }
}
