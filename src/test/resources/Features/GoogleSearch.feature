Feature: Google Search
Scenario: search anything in google

	Given browser is open
	And user is on google search page
	When user enter the text
	Then hits enter
	Then user is navigate to search results
	
	
#Gherkin 
#selenium with BDD cucumber