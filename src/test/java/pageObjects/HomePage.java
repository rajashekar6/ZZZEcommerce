package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  extends BasePage {

		// TODO Auto-generated method stub

		
		WebDriver driver;
		
		public HomePage(WebDriver driver)
		
		{
			super(driver);
		}
	

		@FindBy(xpath="//span[normalize-space()='My Account']")
		WebElement Myaccount;
		
		@FindBy(xpath="//a[normalize-space()='Register']")
		WebElement Register;
		
		public void clickMyaccount()
		{
			Myaccount.click();
			
		}
		public void clickRegister()
		{
			Register.click();
		}

}	
