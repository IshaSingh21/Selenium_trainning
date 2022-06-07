package Selenium_training.Sel_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Select se = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
		
		// Select the option with value "6"
		se.selectByValue("6");
		
		Select se1 = new Select(driver.findElement(By.id("cars")));
		
		//Selecting multiple values by visible text
		se1.selectByVisibleText("Volvo");
		
		//Selecting multiple values by index
		se1.selectByIndex(2);
		
	}

}
