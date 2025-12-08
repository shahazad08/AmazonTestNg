package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomePage {
	WebDriver driver;
	
	public AmazonHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Objects
	// For Test case 3
	@FindBy(id="nav-cart")
	WebElement cart;
	
	// For Test case 4
	@FindBy(id="glow-ingress-line1")
	WebElement location;
	
	@FindBy(id="GLUXZipUpdateInput")
	WebElement pincode;
	
	@FindBy(id="GLUXZipUpdate")
	WebElement apply;
	
	@FindBy(id="glow-ingress-line2")
	WebElement locationPinCode;
	// Action Methods
	
	//TC 3
	public void openCart() {
		cart.click();
	}

	//TC 4
	public void openLocation() {
		location.click();
	}
	
	public void applyPincode() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(pincode));
		pincode.sendKeys("400001");
		apply.click();
	}
	
	public String getLocationPinCode() {
		System.out.println(locationPinCode.getText());
		return locationPinCode.getText();
		
	}
	
}
