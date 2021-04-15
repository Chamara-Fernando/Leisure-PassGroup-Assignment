package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.PlanATripPage;
import utils.DriverFactory;

import java.io.IOException;

public class PlanATripSteps extends DriverFactory {

    PlanATripPage planATripPage = new PlanATripPage();


    @Given("I am on the gocity website")
    public void i_am_on_the_gocity_website() {

        System.out.println("On the gocity website");
    }

    @When("I click on plan your trip link")
    public void i_click_on_plan_your_trip_link() throws IOException, InterruptedException {
        planATripPage.goToGoCityBoston();
    }

    @And("I enter the first name, last name, email, travel date")
    public void i_enter_the_first_name_last_name_email_travel_date() throws InterruptedException {
        planATripPage.enterPersonalDetails();

    }

    @And("I click on the privacy policy check box to agree to terms")
    public void i_click_on_the_privacy_policy_check_box_to_agree_to_terms() throws InterruptedException {

        planATripPage.clickingOnPrivacyPolicy();
    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() throws InterruptedException {
        planATripPage.clickOnSubmitButton();
    }

    @Then("My request should be submitted")
    public void my_request_should_be_submitted() {
        System.out.println("Request submitted");
    }
}