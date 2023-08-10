package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleAccountPage extends BasePage{

	public GoogleAccountPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="identifierId")
	WebElement ChooseAnAccountText;
	
	public boolean ChooseAnAccountTextIsDisplayed() {
		return ChooseAnAccountText.isDisplayed();
	}
	

}
