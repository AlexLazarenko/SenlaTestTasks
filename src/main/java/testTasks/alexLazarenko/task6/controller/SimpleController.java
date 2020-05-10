package testTasks.alexLazarenko.task6.controller;


import testTasks.alexLazarenko.task6.entity.Bag;
import testTasks.alexLazarenko.task6.entity.Item;
import testTasks.alexLazarenko.task6.scanner.SimpleScanner;
import testTasks.alexLazarenko.task6.service.ItemViewService;
import testTasks.alexLazarenko.task6.utils.Utils;

import java.util.List;

public class SimpleController {
    ItemViewService viewService;
    Bag bag;
    Utils utils;
    SimpleScanner scanner;

    public SimpleController(ItemViewService viewService, Bag bag, Utils utils, SimpleScanner scanner) {
        this.viewService = viewService;
        this.bag = bag;
        this.utils = utils;
        this.scanner = scanner;
    }

    public void run() {
        System.out.println("Please input bag capacity:");
        String input = scanner.scan();
        int value = Integer.parseInt(input);
        List<Item> list = bag.getItemList();
        System.out.println("List of items that sorted by quality:");
        utils.printArrayList(utils.sortArrayListByQuality(list));
        viewService.getItemByThisCapacity(utils.sortArrayListByQuality(list), value);
    }
}
