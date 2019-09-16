
package co.grandcircus.FinalProject.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.FinalProject.jpaEntity.Food;
import co.grandcircus.FinalProject.jpaEntity.PossibleRecipe;
import co.grandcircus.FinalProject.jpaEntity.User;
import co.grandcircus.FinalProject.repository.FoodRepository;
import co.grandcircus.FinalProject.repository.PantryRepository;

@Controller
public class MealController {
	
	RestTemplate rt = new RestTemplate();

	Food food;
	Food foodTwo;
	PossibleRecipe pr;
	@Value("${spoonacular-recipe.key}")
	private String key;
	
	@Autowired
	PantryRepository pRepo;

	@Autowired
	FoodRepository fRepo;
	
	@Autowired
	HttpSession sess;

	@RequestMapping("meal-page")
	public ModelAndView mealHome() {
		User user = (User) sess.getAttribute("user");
		List<Food> list = user.getPantry().getPantryFood();
		
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
	public ModelAndView addToMeal(@RequestParam("check") String check, @RequestParam("items") int num) {
		System.out.println(check);
		String[] ingredients = check.split(",");
		String foodString = "";
		for (int i = 0; i < ingredients.length; i++) {
			if (i == 0) {
				foodString = ingredients[i] + foodString;
				//System.out.print(ingredients[i]);
			} else if (i != 0) {
				foodString = ",+" + ingredients[i] + ",+" + foodString;
//				System.out.print(",+");
//				System.out.print(ingredients[i]);
			}
		}
		
			System.out.println(foodString);
			//apples,+flour,+sugar
			String url = "https://api.spoonacular.com/recipes/findByIngredients?ingredients=" + foodString + "&number=" + num + "&apiKey=" + key;
			HttpHeaders headers = new HttpHeaders();		
			headers.add("Content-Type", "application/json");
//			headers.add(, headerValue);

		
			HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
			ResponseEntity<List> response = rt.exchange(url, HttpMethod.GET, entity, List.class);
//			//this came from the URL
//			//apples,+flour,+sugar&number=2&apiKey=
//			String url = "https://api.spoonacular.com/recipes/findByIngredients?ingredients="  + key;
//			HttpHeaders headers = new HttpHeaders();		
//			headers.add("Content-Type", "application/json");
////			headers.add(, headerValue);
//
//		
//			HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
//			ResponseEntity<String> response = rt.exchange(url, HttpMethod.GET, entity, String.class);
//			System.out.println(response.getBody());
			
			/*
			 * // } else if (i== ingredients.length-1) { // System.out.print(",+"); //
			 * System.out.print(ingredients[i]); // }
			 */ 
		ModelAndView mv = new ModelAndView("recipe-page", "test", response.getBody());
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

//	@RequestMapping("complete-recipe")
//	public ModelAndView recipeData() {
//		return null;
//		
	
	
	}

