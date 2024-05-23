package com.example.fitrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class HealthActivity extends AppCompatActivity {

    TextView mbmiDisplay, sug;
    Button recipeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        // Initialize views
        mbmiDisplay = findViewById(R.id.bmi_display);
        sug = findViewById(R.id.suggested_food_text);
        recipeButton = findViewById(R.id.recipeButton);

        // Get the intbmi value from the intent
        float intbmi = getIntent().getFloatExtra("intbmi", 0);

        // Display the intbmi value
        mbmiDisplay.setText(String.valueOf(intbmi));

        // Set suggested food items based on BMI value
        setSuggestedFood(intbmi);

        // Set onClickListener for recipeButton
        recipeButton.setOnClickListener(v -> {
            Intent intent = new Intent(HealthActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }

    private void setSuggestedFood(float intbmi) {
        if (intbmi < 16) {
            sug.setText("High-calorie foods like Berry Chia pudding, Yougrut Parfait with blueberries, beef with rice, and donuts");
        } else if (intbmi < 16.9 && intbmi > 16) {
            sug.setText("High-protein foods like Colorful Veggie Salad, chicken roll, and Mixed grill");
        } else if (intbmi < 18.4 && intbmi > 17) {
            sug.setText("Fruits, vegetables, and whole grains for balanced nutrition. Consider Fresh garden salad, pasta, and dosa");
        } else if (intbmi < 24.9 && intbmi > 18.5) {
            sug.setText("Continue with a balanced diet including fruits, vegetables, and lean proteins. You may enjoy chicken burger, pancake, and BBQ chicken pizza.");
        } else if (intbmi < 29.9 && intbmi > 25) {
            sug.setText("Reduce high-calorie and processed foods, focus on fruits, vegetables, and lean proteins. Opt for Colorful Veggie Salad, Fresh garden salad, and Yougrut Partfait with blue berries");
        } else if (intbmi < 34.9 && intbmi > 30) {
            sug.setText("Focus on portion control and incorporating more fruits, vegetables, and whole grains. Consider Colorful Veggie Salad, chicken roll, and pasta.");
        } else {
            sug.setText("Consult a healthcare professional for personalized dietary advice. In the meantime, focus on a balanced diet with options like Berry Chia pudding, Colorful Veggie Salad, and Rasberry Vanilla.");
        }
    }
}
