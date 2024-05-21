package com.example.fitrecipe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeActivity extends AppCompatActivity {

    private TextView mRecipeName;
    private TextView mRecipeIngredients;
    private TextView mRecipeMethodTitle;
    private TextView mRecipe;
    private ImageView mRecipeThumbnail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        mRecipeName = findViewById(R.id.text_recipe);
        mRecipeIngredients = findViewById(R.id.ingredients);
        mRecipeMethodTitle = findViewById(R.id.method);
        mRecipe = findViewById(R.id.recipe);


        Intent intent = getIntent();
        if (intent != null) {
            String title = intent.getStringExtra("RecipeName");
            String ingredients = intent.getStringExtra("RecipeIngredients");
            String methodTitle = intent.getStringExtra("RecipeMethodTitle");
            String recipe = intent.getStringExtra("Recipe");


            mRecipeName.setText(title);
            mRecipeIngredients.setText(ingredients);
            mRecipeMethodTitle.setText(methodTitle);
            mRecipe.setText(recipe);

        }
    }
}
