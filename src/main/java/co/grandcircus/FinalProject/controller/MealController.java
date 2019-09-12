
package co.grandcircus.FinalProject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.FinalProject.jpaEntity.Food;
import co.grandcircus.FinalProject.repository.FoodRepository;
import co.grandcircus.FinalProject.repository.PantryRepository;

@Controller
public class MealController {

	Food food;
	Food foodTwo;

	@Autowired
	PantryRepository pRepo;

	@Autowired
	FoodRepository fRepo;

	@RequestMapping("meal-page")
	public ModelAndView mealHome() {
		List<Food> list = fRepo.findAll();

		return new ModelAndView("meal", "list", list);

	}

//	@RequestMapping("edit-meal")
//	public ModelAndView addToMeal(@RequestParam("id") int id, @RequestParam("check") boolean check) {
//		ModelAndView mv = new ModelAndView();
//		List<Food> caloriesList = new ArrayList<Food>();
//		if(check) {
//			foodTwo = fRepo.getOne(id);
//			caloriesList.add(foodTwo);
//		}
//		
//		
//		food = fRepo.getOne(id);
//		int calories = food.getCalories();
//		List<Food> list = fRepo.findAll();
//		double sum = 0;
//		for ( Food food : list) {
//			sum = food.getCalories() + sum;
//			
//		}
//		mv = new ModelAndView("page", "test", caloriesList);
//		return mv;
//	}
//	

	@RequestMapping("edit-meal")
	public ModelAndView addToMeal(@RequestParam("check") String check) {
		System.out.println(check);
		String[] ingredients = check.split(",");

		for (int i = 0; i < ingredients.length; i++) {
			if (i == 0) {
				System.out.print(ingredients[i]);
			} else if (i != 0) {
				System.out.print(",+");
				System.out.print(ingredients[i]);
			}
			/*
			 * // } else if (i== ingredients.length-1) { // System.out.print(",+"); //
			 * System.out.print(ingredients[i]); // }
			 */ }
		ModelAndView mv = new ModelAndView("page");
//		List<Food> caloriesList = new ArrayList<Food>();
//		if(check) {
//			foodTwo = fRepo.getOne(id);
//			caloriesList.add(foodTwo);
//		}
//		
//		
//		food = fRepo.getOne(id);
//		int calories = food.getCalories();
//		List<Food> list = fRepo.findAll();
//		double sum = 0;
//		for ( Food food : list) {
//			sum = food.getCalories() + sum;
//			
//		}
		// mv = new ModelAndView("page", "test", caloriesList);
		return mv;
	}

}
