package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPasswordPage extends BasePage{

	public ForgetPasswordPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css=".text-xl.font-semibold.text-gray-900")
	WebElement forgotPasswordText;
	
	@FindBy(xpath="//form[@class='mt-5']//input[@id='email']")
	WebElement emailInputField;
	
	@FindBy(xpath="//span[@class='pl-4 text-xs text-red-500']")
	WebElement forgetPasswordEmailErrorText;
	
	@FindBy(css=".btn-primary.px-5.w-full.py-2")
	WebElement sendResetLinkBtn;
		
	public String getForgotPasswordText() {
		return forgotPasswordText.getText();
	}
	public void setEmailField(String Email) {
		emailInputField.sendKeys(Email);
	}
	public void clickResetLinkBtn() {
		sendResetLinkBtn.click();
	}
	public String getForgetPasswordEmailErrorText() {
		return forgetPasswordEmailErrorText.getText();
	}

}
