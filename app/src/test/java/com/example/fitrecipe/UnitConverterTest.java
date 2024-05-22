package com.example.fitrecipe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UnitConverterTest {

    private UnitConverter unitConverter;

    @Before
    public void setUp() {
        unitConverter = UnitConverter.getInstance();
    }

    @Test
    public void testConvertMetersToInches() {
        double result = unitConverter.convertUnits(1, "Meters", "Inches");
        assertEquals(39.3701, result, 0.0001);
    }

    @Test
    public void testConvertMilesToKilometers() {
        double result = unitConverter.convertUnits(1, "Miles", "Kilometers");
        assertEquals(1.60934, result, 0.0001);
    }

    @Test
    public void testConvertFeetToMeters() {
        double result = unitConverter.convertUnits(1, "Feet", "Meters");
        assertEquals(0.3048, result, 0.0001);
    }

    @Test
    public void testConvertInchesToCentimeters() {
        double result = unitConverter.convertUnits(1, "Inches", "Centimeters");
        assertEquals(2.54, result, 0.0001);
    }

    @Test
    public void testConvertCentimetersToFeet() {
        double result = unitConverter.convertUnits(30.48, "Centimeters", "Feet");
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void testConvertMetersToLightYears() {
        double result = unitConverter.convertUnits(1, "Meters", "Light Years");
        assertEquals(1.057e-16, result, 1e-20);
    }

    @Test
    public void testConvertFeetToYards() {
        double result = unitConverter.convertUnits(3, "Feet", "Yards");
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void testConvertInchesToMegameters() {
        double result = unitConverter.convertUnits(1, "Inches", "Megameters");
        assertEquals(2.54e-8, result, 1e-12);
    }

    @Test
    public void testInvalidConversion() {
        double result = unitConverter.convertUnits(1, "Meters", "InvalidUnit");
        assertEquals(-1, result, 0);
    }

    @Test
    public void testInvalidFromUnit() {
        double result = unitConverter.convertUnits(1, "InvalidUnit", "Meters");
        assertEquals(-1, result, 0);
    }
}
