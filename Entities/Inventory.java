package Entities;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;
    public Inventory(){
        this.items = new ArrayList<Item>();
    }
    
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Item> addItem(Item item) {
        items.add(item);

        return items;
    }
}
