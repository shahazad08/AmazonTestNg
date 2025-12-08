package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.Base;

public class TestCase_01 extends Base {
//	static WebDriver driver=setup();
	
		@Test
		public void test1() {
		String url=driver.getCurrentUrl();
		if(url.contains("https://www.amazon.in/")) {
			System.out.println("Url Matchs");
		}
		else {
			System.out.println("Url doesnt match");
		}
//		driver.close();
	}
}
