package Selenium_training.Sel_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class invokingDiffBroswer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		System.out.println("Chrome browser successfully invoked");
		driver.close();
		
		
		
		

		System.setProperty("webdriver.edge.driver",".\\edgeDriver\\msedgedriver.exe" );
		WebDriver driver1= new EdgeDriver();
		driver1.get("https://www.facebook.com/login/");
		driver1.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("MS Edge browser successfully invoked");
		driver1.quit();
	}

}
