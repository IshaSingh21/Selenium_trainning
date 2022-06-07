package Selenium_training.Sel_Assignment;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;


public class ReadingDataFromExcel {

	

	@Test
	public void datareadTest() throws Exception
	{
		File src =new File("C:/Users/ISINGH5/OneDrive - Capgemini/Book3.xls");
		
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);   
		HSSFSheet sheet=wb.getSheetAt(0);
		String entry1=sheet.getRow(1).getCell(5).getStringCellValue();
		System.out.println("The data in the box is "+ entry1);
		
		
		System.out.println("ROW no. :"+ sheet.getLastRowNum());
		
		wb.close();
		
				
	}
	
}
