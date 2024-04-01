package Selenium_basics;
import java.io.*;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class propertyfile_login {
	String filePath = "C:\\Users\\WIN\\eclipse-workspace\\Mavenprojectcreation\\src\\main\\java\\textfolder\\";
	String fileName = "login.properties";
	
	//String filepath =System.getProperty("user.dir")+"\\login\\";
	
	public void file() throws IOException
	{
		File F = new File(filePath+fileName);
		FileInputStream FS = new FileInputStream(F);
		Properties Ps = new Properties(); 
		Ps.load(FS);
		WebDriver driver =new ChromeDriver(); //to open the chrome browser
		driver.manage().window().maximize(); 
		driver.get(Ps.getProperty("url")); // to get the property file
		WebElement username = driver.findElement(By.xpath("//input[contains(@id,'email')]")); // Contains xpath type
		username.sendKeys(Ps.getProperty("Username"));
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@aria-label,'Pass')]")); //starts-with xpatth type
		password.sendKeys(Ps.getProperty("Password"));
		WebElement button = driver.findElement(By.xpath("//button[starts-with(@id,'u_0')]"));
		button.click();
		//driver.close();
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		propertyfile_login s = new propertyfile_login();
		s.file();

	}

}
