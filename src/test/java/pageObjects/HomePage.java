package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//span[normalize-space()='My Account']") 
	WebElement lnkMyaccount;
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement lnklogin;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchBox;
	
	@FindBy(xpath = "//i[@class='fa fa-search']")
	WebElement searchbtn;
	
	
	
	
	
	public void clickMyAccount()
	{
		lnkMyaccount.click();
	}
	
	public void clickRegidter()
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		lnklogin.click();
	}
	
	public void searchProductName(String pname)
	{
		searchBox.sendKeys(pname);
	}
	
	public void clickSearch()
	{
		searchbtn.click();
	}
	
	
	
	

}
