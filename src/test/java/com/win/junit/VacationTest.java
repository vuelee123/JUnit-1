package com.win.junit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationTest {
    @DisplayName("Test vacation () method")
    @Test

    void testVacation() {
        assertEquals("I'd like to visit South Korea and Japan", Vacation.vacation("I'd like to visit"));
    }

}
