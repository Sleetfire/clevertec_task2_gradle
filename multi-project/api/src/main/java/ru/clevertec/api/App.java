package ru.clevertec.api;

import ru.clevertec.core.Utils;

public class App {
    public static void main(String[] args) {
        if (args.length < 1) {
            getResultForEmptyArgs();
        } else {
            getResult(args);
        }
    }
    private static void getResultForEmptyArgs() {
        String message = String.format("Are 12 and 79 positive numbers? %s",
                Utils.isAllPositiveNumbers("12", "79"));
        System.out.println(message);
    }
    private static void getResult(String ... args) {
        String message = String.format("Are all given array's elements positive numbers? %s",
                Utils.isAllPositiveNumbers(args));
        System.out.println(message);
    }
}
