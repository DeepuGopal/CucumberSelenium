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
@tag
Feature: Registration Feature


  @tag2
  Scenario Outline: Title of your scenario outline
    Given I land on the flights page
    When I click Register
    Then I verify the "<name>" link in page

    Examples: 
   |Test  | name  |
  |Test1    | Home |
   |Test2   | Flights |
   |Test3  |	Hotels|
    |Test4  | Car Rentals|
     |Test5 | Cruises|
    |Test6  | Destinations|
    |Test7  |	Vacations|
  |Test8    | SIGN-ON|
   |Test9   | REGISTER|
   |Test10   | SUPPORT|
  |Test11    | CONTACT|
    |Test12  |Summer|
    |Test13  |Winter|
   |Test14   |Spring|
    |Test15  |Boot|
    |Test16  |MVC|
    |Test17  |abcd|
