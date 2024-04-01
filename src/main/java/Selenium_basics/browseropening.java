package Selenium_basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class browseropening {
	public void open()
	{
		WebDriver name =new ChromeDriver(); //to open the chrome browser
		name.manage().window().maximize(); // to mazimize or minimize the browser page
		//name.close();
		name.get("https://www.facebook.com/");
		/*name.navigate().back();
		name.navigate().forward();
		name.navigate().refresh();
		WebDriver name =new EdgeDriver(); //to open the chrome browser
		name.manage().window().maximize(); // to mazimize or minimize the browser page
		//name.close();
		name.get("https://www.facebook.com/");
		name.navigate().to("https://accounts.google.com/v3/signin/identifier?dsh=S1946876068%3A1688139713783672&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AeDOFXjhZlgCkspZm3qFD_bdwcQCG4PDFrnKaJ_reb8llNN8R7JUMEUVQez12AJBTm8KolEE4FDsOQ&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		name.navigate().back();
		name.navigate().forward();
		name.navigate().refresh();*/
		WebElement username = name.findElement(By.id("email"));
		username.sendKeys("Mahalakshmi");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		browseropening s = new browseropening();
		s.open();

	}

}
