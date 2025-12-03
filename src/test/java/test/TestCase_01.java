package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase_01 {
	
	@Test
	public void test1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String url=driver.getCurrentUrl();
		if(url.contains("https://www.amazon.in/")) {
			System.out.println("Url Matchs");
		}
		else {
			System.out.println("Url doesnt match");
		}
	}
}
