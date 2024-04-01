package BillProject2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Hotel2 {
	public void hotelname(String str) throws IOException 
	{
		String filePath = "C:\\Users\\WIN\\eclipse-workspace\\Selenium Java tutorial\\src\\textfolder\\";
		String fileName = "hotelsangee.properties";
		if (str=="Ambur")
		{
			System.out.println("\t\t\t\t\tHotel Name: " + str);
			File F = new File(filePath+fileName);
			FileInputStream FS = new FileInputStream(F);
			Properties Ps = new Properties(); // propert method
			Ps.load(FS); // load is used to read the FS file to readable format
			System.out.println("\t\t\t\t" +Ps.getProperty("Ambur"));
			System.out.println("\t\t\t\t--------------------------------------------------------------");
			System.out.println("\t\t\t\t" + "Food" + "\t\t\t" + "Rate" + "*" + "Count" + "\t\t" + "Total");
		}
		else
		{
			System.out.println("unavailable");
		}
	}

}
