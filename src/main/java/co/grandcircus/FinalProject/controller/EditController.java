package co.grandcircus.FinalProject.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.FinalProject.helpers.CookingUnitConverter;
import co.grandcircus.FinalProject.helpers.GroceryListGenerator;
import co.grandcircus.FinalProject.jpaEntity.Food;
import co.grandcircus.FinalProject.jpaEntity.Pantry;
import co.grandcircus.FinalProject.jpaEntity.User;
import co.grandcircus.FinalProject.repository.FoodRepository;
import co.grandcircus.FinalProject.repository.PantryRepository;

@Controller
public class EditController {
	@Autowired
	FoodRepository foodRepo;

	@Autowired
	HttpSession session;
	
	@Autowired
	PantryRepository pRepo;
	
	GroceryListGenerator groceryListGenerator = new GroceryListGenerator();

	CookingUnitConverter converter = new CookingUnitConverter();

	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView("edit-page", "food", id);

		return mv;

	}

	@RequestMapping("edit-selection")
	public ModelAndView edit(@RequestParam("id") int food_id, @RequestParam("quantity") double quantity) {

		ModelAndView mv = new ModelAndView();

		return mv;

	}

	@RequestMapping("delete")
	public ModelAndView delete(@RequestParam("id") int id) {
		//foodRepo.deleteById(id);
		
		User u = (User) session.getAttribute("user");

		Pantry pantry = u.getPantry();
		List<Food> foodList = pantry.getPantryFood();
		
		if (foodList.contains(foodRepo.findById(id).orElse(null))) {
			foodList.remove(id);
			pantry.setPantryFood(foodList);
		}
		pRepo.saveAndFlush(pantry);
		
		return new ModelAndView("redirect:/login?email=" +u.getEmail()+"&password="+ u.getPassword());
	}

	@RequestMapping("go-to-add-page")
	public ModelAndView goToAddPage(@RequestParam("id") Integer id) {
		Food f = foodRepo.findById(id).get();
		return new ModelAndView("add-to-pantry", "food", f);
	}

	@RequestMapping("add-amt")
	public ModelAndView addAmount(@RequestParam("food") Integer id, @RequestParam("qty") Double qtyToAdd,
			@RequestParam("unitChoice") String additionUnit) {
		Food f = foodRepo.findById(id).get();
		String targetUnit = f.getQuantityUnit();
		Double initialQty = f.getQuantity();

		Double convertedSubtraction = converter.convert(qtyToAdd, additionUnit, targetUnit);

		Double newAmt = initialQty + convertedSubtraction;

		f.setQuantity(newAmt);
		foodRepo.save(f);

		User u = (User) session.getAttribute("user");
		System.out.println(u.getEmail());

//		return new ModelAndView("user-pantry", "a", u);
		return new ModelAndView("redirect:/login?email=" +u.getEmail()+"&password="+ u.getPassword());
	}

	@RequestMapping("go-to-subtract-page")
	public ModelAndView goToSubtractPage(@RequestParam("id") Integer id) {
		Food f = foodRepo.findById(id).get();
		return new ModelAndView("subtract-from-pantry", "food", f);
	}

	@RequestMapping("subtract-amt")
	public ModelAndView subtractAmount(@RequestParam("food") Integer id, @RequestParam("qty") Double qtyToAdd,
			@RequestParam("unitChoice") String additionUnit) {
		Food f = foodRepo.findById(id).get();
		String targetUnit = f.getQuantityUnit();
		Double initialQty = f.getQuantity();

		Double convertedSubtraction = converter.convert(qtyToAdd, additionUnit, targetUnit);

		Double newAmt = initialQty - convertedSubtraction;

		f.setQuantity(newAmt);
		foodRepo.save(f);

		User u = (User) session.getAttribute("user");

		return new ModelAndView("user-pantry", "updatedPantry", u.getPantry());
	}

	
	@RequestMapping("grocery-list")
	public ModelAndView showGroceryList() {
		User u = (User) session.getAttribute("user");
		Pantry p = u.getPantry();
		List<Food> toBuy = groceryListGenerator.createGroceryList(p);
		return new ModelAndView("grocery-list", "groceries", toBuy);
	}
	@RequestMapping("buy-all")
	public ModelAndView buyAllGroceries() {
		User u = (User) session.getAttribute("user");
		Pantry p = u.getPantry();
		List<Food> fList = groceryListGenerator.createGroceryList(p);
		groceryListGenerator.buyAllFood(fList, p);
		return new ModelAndView("user-pantry", "updatedPantry", u.getPantry());
		
	}
}
