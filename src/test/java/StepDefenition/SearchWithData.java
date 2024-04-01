package StepDefenition;

import com.relevantcodes.extentreports.LogStatus;

import BrowserDriver.WebDriverFile;
import Pages.SearchPage;
import Pages.SearchResultPage;
import io.cucumber.java.en.When;

public class SearchWithData extends WebDriverFile {

	@When("select the From location as {string}")
	public void select_the_from_location_as(String fromLoc) throws InterruptedException {
		SearchPage s = new SearchPage(driver);
		test.log(LogStatus.INFO, "Browser is Launched sucessfully");
		s.ClickFromLocation();
		s.SelectLocation(fromLoc);
		test.log(LogStatus.INFO, "From location is sucessfully clicked and the selected value is : "+fromLoc);
		}

	@When("select the to location as {string}")
	public void select_the_to_location_as(String toLoc) throws InterruptedException {
		SearchPage s = new SearchPage(driver);
		
		s.ClickToLocation();
		s.SelectLocation(toLoc);
		test.log(LogStatus.INFO, "To location is sucessfully clicked and the selected value is : "+toLoc);
		
	}

	@When("select the date as {string}")
	public void select_the_date_as(String date) {
		SearchPage s = new SearchPage(driver);
		
		
		s.SelectADate(date);
		test.log(LogStatus.INFO, "Date selection is sucessfully clicked and the selected value is : "+date);
		
	}
	
	@When("close the Browser")
	public void close_the_Browser() throws InterruptedException {
		extentreportclose();
		driver.close();
		}
	
	@When("select the From location as ([^\"]*)$")
	public void select_the_from_location(String fromLoc) throws InterruptedException {
		SearchPage s = new SearchPage(driver);
		test.log(LogStatus.INFO, "Browser is Launched sucessfully");
		s.ClickFromLocation();
		s.SelectLocation(fromLoc);
		test.log(LogStatus.INFO, "From location is sucessfully clicked and the selected value is : "+fromLoc);
		}

	@When("select the to location as ([^\"]*)$")
	public void select_the_to_location(String toLoc) throws InterruptedException {
		SearchPage s = new SearchPage(driver);
		
		s.ClickToLocation();
		s.SelectLocation(toLoc);
		test.log(LogStatus.INFO, "To location is sucessfully clicked and the selected value is : "+toLoc);
		
	}

	@When("select the date as ([^\"]*)$")
	public void select_the_date(String date) {
		SearchPage s = new SearchPage(driver);
		
		
		s.SelectADate(date);
		test.log(LogStatus.INFO, "Date selection is sucessfully clicked and the selected value is : "+date);
		
	}

}
