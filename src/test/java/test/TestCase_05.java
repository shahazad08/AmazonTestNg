package test;

/*
 * //testCase_05: Validate the Sign-in page.
//# 1. Launch Chrome browser.
//# 2. Launch URL https://www.amazon.in
//# 3. Mouse hover to the sign-in option.
//# 4. Click on the sign-in button
//# 4. Validate the sign-in page URL
//# 5. Close the browser.
 */
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.AmazonHomePage;

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
