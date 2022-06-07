package Selenium_training.Sel_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Controls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		

		Thread.sleep(2000);
		//Radio button
		
		WebElement radio=driver.findElement(By.className("radio-inline"));
		if(!radio.isSelected())
		{
			radio.click();
		}
		Thread.sleep(2000);
		
		//checkbox__
		driver.findElement(By.name("agree")).click();
		Thread.sleep(2000);
		

		
	}

}
