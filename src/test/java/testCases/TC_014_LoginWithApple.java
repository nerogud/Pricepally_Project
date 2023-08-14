package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;
import testBase.BaseClass;

public class TC_014_LoginWithApple extends BaseClass{
	
	@Test
	public void VerifyLoginWithApple() throws InterruptedException {
		
		logger.info("***Starting VerifyLoginWithApple Test***");
		
		WelcomePage wp = new WelcomePage(driver);
		wp.clickLagosCheckBox();
		wp.clickConfirmBtn();
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(3000);
		hp.clickSignup();
		Thread.sleep(2000);
		
		logger.info("*** login details intentionally kept blank***");
		LoginPage lp = new LoginPage(driver);
		lp.clickAppleSignUpBtn();
		
		
		
		
		logger.info("***Assert test***");
		Assert.assertTrue(lp.facebookSignUpBtnIsDisplayed());
		
	}

}
