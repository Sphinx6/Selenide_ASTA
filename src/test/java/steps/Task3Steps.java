package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.executors.Task3Page;


public class Task3Steps {
    private Task3Page task3page;

    public Task3Steps(Task3Page task3page){
        this.task3page = task3page;
    }

    @When("^I start edit mode$")
    public void iStartEditMode() throws Throwable {
        task3page.startEdit();
    }

    @And("^I change data in form$")
    public void iChangeDataInForm() throws Throwable {
        task3page.fillForm();
        task3page.uploadFile();
    }

    @And("^I click save button$")
    public void iClickSaveButton() throws Throwable {
        task3page.clickSave();
    }

    @Then("^Entered data are saved$")
    public void enteredDataAreSaved() throws Throwable {
        task3page.assertFormData();
    }

    @Then("^Success message is shown$")
    public void successMessageIsShown() throws Throwable {
        task3page.assertNotification();
    }
}
