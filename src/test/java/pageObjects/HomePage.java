package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="body > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1) > p:nth-child(2)")
	WebElement signupLinkText;
	
	public void clickSignup() {
		signupLinkText.click();
	}

}
