import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synconization {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sohel\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.expedia.com/Hotels");
		driver.manage().window().maximize();
		driver.findElement(By.id("hotel-destination-hlp")).sendKeys(" nyc");
		driver.findElement(By.id("hotel-destination-hlp")).sendKeys(Keys.TAB);
		driver.findElement(By.id("hotel-checkin-hlp")).sendKeys(Keys.ENTER);
		
		WebDriverWait d = new WebDriverWait(driver,10);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'New-York-Hotels-The-Roosevelt-Hotel')]")));
		driver.findElement(By.xpath("//a[contains(@href,'New-York-Hotels-The-Roosevelt-Hotel')]")).click();

		
	}

}
