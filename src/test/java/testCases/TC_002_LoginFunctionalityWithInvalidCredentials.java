package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;
import testBase.BaseClass;

public class TC_002_LoginFunctionalityWithInvalidCredentials extends BaseClass{
	
	@Test
	public void LoginTestWithInvalidCredentials() throws InterruptedException {
		
		logger.info("***Starting LoginTestWithInvalidCredentials***");
		WelcomePage wp = new WelcomePage(driver);
		wp.clickLagosCheckBox();
		wp.clickConfirmBtn();
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(3000);
		hp.clickSignup();
		Thread.sleep(2000);
		
		logger.info("***Enter invalid login details***");
		LoginPage lp = new LoginPage(driver);
		lp.setEmailOrUsernameField(getRandomString()+"@mail.com");
		lp.setPasswordField(getRandomString());
		lp.clickLoginBtn();
		
		logger.info("***Assert invalid test***");
		Assert.assertEquals(lp.getInvalidEmailErrorMessage(), "Attempt to read property \"user_access\" on null");  
		
	}
	

}
