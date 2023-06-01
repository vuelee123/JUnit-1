package com.win.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideMethodTest {
    @Test
    void testDivideMethod() {
        assertEquals("11.0 / 30.0 = 0.36666666666666664", DivideMethod.divide(11, 30));
    }
}
