package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.executors.Task5Page;

import java.util.ArrayList;
import java.util.List;

public class Task5Steps {

    private Task5Page task5page;

    public Task5Steps (Task5Page task5page){
        this.task5page = task5page;
    }

    @And("^file with data is prepared$")
    public void fileWithDataIsPrepared() throws Throwable {
        task5page.generateRandomData();
        task5page.createFile();
    }

    @When("^I upload file$")
    public void iUploadFile() throws Throwable {
        task5page.uploadFile();
    }

    @Then("^Imported data are correct$")
    public void importedDataAreCorrect() throws Throwable {
        List<String> uploadedData = task5page.getUploadedData();
        task5page.assertData(uploadedData);
    }
}
