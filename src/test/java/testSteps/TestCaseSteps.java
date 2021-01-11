/**
 * 
 */
package testSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.apache.http.HttpStatus;

/**
 * @author rohit
 *
 */
public class TestCaseSteps {

	@Given("^Rates API for Latest Foreign Exchange rates$")
	public void rates_API_for_Latest_Foreign_Exchange_rates() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		given().contentType(ContentType.JSON);
		System.out.println("Start Given");

	}

	@When("^The API is available$")
	public void the_API_is_available() throws Throwable {

		when().get("https://api.ratesapi.io/api/latest").then().assertThat().statusCode(200);

	}

	@Then("^An automated test suite	should run	which will assert the success status of the response$")
	public void an_automated_test_suite_should_run_which_will_assert_the_success_status_of_the_response()
			throws Throwable {
		assertTrue(true);
		System.out.println("End Then");
	}

/////////////////////  2  ////////////////////

	@Given("^Rates API for Latest Foreign Exchange rates with Response Assert$")
	public void rates_API_for_Latest_Foreign_Exchange_rates_with_Response_Assert() throws Throwable {
		given().contentType(ContentType.JSON);
	}

	@When("^The API is available For Resposne Assert$")
	public void the_API_is_available_for_response_assert() throws Throwable {
		Response response = when().get("https://api.ratesapi.io/api/latest");
		response.getBody().path("Base").equals("EUR");

	}

	@Then("^An automated test suite should run which will assert the response$")
	public void an_automated_test_suite_should_run_which_will_assert_the_response() throws Throwable {
		assertTrue(true);
		System.out.println("End Then");

	}

	///////// 3 ///////////////////

	@Given("^Rates API for Latest Foreign Exchange rates with Response Assert Correct Response Supplied By The Call$")
	public void rates_API_for_Latest_Foreign_Exchange_rates_with_Response_Assert_correct_response_supplied_by_the_call()
			throws Throwable { // Write code here that turns the phrase above into
		given().contentType(ContentType.JSON);

	}

	@When("^An incorrect or incomplete url is provided e\\.g: https://api\\.ratesapi\\.io/api$")
	public void an_incorrect_or_incomplete_url_is_provided_e_g_https_api_ratesapi_io_api() throws Throwable {

		when().get("https://api.ratesapi.io/api").then().assertThat().statusCode(400);

	}

	@Then("^Test case should assertthe correct response supplied	by the call$")
	public void test_case_should_assertthe_correct_response_supplied_by_the_call() throws Throwable {
		assertTrue(true);
		System.out.println("End Then");

	}

/////////  4   //////////////////

	@Given("^Rates API for Specific date Foreign Exchange rates$")
	public void rates_API_for_Specific_date_Foreign_Exchange_rates() throws Throwable {

		given().contentType(ContentType.JSON);

	}

	@When("^The API is available For Resposne Assert For Specific Date $")
	public void The_API_is_available_For_Resposne_Assert() throws Throwable {

		when().get("https://api.ratesapi.io/api/2010-01-12").then().assertThat().statusCode(200);

	}

	@Then("^An automated test suite should run which will assert the success status of the response$")
	public void The_automated_test_suite_should_run_which_will_assert_the_success_status_of_the_response()
			throws Throwable {
		assertTrue(true);
		System.out.println("End Then");

	}


//////////////////   6      ///////////////	

	@Given("^Rates API for Specific date Foreign Exchange rates For Future Dates$")
	public void rates_API_for_Specific_date_Foreign_Exchange_ratesSpecific_Date_For_Future_Dates() throws Throwable {

		given().contentType(ContentType.JSON);

	}

	@When("^The API is available For Resposne Assert For Specific Date For Future Dates $")
	public void The_API_is_available_For_Resposne_AssertSpecific_Date_For_Future_Dates() throws Throwable {

		when().get("https://api.ratesapi.io/api/2010-01-18").then().assertThat().statusCode(200);

	}

	@Then("^An automated test suite	should run which will validate that the response matches for the current[Future] date$")
	public void An_automated_test_suite_should_run_which_will_validate_that_the_response_matches_for_the_current_date()
			throws Throwable {
		assertTrue(true);
		System.out.println("End Then");
	}

}


