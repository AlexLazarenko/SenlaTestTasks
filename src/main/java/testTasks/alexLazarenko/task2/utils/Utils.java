package testTasks.alexLazarenko.task2.utils;

public class Utils {
    public int nod(int a, int b) {
        if (a == 0)
            return b;
        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    public double nok(int a, int b) {
        return a * b / nod(a, b);
    }
}

