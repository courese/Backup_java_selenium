package Selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Tableconcept {
	public void table(String Expectedcountryname) throws Exception
	{
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://leafground.com/table.xhtml;jsessionid=node0twdqvu4bx0ngr5skywg5k1hm389682.node0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		List<WebElement> total = driver.findElements(By.xpath("//*[@class='ui-datatable-scrollable-body']//table//tbody//tr"));
		for(int i=1; i<total.size(); i++)
			{
			String countryname = driver.findElement(By.xpath("//*[@class='ui-datatable-scrollable-body']//table/tbody//tr[\"+i+\"]//td[2]//span[contains(@style,'vertical-align')]")).getText(); 
			if (Expectedcountryname.equalsIgnoreCase(countryname))
			{
				String Representative = driver.findElement(By.xpath("//*[@class='ui-datatable-scrollable-body']//table/tbody//tr[\"+i+\"]//td[2]//span[contains(@style,'vertical-align')]")).getText();
				System.out.println(Representative);
				//String Status = driver.findElement(By.xpath("//*[@class='ui-datatable-scrollable-body']//table/tbody//tr[\"+i+\"]td[5]//span[contains(@class,'customer-badge')]")).getText();
				//System.out.println(Status);
			}
			}
					
	}
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Tableconcept s = new Tableconcept();
		s.table("india");
		

	}

}
