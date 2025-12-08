package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.AmazonHomePage;
import base.Base;

public class TestCase_05 extends Base {
public AmazonHomePage home;
	
	@BeforeClass
	public void initialize() {
		home=new AmazonHomePage(driver);
	}
	
	@Test
	public void test5() throws InterruptedException {
		
		// Mouse hover to the sign-in option
		home.moveToSignInOption();
		Thread.sleep(1000);
		
		//Click on the sign in button
		home.clickSignIn();
		Thread.sleep(1000);
		
		String url=home.validateUrl();
		if(url.contains("amazon.in/ap/signin"))
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
		
		
		//Validate the sign-in page URL
	}
	

}
