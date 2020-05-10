package testTasks.alexLazarenko.task5.utils;

public class Utils {

    public void inputWordCount(int length) {
        for (int i = 0; i < length; i++) {
            int first = i % 10;
            int second = i / 10 % 10;
            if (first == second) {
                if (i == 0) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}

