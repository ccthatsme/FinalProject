package co.grandcircus.FinalProject.recipeApiEntity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.grandcircus.FinalProject.jpaEntity.PossibleRecipe;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecipeResponse {
	
	private ArrayList<PossibleRecipe> recipes;
	
	public RecipeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecipeResponse(ArrayList<PossibleRecipe> recipes) {
		super();
		this.recipes = recipes;
	}

	public ArrayList<PossibleRecipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(ArrayList<PossibleRecipe> recipes) {
		this.recipes = recipes;
	}

}
