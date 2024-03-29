package co.grandcircus.FinalProject.helpers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.grandcircus.FinalProject.jpaEntity.Food;
import co.grandcircus.FinalProject.jpaEntity.Pantry;
import co.grandcircus.FinalProject.repository.FoodRepository;

public class GroceryListGenerator {

	CookingUnitConverter converter = new CookingUnitConverter();
	
	@Autowired
	FoodRepository fRepo;
	
	public GroceryListGenerator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Food> createGroceryList(Pantry p) {
		List<Food> foodInPantry = p.getPantryFood();
		List<Food> foodToBuy = new ArrayList<>();

		for (Food f : foodInPantry) {
			if (f.getQuantity() < 2) {
				foodToBuy.add(f);
			}
		}
		return foodToBuy;

	}

	public void buyAllFood(List<Food> fList, Pantry p) {
		for (Food f : fList) {
			
			Double amtToAdd = converter.convert(f.getPurchaseQuantity(), f.getPurchaseUnit(), f.getQuantityUnit());
			f.setQuantity(f.getQuantity() + amtToAdd);
			fRepo.save(f);
		}
	}

	public void buySelected(List<Food> fList, List<Food> selectedList, Pantry p) {
		ArrayList<Food> food = new ArrayList<>();
		for (Food selectedFood : selectedList) {
			for (Food foodInGroceryList : fList) {
				if (foodInGroceryList.getName().equalsIgnoreCase(selectedFood.getName())) {
					foodInGroceryList.setQuantity(foodInGroceryList.getQuantity() + 5);
				}
			}

		}

	}
}
