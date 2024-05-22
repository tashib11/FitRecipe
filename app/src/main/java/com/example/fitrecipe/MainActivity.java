package com.example.fitrecipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView myRecyclerView;
    RecyclerViewAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecyclerView = findViewById(R.id.recyclerView_id);
        myAdapter = new RecyclerViewAdapter(this, RecipeManager.getInstance().getRecipes());

        myRecyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        myRecyclerView.setAdapter(myAdapter);
    }
}