package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="img[alt='logo']")
	WebElement pricepallyLogo;
	
	@FindBy(css="p[class='fw-500 text-gray-400']")
	WebElement welcomeBackText;
	
	@FindBy(css="body > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > label:nth-child(1)")
	WebElement emailText;
	
	@FindBy(css="body > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > label:nth-child(1)")
	WebElement passwordText;
	
	@FindBy(css="p[class='fw-600 text-lg lg:text-2xl mt-4']")
	WebElement signInToYourAccountText;
	
	@FindBy(css=".text-tertial.fw-600")
	WebElement createNowLinkText;
	
	@FindBy(css="#email")
	WebElement emailOrUsernameField;
	
	@FindBy(css="#password")
	WebElement passwordField;
	
	@FindBy(css="#toggleText")
	WebElement showToggleText;
	
	@FindBy(css=".text-tertial.cursor-pointer")
	WebElement forgotPasswordLink;
	
	@FindBy(css=".btn-primary.fw-800.w-full.py-2")
	WebElement loginBtn;
	
	@FindBy(css="body > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(2)")
	WebElement invalidEmailErrorMessage;
	
	@FindBy(css="body > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(2)")
	WebElement invalidPasswordErrorMessage;
	
	@FindBy(css="body > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(2)")
	WebElement emailRequiredText;
	
	@FindBy(css="body > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(2)")
	WebElement passwordRequiredText;
	
	@FindBy(css=".text-tertial.cursor-pointer")
	WebElement forgetPasswordLinkText;
	
	@FindBy(css="p[class='fw-600 text-lg lg:text-2xl mt-4']")
	WebElement signIntoYourAccountText;
	
	@FindBy(css="img[alt='google']")
	WebElement googleSignUpBtn;
	
	@FindBy(css="img[alt='facebook']")
	WebElement facebookSignUpBtn;
	
	@FindBy(css="img[alt='facebook']")
	WebElement appleSignUpBtn;
	
	public void clickCreateAccountLink() {
		createNowLinkText.click();
	}
	public void setEmailOrUsernameField(String email) {
		emailOrUsernameField.sendKeys(email);
	}
	public void setPasswordField(String password) {
		passwordField.sendKeys(password);
	}
	public void clickShowToggleText() {
		showToggleText.click();
	}
	public void clickForgotPasswordLink() {
		forgotPasswordLink.click();
	}
	public void clickLoginBtn() {
		loginBtn.click();
	}
	public String getInvalidEmailErrorMessage() {
		return invalidEmailErrorMessage.getText();
	}
	public String getInvalidPasswordErrorMessage() {
		return invalidPasswordErrorMessage.getText();
	}
	public String getEmailRequiredText() {
		return emailRequiredText.getText();
	}
	public String getPasswordRequiredText() {
		return passwordRequiredText.getText();
	}
	public boolean forgetPasswordLinkTextIsDisplayed() {
		return forgetPasswordLinkText.isDisplayed();
	}
	public String getSignIntoYourAccountText() {
		return signIntoYourAccountText.getText();
	}
	public void clickGoogleSignUpBtn() {
		googleSignUpBtn.click();
	}
	public void clickFacebookSignUpBtn() {
		facebookSignUpBtn.click();
	}
	public void clickAppleSignUpBtn() {
		appleSignUpBtn.click();
	}
	public boolean googleSignUpBtnIsEnabled() {
		return googleSignUpBtn.isEnabled();
	}
	public boolean facebookSignUpBtnIsEnabled() {
		return facebookSignUpBtn.isEnabled();
	}
	public boolean appleSignUpBtnIsEnabled() {
		return appleSignUpBtn.isEnabled();
	}
	public boolean googleSignUpBtnIsDisplayed() {
		return googleSignUpBtn.isDisplayed();
	}
	public boolean facebookSignUpBtnIsDisplayed() {
		return facebookSignUpBtn.isDisplayed();
	}
	public boolean appleSignUpBtnIsDisplayed() {
		return appleSignUpBtn.isDisplayed();
	}
	public boolean pricepallyLogoIsDisplayed() {
		return pricepallyLogo.isDisplayed();
	}
	public String ConfirmWelcomeBackText() {
		return welcomeBackText.getText();
	}
	public String ConfirmEmailText() {
		return emailText.getText();
	}
	public String ConfirmPasswordText() {
		return passwordText.getText();
	}
	public String ConfirmSignInToYourAccountTextt() {
		return signInToYourAccountText.getText();
	}
	

}
