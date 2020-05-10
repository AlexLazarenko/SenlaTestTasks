package testTasks.alexLazarenko.task3.controller;

import testTasks.alexLazarenko.task3.scanner.SimpleScanner;
import testTasks.alexLazarenko.task3.utils.Utils;

import java.util.List;

public class SimpleController {
    SimpleScanner scanner;
    Utils utils;

    public SimpleController(SimpleScanner scanner, Utils utils) {
        this.scanner = scanner;
        this.utils = utils;
    }

    public void run() {
        String input = scanner.scan();
        System.out.println("Sorted sentence that contains all words with capital letter:");
        List<String> list = utils.makeStringList(input);
        utils.printList(utils.sortByWordLength(utils.firstToUpperCase(list)));
        System.out.println("Number of words=" + utils.wordsCount(list));
    }
}



