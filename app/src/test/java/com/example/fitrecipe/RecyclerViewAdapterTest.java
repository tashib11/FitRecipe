package com.example.fitrecipe;

import static org.junit.Assert.assertEquals;

import android.content.Context;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricTestRunner;

import java.util.ArrayList;
import java.util.List;

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
}