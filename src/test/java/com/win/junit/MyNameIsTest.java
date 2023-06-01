package com.win.junit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyNameIsTest {
    @DisplayName("Test myNameIs() method")
    @Test
    void testMyNameIs() {
        assertEquals("Lee Vue", MyNameIs.myNameIs("Lee Vue"));
    }
}
