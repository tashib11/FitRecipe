package com.example.fitrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class HeightConverter extends AppCompatActivity {

    private EditText editTextValue;
    private Spinner spinnerFromUnit;
    private Spinner spinnerToUnit;
    private Button buttonConvert;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height_converter);
        editTextValue = findViewById(R.id.editTextValue);
        spinnerFromUnit = findViewById(R.id.spinnerFromUnit);
        spinnerToUnit = findViewById(R.id.spinnerToUnit);
        buttonConvert = findViewById(R.id.buttonConvert);
        textViewResult = findViewById(R.id.textViewResult);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.unit_array,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerFromUnit.setAdapter(adapter);
        spinnerToUnit.setAdapter(adapter);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performConversion();
            }
        });
    }

    private void performConversion() {
        String inputValueStr = editTextValue.getText().toString().trim();
        if (inputValueStr.isEmpty()) {
            textViewResult.setText("Please enter a value.");
            return;
        }

        try {
            double inputValue = Double.parseDouble(inputValueStr);
            String fromUnit = spinnerFromUnit.getSelectedItem().toString();
            String toUnit = spinnerToUnit.getSelectedItem().toString();

            double result = UnitConverter.getInstance().convertUnits(inputValue, fromUnit, toUnit);

            if (result != -1) {
                String resultText = String.format("%s %s is %.2f %s.", inputValue, fromUnit, result, toUnit);
                textViewResult.setText(resultText);
            } else {
                textViewResult.setText("Conversion failed. Check the units.");
            }
        } catch (NumberFormatException e) {
            textViewResult.setText("Invalid input value.");
        }
    }
}