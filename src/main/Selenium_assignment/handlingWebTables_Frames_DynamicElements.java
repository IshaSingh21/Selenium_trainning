package Selenium_training.Sel_Assignment;


import java.util.List;

//DYNAMIC TABLE HANDLING
/*
Step 1: First get the entire HTML table and store this in a variable ‘htmltable’ of type web element.

Step 2: Get all the rows with tag name ‘tr’ and store all the elements in a list of web elements. Now all the elements with tag ‘tr’ are stored in ‘rows’ list.

Step 3: Loop through each row and get the list of elements with tag ‘th’. ‘rows.get(0)’ will give first row and ‘findElements(By.tagName(“th”))’ will give list of columns for the row.

Step 4: Iterate using ‘columns.getsize()’ and get the details of each cell.

Note: Above approach will be best suitable if the table dimensions changes dynamically. */


//Dynamic Elements
/*
 	Example: As in the above example, id value changes but few fields remains constant.
	‘username_123’ changed to ‘username_234’ but ‘username’ always remained constant.
	
	If there is no constant value------------
		driver.findElement(By.id(“password”)).sendKeys(Keys.ENTER));
		or
		driver.findElement(By.id(“password”)).sendKeys(Keys.TAB));
	
	
 */


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class handlingWebTables_Frames_DynamicElements {

	@Test
	public static void verifyTable(){
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		List<WebElement> allheaders= driver.findElements(By.xpath("//table[@class='dataTable']//th"));
		System.out.println("No.of headers : "+ allheaders.size());
		
		Assert.assertEquals(allheaders.size(), 5, "column count is not same");
		
		boolean status=false;
		for(WebElement ele:allheaders)
		{
			String value=ele.getText();
			System.out.println(value);
			if(value.contains("% Change"))
			{
				status=true;
				break;
			}
		}
		Assert.assertTrue(status);
		
		System.out.println("===================================");
		
		List<WebElement> allrows= driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		System.out.println("No.of Rows : "+allrows.size());
		Assert.assertEquals(allrows.size(), 27, "row count mismatch");
		
		System.out.println("===================================");
		
		List<WebElement> companiesnames= driver.findElements(By.xpath("//table[@class='dataTable']//tr//td[1]"));
		for(WebElement ele3:companiesnames)
		{
			String company=ele3.getText();
			System.out.println("First Company name appeared : " + company);
		}
		
		System.out.println("===================================");
		
		List<WebElement> companyname= driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//td[1]"));
		for(WebElement ele3:companyname)
		{
			String firstcompanyname=ele3.getText();
			System.out.println(firstcompanyname);
		}
		
		System.out.println("===================================");
		
		List<WebElement> alldata= driver.findElements(By.xpath("//table[@class='dataTable']//td"));
		
		boolean datastatus= false;
		for(WebElement ele2: alldata)
		{
			String data=ele2.getText();
			if(data.contains("A"))
			{
				datastatus=true;
				break;
			}
		}
		Assert.assertTrue(datastatus);
		System.out.println("===================================");
		
		
		
		driver.quit();
	}

}
