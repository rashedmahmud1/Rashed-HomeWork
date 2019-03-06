import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scoop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sohel\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
	WebElement colomdriver = 	footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(colomdriver.findElements(By.tagName("a")).size());
	
	for(int i =1;i<colomdriver.findElements(By.tagName("a")).size();i++) {
		String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		
		colomdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
		Thread.sleep(3000);
	}//open all the tabs
		
	Set<String> abc=driver.getWindowHandles();
	Iterator<String> it = abc.iterator();
	while(it.hasNext()) {
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
		
		
	}
		
		
		}
			

	


