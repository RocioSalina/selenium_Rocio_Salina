package clase11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SpotifyWithCssSelectorTest {
    @Test
    public void spotifyByPlaceHolderTest(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(" https://www.spotify.com/uy/signup/");

        driver.findElement(By.cssSelector("input[placeholder='Introduce tu correo electrónico.']")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector("input[placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector("input[placeholder='Crea una contraseña.']")).sendKeys("123456789");
        driver.findElement(By.cssSelector("input[placeholder='Introduce un nombre de perfil.']")).sendKeys("Alexis");
        driver.findElement(By.cssSelector("input[placeholder='DD']")).sendKeys("13");

        //***Mes no posee placeholder, por lo que seleccioné por name****
        WebElement meses=driver.findElement(By.cssSelector("select#month"));
        Select mes=new Select(meses);
        mes.selectByIndex(8);

        driver.findElement(By.cssSelector("input[placeholder='AAAA']")).sendKeys("1992");

        //****Los siguientes elementos no poseen placeholder ni name****
        driver.findElement(By.cssSelector("label[for=gender_option_nonbinary]")).click();
        driver.findElement(By.cssSelector("label[for='marketing-opt-checkbox']")).click();

    }
}
