package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgetPasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;
import testBase.BaseClass;

public class TC_007_ForgotPasswordLinkFunctionality extends BaseClass{
	
	@Test
	public void ForgotPasswordLinkFunctionality() throws InterruptedException {
		
		logger.info("***Starting ForgotPasswordLinkFunctionality Test***");
		
		WelcomePage wp = new WelcomePage(driver);
		wp.clickLagosCheckBox();
		wp.clickConfirmBtn();
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(3000);
		hp.clickSignup();
		Thread.sleep(2000);
		
		logger.info("***Enter valid login details***");
		LoginPage lp = new LoginPage(driver);
		lp.setEmailOrUsernameField(resourcebundle.getString("email"));
		
		lp.clickForgotPasswordLink();
		
		
		ForgetPasswordPage forgotpassword = new ForgetPasswordPage(driver);
		
		
		logger.info("***Assert test***");
		
		Assert.assertEquals(forgotpassword.getForgotPasswordText(), "Forgot Password"); 
		
	}
	

}
