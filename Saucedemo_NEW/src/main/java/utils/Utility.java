package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

		public static String GetDataFromExelSheet(String sheet, int row,int cell) throws EncryptedDocumentException, IOException {
		
		String data;
	
		String path ="C:\\Users\\eblog\\Desktop\\Book.xlsx\\";

		FileInputStream  file = new FileInputStream(path);
	
		Cell c = WorkbookFactory.create(file).getSheet(sheet)
				.getRow(row).getCell(cell);
			
		try {
			data=c.getStringCellValue();
			}
			
			catch(IllegalStateException e) 
			{
			double v = c.getNumericCellValue();
		
			data =String.valueOf(v);  
			
				System.out.println(data);  
			}
		
			catch(java.lang.NullPointerException e) 
			{
		
			data = "Null Data";
			
			}
			return data;
			}	
	
//			What do you mean by wrapper class and how will you do data conversion?
		
//				Wrapper class in java are used for data conversion.
//				In data conversion if user wants to convert Int to string, String to int, Boolean, double then we use Wrapper class. 
//				
//				integer.parseInt(); - To convert string to Integer
//				Double.parseDouble(); - To convert string to Double
//				Boolean.parseBoolean(); - To convert string to Boolean
//				String.valueof(); - To convert Integer to String.

	
	public static void getScreenShot(WebDriver driver , int testId) throws IOException, InterruptedException {
		
		System.out.println("getScreenShot");
		
		 // Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		 
		 // Print the Date
		 System.out.println(date1);
		 
		 File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 File dest = new File ("F:\\velocity pune\\automation , akasha sir\\selenium  2nd\\class 47 ( 19-1-22 ) { how take screen shot  }\\screenshot selenium\\test"+ testId +"_"+ date1 +".jpg");
			 
		 FileHandler.copy(scr, dest);

		 
		 Thread.sleep(1000);
		
		
	}

}
