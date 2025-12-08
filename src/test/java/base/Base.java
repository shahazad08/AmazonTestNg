package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	protected static WebDriver driver;

	//1
	@BeforeTest
	public static WebDriver setup() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		return driver;
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
