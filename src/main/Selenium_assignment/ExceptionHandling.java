package Selenium_training.Sel_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		try
		{
		driver.get("https://google.com");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			System.out.println("WebPage not Found");
			Assert.fail();
		}
		try
		{
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle,actualTitle);
		System.out.println("Actual Page Title: "+actualTitle);
		}
		catch(Exception e)
		{
			System.out.println("Exception: Webpage Title differs");
			Assert.fail();
		}
		driver.close();
	}

}
