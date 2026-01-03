package test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.AmazonHomePage;

/*
 * //# 1. Launch Chrome browser.
   //# 2. Launch URL https://www.amazon.in
   //# 3. Scroll down to the bottom of the home page
   //# 4. Click on the language select element and select Hindi language
   //# 5. Add an assertion to make sure the language of the page has been changed to the selected language
   //# 6. Now again go to the bottom of the home page
   //# 7.  Click on the language select element and select English language 
   //# 8. Add an assertion to make sure the language of the page has been changed back to the English language
   //# 9. Close the browser
 */

public class TestCase_09 extends Base {
	
	AmazonHomePage home;
	
	@BeforeClass
	public void preTest() {
		home=new AmazonHomePage(driver);
	}
	
	@Test
	public void test09() throws InterruptedException {
		//# 3. Scroll down to the bottom of the home page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		
		 //# 4. Click on the language select element and select Hindi language
		home.changeLanguage("hi");
		Thread.sleep(1000);
		
		 //# 5. Add an assertion to make sure the language of the page has been changed to the selected language
		Assert.assertTrue(home.getLanguage().contains("hi"));
		Thread.sleep(3000);
		
		//# 6. Now again go to the bottom of the home page
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		
		 //# 7. Click on the language select element and select English language
		home.changeLanguage("en");
		Thread.sleep(2000);
		
		 //# 8. Add an assertion to make sure the language of the page has been changed back to the English language
		Assert.assertTrue(home.getLanguage().contains("en"));
		
	}
	
}
