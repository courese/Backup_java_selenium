package StepDefenition;


import com.relevantcodes.extentreports.LogStatus;

import BrowserDriver.WebDriverFile;

import Commons.WebDriverCommons;

import Pages.SearchPage;
import Pages.SearchResultPage;
import io.cucumber.java.en.*;
import Utils.PropertyFileHandle;

public class Search extends WebDriverFile{
	
	@Given("Open the browser and enter the application url")
	public void open_the_browser_and_enter_the_application_url() throws InterruptedException {
	  Launch();
	  String URL = PropertyFileHandle.propreaddata().getProperty("URL");
	  driver.get(URL);
	}

	@When("i see a popup click on it")
	public void i_see_a_popup_click_on_it() throws InterruptedException {
		WebDriverCommons E = new WebDriverCommons();
		driver.navigate().refresh();
		E.ClearPopups(driver);
		
		}

	@When("select the From location")
	public void select_the_from_location() throws InterruptedException {
		SearchPage s = new SearchPage(driver);
		test.log(LogStatus.INFO, "Browser is Launched sucessfully");
		s.ClickFromLocation();
		s.SelectLocation("MAA");
		test.log(LogStatus.INFO, "From location is sucessfully clicked and the selected value is : "+"MAA");
		}

	@When("select the to location")
	public void select_the_to_location() throws InterruptedException {
		SearchPage s = new SearchPage(driver);
		
		s.ClickToLocation();
		s.SelectLocation("DEL");
		test.log(LogStatus.INFO, "To location is sucessfully clicked and the selected value is : "+"DEL");
		
	}

	@When("select the date")
	public void select_the_date() {
		SearchPage s = new SearchPage(driver);
		
		
		s.SelectADate("17");
		test.log(LogStatus.INFO, "Date selection is sucessfully clicked and the selected value is : "+"17");
		
	}

	@When("Click on SearchButton")
	public void click_on_search_button() {
		SearchPage s = new SearchPage(driver);
		
		s.ClickOnSearchButton();
		test.log(LogStatus.INFO, "Search button is clicked sucessfully");
		
	}

	@When("i see a OKGOTIT Popup click on it")
	public void i_see_a_okgotit_popup_click_on_it() throws InterruptedException {
		SearchResultPage sp = new SearchResultPage(driver);
		sp.waitForOkayGotIt();
		test.log(LogStatus.INFO, "POP up is clicked sucessfully");
	}

	@Then("i validate the search result with searched text")
	public void i_validate_the_search_result_with_searched_text() throws InterruptedException {
		SearchResultPage sp = new SearchResultPage(driver);
		SearchPage s = new SearchPage(driver);
		
		String screenShot = s.takescreenshot(driver);
		String actualResult = sp.WaitAndGetSearchText();
		test.log(LogStatus.INFO, "Actual and expected text is matched" +actualResult);
		s.ClickOnBackButton(driver);
		test.log(LogStatus.INFO, "Back button clicked sucessfuly");
		s.ClearPopups(driver);
		// test.log(LogStatus.INFO, "All Steps are executed sucessfully");
		test.log(LogStatus.PASS, test.addScreenCapture(screenShot));
		
	}


}
