package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.AmazonHomePage;

/*
 * 1. Launch Chrome Browser
 * 2. Launch URL https://www.amazon.in
 * 3. Go to end of the page
 * 4. Click on all the footer link once by one and validate the page URL
 * 5. Add an assertion to pass the test case
 * 6. Close the Browser.
 */
public class TestCase11 extends Base{
	
	AmazonHomePage home;
	
	@BeforeClass 
	public void preTest() {
		home =new AmazonHomePage(driver);
	}
	
	@Test
	public void test11() throws InterruptedException {
		home.validateFooterUrls();
	}
	
	
}
