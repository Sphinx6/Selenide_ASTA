package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.executors.Task4Page;


public class Task4Steps {

    private Task4Page task4page;

    public Task4Steps(Task4Page task4page){
        this.task4page = task4page;
    }

    @When("^I click apply$")
    public void iClickApply() throws Throwable {
        task4page.clickApply();
    }

    @And("^I fill form$")
    public void iFillForm() throws Throwable {
        task4page.fillForm();
    }

    @And("^I click send button$")
    public void iClickSendButton() throws Throwable {
        task4page.clickSendButton();
    }

    @Then("^Success info is shown$")
    public void successInfoIsShown() throws Throwable {
        task4page.assertMessage();
    }
}
