package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.executors.Task2Page;

public class Task2Steps {
    private Task2Page task2page;

    public Task2Steps(Task2Page task2page){
        this.task2page = task2page;
    }

    @When("^I select \"([^\"]*)\" group$")
    public void iSelectGroup(String group) throws Throwable {
        task2page.selectGroup(group);
    }

    @Then("^Only products from \"([^\"]*)\" group will be visible$")
    public void onlyProductsFromGroupWillBeVisible(String group) throws Throwable {
        task2page.assertProductsGroups(group);
    }
}
