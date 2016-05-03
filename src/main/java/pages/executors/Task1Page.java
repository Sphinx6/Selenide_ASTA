package pages.executors;

import com.codeborne.selenide.SelenideElement;
import pages.locators.Task1Locators;


public class Task1Page {

    public Task1Locators locators;

    public Task1Page(Task1Locators locators){
        this.locators = locators;
    }

    public String getItemTitle(SelenideElement item) {
        return item.find("h4").text();
    }

    public float getItemPrice(SelenideElement item){
        String price = item.find("p").text();
        return Float.parseFloat(price.split(" ")[1]);
    }

    public void setItemQuantity(SelenideElement item, int qunatity){
        item.find("input").setValue(Integer.toString(qunatity));
    }

    public void addItemToCart(SelenideElement item){
        item.find("button").click();
    }
}
