package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
	
	// Test Case 8
	@FindBy(id="searchDropdownBox")
	WebElement dd_search;
	
	//Test Case 9
	@FindBy(className="icp-language-link")
	WebElement dd_language;
	
	@FindBy(xpath="//*[contains(@value,\"_IN\")]/following-sibling::i")
	List<WebElement> cb_languages;
	
	@FindBy(xpath="//*[contains(@value,\"_IN\")]")
	List<WebElement> lbl_languages;
	
	@FindBy(className="a-button-input")
	WebElement btnSaveLanguageChanges;
	
	@FindBy(tagName="html")
	WebElement html_tag;
	
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

	// TC 8
	public void dropDownOperations() {
		dd_search.click();
		Select select=new Select(dd_search);
		System.out.println("Count is"+select.getOptions().size());
		System.out.println("4th Options is"+select.getOptions().get(3).getText());
		select.selectByVisibleText("Electronics");
		
		// TODO Auto-generated method stub
		
	}

	public void changeLanguage(String lang) {
		dd_language.click();
		
		for(int i=0;i<=cb_languages.size()-1;i++) {
			if(lbl_languages.get(i).getAttribute("value").contains(lang)) {
				cb_languages.get(i).click();
				btnSaveLanguageChanges.click();
			}
		}
		// TODO Auto-generated method stub
	}
	
	public String getLanguage() {
		return html_tag.getAttribute("lang");
	}
	
}
