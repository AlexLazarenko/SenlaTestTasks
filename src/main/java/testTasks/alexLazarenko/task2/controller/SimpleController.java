package testTasks.alexLazarenko.task2.controller;

import testTasks.alexLazarenko.task2.scanner.SimpleScanner;
import testTasks.alexLazarenko.task2.utils.Utils;

public class SimpleController {
    SimpleScanner scanner;
    Utils utils;

    public SimpleController(SimpleScanner scanner, Utils utils) {
        this.scanner = scanner;
        this.utils = utils;
    }

    public void run() {
        String input1 = "";
        String input2 = "";
        do {
            input1 = scanner.scan();
            if (input1.equals("e")) {
                System.out.println("You are exit the program!");
                break;
            }
            input2 = scanner.scan();
            if (input2.equals("e")) {
                System.out.println("You are exit the program!");
                break;
            } else {
                try {
                    int value1 = Integer.parseInt(input1);
                    int value2 = Integer.parseInt(input2);
                    System.out.println("NOK=" + utils.nok(value1, value2));
                    System.out.println("NOD=" + utils.nod(value1, value2));
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Wrong value!!!Input integer number please!");
                }
            }
        } while (true);
    }
}
