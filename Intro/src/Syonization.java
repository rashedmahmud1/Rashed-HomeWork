import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Syonization {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\sohel\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.alaskaair.com/?semid=Google%7c%7cSEMBrand%7c%7c&gclid=Cj0KCQiA2L7jBRCBARIsAPeAsaMh2-tImGR6z0s2-n1Eg-sS1T3NOHyg2kvQ_wN9P1fP1omKTPG5UDIaAjvDEALw_wcB&gclsrc=aw.ds");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     
	}

}
