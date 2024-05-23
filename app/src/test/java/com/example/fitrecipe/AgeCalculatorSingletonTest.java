package com.example.fitrecipe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AgeCalculatorSingletonTest {

    private AgeCalculatorSingleton ageCalculator;

    @Before
    public void setUp() {
        ageCalculator = AgeCalculatorSingleton.getInstance();
        ageCalculator.setCustomDate(2024, 5, 22); // Set custom date to 2024-05-22 for testing
    }

    @Test
    public void testDaysInMonth() {
        assertEquals(31, ageCalculator.daysInMonth(1, 2021));
        assertEquals(28, ageCalculator.daysInMonth(2, 2021));
        assertEquals(29, ageCalculator.daysInMonth(2, 2020));
        assertEquals(30, ageCalculator.daysInMonth(4, 2021));
        assertEquals(31, ageCalculator.daysInMonth(12, 2021));
        assertEquals(0, ageCalculator.daysInMonth(13, 2021));
    }

    @Test
    public void testCalculateAge() {
        String[] age1 = ageCalculator.calculateAge(22, 5, 2000);
        assertArrayEquals(new String[]{"24", "0", "0"}, age1);

        String[] age2 = ageCalculator.calculateAge(25, 12, 1990);
        assertArrayEquals(new String[]{"33", "4", "27"}, age2);

        String[] age3 = ageCalculator.calculateAge(1, 1, 2020);
        assertArrayEquals(new String[]{"4", "4", "21"}, age3);

        String[] age4 = ageCalculator.calculateAge(30, 12, 2000);
        assertArrayEquals(new String[]{"23", "4", "22"}, age4);
    }

    @Test
    public void testIsValidDate() {
        assertTrue(ageCalculator.isValidDate(1, 1, 2020));
        assertFalse(ageCalculator.isValidDate(0, 1, 2020));
        assertFalse(ageCalculator.isValidDate(32, 1, 2020));
        assertTrue(ageCalculator.isValidDate(29, 2, 2020));
        assertFalse(ageCalculator.isValidDate(30, 2, 2021));
        assertFalse(ageCalculator.isValidDate(31, 4, 2021));
        assertTrue(ageCalculator.isValidDate(31, 12, 2021));
    }
}
