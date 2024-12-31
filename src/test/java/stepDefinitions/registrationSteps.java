package stepDefinitions;

import io.cucumber.java.en.*;

public class registrationSteps {

	@Given("I launch the application")
	public void launch()
	{
		System.out.println("application launched");
		
	}
	@When ("I click the registeration link")
	public void click()
	{
		System.out.println("registration link clicked");
	}
}
