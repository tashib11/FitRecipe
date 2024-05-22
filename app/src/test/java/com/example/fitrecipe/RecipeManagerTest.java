package com.example.fitrecipe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RecipeManagerTest {

    private RecipeManager recipeManager;

    @Before
    public void setUp() {
        recipeManager = RecipeManager.getInstance();
    }

    @Test
    public void testGetInstance() {
        assertNotNull(recipeManager);
    }

    @Test
    public void testGetRecipes() {
        List<Recipes> recipes = recipeManager.getRecipes();
        assertNotNull(recipes);
        assertFalse(recipes.isEmpty());
    }

    @Test
    public void testAddRecipe() {
        int initialSize = recipeManager.getRecipes().size();

        Recipes newRecipe = new Recipes(
                "Test Recipe",
                "Test Ingredients",
                "Test Method",
                "Test Steps",
                R.drawable.pasta1
        );

        recipeManager.addRecipe(newRecipe);
        List<Recipes> recipes = recipeManager.getRecipes();

        assertEquals(initialSize + 1, recipes.size());
        assertEquals(newRecipe, recipes.get(recipes.size() - 1));
    }
}
