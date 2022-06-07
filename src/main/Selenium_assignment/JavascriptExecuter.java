package Selenium_training.Sel_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptExecuter {

	@Test
	public void Guru99() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Creating the JavascriptExecutor interface object by Typecasting_
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		//title of page
		String script= "return document.title;";
		String title=(String) js.executeScript(script);
		System.out.println(title);
		
		driver.findElement(By.name("uid")).sendKeys("mgr123");					
        driver.findElement(By.name("password")).sendKeys("mgr!23");					
        		
        //Perform Click on LOGIN button using JavascriptExecutor	
        WebElement button=driver.findElement(By.name("btnLogin"));
        js.executeScript("arguments[0].click();", button);
        Thread.sleep(2000);
        
        //alert print
        try{
        	 js.executeScript("alert('Welcome to Guru99');");
             Thread.sleep(2000);
             js.executeScript("history.go(0)");
        }
        catch(Exception e)
        {
        	System.out.println("Alert unable to close");
        }
       
        
		      
	}

}
