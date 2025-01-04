package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//span[normalize-space()='Shopping Cart']")
	WebElement shoppingCart;
	
	@FindBy(xpath = "//strong[normalize-space()='View Cart']")
	WebElement viewCart;
	
	@FindBy(xpath = "//*[@id='content']/div[2]/div/table//strong[text()='Total:']//following::td")
	WebElement totalPrice;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement btncheckout;
	
	public void clickshoppingCart()
	{
		shoppingCart.click();
	}
	
	public void clickviewCart()
	{
		viewCart.click();
	}
	
	public String getTotalPrice()
	{
		return totalPrice.getText();
	}
	
	public void clickCheckOut()
	{
		btncheckout.click();
	}

}
