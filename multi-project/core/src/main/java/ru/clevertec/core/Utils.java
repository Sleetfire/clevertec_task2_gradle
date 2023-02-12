package ru.clevertec.core;

import ru.clevertec.utils.StringUtils;

import java.util.Arrays;

public class Utils {

    private Utils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Checking: are array's members positive numbers
     * @param strings String array
     * @return true if all array's members are positive numbers, false if they are not positive numbers
     */
    public static boolean isAllPositiveNumbers(String ... strings) {
        return Arrays.stream(strings).allMatch(StringUtils::isPositiveNumber);
    }

}
