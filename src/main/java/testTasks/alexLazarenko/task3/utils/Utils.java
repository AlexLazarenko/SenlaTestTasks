package testTasks.alexLazarenko.task3.utils;

import java.util.Arrays;
import java.util.List;

public class Utils {

    public List<String> makeStringList(String inputData) {
        return Arrays.asList(inputData.split(" "));
    }

    public void printList(List<String> list) {
        for (String value : list) {
            System.out.println(value);
        }
    }

    public List<String> firstToUpperCase(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
            list.set(i, word);
        }
        return list;
    }

    public int wordsCount(List<String> list) {
        return list.size();
    }

    public List<String> sortByWordLength(List<String> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j).length() > list.get(j + 1).length()) {
                    String temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }
}


