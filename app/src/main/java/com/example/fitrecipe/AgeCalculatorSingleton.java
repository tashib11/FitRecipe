package com.example.fitrecipe;

import java.util.Calendar;

public class AgeCalculatorSingleton {
    private static AgeCalculatorSingleton single_instance = null;
    private Calendar customDate = null;


    private AgeCalculatorSingleton() {}

    public static synchronized AgeCalculatorSingleton getInstance() {
        if (single_instance == null) {
            single_instance = new AgeCalculatorSingleton();
        }
        return single_instance;
    }


    public void setCustomDate(int year, int month, int day) {
        customDate = Calendar.getInstance();
        customDate.set(year, month - 1, day); // Months are 0-based in Calendar
    }


    public void resetCustomDate() {
        customDate = null;
    }


    public int daysInMonth(int month, int year) {
        int[] daysInMonthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month >= 1 && month <= 12) {
            // Adjust for leap years
            if (month == 2 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
                return 29;
            } else {
                return daysInMonthArray[month - 1];
            }
        } else {
            return 0;
        }
    }


    public String[] calculateAge(int day, int month, int year) {
        Calendar calendar = (customDate != null) ? customDate : Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH) + 1; // Months are 0-based
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);


        int ageYears = currentYear - year;
        int ageMonths = currentMonth - month;
        int ageDays = currentDay - day;


        if (ageDays < 0) {
            ageMonths--;
            ageDays += daysInMonth((currentMonth == 1 ? 12 : currentMonth - 1), currentYear);
        }
        if (ageMonths < 0) {
            ageYears--;
            ageMonths += 12;
        }

        return new String[]{String.valueOf(ageYears), String.valueOf(ageMonths), String.valueOf(ageDays)};
    }


    public boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12 || day < 1 || year <= 0) {
            return false;
        }
        int daysInMonth = daysInMonth(month, year);
        return day <= daysInMonth;
    }
}
