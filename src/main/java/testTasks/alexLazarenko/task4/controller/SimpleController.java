package testTasks.alexLazarenko.task4.controller;

import testTasks.alexLazarenko.task4.scanner.SimpleScanner;
import testTasks.alexLazarenko.task4.utils.Utils;

import java.util.List;

public class SimpleController {
    SimpleScanner scanner;
    Utils utils;

    public SimpleController(SimpleScanner scanner, Utils utils) {
        this.scanner = scanner;
        this.utils = utils;
    }

    public void run() {
        System.out.println("Please input text:");
        String input = scanner.scan();
        System.out.println("Please input word to count:");
        String word = scanner.scan();
        List<String> list = utils.removePunctuation(utils.makeStringList((input)));
        System.out.println("Text without punctuation:");
        utils.printList(list);
        System.out.println("Number of words:" + utils.inputWordCount(list, word));
    }
}



