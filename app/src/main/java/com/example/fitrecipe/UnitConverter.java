package com.example.fitrecipe;

public class UnitConverter {
    private static UnitConverter instance;

    private UnitConverter() {}

    public static synchronized UnitConverter getInstance() {
        if (instance == null) {
            instance = new UnitConverter();
        }
        return instance;
    }

    public double convertUnits(double value, String fromUnit, String toUnit) {
        final double METER_TO_INCH = 39.3701;
        final double METER_TO_FEET = 3.28084;
        final double METER_TO_CENTIMETER = 100;
        final double METER_TO_MILLIMETER = 1000;
        final double METER_TO_KILOMETER = 0.001;
        final double METER_TO_MILE = 0.000621371;
        final double METER_TO_YARD = 1.09361;
        final double METER_TO_MEGAMETER = 1e-6;
        final double METER_TO_NAUTICAL_MILE = 0.000539957;
        final double METER_TO_LIGHT_YEAR = 1.057e-16;

        switch (fromUnit) {
            case "Meters":
                switch (toUnit) {
                    case "Inches":
                        return value * METER_TO_INCH;
                    case "Feet":
                        return value * METER_TO_FEET;
                    case "Centimeters":
                        return value * METER_TO_CENTIMETER;
                    case "Millimeters":
                        return value * METER_TO_MILLIMETER;
                    case "Kilometers":
                        return value * METER_TO_KILOMETER;
                    case "Miles":
                        return value * METER_TO_MILE;
                    case "Yards":
                        return value * METER_TO_YARD;
                    case "Megameters":
                        return value * METER_TO_MEGAMETER;
                    case "Nautical Miles":
                        return value * METER_TO_NAUTICAL_MILE;
                    case "Light Years":
                        return value * METER_TO_LIGHT_YEAR;
                    default:
                        break;
                }
                break;
            case "Miles":
                switch (toUnit) {
                    case "Meters":
                        return value / METER_TO_MILE;
                    case "Inches":
                        return value * 63360;
                    case "Feet":
                        return value * 5280;
                    case "Centimeters":
                        return value * 160934;
                    case "Millimeters":
                        return value * 1.609e+6;
                    case "Kilometers":
                        return value * 1.60934;
                    case "Yards":
                        return value * 1760;
                    case "Megameters":
                        return value / 1.609;
                    case "Nautical Miles":
                        return value / 1.151;
                    case "Light Years":
                        return value / 5.879e+12;
                    default:
                        break;
                }
                break;
            case "Feet":
                switch (toUnit) {
                    case "Meters":
                        return value / 3.28084;
                    case "Inches":
                        return value * 12;
                    case "Miles":
                        return value / 5280.0;
                    case "Centimeters":
                        return value * 30.48;
                    case "Millimeters":
                        return value * 304.8;
                    case "Kilometers":
                        return value / 3280.84;
                    case "Yards":
                        return value / 3.0;
                    default:
                        break;
                }
                break;
            case "Inches":
                switch (toUnit) {
                    case "Meters":
                        return value / METER_TO_INCH;
                    case "Feet":
                        return value / 12;
                    case "Centimeters":
                        return value * 2.54;
                    case "Millimeters":
                        return value * 25.4;
                    case "Kilometers":
                        return value * 2.54e-5;
                    case "Miles":
                        return value / 63360;
                    case "Yards":
                        return value / 36;
                    case "Megameters":
                        return value * 2.54e-8;
                    case "Nautical Miles":
                        return value / 72913.4;
                    case "Light Years":
                        return value * 2.54e-17;
                    default:
                        break;
                }
                break;
            case "Centimeters":
                switch (toUnit) {
                    case "Meters":
                        return value / METER_TO_CENTIMETER;
                    case "Inches":
                        return value / 2.54;
                    case "Feet":
                        return value / 30.48;
                    case "Millimeters":
                        return value * 10;
                    case "Kilometers":
                        return value / 100000;
                    case "Miles":
                        return value / 160934;
                    case "Yards":
                        return value / 91.44;
                    case "Megameters":
                        return value / 1e8;
                    case "Nautical Miles":
                        return value / 185200;
                    case "Light Years":
                        return value / 9.461e+18;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        return -1;
    }

}
