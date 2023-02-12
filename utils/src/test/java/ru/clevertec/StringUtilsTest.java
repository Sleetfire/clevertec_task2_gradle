package ru.clevertec;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.clevertec.utils.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    @DisplayName("Positive numbers checker")
    void isPositiveNumber() {
        assertFalse(StringUtils.isPositiveNumber("0"));
        assertFalse(StringUtils.isPositiveNumber("-42"));
        assertTrue(StringUtils.isPositiveNumber("10"));
        assertFalse(StringUtils.isPositiveNumber("zxc"));
    }

}