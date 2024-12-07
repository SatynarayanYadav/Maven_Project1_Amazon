package Project1.Ecommerce_Amazon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.WebDriver;

  
public class DDT 
{ 

	WebDriver driver;
	
	public static String username1_valid,Password1_valid ,username2_invalid,Password2_invalid ,Coupon1,DebitCard1;
	public void UserDetails(WebDriver driver) throws EncryptedDocumentException, IOException
	{    
		  FileInputStream file = new FileInputStream("C:\\Users\\satya\\eclipse-workspace\\Ecommerce_Amazon\\DDT\\Amazon user details.xlsx");
		  Workbook work =  WorkbookFactory.create(file);
		  username1_valid = work.getSheet("UserDetails1").getRow(1).getCell(0).getStringCellValue();
		  
		
		  Password1_valid = work.getSheet("UserDetails1").getRow(1).getCell(1).getStringCellValue();
		   
		  
		  username2_invalid = work.getSheet("UserDetails1").getRow(2).getCell(0).getStringCellValue();
		 
		
		  Password2_invalid = work.getSheet("UserDetails1").getRow(2).getCell(1).getStringCellValue();
		  
		  
		  
		   
	}
	
	public void coupondetails(WebDriver driver) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\satya\\eclipse-workspace\\Ecommerce_Amazon\\DDT\\Amazon user details.xlsx");
		Workbook work1 =  WorkbookFactory.create(file);
		// Coupon code 
		Coupon1 = NumberToTextConverter.toText (work1.getSheet("Couponid").getRow(1).getCell(0).getNumericCellValue());
		  
	}
	
	public void CardDetail(WebDriver driver) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\satya\\eclipse-workspace\\Ecommerce_Amazon\\DDT\\Amazon user details.xlsx");
		Workbook work2 =  WorkbookFactory.create(file);
		// Coupon code 
		DebitCard1 = NumberToTextConverter.toText (work2.getSheet("CardDetails").getRow(1).getCell(0).getNumericCellValue());
		  
	}
	
}
