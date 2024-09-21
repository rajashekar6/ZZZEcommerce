package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountReg  extends BasePage{
	
	WebDriver driver;
	
	public AccountReg(WebDriver driver)
	{
		super(driver);
		
		
	}
	
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement Fname ;

	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement Lname ;

	@FindBy(xpath="//input[@id='input-email']\"))")
	WebElement Email ;

	@FindBy(xpath="//input[@id='input-password']")
	WebElement PSWD; ;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement Continue ;
	
	
	public void setFname(String fnameip)
	{
		Fname.sendKeys(fnameip);
	}
	
	public void setLname(String lnameip)
	{
		Lname.sendKeys(lnameip);
	}
	
	public void setEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void setpassword(String password)
	{
		PSWD.sendKeys(password);
	}
	
	public void clickContinue()
	{
		Continue.click();
	}
	
	public String  verifymsg()
	{
		try {
			return Continue.getText() ;	
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
		
	}
	

	
	

}
