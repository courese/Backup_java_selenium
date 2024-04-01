package Selenium_basics;
import java.io.*;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FB_Accountcreation {
	String filePath = "C:\\Users\\WIN\\eclipse-workspace\\Mavenprojectcreation\\src\\main\\java\\textfolder\\";
	String fileName = "login.properties";
	
	public void accountcreation() throws IOException
	{
		File F = new File(filePath+fileName);
		FileInputStream FS = new FileInputStream(F);
		Properties Ps = new Properties();
		Ps.load(FS);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Ps.getProperty("url"));
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(60)); //explicity wait method
        //Wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[starts-with(@name,'firstname')]"))));
		driver.findElement(By.xpath("//input[starts-with(@name,'firstname')]")).sendKeys(Ps.getProperty("Firstname"));;
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(Ps.getProperty("Lastname"));;
		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys(Ps.getProperty("email"));
		driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys(Ps.getProperty("re-enter"));
		driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]")).sendKeys(Ps.getProperty("Password"));
	    Select s = new Select (driver.findElement(By.xpath("//select[@name='birthday_day']")));
	    s.selectByIndex(20);
	    driver.findElement(By.xpath("(//select[@name='birthday_month']//descendant::option)[6]")).click();
	    driver.findElement(By.xpath("(//select[@name='birthday_year']//descendant::option)[15]")).click();
	    driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();
	}
	
	public void conditions(String Gender) throws IOException
	{
		File F = new File(filePath+fileName);
		FileInputStream FS = new FileInputStream(F);
		Properties Ps = new Properties();
		Ps.load(FS);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Ps.getProperty("url"));
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		if(Gender.equalsIgnoreCase("Female"))
		{
			driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();
		}
		else if(Gender.equalsIgnoreCase("Male"))
		{
			driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();	
		}
		else if(Gender.equalsIgnoreCase("Custom"))
		{
			driver.findElement(By.xpath("//input[@name='sex' and @value='-1']")).click();	
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FB_Accountcreation s = new FB_Accountcreation();
		//s.conditions("Custom");
		s.accountcreation();

	}

}
