package testTasks.alexLazarenko.task6.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bag {
    private List<Item> itemList = new ArrayList<>();

    public Bag(List<Item> itemList) {
        this.itemList = itemList;
    }

    public Bag() {
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bag bag = (Bag) o;
        return Objects.equals(itemList, bag.itemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemList);
    }

    @Override
    public String toString() {
        return "Bag{" +
                "itemList=" + itemList +
                '}';
    }
}
