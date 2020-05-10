package testTasks.alexLazarenko.task6;


import testTasks.alexLazarenko.task6.controller.SimpleController;
import testTasks.alexLazarenko.task6.entity.Bag;
import testTasks.alexLazarenko.task6.entity.Item;
import testTasks.alexLazarenko.task6.scanner.SimpleScanner;
import testTasks.alexLazarenko.task6.service.ItemViewService;
import testTasks.alexLazarenko.task6.utils.Utils;


public class Main {
    public static void main(String[] args) {
        Bag bag = new Bag();
        ItemViewService viewService = new ItemViewService();
        Utils utils = new Utils();
        SimpleScanner scanner = new SimpleScanner();
        SimpleController controller = new SimpleController(viewService, bag, utils, scanner);
        bag.addItem(new Item("Gold", 1300, 110));
        bag.addItem(new Item("Gold", 700, 80));
        bag.addItem(new Item("Gold", 1300, 200));
        bag.addItem(new Item("Gold", 800, 120));
        bag.addItem(new Item("Gold", 1000, 101));
        bag.addItem(new Item("Gold", 950, 95));
        bag.addItem(new Item("Gold", 2000, 150));
        bag.addItem(new Item("Gold", 1500, 110));

        controller.run();
    }
}
