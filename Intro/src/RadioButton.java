import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sohel\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.findElement(By.xpath("//input[@value='Milk']")).click();
		// System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());

		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		Thread.sleep(3000);
		for (int i = 0; i < count; i++) {
			// driver.findElements(By.xpath("//input[@name='group1']")).get(1).click();
			// System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));

			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if (text.equals("Cheese")) {
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}

	}

}
