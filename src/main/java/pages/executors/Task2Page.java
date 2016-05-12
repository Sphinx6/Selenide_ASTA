package pages.executors;

import com.codeborne.selenide.SelenideElement;
import pages.locators.Task2Locators;

import static com.codeborne.selenide.Condition.visible;

public class Task2Page {

    public Task2Locators locators;

    public Task2Page(Task2Locators locators){
        this.locators = locators;
    }

    public void clickGroupBar(){
        locators.groupBar.click();
    }

    public void enterGroupName(String group){
        locators.groupInput.shouldBe(visible);
        locators.groupInput.setValue(group);
    }

    public void clickFirstGroup(){
        locators.firstResult.shouldBe(visible);
        locators.firstResult.click();
    }

    public void selectGroup(String groupName){
        clickGroupBar();
        enterGroupName(groupName);
        clickFirstGroup();
    }

    public void assertProductsGroups(String groupName){
        for(SelenideElement item : locators.itemsGroups){
            assert (item.getText().equals(groupName)) :
                    String.format("Incorrect group: %s|%s", groupName, item.getText());
        }
    }
}
