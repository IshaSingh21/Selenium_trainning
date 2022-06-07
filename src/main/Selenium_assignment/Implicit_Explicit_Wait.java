package Selenium_training.Sel_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_Explicit_Wait {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
		driver.get("http://demo.guru99.com/test/guru99home/" );
		System.out.println( "Entered into website");
		driver.manage().window().maximize() ;
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		aTitle = driver.getTitle();
		if (aTitle.equals(eTitle))
		{
		System.out.println( "Expected title is same as Actual Title");
		}
		else 
		{
		System.out.println( "Expected title is different from Actual Title" );
		}
		
		//EXPLICIT WAIT
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement guru99seleniumlink;
		guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//*[@id=\"rt-feature\"]/div/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/div/a/i")));
		guru99seleniumlink.click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
