package testTasks.alexLazarenko.task6.utils;


import testTasks.alexLazarenko.task6.entity.Item;

import java.util.List;

public class Utils {
    public void printArrayList(List<Item> items) {
        for (Item item : items) {
            System.out.println("Item name=" + item.getItemName()
                    + ", Item price=" + item.getPrise()
                    + ", Item weight=" + item.getWeight());
        }
    }

    public double calculateQuality(int prise, int weight) {
        return prise / weight;
    }

    public List<Item> sortArrayListByQuality(List<Item> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (calculateQuality(list.get(j).getPrise(), list.get(j).getWeight())
                        < calculateQuality(list.get(j + 1).getPrise(), list.get(j + 1).getWeight())) {
                    Item temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }
}

