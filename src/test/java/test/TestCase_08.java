package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.AmazonHomePage;

/*
 * //Test_Case_08
//# Steps
//# 1. Launch Chrome browser.
//# 2. Launch URL https://www.amazon.in
//# 3. Click on the Search dropdown list from the homepage.
//# 4. Get the count of All the options from the list.p
//# 5. Use Select class and get the text of the 4th element from the options.
//# 6. Use Select class and click on “Electronics”, so that "Electronics" is selected from the dropdown
//# 7. Search Laptop from the search box.
//# 8. Validate Page title contains 'laptop'
//# 9. Close the browser.
 */

public class TestCase_08 extends Base {
	AmazonHomePage home;
	
	@BeforeClass
	public void preTest() {
		home = new AmazonHomePage(driver);
	}
	
	@Test
	public void test8() {
		driver.manage().window().maximize();
		//# 3. Click on the Search dropdown list from the homepage.
		//# 4. Get the count of All the options from the list.p
		//# 5. Use Select class and get the text of the 4th element from the options.
		//# 6. Use Select class and click on “Electronics”, so that "Electronics" is selected from the dropdown
		home.dropDownOperations();

		//# 7. Search Laptop from the search box.
		home.search("Laptop");
		
		//# 8. Validate Page title contains 'laptop'
		Assert.assertTrue(driver.getTitle().contains("Laptop"));

	}
	
}
