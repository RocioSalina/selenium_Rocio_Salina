package clase12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class spotifyTestWithParameters {
    WebDriver driver;

    @BeforeMethod(groups = {"Success"})
    public void setUp(){
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.spotify.com");
    }

    @Test(groups = {"Success"})
    @Parameters({"specificTag"})
    public void  spotifyTags(@Optional("h1") String specificTagParameter){
    List<WebElement> listaHs=driver.findElements(By.tagName(specificTagParameter));
    System.out.println("****Lista de elementos H******");

    for(WebElement element: listaHs){
        System.out.println("-->"+element.getText());
    }
    System.out.println("*******************");
    }
}
