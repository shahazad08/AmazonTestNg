package test;
//Test_Case_07
//# Steps
//# 1. Launch Chrome browser.
//# 2. Launch URL https://www.amazon.in
//# 3. Search for mobile phones.
//# 4. Click on the 3rd phone from the list by using the Xpath locator,
//# 5. Add it to the cart.
//# 6. Now go back to the listing page
//# 7. Select the 4th option from the list.
//# 8. Add it to the cart.
//# 9. Come back to the main window and click on the cart option
//# 10. Add an assertion to make sure both products are displayed in the cart. (Check the product count)
//# 11. Quit the browser.

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.AmazonHomePage;
import pageObjects.CartPage;
import pageObjects.ProductDetailsPage;

public class TestCase_07 extends Base {
	AmazonHomePage home;
	ProductDetailsPage product;
	CartPage cart;
	
	@BeforeClass
	public void preTest() {
		home=new AmazonHomePage(driver);
		product=new ProductDetailsPage(driver);
		cart=new CartPage(driver);
	}
	@Test
	public void test7() throws InterruptedException {
		// 3. Search for mobile phones.
		home.search("Mobile Phones");
		driver.manage().window().maximize();

		// 4. Click on the 3rd phone from the list by using the Xpath locator,
		home.openProductDetailsFromList(2);
		Thread.sleep(5000);
		
		String parentWindow=driver.getWindowHandle();
		Set<String> windowHandles=driver.getWindowHandles();
		Iterator<String> itr=windowHandles.iterator();
		
		while(itr.hasNext()) {
			String childWindow=itr.next();
			if(!parentWindow.equalsIgnoreCase(childWindow))
				driver.switchTo().window(childWindow);
		}
		
//		//Printing the Product TItle
//		Thread.sleep(2000);
//		String selectedProductName=product.getProductTitle();
//		System.out.println(selectedProductName);
		
		//  5. Add the product to the cart.
		product.addToCart();
		Thread.sleep(2000);
		
		

	}
	
	
	
	
}
