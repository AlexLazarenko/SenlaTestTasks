package testTasks.alexLazarenko.task1.controller;

import testTasks.alexLazarenko.task1.scanner.SimpleScanner;
import testTasks.alexLazarenko.task1.utils.Utils;

public class SimpleController {
    SimpleScanner scanner;
    Utils utils;

    public SimpleController(SimpleScanner scanner, Utils utils) {
        this.scanner = scanner;
        this.utils = utils;
    }

    public void run() {
        String input = "";
        do {
            input = scanner.scan();
            if (input.equals("e")) {
                System.out.println("You are exit the program!");
            } else {
                try {
                    int value = Integer.parseInt(input);
                    if (utils.isEven(value)) {
                        System.out.println("This number is even!");
                    } else {
                        System.out.println("This number is odd!");
                    }
                    if (utils.isPrime(value)) {
                        System.out.println("This number is prime!");
                    } else {
                        System.out.println("This number is complex!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Wrong value!!!Input integer number please!");
                }
            }
        } while (!input.equals("e"));
    }
}
