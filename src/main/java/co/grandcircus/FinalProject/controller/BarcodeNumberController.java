package co.grandcircus.FinalProject.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.FinalProject.entity.jsonEntity.Product;
import co.grandcircus.FinalProject.entity.jsonEntity.ProductResponse;
import co.grandcircus.FinalProject.helpers.ProductConverter;
import co.grandcircus.FinalProject.jpaEntity.AutoSubtraction;
import co.grandcircus.FinalProject.jpaEntity.Food;
import co.grandcircus.FinalProject.jpaEntity.Pantry;
import co.grandcircus.FinalProject.jpaEntity.Restriction;
import co.grandcircus.FinalProject.jpaEntity.User;
import co.grandcircus.FinalProject.repository.AutoSubtractionRepository;
import co.grandcircus.FinalProject.repository.FoodRepository;
import co.grandcircus.FinalProject.repository.PantryRepository;
import co.grandcircus.FinalProject.repository.UserRepository;

@Controller
@SessionAttributes("user")
public class BarcodeNumberController {

	ProductConverter convert = new ProductConverter();

	@Autowired
	FoodRepository foodrepo;

	@Autowired
	PantryRepository pRepo;

	@Autowired
	UserRepository uRepo;

	@Autowired
	AutoSubtractionRepository aRepo;

	RestTemplate rt = new RestTemplate();

	@Value("${nutritionix-barcode.key}")
	private String key;

	@Value("${nutritionix-barcode.project}")
	private String projId;

	@Autowired
	HttpSession sess;

//	@Autowired
//	ScheduledSubtractHandler schedule;

	@RequestMapping("/")
	public ModelAndView showJsonForBarcodeNum() {
//		String url = "https://trackapi.nutritionix.com/v2/search/item?upc=044000032029";
//		HttpHeaders headers = new HttpHeaders();
//		
//		headers.add("x-app-key", key);
//		headers.add("x-app-id", projId);
//		
//		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
//		ResponseEntity<ProductResponse> response = rt.exchange(url, HttpMethod.GET, entity, ProductResponse.class);
//		ProductResponse rep = response.getBody();
//		Product prod = rep.getFoods().get(0);

		// String responseBody = response.getBody();
		return new ModelAndView("log-in");

	}

	@RequestMapping("search")
	public ModelAndView searchByBarcode(@RequestParam("barcode") String barcode) {
		String typeSearch = "upc";
		ProductResponse resp = apiSearch(barcode, typeSearch);
		Product p = resp.getFoods().get(0);

		ModelAndView mv = new ModelAndView("search-results");
		System.out.println(barcode + "barcode");
		mv.addObject("barcode", barcode);
		mv.addObject("response", p);
		return mv;

	}

	public ProductResponse apiSearch(String searchName, String typeSearch) {
		String url = "https://trackapi.nutritionix.com/v2/search/item?"+ typeSearch +"=" + searchName;
		HttpHeaders headers = new HttpHeaders();

		headers.add("x-app-key", key);
		headers.add("x-app-id", projId);

		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		ResponseEntity<ProductResponse> response = rt.exchange(url, HttpMethod.GET, entity, ProductResponse.class);
		ProductResponse resp = response.getBody();
		return resp;
	}

	@RequestMapping("search-by-keyword")
	public ModelAndView listKeywordResults(@RequestParam("keyword") String term) {
//		String url = "https://nutritionix-api.p.rapidapi.com/v1_1/item?phrase=" + term + "&fields=item_name,item_id,brand_name,nf_calories,nf_total_fat,";
//		HttpHeaders headers = new HttpHeaders();
//		
//		headers.add("x-rapidapi-host", "nutritionix-api.p.rapidapi.com");
//		headers.add("X-RapidAPI-Key", key);
//		headers.add("RapidAPI Project", projId);
		String typeSearch = "phrase";
		String url = "https://trackapi.nutritionix.com/v2/search/item?"+ typeSearch +"=" + term + "&fields=item_name,item_id,brand_name,nf_calories,nf_total_fat,";
		HttpHeaders headers = new HttpHeaders();

		headers.add("x-app-key", key);
		headers.add("x-app-id", projId);

		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		ResponseEntity<String> response = rt.exchange(url, HttpMethod.GET, entity, String.class);
		//ProductResponse resp = response.getBody();
		
		
		//ProductResponse resp = apiSearch(term, typeSearch);
		//Product p = resp.getFoods().get(0);
		ModelAndView mv = new ModelAndView("search-results");
		System.out.println(term + "barcode");
		System.out.println(response);
//		mv.addObject("barcode", term);
//		mv.addObject("response", response);
		
		return mv;
		
	}

