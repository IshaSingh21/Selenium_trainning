package Selenium_training.Sel_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		 /**Locate by ID Attribute*/
		 driver.findElement(By.id("input-firstname")).sendKeys("Isha");
	
		 //Locate by name Attribute
		 driver.findElement(By.id("input-lastname")).sendKeys("Singh");
		 Thread.sleep(2000);
		 
		 //Xpath
		 driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("isha@gmail.com");
		 
		 //cssSelector 
		 driver.findElement(By.cssSelector("#input-telephone")).sendKeys("2434768");
		 Thread.sleep(2000);
		 //tagName
		 driver.findElement(By.tagName("input"));
		 //linkText 
		 driver.findElement(By.linkText("Contact Us"));
		 Thread.sleep(2000);
		 
		 //partialLinkText
		 driver.findElement(By.partialLinkText("Conta"));
		 Thread.sleep(2000);
		 //ClassName 
		 driver.findElement(By.className("list-group-item")).click();
		
	}

}
