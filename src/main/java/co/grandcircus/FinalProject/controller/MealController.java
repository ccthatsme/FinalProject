package co.grandcircus.FinalProject.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.FinalProject.jpaEntity.Food;
import co.grandcircus.FinalProject.jpaEntity.Pantry;
import co.grandcircus.FinalProject.repository.FoodRepository;
import co.grandcircus.FinalProject.repository.PantryRepository;

@Controller
public class MealController {
	
	Food food;
	
	@Autowired
	PantryRepository pRepo;
	
	@Autowired
	FoodRepository fRepo;
	
	@RequestMapping("meal-page")
	public ModelAndView mealHome() {
		List<Food> list = fRepo.findAll();
		
		return new ModelAndView("meal", "list", list);
		
	}
	
	@RequestMapping("edit-meal")
	public ModelAndView addToMeal(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView();
		food = fRepo.getOne(id);
		int calories = food.getCalories();
		List<Food> list = fRepo.findAll();
		double sum = 0;
		for ( Food food : list) {
			sum = food.getCalories() + sum;
			
		}
		mv = new ModelAndView("page", "test", calories);
		return mv;
	}
	
}
