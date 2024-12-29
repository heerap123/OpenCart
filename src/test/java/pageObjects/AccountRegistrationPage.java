package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//input[@id='input-firstname']") 
	WebElement FirstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']") 
	WebElement LastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement EMail;
	
	@FindBy (xpath = "//input[@id='input-telephone']")
	WebElement Telephone;
	
	@FindBy (xpath ="//input[@id='input-password']")
	WebElement Password;
	
	@FindBy (xpath ="//input[@id='input-confirm']")
	WebElement PasswordConfirm;
	
	@FindBy (xpath ="//input[@name='agree']")
	WebElement chkPolicy;
	
	@FindBy(xpath ="//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath ="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	
	public void setFirstName(String fname)
	{
		FirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		LastName.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		EMail.sendKeys(email);
	}
	
	public void setTelephone(String Tphone)
	{
		Telephone.sendKeys(Tphone);
	}
	
	public void setPassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	public void setPasswordConfirm(String cpwd)
	{
		PasswordConfirm.sendKeys(cpwd);
	}
	
	public void setPrivacyPolicy()
	{
		chkPolicy.click();
	}
	
	public void clickContinue()
	{
		//sol1 
		btnContinue.click();
		
		//sol2 
		//btnContinue.submit();
		
		//sol3
		//Actions act=new Actions(driver);
		//act.moveToElement(btnContinue).click().perform();
					
		//sol4
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", btnContinue);
		
		//Sol 5
		//btnContinue.sendKeys(Keys.RETURN);
		
		//Sol6  
		//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
	}
	
	public String getConfirmationMsg()
	{
		try {
		return (msgConfirmation.getText());
		}
		catch (Exception e)
		{
			return e.getMessage();
		}
	}

}
