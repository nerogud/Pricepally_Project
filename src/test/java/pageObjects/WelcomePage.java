package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage{

	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="input[name='Lagos']")
	WebElement lagosCheckBox;
	
	@FindBy(css=".btn-primary.fw-800.w-full.py-2")
	WebElement confirmBtn;
	
	public void clickLagosCheckBox() {
		lagosCheckBox.click();
	}
	public void clickConfirmBtn() {
		confirmBtn.click();
	}

}
