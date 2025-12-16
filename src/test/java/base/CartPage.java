package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(className="a-truncate-cut")
	WebElement productName;

	public String getProductName() {
		String getProductName=productName.getText();
		String filterName=getProductName.substring(0, getProductName.length()-5);
		return filterName;
	}
	
	// Actions
//	public String getProductName {
//		
//	}
//	
//	String filterName=getProductName.substring(0, getProductName.length()-5);
	
	
}
