package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project {
	public void mail()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
		driver.findElement(By.xpath(null))
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
