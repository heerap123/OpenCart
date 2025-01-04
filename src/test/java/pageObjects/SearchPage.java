package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//*[@id='content']/div[3]//img")
	List<WebElement> searchProducts;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	WebElement txtqty;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	WebElement btnAddToCart;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement cmf_msg;
	
	
	
	public boolean isProductExist(String productName)
	{
		boolean flag = false;
		for(WebElement product:searchProducts)
		{
			if(product.getAttribute("title").equals(productName))
			{
				flag = true;
				break;
			}
		}
		return flag;	
	}
	
	public void selectProduct(String product)
	{
		for(WebElement product1:searchProducts) 
		{
			if(product1.getAttribute("title").equals(product))
			{
				product1.click();
			}
		}
	}
	
	public void setQuantity(String qty)
	{
		txtqty.clear();
		txtqty.sendKeys(qty);
	}
	
	public void addToCart()
	{
		btnAddToCart.click();
	}
	
	public boolean checkConfMsg()
	{
		try {
		return cmf_msg.isDisplayed();
		}
		catch (Exception e) {
			return false;
		}
	}

}
