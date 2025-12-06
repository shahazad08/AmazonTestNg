package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	WebDriver driver;
	
	public AmazonHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Objects
	@FindBy(id="nav-cart")
	WebElement cart;
	
	// Action Methods
	
	public void openCart() {
		cart.click();
	}
	
}
