package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationandValidation {
	public void verification()
	{
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://leafground.com/checkbox.xhtml");
		String title = driver.getTitle(); //it is use dto get the title 
		System.out.println(title);
		String geturl = driver.getCurrentUrl(); // it is to get the current url for verification
		System.out.println(geturl);
		String domstructure = driver.getPageSource(); //it will give the domestructure details means F12
		System.out.println(domstructure);
		String text = driver.findElement(By.xpath("(//*[@id='j_idt87']//div[1]//h5)[7]")).getText(); //xpath is to take anyone of the element name eg:select multiple element in testleaf url 
		System.out.println(text);
		String windowname = driver.getWindowHandle();
		System.out.println(windowname);
		String windowsname = driver.getWindowHandle();
		System.out.println(windowsname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VerificationandValidation s = new VerificationandValidation();
		s.verification();
		

	}

}
