package testTasks.alexLazarenko.task6.service;



import testTasks.alexLazarenko.task6.entity.Item;
import testTasks.alexLazarenko.task6.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class ItemViewService {
    Utils utils = new Utils();

    public void getItemByThisCapacity(List<Item> items, int capacity) {
        List<Item> itemsByCapacity = new ArrayList<>();
        System.out.println("Items by this capacity:");
        int sum = 0;
        for (int i = 0; i < items.size(); i++) {
            if ((sum + items.get(i).getWeight()) < capacity) {
                sum = sum + items.get(i).getWeight();
                itemsByCapacity.add(items.get(i));
            }
        }
        utils.printArrayList(itemsByCapacity);
        System.out.println("Total capacity=" + sum);
    }
}
