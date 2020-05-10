package testTasks.alexLazarenko.task6.entity;

import java.util.Objects;

public class Item {
    private String itemName;
    private int prise;
    private int weight;

    public Item(String itemName, int prise, int weight) {
        this.prise = prise;
        this.itemName = itemName;
        this.weight = weight;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String treasureName) {
        this.itemName = treasureName;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return prise == item.prise &&
                weight == item.weight &&
                itemName.equals(item.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, prise, weight);
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", prise=" + prise +
                ", weight=" + weight +
                '}';
    }
}