	@RequestMapping("add-to-pantry")
	public ModelAndView addItem(@RequestParam("barcode") String barcode) {
		String url = "https://trackapi.nutritionix.com/v2/search/item?upc=" + barcode;
		HttpHeaders headers = new HttpHeaders();

		headers.add("x-app-key", key);
		headers.add("x-app-id", projId);

		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		ResponseEntity<ProductResponse> response = rt.exchange(url, HttpMethod.GET, entity, ProductResponse.class);
		Product p = response.getBody().getFoods().get(0);

		Food f = convert.convertFood(p);
		User u = (User) sess.getAttribute("user");

		// if the food exists, we dont want to add a duplicate entry to the database, we
		// just want to add it to the user pantry
		if (checkIfFoodExists(f)) {
			Pantry pantry = u.getPantry();
			pantry.getPantryFood().add(foodrepo.findByName(f.getName()).get(0));
			foodrepo.save(f);
			pRepo.save(pantry);
		} else {
			Pantry pantry = u.getPantry();
			pantry.getPantryFood().add(f);
			foodrepo.save(f);
			pRepo.save(pantry);
		}
		// User u = (User) sess.getAttribute("user");
		System.out.println(u);
		Pantry userPantry = u.getPantry();
		List<Food> userItems = userPantry.getPantryFood();
		return new ModelAndView("user-pantry2", "test", userItems);
	}

	// this method should be updated later. right now it checks if a food with the
	// same name exists, but we should make it check by upc or some other unique
	// identifier.
	public boolean checkIfFoodExists(Food f) {
		List<Food> returnedFoods = foodrepo.findByName(f.getName());
		if (returnedFoods.size() == 0) {
			return false;
		}
		return true;
	}
//	@RequestMapping("user-pantry")
//	public ModelAndView userPantryItems() {
//		//refactor the method findEmail in UserRepo to return a single user and not a list, bc email addresses should be unique
//		User u = (User) sess.getAttribute("user");
//		System.out.println(u);
//		Pantry userPantry = u.getPantry();
//		List<Food> userItems = userPantry.getPantryFood();

//		return new ModelAndView("user-pantry2", "test", userItems);

	@RequestMapping("dashboard")
	public ModelAndView showUserDashboard() {
		User u = (User) sess.getAttribute("user");
		return new ModelAndView("user-home", "user", u);
	}

	@RequestMapping("user-pantry")
	public ModelAndView showUserPantry() {
		User u = (User) sess.getAttribute("user");
		return new ModelAndView("user-pantry", "user", u);
	}
	
	@RequestMapping("acct-page")
	public ModelAndView showAcctPage() {
		User u = (User) sess.getAttribute("user");
		
		ModelAndView mv = new ModelAndView("acct-page");
		
		mv.addObject("user", u);
		
		List<AutoSubtraction> subList = aRepo.findByPantry(u.getPantry());
		mv.addObject("subtractions", subList);
		
		List<Restriction> restrictionList = u.getRestriction();
		mv.addObject("restrictions", restrictionList);
		
		return mv;
	}
	
	@RequestMapping("manage-subtractions")
	public ModelAndView showSubtractionPage() {
		ModelAndView mv = new ModelAndView("subtraction-manager");
		User u = (User) sess.getAttribute("user");
		List<AutoSubtraction> subList = aRepo.findByPantry(u.getPantry());
		mv.addObject("subtractions", subList);
		mv.addObject("user", u);
		return mv;
		
	}
	
	@RequestMapping("add-auto")
	public ModelAndView addAuto(@RequestParam("qty") Double qtyNum, @RequestParam("unitChoice") String unit, @RequestParam("food") Integer foodId, @RequestParam("pantry") Integer pantryId) {
		User u = (User) sess.getAttribute("user");
		Optional<Pantry> pantry = pRepo.findById(pantryId);
		Pantry p = pantry.get();
		System.out.println("PANTRY ID IS: " + pantryId);
		Optional<Food> food = foodrepo.findById(foodId);
		Food f = food.get();
		System.out.println("FOOD ID IS: " + foodId);
		AutoSubtraction newsub = new AutoSubtraction(qtyNum, unit, 50000, p, f);
		aRepo.save(newsub);
		return new ModelAndView("acct-page");
	}

}
