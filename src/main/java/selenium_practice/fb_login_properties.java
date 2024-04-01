package selenium_practice;
import java.io.*;
import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class fb_login_properties {

	String Filepath= "C:\\Users\\WIN\\eclipse-workspace\\Framework\\Input\\";
	String Filename= "fBCREATE.PROPERTIES";
	
	public void account_creation() throws Exception
	{
		File F = new File(Filepath+Filename);
		FileInputStream FS = new FileInputStream(F);
		Properties Ps = new Properties();
		Ps.load(FS);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Ps.getProperty("URL"));
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//input[starts-with(@name,'firstname')]")).sendKeys(Ps.getProperty("firstname"));
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys(Ps.getProperty("lastname"));
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys(Ps.getProperty("email"));
		driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys(Ps.getProperty("re-enter"));
		driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys(Ps.getProperty("password"));
		driver.findElement(By.xpath("//select[@name='birthday_day']//option[21]")).click();
		driver.findElement(By.xpath("//select[@name='birthday_month']//option[6]")).click();
		driver.findElement(By.xpath("//select[@name='birthday_year']//option[1996]")).click();
		driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();
		
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		fb_login_properties s = new fb_login_properties();
		s.account_creation();

	}

}
