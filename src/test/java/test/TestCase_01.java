package test;
/*
 * //TestCase_01 – Launch Amazon.in and validate the page URL
//# Steps
//# 1. Launch Chrome browser.
//# 3. Launch URL https://www.amazon.in
//# 4. Capture the page URL
//# 5. If 'amazon.in' is there in the Page URL, test passed, else, fail.
//# 6. Close the browser.
 */
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
