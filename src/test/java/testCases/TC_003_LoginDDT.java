package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDDT extends BaseClass{
	
	@Test(dataProvider = "LoginData" ,dataProviderClass = DataProviders.class ,groups ={"Master"})
	public void verify_loginDDT(String email, String password , String exp)
	{
		try {
		logger.info("**** Starting TC_003_LoginDDT  ****");
		logger.debug("capturing application debug logs....");
		
		//Home page
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("clicked on myaccount link on the home page..");
		hp.clickLogin();
	    logger.info("clicked on login link under myaccount..");
				
		//Login page
		LoginPage lp = new LoginPage(driver);
		logger.info("Entering valid email and password..");
		lp.setEMail(email);
		lp.setPassword(password);
		lp.clickLogin();
		logger.info("clicked on ligin button..");
		
		MyAccountPage macc = new MyAccountPage(driver);
		boolean targetPage = macc.isMyAccountPageExists();
		
		/*Data is valid  - login success - test pass  - logout
		Data is valid -- login failed - test fail

		Data is invalid - login success - test fail  - logout
		Data is invalid -- login failed - test pass
		*/
		 if (exp.equalsIgnoreCase("Valid"))
		 {
			 if(targetPage==true)
			 {
				 macc.clickLogout();
				 Assert.assertTrue(true);
			 }
			 else
			 {
				 Assert.assertTrue(false);
			 }
		 }
		 if (exp.equalsIgnoreCase("Invalid"))
		 {
			 if(targetPage==true)
			 {
				 macc.clickLogout();
				 Assert.assertTrue(false);
			 }
			 else
			 {
				 Assert.assertTrue(true);
			 }
		 }
		}
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
			logger.info("fall in catch exception");
		}
	
		 
		 logger.info("**** Finished TC_003_LoginDDT *****");
		
	}

}
