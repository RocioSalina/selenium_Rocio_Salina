import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ejercicio14 {
    @Test
    public void netflixTest(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.netflix.com/uy/");

        List<WebElement> listaH1s= driver.findElements(By.tagName("h1"));
        System.out.println("**********Lista de H1s del sitio*********");
        for (WebElement h1:listaH1s){
            System.out.println("--> "+h1.getText());
        }

        List<WebElement> listaH2s= driver.findElements(By.tagName("h2"));
        System.out.println("**********Lista de H2s del sitio*********");
        for (WebElement h2:listaH2s){
            System.out.println("--> "+h2.getText());
        }

        driver.navigate().refresh();

        System.out.println("**********Lista de botones del sitio*********");
        List<WebElement> listaBotones=driver.findElements(By.tagName("button"));
        for (WebElement boton:listaBotones){
            System.out.println("--> "+boton.getText());
        }

        List<WebElement> listaDivs=driver.findElements(By.tagName("div"));
        System.out.println("Cantidad de divs del sitio: "+listaDivs.size());

        System.out.println("Titulo del sitio: "+driver.getTitle());

        List<WebElement> listaLinks=driver.findElements(By.tagName("a"));
        System.out.println("Cantidad de links del sitio: "+listaLinks.size());
    }
}
