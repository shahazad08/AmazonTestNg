package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;


import base.AmazonHomePage;
import base.Base;

public class TestCase_03 extends Base{
	static WebDriver ldriver=setup();

	public static void main(String[] args) {
//		WebElement cart=driver.findElement(By.id("nav-cart"));
//		cart.click();
//		
		AmazonHomePage home=new AmazonHomePage(ldriver);
		home.openCart();
		
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			if(ldriver.getTitle().contains("Shopping Cart"))
				System.out.println("Title Passed");
			else 
				System.out.println("Title Failed");
			ldriver.quit();
		
		// TODO Auto-generated method stub

	}

}
