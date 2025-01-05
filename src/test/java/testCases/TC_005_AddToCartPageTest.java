package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_005_AddToCartPageTest extends BaseClass{
	
	@Test(groups = "Master")
	public void verify_addToCart()
	{
		logger.info("Started TC_005_AddToCartPageTest ");
		try {
		HomePage hp = new HomePage(driver);
		hp.searchProductName("iphone");
		hp.clickSearch();
		
		SearchPage sp = new SearchPage(driver);
		if(sp.isProductExist("iPhone"))
		{
			sp.selectProduct("iPhone");
			sp.setQuantity("2");
			sp.addToCart();
			
		}
	
		Assert.assertEquals(sp.checkConfMsg(), true);
		}
		catch (Exception e) {
			Assert.fail();
		}
		
		
		
	}

}
