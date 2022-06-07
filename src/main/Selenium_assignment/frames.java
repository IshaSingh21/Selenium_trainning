package Selenium_training.Sel_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		
//		----------handling single Frame----------------------
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input")).sendKeys("Isha");
		
		
		
//        ----------handling multiple Frame--------------------
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.id("frame1"));
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.id("frame3"));
		driver.switchTo().frame("frame3");
		
		WebElement checkbox = driver.findElement(By.id("a"));
		if(! checkbox.isSelected())
		{
			checkbox.click();
		}
		
//		-----------handling Dropdown_ in frame------------
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		WebElement dropdown= driver.findElement(By.id("animals"));
		
		Select sel=new Select(dropdown);
		
		sel.selectByVisibleText("Avatar");
		
		Thread.sleep(2000);
		driver.close();
	}

}
