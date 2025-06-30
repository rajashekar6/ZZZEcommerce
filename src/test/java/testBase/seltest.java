package testBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seltest {

	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws IOException {
		test2();
	}
	
	public static void test2() throws IOException {
	
	// TODO Auto-generated method stub
			driver.get("http://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("ra");
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("c://tmp//scrss1.jpeg"));

	}
	
	public static void winds() {
		
		
		String mw = driver.getWindowHandle();
		
		Set<String> s1= driver.getWindowHandles();
		
		Iterator<String> i1= s1.iterator();
		
		while(i1.hasNext())
		{
			String cw = i1.next();
			try {

			if(!mw.equalsIgnoreCase(cw))
			{
			driver.switchTo().window(cw);
			System.out.println(driver.getTitle());
			}
		     }catch (Exception e) {
			
			}}
	}
	public static void wa()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//WebDriverWait wait= new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("XPATH VALUE")));	
		
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	    .withTimeout(Duration.ofSeconds(10))
	    .pollingEvery(Duration.ofSeconds(5))
	    .ignoring(NoSuchElementException.class);
	    
	    //test2
	    driver.findElement(By.xpath(""));
		//test3 pull
	    
	    
}
}
		
		
		
	
