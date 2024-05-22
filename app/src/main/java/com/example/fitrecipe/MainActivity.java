package com.example.fitrecipe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView myRecyclerView;
    RecyclerViewAdapter myAdapter;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.bmiButton);

        myRecyclerView = findViewById(R.id.recyclerView_id);
        myAdapter = new RecyclerViewAdapter(this, RecipeManager.getInstance().getRecipes());

        myRecyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        myRecyclerView.setAdapter(myAdapter);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        });


    }


}