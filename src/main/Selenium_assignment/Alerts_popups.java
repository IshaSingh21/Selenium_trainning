package Selenium_training.Sel_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_popups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
/*		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.name("cusid")).sendKeys("53920");					
	    driver.findElement(By.name("submit")).submit();	
	    
	    Alert alert=driver.switchTo().alert();
	    
	    //get text
	    String msg= driver.switchTo().alert().getText();
	    System.out.println("Alert msg : " + msg);
	    
	    Thread.sleep(3000);
	    // Accepting alert		
        alert.accept();	 */
	    
		
		//POPUPS
		
		   driver.get("https://demoqa.com/alerts");
		   driver.manage().window().maximize();
		  // This step will result in an alert on screen
		   WebElement element = driver.findElement(By.id("promtButton"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		   Alert promptAlert  = driver.switchTo().alert();

		   Thread.sleep(3000);
		   String alertText = promptAlert.getText();
		   System.out.println("Alert text is " + alertText);
		   Thread.sleep(3000);
		  //Send some text to the alert
		   promptAlert.sendKeys("Test User");
		   Thread.sleep(3000);
		   promptAlert.accept();
		   WebElement textentered=driver.findElement(By.id("promptResult"));
		   System.out.println(textentered.getText());

	}

}
