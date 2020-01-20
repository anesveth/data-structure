package com.elves.elvesprogram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void calculateFuel() {
        assertEquals(2,Main.Fuel(12));
        assertEquals(2,Main.Fuel(14));
        assertEquals(654,Main.Fuel(1969));
        assertEquals(33583,Main.Fuel(100756));
    }
}