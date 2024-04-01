package BillProject2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hotel1 extends Hotel2{
	
	
	public void hotelname(String str) throws IOException 
	{
		String filePath = "C:\\Users\\WIN\\eclipse-workspace\\Mavenprojectcreation\\src\\main\\java\\textfolder\\";
		String fileName = "hotelsangee.properties";
		if (str=="sangeetha")
		{
			System.out.println("\t\t\t\t\tHotel Name: " + str);
			File F = new File(filePath+fileName);
			FileInputStream FS = new FileInputStream(F);
			Properties Ps = new Properties(); // propert method
			Ps.load(FS); // load is used to read the FS file to readable format
			System.out.println("\t\t\t\t" +Ps.getProperty("sangeetha"));
			System.out.println("\t\t\t\t--------------------------------------------------------------");
			System.out.println("\t\t\t\t" + "Food" + "\t\t\t" + "Rate" + "*" + "Count" + "\t\t" + "Total");
		}
		else
		{
			System.out.println("unavailable");
		}
	}
	
	public double restaurant(String str, String food, int count1) throws IOException
	{
		String filePath = "C:\\Users\\WIN\\eclipse-workspace\\Mavenprojectcreation\\src\\main\\java\\textfolder\\";
		String fileName = "hotel1list.xlsx";
		double total=0;
		
		File F = new File(filePath+fileName); //to open the file
		FileInputStream FS = new FileInputStream(F); // to read the file
		XSSFWorkbook workbook = new XSSFWorkbook(FS);
		Sheet sheet = workbook.getSheet("sangeetha");
		int totalRows = sheet.getPhysicalNumberOfRows();
		
		for(int i=0;i<totalRows;i++) 
		{
			
			Row row = sheet.getRow(i); 
			int totalColumn = row.getLastCellNum(); 
			
				Cell eachcell =row.getCell(0);
				Cell eachcell1 =row.getCell(1);
				double amount=eachcell1.getNumericCellValue();
				//System.out.println(eachcell);
				//System.out.println(eachcell1);	
				if (food.equals(eachcell.getStringCellValue())) {
				total = amount * count1;
				System.out.println("\t\t\t\t" + food + "\t\t" + amount + "*" + count1 + "\t\t\t" + total);
				}
		}
		return count1;	
	}
	public void calc(double total)
	{
					
			double discount = total * .15;
			double taxpercent = .09;
			double tax = total * .09;
			double percent = .15;
			System.out.println("\t\t\t\tDiscount amt @15%\t" + percent + "\t\t\t" + discount);
			System.out.println("\t\t\t\tGCST amt @9%\t\t" + taxpercent + "\t\t\t" + tax);
			double price = discount + tax + total;
			System.out.println("\t\t\t\tPrice(Rs):\t\t\t\t\t" + price);


		
	}
}
