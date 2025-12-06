package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Base;

public class TestCase_03 extends Base{
	static WebDriver driver=setup();

	public static void main(String[] args) {
		WebElement cart=driver.findElement(By.id("nav-cart"));
		cart.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			if(driver.getTitle().contains("Shopping Cart"))
				System.out.println("Title Passed");
			else 
				System.out.println("Title Failed");
			driver.quit();
		
		// TODO Auto-generated method stub

	}

}
