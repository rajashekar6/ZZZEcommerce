package testBase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountReg;
import pageObjects.HomePage;

public class Tc1 extends Baseclass {
	
	WebDriver driver;
	@Test
	
	public  void verifyaccReg()
	
	{
		logger.info("starting verifyaccReg");
		try {
			
	
		HomePage h = new HomePage(driver);
		h.clickMyaccount();
		h.clickRegister();
		
			
		AccountReg a = new AccountReg(driver);
		String s =a.verifymsg();
		
		Assert.assertEquals(s, "you account ");
		
		}catch(Exception e)
		{
			logger.error("test failed");
			logger.debug("s");
			Assert.fail();
		}
	}
}
