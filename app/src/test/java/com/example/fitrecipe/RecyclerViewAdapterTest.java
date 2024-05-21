package com.example.fitrecipe;

import static org.junit.Assert.*;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@RunWith(RobolectricTestRunner.class)
public class RecyclerViewAdapterTest {


    @Mock
    Context mockContext;

    private RecyclerViewAdapter adapter;
    private List<Recipes> recipeList;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        // Initialize a sample recipe list
        recipeList = new ArrayList<>();
        recipeList.add(new Recipes("Pasta", "Pasta, Tomato Sauce, Garlic", "Cooking Instructions", "Boil pasta. Heat sauce. " +
                "Mix together.", R.drawable.chicken_roll));

        // Initialize the adapter with mock context and sample data
        adapter = new RecyclerViewAdapter(mockContext, recipeList);
    }

    @Test
    public void getItemCount_shouldReturnCorrectItemCount() {
        // Verify the item count
        assertEquals(1, adapter.getItemCount());
    }


    @Test
    public void onCreateViewHolder_shouldInflateViewHolder() {
        // Create a ViewGroup (RecyclerView) to pass as the parent
        ViewGroup parent = new RecyclerView(RuntimeEnvironment.getApplication());

        // Call onCreateViewHolder to get the ViewHolder
        RecyclerViewAdapter.MyHolder holder = adapter.onCreateViewHolder(parent, 0);

        // Assuming MyHolder is a subclass of RecyclerView.ViewHolder
        // and has a field named rootView that represents the root view of the item layout
        // Replace "rootView" with the actual name of the field in your ViewHolder class
        View rootView = holder.itemView.getRootView();

        // Verify the root view is not null and check its visibility
        assertNotNull(rootView);
        assertEquals(View.VISIBLE, rootView.getVisibility());

        // Optionally, if you want to assert on the type of the root view,
        // you can add an assertion here based on the expected layout resource ID
        // For example:
        // assertEquals(R.layout.your_item_layout, rootView.getId());
    }



}