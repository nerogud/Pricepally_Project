package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;
import testBase.BaseClass;

public class TC_004_LoginFunctionalityWithValidEmailAndInvalidPassword extends BaseClass{
	
	@Test
	public void LoginFunctionalityWithValidEmailAndInvalidPassword() throws InterruptedException {
		
		logger.info("***Starting LoginTestWithValidEmailAndInvalidPassword***");
		
		WelcomePage wp = new WelcomePage(driver);
		wp.clickLagosCheckBox();
		wp.clickConfirmBtn();
		
		HomePage hp = new HomePage(driver);
		hp.clickSignup();
		
		
		logger.info("***Enter login details***");
		LoginPage lp = new LoginPage(driver);
		lp.setEmailOrUsernameField(resourcebundle.getString("email"));
		Thread.sleep(3000);
		lp.setPasswordField(getRandomString());
		lp.clickLoginBtn();
		
		logger.info("***Assert test***");
		Assert.assertEquals(lp.getInvalidPasswordErrorMessage(), "Invalid email or password"); 
		
	}
		

}
