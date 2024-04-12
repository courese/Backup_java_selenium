package selenium_practice;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_login {
	public void test()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"nI-gNb-log-reg\"]//a[@id=\"login_Layer\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"form-row\"]//input[contains(@placeholder,'Username')]")).sendKeys("lakshmirajamohan21@gmail.com");
		driver.findElement(By.xpath("//div[@class=\"form-row\"]//input[contains(@placeholder,'password')]")).sendKeys("Lakshmi@2109");
		driver.findElement(By.xpath("//*[@class=\"login-layer\"]//div[6]")).click();
		
	}

}
