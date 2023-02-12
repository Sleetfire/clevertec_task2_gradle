package ru.clevertec.utils;

public class StringUtils {

    private StringUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Checking: is given string positive number
     * @param str checked string
     * @return true if given string is positive number, false if negative number or not a number
     */
    public static boolean isPositiveNumber(String str) {
        return org.apache.commons.lang3.StringUtils.isNumeric(str) && Integer.parseInt(str) > 0;
    }
}
