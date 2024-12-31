Feature: Register_new_user

Scenario: Open the Register page
	Given I launch the application
	When I click the registeration link
	
	
Scenario Outline: Checking scenario outline
	Then I print "<username>" field password as "<password>"
	
	Examples:
		|username |password|
		|chandan  |123     |
		|aman     |456	   |