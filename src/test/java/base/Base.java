package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	protected static WebDriver driver;

	//1
	@BeforeTest
	public static WebDriver setup() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		return driver;
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
