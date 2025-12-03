package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class TestCase_02 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		if(driver.getTitle().contains("Amazon.in"))
			System.out.println("Title Matches");
		else 
			System.out.println("Title doesn't Matches");
		driver.quit();
	
		// TODO Auto-generated method stub
	}
}
