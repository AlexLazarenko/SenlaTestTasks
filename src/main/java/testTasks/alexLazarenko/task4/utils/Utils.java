package testTasks.alexLazarenko.task4.utils;

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


    public List<String> removePunctuation(List<String> text) {
        for (int i = 0; i < text.size(); i++) {
            String word = text.get(i);
            word = word.replaceAll("\\W", "");
            text.set(i, word);
        }
        return text;
    }

    public int inputWordCount(List<String> list, String word) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(word)) {
                counter++;
            }
        }
        return counter;
    }
}


