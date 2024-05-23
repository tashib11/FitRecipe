package com.example.fitrecipe;

import java.util.ArrayList;
import java.util.List;

public class RecipeManager {


    private static RecipeManager instance;
    private List<Recipes> recipesList;

    // Private constructor to prevent instantiation
    private RecipeManager() {
        recipesList = new ArrayList<>();

        recipesList.add(new Recipes(
                "Berry Chia Pudding",
                "Ingredients:\n" +
                        "1/4 cup chia seeds\n" +
                        "1 cup almond milk\n" +
                        "1 tbsp maple syrup\n" +
                        "1/2 tsp vanilla extract\n" +
                        "1/2 cup mixed berries\n" +
                        "1 tbsp berry sauce\n" +
                        "Mint leaves for garnish (optional)",
                "Method:\n" ,
                        "1. In a bowl, combine chia seeds, almond milk, maple syrup, and vanilla extract. Stir well to combine.\n" +
                        "2. Let the mixture sit for about 10 minutes, then stir again to prevent clumping.\n" +
                        "3. Cover the bowl and refrigerate for at least 2 hours or overnight.\n" +
                        "4. Once the chia pudding is set, divide it into serving bowls or glasses.\n" +
                        "5. Top each serving with mixed berries and a drizzle of berry sauce.\n" +
                        "6. Garnish with mint leaves if desired.\n" +
                        "7. Serve immediately and enjoy!",
                R.drawable.salad2
        ));


        recipesList.add(new Recipes(
                "Colorful Veggie Salad Bowl",
                "1 cup mixed lettuce\n" +
                        "1/2 cup cherry tomatoes\n" +
                        "1/2 yellow bell pepper, sliced\n" +
                        "1/4 cup shredded red cabbage\n" +
                        "1/2 cup chickpeas\n" +
                        "1/2 cup roasted sweet potatoes\n" +
                        "1/2 avocado, sliced\n" +
                        "1/4 cup radish slices\n" +
                        "1/4 cup microgreens\n" +
                        "2 tbsp ranch dressing",
                "Method",
                "1. Arrange the mixed lettuce at the bottom of a large bowl.\n" +
                        "2. Add cherry tomatoes, yellow bell pepper slices, shredded red cabbage, chickpeas, and roasted sweet potatoes in sections around the bowl.\n" +
                        "3. Place the avocado slices and radish slices on top of the lettuce.\n" +
                        "4. Sprinkle microgreens over the top.\n" +
                        "5. Drizzle ranch dressing over the salad.\n" +
                        "6. Serve immediately and enjoy!",
                R.drawable.veggi
        ));

        recipesList.add(new Recipes(
                "Yogurt Parfait with Blueberries and Granola",
                "1 cup plain Greek yogurt\n" +
                        "1/2 cup granola\n" +
                        "1/2 cup fresh blueberries\n" +
                        "1 tbsp honey (optional)\n" +
                        "1 tsp chia seeds (optional)",
                "Method",
                "1. In a glass or bowl, add a layer of Greek yogurt.\n" +
                        "2. Add a layer of granola on top of the yogurt.\n" +
                        "3. Add a layer of fresh blueberries.\n" +
                        "4. Repeat the layers until all ingredients are used, finishing with blueberries and granola on top.\n" +
                        "5. Drizzle honey on top if desired.\n" +
                        "6. Sprinkle chia seeds on top for extra nutrition if desired.\n" +
                        "7. Serve immediately and enjoy!",
                R.drawable.granola
        ));

        recipesList.add(new Recipes(
                "Beef with Rice and Asparagus",
                "200g beef steak\n" +
                        "1 cup brown rice\n" +
                        "5 asparagus spears\n" +
                        "Salt to taste\n" +
                        "Pepper to taste\n" +
                        "1 tsp olive oil",
                "Method",
                "1. Cook the brown rice according to package instructions.\n" +
                        "2. Season the beef steak with salt and pepper.\n" +
                        "3. Heat olive oil in a pan and cook the steak to your liking.\n" +
                        "4. Steam or grill the asparagus until tender.\n" +
                        "5. Serve the beef with rice and asparagus.",
                R.drawable.asparagus
        ));


        recipesList.add(new Recipes("Pasta","1 tsp oil" +
                "1 tsp butter" +
                "2 clove garlic, finely chopped" +
                "1 inch ginger, finely chopped" +
                "½ onion, finely chopped" +
                "1 cup tomato pulp" +
                "¼ tsp turmeric / haldi" +
                "½ tsp kashmiri red chilli powder" +
                "2 tbsp tomato sauce" +
                "½ tsp garam masala","Method",
                "firstly, saute 1 inch ginger and 2 clove garlic in 1 tsp oil and 1 tsp butter." +
                        "further saute ½ onion till they turn soft." +
                        "additionally add 1 cup tomato pulp and saute well." +
                        "keep stirring till the tomato pulp thickens." +
                        "now add ¼ tsp turmeric, ½ tsp chilli powder, ½ tsp garam masala and ½ tsp salt." +
                        "saute till the spices gets cooked completely." +
                        "now add 2 tbsp corn, ¼ capsicum, ¼ carrot, 2 tbsp peas and 7 florets broccoli. saute for a minute." +
                        "add in 3 tbsp water and mix well." +
                        "cover and simmer for 5 minutes." +
                        "now add in 2 tbsp tomato sauce and ½ tsp mixed herbs. mix well." +
                        "add in cooked pasta and mix gently till the sauce gets coated well." +
                        "finally, serve masala pasta indian style hot topped with cheese if required.",R.drawable.pasta1));
        recipesList.add(new Recipes("Fresh Garden Salad",
                "For the Salad:\n" +
                        "1 head of lettuce, torn into bite-sized pieces\n" +
                        "1 cup shredded carrots\n" +
                        "1/2 red onion, thinly sliced\n" +
                        "1/2 cup black olives, sliced\n" +
                        "1/2 cup green olives, sliced\n" +
                        "1/2 cup cherry tomatoes, halved\n" +
                        "1/2 cup cucumber, diced\n" +
                        "1/2 cup feta cheese, cubed\n" +
                        "1/4 cup walnuts\n\n" +

                        "For the Dressing:\n" +
                        "1/4 cup olive oil\n" +
                        "2 tablespoons balsamic vinegar\n" +
                        "1 tablespoon honey\n" +
                        "1 teaspoon Dijon mustard\n" +
                        "Salt and pepper to taste",
                "Method",
                "1. Prepare the Salad:\n" +
                        "In a large bowl, combine the lettuce, shredded carrots, red onion slices, black and green olives, cherry tomatoes, and diced cucumber. Toss gently to mix the ingredients evenly.\n\n" +

                        "2. Add the Toppings:\n" +
                        "Sprinkle the cubed feta cheese and walnuts over the top of the salad.\n\n" +

                        "3. Prepare the Dressing:\n" +
                        "In a small bowl, whisk together the olive oil, balsamic vinegar, honey, Dijon mustard, salt, and pepper until well combined.\n\n" +

                        "4. Dress the Salad:\n" +
                        "Drizzle the dressing over the salad just before serving. Toss the salad gently to ensure all ingredients are coated with the dressing.\n\n" +

                        "5. Serve:\n" +
                        "Serve the salad immediately, accompanied by a refreshing glass of orange juice if desired. Enjoy your fresh garden salad!",
                R.drawable.salad));  // Make sure to replace with the correct drawable resource name for the image


        recipesList.add(new Recipes("Chicken Roll",
                "200 gm chopped into cubes chicken " +
                        "1 medium chopped tomato " +
                        "1/2 pinch red chilli powder " +
                        "2 tablespoon vegetable oil " +
                        "1/2 cut into strips cucumber " +
                        "1/2 tablespoon chopped coriander leaves " +
                        "1 large thinly sliced onion " +
                        "2 medium chopped green chilli " +
                        "2 pinches garam masala powder " +
                        "1 lemon wedges " +
                        "1 teaspoon tomato ketchup " +
                        "1 tablespoon green chilli sauce",
                "Method",
                "Chicken Roll is a delectable North Indian recipe made using all purpose flour, stir-fried chicken, " +
                        "yoghurt and a variety of vegetables rolled into paranthas. On days you do not want to prepare an elaborate meal," +
                        "" +
                        " this delectable dish can be a saviour. Rolls are quite popular across India and they are often a favourite evening snack." +
                        " Egg Roll, Kathi Kebab Roll, Mutton Roll, Paneer Roll, Potato Roll and even Fish Roll are among its many variations." +
                        " This easy roll recipe is made using chicken and has the unforgettable aroma of Indian spices. You can also utilize your " +
                        "leftover parathas and chapatis in making this recipe. If you do not like to use all-purpose flour or maida, you can make " +
                        "it with whole wheat flour too. In fact, it can be made even with leftover chicken. All you have to ensure is that " +
                        "you use the right amount of spices so that the flavour is not lost. Easy to pack and carry, you can also take it" +
                        " to office or prepare it for picnics and day trips. A must try roll recipe for all chicken lovers!\n",
                R.drawable.chicken_roll));

        recipesList.add(new Recipes(
                "Raspberry Vanilla Layer Cake",
                "For the Cake:\n" +
                        "2 1/2 cups all-purpose flour\n" +
                        "2 1/2 tsp baking powder\n" +
                        "1/2 tsp salt\n" +
                        "1 cup unsalted butter, room temperature\n" +
                        "2 cups granulated sugar\n" +
                        "4 large eggs\n" +
                        "1 tsp vanilla extract\n" +
                        "1 cup whole milk\n" +
                        "\n" +
                        "For the Filling:\n" +
                        "1 cup heavy whipping cream\n" +
                        "1/4 cup powdered sugar\n" +
                        "1 tsp vanilla extract\n" +
                        "1 1/2 cups fresh raspberries\n" +
                        "\n" +
                        "For the Topping:\n" +
                        "1/2 cup fresh raspberries\n" +
                        "Mint leaves for garnish (optional)",
                "Method",
                "1. Preheat your oven to 350°F (175°C). Grease and flour two 9-inch round cake pans.\n" +
                        "2. In a medium bowl, whisk together the flour, baking powder, and salt.\n" +
                        "3. In a large bowl, beat the butter and sugar together until light and fluffy. Add the eggs one at a time, beating well after each addition. Mix in the vanilla extract.\n" +
                        "4. Gradually add the flour mixture to the butter mixture, alternating with the milk, beginning and ending with the flour mixture. Mix until just combined.\n" +
                        "5. Divide the batter evenly between the prepared cake pans and smooth the tops.\n" +
                        "6. Bake for 25-30 minutes, or until a toothpick inserted into the center comes out clean. Allow the cakes to cool in the pans for 10 minutes, then turn them out onto a wire rack to cool completely.\n" +
                        "7. For the filling, whip the heavy cream, powdered sugar, and vanilla extract until stiff peaks form.\n" +
                        "8. To assemble the cake, place one cake layer on a serving plate. Spread half of the whipped cream over the top and sprinkle with 3/4 cup of fresh raspberries. Place the second cake layer on top and spread the remaining whipped cream over the top. Arrange the remaining raspberries on top of the cake.\n" +
                        "9. Garnish with mint leaves if desired. Serve immediately or refrigerate until ready to serve.",
                R.drawable.vanela
        ));



        recipesList.add(new Recipes("Donut","1 c. whole milk" +
                "1/4 c. plus 1 tsp. granulated sugar, divided" +
                "1 packet (or 2 1/4 tsp.) active dry yeast " +
                "4 c. all-purpose flour, plus more if needed" +
                "1/2 tsp. kosher salt" +
                "6 tbsp. melted butter" +
                "2 large eggs" +
                "1/2 tsp. pure vanilla extract" +
                "Canola or vegetable oil, for frying","Method","\n" +
                "Grease a large bowl with cooking spray and set aside. In a small, microwave-safe bowl or glass measuring cup, add milk. Microwave until lukewarm, 40 seconds. Add a teaspoon of sugar and stir to dissolve, then sprinkle over yeast and let sit until frothy, about 8 minutes.\n" +
                "Make glaze: In a large bowl, whisk together milk, powdered sugar, and vanilla until smooth. Set aside.\n" +
                "Line a large baking sheet with paper towels. In a large dutch oven over medium heat, heat 2'' oil to 350°. Cook doughnuts, in batches, until deeply golden on both sides, about 1 minute per side. Holes will cook even faster!\n" +
                "Transfer doughnuts to paper towel-lined baking sheet to drain and cool slightly. Dip into glaze, then place onto a cooling rack (or eat immediately!)",R.drawable.donut1));

        recipesList.add(new Recipes(
                "Mixed Grill Platter",
                "For the Marinade:\n" +
                        "1/4 cup olive oil\n" +
                        "3 tbsp lemon juice\n" +
                        "4 garlic cloves, minced\n" +
                        "1 tbsp paprika\n" +
                        "1 tbsp dried oregano\n" +
                        "Salt and pepper to taste\n" +
                        "\n" +
                        "For the Meat and Vegetables:\n" +
                        "1 lb chicken breasts, cut into chunks\n" +
                        "1 lb lamb chops\n" +
                        "1 lb beef kebabs\n" +
                        "2 red bell peppers, halved\n" +
                        "1 large eggplant, halved\n" +
                        "4 large potatoes, halved\n" +
                        "8 large mushrooms\n" +
                        "\n" +
                        "For the Sauces:\n" +
                        "1/2 cup BBQ sauce\n" +
                        "1/2 cup tzatziki sauce\n" +
                        "1/2 cup garlic aioli\n" +
                        "1/2 cup spicy red pepper sauce",
                "Method",
                "1. In a large bowl, mix together the olive oil, lemon juice, garlic, paprika, oregano, salt, and pepper to make the marinade.\n" +
                        "2. Place the chicken chunks, lamb chops, and beef kebabs into the marinade. Cover and refrigerate for at least 1 hour, or overnight for best results.\n" +
                        "3. Preheat the grill to medium-high heat.\n" +
                        "4. Thread the marinated chicken onto skewers. Prepare the vegetables by lightly brushing them with olive oil and seasoning with salt and pepper.\n" +
                        "5. Grill the chicken skewers, lamb chops, beef kebabs, bell peppers, eggplant, potatoes, and mushrooms until cooked through and charred to your liking. Chicken should reach an internal temperature of 165°F, lamb should reach 145°F for medium-rare, and beef should reach 135°F for medium-rare.\n" +
                        "6. Remove the meats and vegetables from the grill and let them rest for a few minutes.\n" +
                        "7. Arrange the grilled meats and vegetables on a large serving platter.\n" +
                        "8. Serve with BBQ sauce, tzatziki sauce, garlic aioli, and spicy red pepper sauce on the side for dipping.",
                R.drawable.platter
        ));



        recipesList.add(new Recipes("Dosa","3 cups rice" +
                "1 cup urad daal (split, skinless black gram)" +
                "3/4 teaspoon fenugreek seeds" +
                "Salt (to taste)" +
                "Vegetable / canola / sunflower cooking oil","Method",
                "Wash the rice and urad daal well. Add the fenugreek seeds to the mix and fill enough water in the rice-daal bowl to cover them about 2-inch deep. Soak overnight.\n" +
                        "Put some cooking oil in a small bowl and keep ready. You will also need a bowl of ice cold water, a large, flat nonstick pan, 2 sheets of paper towel, a ladle, a spatula, and a basting brush.\n" +
                        "When the upper surface begins to look cooked (it will no longer look soft or runny), flip the dosa. By this time, ideally, the surface that was underneath should be light golden in color. Cook for 1 minute after flipping.\n" +
                        "The dosa is almost done. Fold it in half and allow to cook for 30 seconds more.",R.drawable.dosa1));
        recipesList.add(new Recipes(
                "Chicken Burger",
                "For the Chicken Patties:\n" +
                        "1 lb ground chicken\n" +
                        "1/2 cup breadcrumbs\n" +
                        "1/4 cup grated Parmesan cheese\n" +
                        "1 egg\n" +
                        "2 garlic cloves, minced\n" +
                        "1 tbsp fresh parsley, chopped\n" +
                        "1 tsp salt\n" +
                        "1/2 tsp black pepper\n" +
                        "\n" +
                        "For the Burger Assembly:\n" +
                        "4 burger buns\n" +
                        "4 slices cheddar cheese\n" +
                        "Lettuce leaves\n" +
                        "Tomato slices\n" +
                        "Red onion slices\n" +
                        "Pickles\n" +
                        "Mayonnaise\n" +
                        "Ketchup\n" +
                        "Mustard",
                "Method",
                "1. In a large bowl, combine the ground chicken, breadcrumbs, Parmesan cheese, egg, garlic, parsley, salt, and pepper. Mix until well combined.\n" +
                        "2. Divide the mixture into 4 equal portions and shape each portion into a patty.\n" +
                        "3. Preheat your grill or a skillet over medium-high heat. Lightly oil the grill grates or the skillet.\n" +
                        "4. Cook the chicken patties for about 5-6 minutes per side, or until they are fully cooked and reach an internal temperature of 165°F (74°C).\n" +
                        "5. During the last minute of cooking, place a slice of cheddar cheese on top of each patty and allow it to melt.\n" +
                        "6. Toast the burger buns on the grill or in a toaster until they are lightly browned.\n" +
                        "7. To assemble the burgers, spread mayonnaise, ketchup, and mustard on the bottom halves of the toasted buns.\n" +
                        "8. Place a lettuce leaf on each bun, followed by a chicken patty with melted cheese, tomato slices, red onion slices, and pickles.\n" +
                        "9. Top with the other half of the buns. Serve immediately with your favorite side dishes.",
                R.drawable.burger
        ));


        recipesList.add(new Recipes("Pancake","1 1/4 cups milk" +
                "1 egg" +
                "3 tablespoons butter melted" +
                "1 1/2 cups all-purpose flour" +
                "3 1/2 teaspoons baking powder" +
                "1 teaspoon salt" +
                "1 tablespoon white sugar","Method",
                "In a large bowl, sift together the flour, baking powder, salt and sugar. Make a well in the center and pour in the milk, egg and melted butter; mix until smooth." +
                        "Heat a lightly oiled griddle or frying pan over medium high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. Brown on both sides and serve hot.",R.drawable.pancakes));

        recipesList.add(new Recipes("BBQ Chicken Pizza",
                "For the Dough:\n" +
                        "2 1/4 tsp active dry yeast\n" +
                        "1 1/2 cups warm water\n" +
                        "3 1/2 to 4 cups all-purpose flour\n" +
                        "2 tbsp olive oil\n" +
                        "2 tsp sugar\n" +
                        "1 tsp salt\n\n" +

                        "For the Toppings:\n" +
                        "1 cup cooked chicken breast, shredded\n" +
                        "1/2 cup BBQ sauce (plus extra for drizzling)\n" +
                        "1 cup pineapple chunks\n" +
                        "1/2 red onion, thinly sliced\n" +
                        "2 cups shredded mozzarella cheese\n" +
                        "Fresh cilantro leaves, for garnish",
                "Method",
                "1. Prepare the Dough:\n" +
                        "In a small bowl, dissolve the yeast in warm water. Let it stand until creamy, about 10 minutes. In a large bowl, combine the flour, olive oil, sugar, and salt. Mix in the yeast mixture. Knead the dough until it becomes smooth and elastic. Place the dough in a lightly oiled bowl, cover, and let it rise in a warm place for about 1 hour, or until doubled in size.\n\n" +

                        "2. Preheat Oven:\n" +
                        "Preheat your oven to 475°F (245°C). If using a pizza stone, place it in the oven to preheat as well.\n\n" +

                        "3. Prepare the Toppings:\n" +
                        "In a bowl, toss the shredded chicken with 1/2 cup BBQ sauce until evenly coated.\n\n" +

                        "4. Assemble the Pizza:\n" +
                        "Punch down the risen dough and divide it into two equal parts. Roll out each part into a circle on a lightly floured surface. Transfer the dough to a pizza stone or baking sheet. Spread a thin layer of BBQ sauce over the pizza dough. Sprinkle with half of the shredded mozzarella cheese. Distribute the BBQ chicken evenly over the cheese. Add pineapple chunks and red onion slices. Top with the remaining mozzarella cheese.\n\n" +

                        "5. Bake:\n" +
                        "Bake in the preheated oven for 12-15 minutes, or until the crust is golden and the cheese is bubbly and slightly browned.\n\n" +

                        "6. Garnish and Serve:\n" +
                        "Remove the pizza from the oven and let it cool for a few minutes. Drizzle additional BBQ sauce over the top, if desired. Garnish with fresh cilantro leaves. Slice and serve hot.\n\n",
                R.drawable.bbq_pizza));  // Make sure to replace with the correct drawable resource name for the image

    }

    // Public method to provide access to the instance
    public static synchronized RecipeManager getInstance() {
        if (instance == null) {
            instance = new RecipeManager();
        }
        return instance;
    }

    // Get the list of recipes
    public List<Recipes> getRecipes() {
        return recipesList;
    }

    // Add a new recipe to the list
    public void addRecipe(Recipes recipe) {
        recipesList.add(recipe);
    }


}
