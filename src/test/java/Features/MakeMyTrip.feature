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

Feature: MakeMy Trip Search Fuctionality
  

  Scenario: Validate the search functionality with Valid Values
    Given Open the Browser and enter the URL
    When Any popup Occurs please close that popup
    And Select the From Location
    And Select the To Location
    And Select the Date
    And I Click On SearchButton
    When I see OkGoIT popup Click onit
    Then Validate the search text with the expected Text
