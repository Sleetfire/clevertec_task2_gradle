package ru.clevertec.core;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    @DisplayName("Checking positive numbers in String array")
    void isAllPositiveNumbers() {
        assertFalse(Utils.isAllPositiveNumbers("-42", "42"));
        assertFalse(Utils.isAllPositiveNumbers("zxc", "42"));
        assertTrue(Utils.isAllPositiveNumbers("42", "789"));
    }
}