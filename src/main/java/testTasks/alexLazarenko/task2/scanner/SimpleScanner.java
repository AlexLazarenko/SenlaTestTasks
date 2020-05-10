package testTasks.alexLazarenko.task2.scanner;

import java.util.Scanner;

public class SimpleScanner {
    public String scan() {
        String text = "Please input integer number, input 'e' to exit";
        Scanner in = new Scanner(System.in);
        System.out.println(text);
        return in.nextLine();
    }
}
