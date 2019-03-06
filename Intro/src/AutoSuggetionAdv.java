import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetionAdv {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sohel\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://ksrtc.in/oprs-web/guest/home.do");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
Thread.sleep(3000);
driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
System.out.println(driver.findElement(By.id("fromPlaceName")).getText());

JavascriptExecutor js = (JavascriptExecutor)driver;
String script = "return document.getElementById(\"fromPlaceName\").value;";
String text = (String) js.executeScript(script);
System.out.println(text);
int i = 0;

while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT")) {
	i++;
	driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
	 text = (String) js.executeScript(script);
	System.out.println(text);
	if(i<10) {
		break;
	}
}





	}
}
	

