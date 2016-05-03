package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.executors.HomePage;
import util.configurations.TestConfiguration;

import static com.codeborne.selenide.Selenide.open;

public class Task1Steps {
    private HomePage homePage;

    public Task1Steps(HomePage homePage){

        this.homePage = homePage;
    }

    @Given("^Browser is opened$")
    public void browser_is_opened() throws Throwable {
        new TestConfiguration();
        open("/");
    }

    @Given("^I am on Task \"([^\"]*)\" page$")
    public void i_am_on_Task_page(String taskNumber) throws Throwable {
        homePage.openTask(Integer.parseInt(taskNumber));

    }

    @When("^I add all products into the basket$")
    public void i_add_all_products_into_the_basket() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^All products will be in the basket$")
    public void all_products_will_be_in_the_basket() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Sum of quantity and price is correct$")
    public void sum_of_quantity_and_price_is_correct() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
