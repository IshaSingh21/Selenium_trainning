package Selenium_training.Sel_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://testingbot.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Actions ac =new Actions(driver);
		WebElement freeTraial=driver.findElement(By.xpath("//a[@class='button button-trial'] "));
		ac.doubleClick(freeTraial).perform();
		
		WebElement features=driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul/li[1]/a/span"));
		ac.moveToElement(features).build().perform();
		WebElement apptest=driver.findElement(By.xpath("//h3[contains(text(), 'Automated App Testing')]"));
		ac.click(apptest).perform();
		
		WebElement login=driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
		ac.click(login).perform();
		Thread.sleep(2000);
		WebElement email= driver.findElement(By.id("user_email"));
		Actions builder=new Actions(driver);
		Action seriesOfActions= (Action) builder
				.moveToElement(email)
				.click()
	//			.keyDown(email, Keys.SHIFT)
				.sendKeys("Isha@gmail.com")
	//			.keyUp(email, Keys.SHIFT)
	//			.doubleClick(email)
				.build();
				
					
		seriesOfActions.perform();
		
	}

	
}
