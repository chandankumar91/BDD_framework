Feature: Register_new_user

Scenario: Open the Register page
	Given I launch the application
	When I click the registeration link
	Then I enter "chandan" in name_input field
