package pages.executors;

import com.codeborne.selenide.Condition;
import pages.locators.HomePageLocators;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    public HomePageLocators locators;

    public HomePage(HomePageLocators locators){
        this.locators = locators;
    }

    public void openTask(int taskNumber){
        this.locators.Tasks.get(taskNumber-1).shouldBe(Condition.visible);
        this.locators.Tasks.get(taskNumber-1).click();
    }

    public void openPage(){
        open("/");
    }
}
