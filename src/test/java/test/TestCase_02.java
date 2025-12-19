package test;

/*
 * //TestCase_02 - Launch Amazon.in and validate the page title
//# Steps
//# 1. Launch Chrome browser.
//# 3. Launch URL https://www.amazon.in
//# 4. Capture the title
//# 5. If 'amazon.in' is there in the Page title, test passed, else, fail.
//# 6. Close the browser.
 */
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import base.Base;


public class TestCase_02 extends Base {
	//static WebDriver driver=setup();
		@Test
		public void test2() {
		if(driver.getTitle().contains("Amazon.in"))
			System.out.println("Title Matches");
		else 
			System.out.println("Title doesn't Matches");
//		driver.quit();
	
		// TODO Auto-generated method stub
	}
}
