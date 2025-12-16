package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {
	WebDriver driver;
	
	public ProductDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	@FindBy(xpath="(//*[@id=\"add-to-cart-button\"])[2]")
	WebElement btn_AddToCart;
	
	@FindBy(xpath="//*[@id=\"productTitle\"]")
	WebElement txt_productTitle;

	// Actions
	public void addToCart() {
		btn_AddToCart.click();
		// TODO Auto-generated method stub
		
	}

	public String getProductTitle() {
		// TODO Auto-generated method stub
		return txt_productTitle.getText();
	}
	
	
	
	

}
