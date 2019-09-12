package co.grandcircus.FinalProject.recipeApiEntity;

import java.util.ArrayList;

import javax.persistence.Entity;
@Entity
public class RecipePriceBreakdown {

	ArrayList<Ingredients> ingredients;

	public RecipePriceBreakdown() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RecipePriceBreakdown [ingredients=" + ingredients + "]";
	}
}

