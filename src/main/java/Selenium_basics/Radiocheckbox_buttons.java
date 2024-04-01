package Selenium_basics;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiocheckbox_buttons {
	
	public void checkbox() throws IOException
	{
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://leafground.com/checkbox.xhtml");
		//driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//div[contains(@class,'chkbox')]")).click();
		driver.findElement(By.xpath("//*[@id='j_idt87:j_idt91']//div[contains(@class,'chkbox')]")).click();
		driver.findElement(By.xpath("(//*[@id='j_idt87:basic']//div[contains(@class,'chkbox-box')])[3]")).click();
		driver.findElement(By.xpath("//*[starts-with(@class,'col-12')]//div[contains(@class,'ui-toggleswitch-slider')]")).click();
		//Select s = new Select(driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']//ul[contains(@class,'ui-selectcheckboxmenu-items')]")));
		//s.selectByIndex(2);
	}
	public void radiobutton() throws IOException
	{
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://leafground.com/radio.xhtml;jsessionid=node01rvep9fr5nncg1i4q7dygpjnpm372324.node0");
		driver.findElement(By.xpath("(//table[starts-with(@id,'j_idt87')]//div[contains(@class,'ui-radiobutton-box')])[2]")).click();
		driver.findElement(By.xpath("(//div[starts-with(@id,'j_idt87:city2')]//div[contains(@class,'ui-radiobutton-box')])[1]")).click();
		driver.findElement(By.xpath("(//table[starts-with(@id,'j_idt87:console2')]//div[contains(@class,'ui-radiobutton-box')])[2]")).click();
		driver.findElement(By.xpath("(//*[starts-with(@id,'j_idt87:age')]//div[contains(@class,'ui-radiobutton-box')])[2]")).click();
		driver.findElement(By.xpath("(//*[starts-with(@id,'j_idt87:age')]//div[contains(@class,'ui-radiobutton-box')])[2]")).click();
	}


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Radiocheckbox_buttons s = new Radiocheckbox_buttons();
		s.checkbox();

	}

}
