package com.Test.EO;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinitions {
	@Given("^open Admin_deatils Page$")
	public void open_Admin_deatils_Page()  {
	}
	
	   

	@When("^click on Admin_Info button$")
	public void click_on_Admin_Info_button() {
	  
	}

	@Then("^should redirect to Admin Info page$")
	public void should_redirect_to_Admin_Info_page() {
		Assert.assertEquals(20, 20);
		
	}
	@Given("^open user_deatils Page$")
	public void open_user_deatils_Page()  {
	    
	}
	    
	@When("^click on user_Info button$")
	public void click_on_user_Info_button()  {
	   
	}

	@Then("^should redirect to user Info page$")
	public void should_redirect_to_user_Info_page() {
		throw new SkipException("skipped");
	   
	}
	@Given("^open customer_deatils Page$")
	public void open_customer_deatils_Page()  {
	   
	}

	@When("^click on customer_Info button$")
	public void click_on_customer_Info_button()  {
	 
	}

	@Then("^should redirect to customer Info page$")
	public void should_redirect_to_customer_Info_page()  {
	 Assert.assertTrue(false);
	}
	
	@Given("^open student_deatils Page$")
	public void open_student_deatils_Page()  {
	   
	}
	@When("^click on student_Info button$")
	public void click_on_student_Info_button()  {
	   
	}

	@Then("^should redirect to student Info page$")
	public void should_redirect_to_student_Info_page()  {
	Assert.assertEquals("edgeops", "edgeops");
	}
	@Given("^open emp_deatils Page$")
	public void open_emp_deatils_Page()  {
	    
	}

	@When("^click on emp_Info button$")
	public void click_on_emp_Info_button()  {
	    
	}

	@Then("^should redirect to emp Info page$")
	public void should_redirect_to_emp_Info_page()  {
		Assert.assertEquals("tonny", "toni");
	  
	}
	@Given("^open company_deatils Page$")
	public void open_company_deatils_Page() {
	   
	}

	@When("^click on company_Info button$")
	public void click_on_company_Info_button()  {
	    
	}

	@Then("^should redirect to company Info page$")
	public void should_redirect_to_company_Info_page()  {
	   Assert.assertTrue(true);
	}
	@Given("^open Client_deatils Page$")
	public void open_Client_deatils_Page() {
	   
	}

	@When("^click on client_Info button$")
	public void click_on_client_Info_button()  {
	   
	}
	
	@Then("^should redirect to client Info page$")
	public void should_redirect_to_client_Info_page()  {
	   throw new SkipException("skipped");
	}
	@Given("^open Finance_deatils Page$")
	public void open_Finance_deatils_Page()  {
	   
	}

	@When("^click on Finance_Info button$")
	public void click_on_Finance_Info_button() {
	
	}
	   

	@Then("^should redirect to Finance Info page$")
	public void should_redirect_to_Finance_Info_page()  {
		 Assert.assertTrue(true);
	}

	@Given("^open login Page$")
	public void open_login_Page()  {
	   
	}

	@Given("^enter login credentials$")
	public void enter_login_credentials()  {
	   
	}

	@When("^click on login$")
	public void click_on_login()  {
	
	}

	@Then("^should redirect Home page$")
	public void should_redirect_Home_page()  {
		 Assert.assertTrue(true);
	}

	@Given("^open Product_deatils Page$")
	public void open_Product_deatils_Page()  {
	   
	}

	@When("^click on Product_Info button$")
	public void click_on_Product_Info_button()  {
	   
	}

	@Then("^should redirect to Product Info page$")
	public void should_redirect_to_Product_Info_page() {
		 Assert.assertTrue(true);
	}


}
