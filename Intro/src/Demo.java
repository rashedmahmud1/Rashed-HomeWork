import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sohel\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	//System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
   // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));	
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	
	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
		System.out.println("it's enable");
		Assert.assertTrue(true);
	}else {
		Assert.assertTrue(false);
	}
	
	
	
	
	
	
	
	//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
		
		
		//Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		//driver.findElement(By.id("divpaxinfo")).click();
		//Thread.sleep(2000l);
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		//for(int i = 1;i<6;i++) {
		//	driver.findElement(By.id("hrefIncAdt")).click();
		//}
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//int i = 1;
		//while(i<5) {
			//driver.findElement(By.id("hrefIncAdt")).click();
			//i++;
			//}
	   // driver.findElement(By.id("btnclosepaxoption")).click();
	    
		//s.selectByValue("USD");
		//s.selectByIndex(2);
		//s.selectByVisibleText("INR");
		
		//driver.findElement(By.cssSelector("a[title*='Sign in'")).click();
		//driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
		//driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
		//driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
		
		
		
		
		
		
		//driver.get("http://facebook.com");
		//driver.findElement(By.id("email")).sendKeys("this is my first code");
		//driver.findElement(By.name("pass")).sendKeys("123456");
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.get("http://google.com");
	    //System.out.println(driver.getTitle());
	    //System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.navigate().to("http://yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close();
		//driver.quit();
	}
	
}
	
	
		

	

	
