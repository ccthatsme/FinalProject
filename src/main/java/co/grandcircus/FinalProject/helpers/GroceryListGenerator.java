package co.grandcircus.FinalProject.helpers;

import java.util.ArrayList;
import java.util.List;

import co.grandcircus.FinalProject.jpaEntity.Food;
import co.grandcircus.FinalProject.jpaEntity.Pantry;

public class GroceryListGenerator {

	public GroceryListGenerator() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<String> createGroceryList(Pantry p){
		List<Food> foodInPantry = p.getPantryFood();
		List<String> foodToBuy = new ArrayList<>();
		
		for(Food f : foodInPantry) {
			if (f.getQuantity() < 2) {
				foodToBuy.add(f.getName());
			}
		}
		return foodToBuy;
		
	}
	
}
