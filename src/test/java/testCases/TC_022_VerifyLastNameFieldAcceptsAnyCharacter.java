package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.SignupPage;
import pageObjects.WelcomePage;
import testBase.BaseClass;

public class TC_022_VerifyLastNameFieldAcceptsAnyCharacter extends BaseClass{
	
	@Test
	public void VerifyLastNameFieldAcceptsAnyCharacter() {
		
		logger.info("***Starting VerifyLastNameFieldAcceptsAnyCharacter Test***");
		WelcomePage wp = new WelcomePage(driver);
		wp.clickLagosCheckBox();
		wp.clickConfirmBtn();
		
		HomePage hp = new HomePage(driver);
		hp.clickSignup();
		
		LoginPage lp = new LoginPage(driver);
		lp.clickCreateAccountLink();
		
		SignupPage signup = new SignupPage(driver);
		signup.setFirstName(getRandomString());
		signup.setLastName("£$%^&*(*@~#");
		signup.setUserName(getRandomString());
		signup.setEmail(getRandomString()+"@mail.com");
		signup.setPassword("qawsedrf");
		signup.setPhone(getRandomNumbers());
		signup.clickWhatsAppNumberYesCheckbox();
		signup.selectIndividualAccount();
		signup.clickCreateAccountBtn();
		
		logger.info("***Assert test***");
		MyAccountPage myaccountpg = new MyAccountPage(driver);
		Assert.assertTrue(myaccountpg.myAccountDisplayStatus());
		
		
	}

}
