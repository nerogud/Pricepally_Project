package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.SignupPage;
import pageObjects.WelcomePage;
import testBase.BaseClass;

public class TC_020_VerifySuccessfulSignupWithCompleteSpecificUserDetails extends BaseClass{
	
	@Test
	public void VerifySuccessfulSignupWithCompleteSpecificUserDetails() {
		
		logger.info("***Starting VerifySuccessfulSignupWithCompleteSpecificUserDetails Test***");
		WelcomePage wp = new WelcomePage(driver);
		wp.clickLagosCheckBox();
		wp.clickConfirmBtn();
		
		HomePage hp = new HomePage(driver);
		hp.clickSignup();
		
		LoginPage lp = new LoginPage(driver);
		lp.clickCreateAccountLink();
		
		SignupPage signup = new SignupPage(driver);
		signup.setFirstName("franki");
		signup.setLastName("ogwas");
		signup.setUserName("frankgwastic");
		signup.setEmail("franki@mail.com");
		signup.setPassword("qawsedrf");
		signup.setPhone("8135879032");
		signup.clickWhatsAppNumberYesCheckbox();
		signup.selectIndividualAccount();
		signup.clickCreateAccountBtn();
		
		logger.info("***Assert test***");
		MyAccountPage myaccountpg = new MyAccountPage(driver);
		Assert.assertTrue(myaccountpg.myAccountDisplayStatus());
		
		
	}

}
