package testTasks.alexLazarenko.task1.scanner;

import java.util.Scanner;

public class SimpleScanner {
    public String scan() {
        String text = "Please input integer for view nature of this number, input 'e' to exit";
        Scanner in = new Scanner(System.in);
        System.out.println(text);
        return in.nextLine();
    }
}
