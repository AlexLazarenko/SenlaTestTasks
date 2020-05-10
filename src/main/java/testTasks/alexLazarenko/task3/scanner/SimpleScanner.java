package testTasks.alexLazarenko.task3.scanner;

import java.util.Scanner;

public class SimpleScanner {
    public String scan() {
        String text = "Please input sentence";
        Scanner in = new Scanner(System.in);
        System.out.println(text);
        return in.nextLine();
    }
}
