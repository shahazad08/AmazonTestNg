package test;

/*
 * //TestCase_04 – Validate the ‘Update location’ feature.
//# 1. Launch Chrome browser.
//# 2. Launch URL https://www.amazon.in
//# 3. Click on the location select option. (right top corner)
//# 3. Enter valid pincode (i.e. 400XXX)
//# 4. Click on the apply button.
//# 5. Validate that the mentioned pincode appears on the location select option.
//# 6. Close the browser.

 */
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
