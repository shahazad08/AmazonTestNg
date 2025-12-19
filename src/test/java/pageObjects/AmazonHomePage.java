package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	// Test case 5
	@FindBy(xpath="(//*[@data-nav-role='signin'])[1]")
	WebElement accountsAndList;
	
	@FindBy(xpath="(//*[@data-nav-role='signin'])[2]")
	WebElement signInButton;
	
	// Test case 6
	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	WebElement search;
	
	@FindBy(id="nav-search-submit-button")
	WebElement btnSearch;
	
	@FindBy(xpath="//*[@role='listitem']")
	List<WebElement> productList;
	
	
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
	
	public void moveToSignInOption() {
		Actions actions=new Actions(driver);
		actions.moveToElement(accountsAndList).perform();
	}
	
	// TC5
	public void clickSignIn() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(accountsAndList));
		signInButton.click();
		Thread.sleep(2000);
		//System.out.println(driver.getCurrentUrl());
	}
	
	public String  validateUrl() {
		String currentURL = driver.getCurrentUrl();
		String cleanURL = currentURL.split("\\?")[0];
		System.out.println(cleanURL);
		return cleanURL;
	}

	public void search(String searchText) {
		search.sendKeys(searchText);
		btnSearch.click();
		
		// TODO Auto-generated method stub
		
	}

	public void openProductDetailsFromList(int index) {
		productList.get(index).click();
		// TODO Auto-generated method stub
		
	}


	
}
