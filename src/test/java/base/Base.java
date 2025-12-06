package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver rdriver;

	public static WebDriver setup() {
		rdriver=new ChromeDriver();
		rdriver.get("https://www.amazon.in/");
		return rdriver;
	}

}
