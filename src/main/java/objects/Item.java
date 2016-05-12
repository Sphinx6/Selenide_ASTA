package objects;

public class Item {

    private String name;
    private float price;
    private int addedQuantity;

    public Item(String name, float price, int addedQuantity){
        this.name = name;
        this.price = price;
        this.addedQuantity = addedQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAddedQuantity() {
        return addedQuantity;
    }

    public void setAddedQuantity(int addedQuantity) {
        this.addedQuantity = addedQuantity;
    }
}
