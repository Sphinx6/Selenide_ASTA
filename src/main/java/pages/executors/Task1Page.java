package pages.executors;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.locators.Task1Locators;
import objects.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1Page {

    public Task1Locators locators;
    public List<Item> addedItems = new ArrayList<>();

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

    public void addItemToCart(SelenideElement item) throws InterruptedException {
        item.find("button").scrollTo();
        item.find("button").click();
    }

    public void addItemsToCart() throws InterruptedException {
        locators.items.shouldHave(CollectionCondition.sizeGreaterThan(0));
        Random r = new Random();
        for(SelenideElement item : locators.items){
            int quantity = r.nextInt(5) + 5;
            addedItems.add(new Item(getItemTitle(item), getItemPrice(item), quantity));
            setItemQuantity(item, quantity);
            addItemToCart(item);
        }
    }

    public String getItemInCartName(SelenideElement item){
        return item.find("div.col-md-9").text().split(" ")[0];
    }

    public int getItemInCartQuantity(SelenideElement item){
        return Integer.parseInt(item.find("span", 0).text());
    }

    public int getQuantitySummary(){
        return Integer.parseInt(locators.quantitySummary.getText());
    }

    public float getPriceSummary(){
        String price = locators.priceSummary.getText().split(" ")[0];
        return Float.parseFloat(price);
    }

    public void assertCartContent(){
        for(int i = 0; i < addedItems.size();++i){
            String expectedName = addedItems.get(i).getName();
            String name = getItemInCartName(locators.itemsInCart.get(i));
            int expectedQuantity = addedItems.get(i).getAddedQuantity();
            int quantity = getItemInCartQuantity(locators.itemsInCart.get(i));

            assert (expectedName.equals(name)) :
                    String.format("Incorrect name of item %d: %s|%s", i, expectedName, name);

            assert (expectedQuantity == quantity) :
                    String.format("Incorrect quantity of item %d: %d|%d", i, expectedQuantity, quantity);
        }
    }

    public void assertCartSummary(){
        int expectedTotalQuantity = 0;
        float expectedTotalPrice = 0;

        for(Item item : addedItems) {
            expectedTotalQuantity += item.getAddedQuantity();
            expectedTotalPrice += item.getAddedQuantity() * item.getPrice();
        }

        assert expectedTotalPrice == getPriceSummary() :
                String.format("Incorrect total price: %f|%f", expectedTotalPrice, getPriceSummary());

        assert expectedTotalQuantity == getQuantitySummary() :
                String.format("Incorrect total quantity: %d|%d", expectedTotalQuantity, getQuantitySummary());
    }
}
