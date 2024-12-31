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
	
	@Then("I print {string} field password as {string}")
	public void i_print_field_password_as(String string1, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user actual name is: "+ string1+" and pwd is: "+string2);
	    
	}



}
