package com.example.fitrecipe;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {
    private Context mContext;
    private List<Recipes> mData;

    public RecyclerViewAdapter(Context mContext, List<Recipes> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.cardview_recipe, viewGroup, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, int position) {
        myHolder.recipeTitle.setText(mData.get(position).getRecipeName());
        myHolder.img_recipe_thumbnail.setImageResource(mData.get(position).getThumbnail());
        myHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int adapterPosition = myHolder.getAdapterPosition();
                if (adapterPosition != RecyclerView.NO_POSITION) {
                    Intent intent = new Intent(mContext, RecipeActivity.class);
                    intent.putExtra("RecipeName", mData.get(adapterPosition).getRecipeName());
                    intent.putExtra("RecipeIngredients", mData.get(adapterPosition).getRecipeIngredients());
                    intent.putExtra("RecipeMethodTitle", mData.get(adapterPosition).getRecipeMethodTitle());
                    intent.putExtra("Recipe", mData.get(adapterPosition).getRecipe());
                    intent.putExtra("Thumbnail", mData.get(adapterPosition).getThumbnail());
                    mContext.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setRecipes(List<Recipes> recipes) {
        this.mData = recipes;
        notifyDataSetChanged();
    }

    public List<Recipes> getRecipes() {
        return mData;
    }

    public static class MyHolder extends RecyclerView.ViewHolder {
        TextView recipeTitle;
        CardView cardView;
        ImageView img_recipe_thumbnail;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            recipeTitle = itemView.findViewById(R.id.recipe_text);
            img_recipe_thumbnail = itemView.findViewById(R.id.recipe_img_id);
            cardView = itemView.findViewById(R.id.cardview_id);
        }
    }
}
