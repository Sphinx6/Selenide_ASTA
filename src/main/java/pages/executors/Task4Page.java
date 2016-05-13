package pages.executors;

import org.openqa.selenium.interactions.Actions;
import pages.locators.Task4Locators;
import util.helpers.RandomStringGenerator;

import static com.codeborne.selenide.Condition.*;

public class Task4Page {

    private String name;
    private String email;
    private String phone;


    public Task4Locators locators;

    public Task4Page(Task4Locators locators){
        this.locators = locators;
    }

    public void clickApply(){
        locators.apply.click();
    }




}
