package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends BasePage{

	public SignupPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="#firstname")
	WebElement firstNameField;
	
	@FindBy(css="#lastname")
	WebElement lastNameField;
	
	@FindBy(css="#username")
	WebElement userNameField;
	
	@FindBy(css="#email")
	WebElement emailField;
	
	@FindBy(css="#password")
	WebElement passwordField;
	
	@FindBy(css="select[name='phone_numberCountry']")
	WebElement countryDropdown;
	
	//@FindBy(css="input[name='phone_number']")
	@FindBy(css="input[value='+234']")
	WebElement phoneField;
	
	//@FindBy(css="#cooperative_id")
	//WebElement cooperative_idField;
	
	@FindBy(css="#referral_code")
	WebElement referral_codeField;
	
	@FindBy(css="input[name='individual']")
	WebElement individualAccountCheckBox;
	
	@FindBy(css="label[for='bussiness']")
	WebElement businessAccountCheckBox;
	
	@FindBy(css=".btn-primary.fw-800.w-full.py-2")
	WebElement createAccountBtn;
	
	@FindBy(css="input[name='yes']")
	WebElement whatsAppNumberYesCheckbox;
	
	@FindBy(css="input[name='no']")
	WebElement whatsAppNumberNoCheckbox;
	
	@FindBy(css="input[name='whatsapp_number']")
	WebElement whatsAppNumberField;
	
	@FindBy(css="select[name='whatsapp_numberCountry']")
	WebElement whatsAppCountryDropdown;
	
	@FindBy(css=".pl-4.text-xs.text-red-500")
	WebElement emailErrorText;

	public void setFirstName(String fName) {
		firstNameField.sendKeys(fName);
	}
	public void setLastName(String lName) {
		lastNameField.sendKeys(lName);
	}
	public void setUserName(String uName) {
		userNameField.sendKeys(uName);
	}
	public void setEmail(String email) {
		emailField.sendKeys(email);
	}
	public void setPassword(String password) {
		passwordField.sendKeys(password);
	}
	public void selectPhoneCountry() {
		Select country = new Select(countryDropdown);
		country.selectByVisibleText("Nigeria");
	}
	
	public void setPhone(String phone) {
		phoneField.sendKeys(phone);
	}
	/*public void setCooperative_id(String cooperativeId) {
		cooperative_idField.sendKeys(cooperativeId);
	}*/
	public void setReferralCode(String refcode) {
		referral_codeField.sendKeys(refcode);
	}
	public void selectIndividualAccount() {
		individualAccountCheckBox.click();
	}
	public void selectBusinessAccount() {
		businessAccountCheckBox.click();
	}
	public void clickCreateAccountBtn() {
		createAccountBtn.click();
	}
	public void clickWhatsAppNumberYesCheckbox() {
		whatsAppNumberYesCheckbox.click();
	}
	public void clickWhatsAppNumberNoCheckbox() {
		whatsAppNumberNoCheckbox.click();
	}
	public void setWhatsAppNumberField(String number) {
		whatsAppNumberField.sendKeys(number);
	}
	public void selectWhatsAppCountry() {
		Select country = new Select(whatsAppCountryDropdown);
		country.selectByVisibleText("Nigeria");	
	}
	public String getEmailErrorText() {
		return emailErrorText.getText();
		
	}

}
