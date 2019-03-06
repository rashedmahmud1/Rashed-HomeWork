import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sohel\\Downloads\\chromedriver_win32 (1)/ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("abc");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("abc");
		
		
		
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		//driver.get("https://login.salesforce.com/");
		//driver.findElement(By.xpath("//*[@id='username']")).sendKeys("abc");
		//driver.findElement(By.xpath("//*[@id='password']")).sendKeys("abc");
		//driver.findElement(By.xpath("//*[@id='Login']")).click();
		//System.out.println(driver.findElement(By.xpath("//*[@id=\'error\']")).getText());
		//driver.get("http://facebook.com");
		//driver.findElement(By.cssSelector("#email")).sendKeys("abc");
		//driver.findElement(By.cssSelector("#pass")).sendKeys("abc");
		//driver.findElement(By.cssSelector("#login_form > table > tbody > tr:nth-child(3) > td:nth-child(2) > div > a")).click();
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc");
		//driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("aqbc");
		//driver.findElement(By.id("pass")).sendKeys("abc");
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
	  
				}
}
	
	
		

	

	
