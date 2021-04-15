package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.PlanATripPage;
import utils.DriverFactory;

import java.io.IOException;

public class PlanATripSteps extends DriverFactory {

    PlanATripPage planATripPage = new PlanATripPage();




    @Given("I am on the")
    public void i_am_on_the() throws IOException, InterruptedException {

        planATripPage.goToGoCityBoston();
    }

    @When("I am")
    public void i_am() {

    }

    @Then("yes")
    public void yes() {

    }
}
