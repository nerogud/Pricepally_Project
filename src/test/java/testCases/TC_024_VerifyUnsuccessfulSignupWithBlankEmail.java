package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.SignupPage;
import pageObjects.WelcomePage;
import testBase.BaseClass;

public class TC_024_VerifyUnsuccessfulSignupWithBlankEmail extends BaseClass{
	
	@Test
	public void VerifyUnsuccessfulSignupWithBlankEmail() {
		
		logger.info("***Starting VerifyUnsuccessfulSignupWithBlankEmail Test***");
		WelcomePage wp = new WelcomePage(driver);
		wp.clickLagosCheckBox();
		wp.clickConfirmBtn();
		
		HomePage hp = new HomePage(driver);
		hp.clickSignup();
		
		LoginPage lp = new LoginPage(driver);
		lp.clickCreateAccountLink();
		
		SignupPage signup = new SignupPage(driver);
		signup.setFirstName(getRandomString());
		signup.setLastName(getRandomString());
		signup.setUserName(getRandomString());
		//intentionally keep email field empty
		signup.setPassword("qawsedrf");
		signup.setPhone(getRandomNumbers());
		signup.clickWhatsAppNumberYesCheckbox();
		signup.selectIndividualAccount();
		signup.clickCreateAccountBtn();
		
		logger.info("***Assert test***");
	
		Assert.assertEquals(signup.getEmailErrorText(), "Email is required");
		
		
	}

}
