package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.AmazonHomePage;
import pageObjects.CartPage;
import pageObjects.ProductDetailsPage;


//Test_Case_06
//# Steps
//# 1. Launch Chrome browser.
//# 3. Launch URL https://www.amazon.in
//# 4. Search for "Samsung Galaxy"
//# 5. Click on the first search Result. (It will open in a new window)
//# 6. Add the product to the cart.
//# 7. Come back to the main window and click on the cart option
//# 8. Validate if the product is there in the cart using product text. (Put validation)
//# 9. Make the test Case Pass else Fail
//# 10. Close the browser

public class TestCase_06 extends Base {
	
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
	public void Test6() throws InterruptedException {
		//  4. Search for "Samsung Galaxy"
		home.search("Samsung Galaxy");
		
		// 5. Click on the first search Result. (It will open in a new window)
		home.openProductDetailsFromList(0);
		Thread.sleep(2000);
		
		String parentWindow=driver.getWindowHandle();
		Set<String> windowHandles=driver.getWindowHandles();
		Iterator<String> itr=windowHandles.iterator();
		
		while(itr.hasNext()) {
			String childWindow=itr.next();
			if(!parentWindow.equalsIgnoreCase(childWindow))
				driver.switchTo().window(childWindow);
		}
		Thread.sleep(2000);
		String productName=product.getProductTitle();
		System.out.println(productName);
		
		//  6. Add the product to the cart.
		product.addToCart();
		Thread.sleep(2000);
		
		//# 7. Come back to the main window and click on the cart option
		driver.switchTo().window(parentWindow);
		home.openCart();
		driver.navigate().refresh();
		
		//8. Validate if the product is there in the cart using product text. (Put validation)
		String productNameCart=cart.getProductName();
		System.out.println(productNameCart);
		
		//9. Make the test Case Pass else Fail
		Assert.assertTrue(productName.contains(productNameCart));
		
		
		
	}
	
	
	

}
