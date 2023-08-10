package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="div[class='text-center ']")
	WebElement myAccountLinkText;
	
	public boolean myAccountDisplayStatus() {
		return myAccountLinkText.isDisplayed();
		
	}

}
