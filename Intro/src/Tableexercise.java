

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableexercise {

	public static void main(String[] args) {
		
		int sum = 0;
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sohel\\\\Downloads\\\\chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20794/nz-vs-ban-1st-test-bangladesh-tour-of-new-zealand-2019");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	WebElement table =	driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	int rowcount =  table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
	int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	for(int i = 0;i<count-2;i++) {
	String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	int ValueInteger =Integer.parseInt(value);
	sum=sum+ValueInteger;
	}
	//System.out.println(sum);
	
	 String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	int ExtrasValue = Integer.parseInt(Extras);
	int TotalSumValue = sum + ExtrasValue;
	System.out.println(TotalSumValue);
	System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
	

	}

}
