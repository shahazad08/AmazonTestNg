package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.AmazonHomePage;

public class TestCase_04 extends Base {
	public AmazonHomePage home;
	
	@BeforeClass
	public void initialize() {
		home=new AmazonHomePage(driver);
	}
	
	@Test
	public void test4() {
		
		home.openLocation();
		
		home.applyPincode();
		
		String code=home.getLocationPinCode();
		if(code.contains("Mumbai")) 
			System.out.println("Test Passed");
		else 
			System.out.println("Test Failed");
		
		
	}
	

}
