package selenium_practice;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class FB_login {
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Maha");
		driver.findElement(By.name("pass")).sendKeys("9500361419");
		driver.findElement(By.xpath("//*[@data-testid='royal_login_button']")).click();
	}
	
	public void FB_account()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Maha");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("lakshmi");
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("lakshmirajamohan21@gmail.com");
		driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys("lakshmirajamohan21@gmail.com");
		driver.findElement(By.xpath("//*[@data-type='password']")).sendKeys("lakshmi");
		driver.findElement(By.xpath("//select[@name='birthday_day']//option[21]")).click();
		driver.findElement(By.xpath("//select[@name='birthday_month']//option[6]")).click();
		driver.findElement(By.xpath("//select[@name='birthday_year']//option[1996]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();
		//driver.findElement(By.xpath("//*[@name='websubmit']")).click();
	}
	
	public void listof_textbox()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		List<WebElement> Textboxes = driver.findElements(By.xpath("//*[@type='text']"));
		System.out.println("Total number of textboxes:"+Textboxes.size());
	}
	
	public static void main(String[] args) {
		FB_login S= new FB_login();
		//S.FB_account();
		S.listof_textbox();
	}
}
