package testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
WebDriver driver;
	
public Logger logger;
public Properties p;

	@BeforeClass
	public void setup() throws IOException
	
	{
		FileInputStream file = new FileInputStream("./src/test//resources//config.properites");
		p= new Properties();
		p.load(file);
	
		logger =(Logger) LogManager.getLogger(this.getClass());
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(p.getProperty("appulr")); //URL from properties file 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
