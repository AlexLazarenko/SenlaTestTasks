package testTasks.alexLazarenko.task1.utils;

import java.math.BigInteger;

public class Utils {
    public boolean isEven(int number) {
        return (number % 2) == 0;
    }

    public boolean isPrime(int number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        return bigInteger.isProbablePrime((int) Math.log(number));
    }
}

