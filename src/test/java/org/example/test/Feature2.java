package org.example.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Feature2
{


    @When("the customer go to {string}")
    public void theCustomerGoTo(String string) {

    }
    @When("the customer click on {string}")
    public void theCustomerClickOn(String string) {

    }

    @Then("his own contact information should be successfully updated")
    public void hisOwnContactInformationShouldBeSuccessfullyUpdated() {

    }


    @When("the customer click on {string} profile")
    public void theCustomerClickOnProfile(String string) {
    }



    @Then("The attempt to update one's own contact information should fail")
    public void theAttemptToUpdateOneSOwnContactInformationShouldFail () {


            }

    @Given("the user is logged in")
    public void theUserIsLoggedIn() {

    }
    @When("the user navigates to the {string}")
    public void theUserNavigatesToThe(String string) {

    }

    @Then("the user should see a list of past orders")
    public void theUserShouldSeeAListOfPastOrders() {

    }
    @Then("the user should not see a list of past orders")
    public void theUserShouldNotSeeAListOfPastOrders() {

    }
    @Then("the user should not  see a list of installation requests")
    public void theUserShouldNotSeeAListOfInstallationRequests() {

    }


    @Given("the customer  has logged in to the system")
    public void theCustomerHasLoggedInToTheSystem() {

    }

    @Given("the user  has logged in to the system")
    public void theUserHasLoggedInToTheSystem() {

    }

    @Given("the user is in the system")
    public void theUserIsInTheSystem() {

    }


}
