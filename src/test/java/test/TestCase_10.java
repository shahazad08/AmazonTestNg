package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.AmazonHomePage;

/*
 * 1. Launch the Chrome Browser
 * 2. Launch URL https://www.amazon.in
 * 3. Search for "Mobile Phones"
 * 4. Scroll all the mobiles till you find the "Limited Time deal" mobile phone
 * 5. Print the phone name
 * 6. Close the browser
 */
public class TestCase_10 extends Base {
	AmazonHomePage home;
	
	@BeforeClass
	public void preTest() {
		home=new AmazonHomePage(driver);
	}
	
	@Test
	public void test10() throws InterruptedException {
		home.search("Laptops");
		System.out.println(home.getLimitedTimeDealProductName());
	}
}
