package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_004_SearchProductTest extends BaseClass{
	@Test(groups= {"Master"})
	public void verify_pruductSearch()
	{
		
		logger.info("Starting TC_004_SearchProductTest");
		try {
		HomePage hp = new HomePage(driver);
		hp.searchProductName("mac");
		hp.clickSearch();
		logger.info("Search completed");
		
		SearchPage sp = new SearchPage(driver);
		boolean p_Stat= sp.isProductExist("MacBook");
		Assert.assertEquals(p_Stat, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info(" Finished TC_004_SearchProductTest ");
	}
	

}
