package com.example.fitrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class AgeCalculate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_calculate);
        TextView titleTextView = findViewById(R.id.titleTextView);
        EditText dayEditText = findViewById(R.id.dayEditText);
        EditText monthEditText = findViewById(R.id.monthEditText);
        EditText yearEditText = findViewById(R.id.yearEditText);
        Button calculateButton = findViewById(R.id.calculateButton);
        TextView ageTextView = findViewById(R.id.ageTextView);

        // Get the instance of the singleton class
        AgeCalculatorSingleton ageCalculator = AgeCalculatorSingleton.getInstance();

        // Set a click listener for the Calculate button
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the entered day, month, and year from the EditTexts
                String dayStr = dayEditText.getText().toString();
                String monthStr = monthEditText.getText().toString();
                String yearStr = yearEditText.getText().toString();

                // Check if the inputs are not empty
                if (!dayStr.isEmpty() && !monthStr.isEmpty() && !yearStr.isEmpty()) {
                    try {
                        // Convert the strings to integers
                        int day = Integer.parseInt(dayStr);
                        int month = Integer.parseInt(monthStr);
                        int year = Integer.parseInt(yearStr);

                        // Validate the input ranges
                        if (ageCalculator.isValidDate(day, month, year)) {
                            // Calculate age
                            String[] age = ageCalculator.calculateAge(day, month, year);

                            // Display the calculated age in the TextView
                            ageTextView.setText("Your age is: " + age[0] + " years, " + age[1] + " months, and " + age[2] + " days");
                        } else {
                            // Display an error message for invalid date ranges
                            Toast.makeText(AgeCalculate.this, "Please enter a valid date", Toast.LENGTH_SHORT).show();
                        }
                    } catch (NumberFormatException e) {
                        // Handle the case where the input is not a valid number
                        Toast.makeText(AgeCalculate.this, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    // If any input is empty, show an error message
                    Toast.makeText(AgeCalculate.this, "Please enter valid day, month, and year", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}