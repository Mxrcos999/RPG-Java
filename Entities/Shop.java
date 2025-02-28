package Entities;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private List<Item> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void Purchase(Character person){
        System.out.println(person.getName() + " encontrou mercado!");

        var listItems = new ArrayList<Item>();
        listItems.add(new Item("Poção cura", "Magico", 100));
        listItems.add(new Item("Poção veneno", "Magico", 100));
        listItems.add(new Item("Espada", "Arma", 80));

        System.out.println("Itens disponiveis para comprar: ");

        for (int i = 0; i < listItems.size(); i++) {
            System.out.println((i + 1) + " - " + listItems.get(i).getName());
        }
        System.out.println("\n");

        System.out.println("Item adicionado ao inventario: " + listItems.get(2).getName());
        var item = listItems.get(2);
        person.addItens(item);
    }
}
