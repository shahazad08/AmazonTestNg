package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.AmazonHomePage;
import base.Base;

public class TestCase_03 extends Base{
	//static WebDriver ldriver;

	//2
	@Test
	public void test3() {
		AmazonHomePage home=new AmazonHomePage(driver);
		home.openCart();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			if(driver.getTitle().contains("Shopping Cart"))
				System.out.println("Title Passed");
			else 
				System.out.println("Title Failed");
			driver.quit();
		
		// TODO Auto-generated method stub

	}
	// For Understanding
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("@AfterSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
	}
	
	@Test
	public void test() {
		System.out.println("@Test");
	}
	

}
