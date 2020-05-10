package testTasks.alexLazarenko.task5.controller;


import testTasks.alexLazarenko.task5.scanner.SimpleScanner;
import testTasks.alexLazarenko.task5.utils.Utils;

public class SimpleController {
    SimpleScanner scanner;
    Utils utils;

    public SimpleController(SimpleScanner scanner, Utils utils) {
        this.scanner = scanner;
        this.utils = utils;
    }

    public void run() {
        System.out.println("Please input length of the sequence(it must bee <100):");
        String input = scanner.scan();
        int value = Integer.parseInt(input);
        System.out.println("Numbers-palindromes:");
        utils.inputWordCount(value);
    }
}



