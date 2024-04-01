#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Make My trip search functionality

Background: Open the browser and enter the application url

@Sanity
  Scenario: 1.Search with Valid values
    Given Open the browser and enter the application url
    When i see a popup click on it
    And select the From location 
    And select the to location
    And select the date
    And Click on SearchButton
    When i see a OKGOTIT Popup click on it
    Then i validate the search result with searched text
		Then close the Browser
@SIT		
    Scenario: 2.Search with Valid values With hardedcoded values
    Given Open the browser and enter the application url
    When i see a popup click on it
    And select the From location as "DEL"
    And select the to location as "MAA"
    And select the date as "21"
    And Click on SearchButton
    When i see a OKGOTIT Popup click on it
    Then i validate the search result with searched text
    Then close the Browser
 @SIT
 @Regression   
    Scenario Outline: 3.Search with Valid values With parametrization
   	Given Open the browser and enter the application url
   	When i see a popup click on it
    And select the From location as <fromLoc>
    And select the to location as <toLoc>
    And select the date as <Date>
    And Click on SearchButton
    When i see a OKGOTIT Popup click on it
    Then i validate the search result with searched text
		Then close the Browser
    Examples: 
      | fromLoc  | toLoc | Date  |
      | DEL 		 |MAA 	 | 19 	 |
      | MAA 		 |BLR 	 | 25 	 |
      
    Scenario: 4.Close the browser
    Then close the Browser