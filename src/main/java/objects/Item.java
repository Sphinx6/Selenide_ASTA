package objects;

import java.math.BigDecimal;

public class Item {

    private String name;
    private BigDecimal price;
    private int addedQuantity;

    public Item(String name, BigDecimal price, int addedQuantity){
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getAddedQuantity() {
        return addedQuantity;
    }

    public void setAddedQuantity(int addedQuantity) {
        this.addedQuantity = addedQuantity;
    }
}
