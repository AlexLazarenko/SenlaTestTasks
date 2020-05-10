package testTasks.alexLazarenko.task5;

import testTasks.alexLazarenko.task5.controller.SimpleController;
import testTasks.alexLazarenko.task5.scanner.SimpleScanner;
import testTasks.alexLazarenko.task5.utils.Utils;

public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        SimpleScanner scanner = new SimpleScanner();
        SimpleController controller = new SimpleController(scanner, utils);
        controller.run();
    }
}


