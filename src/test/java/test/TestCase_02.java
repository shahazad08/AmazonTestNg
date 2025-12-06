package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import base.Base;


public class TestCase_02 extends Base {
	static WebDriver driver=setup();
	public static void main(String[] args) {
		
		if(driver.getTitle().contains("Amazon.in"))
			System.out.println("Title Matches");
		else 
			System.out.println("Title doesn't Matches");
		driver.quit();
	
		// TODO Auto-generated method stub
	}
}
