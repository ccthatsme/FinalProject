package co.grandcircus.FinalProject.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
import co.grandcircus.FinalProject.repository.AutoSubtractionRepository;
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

	@Autowired
	AutoSubtractionRepository aRepo;
	
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
		// foodRepo.deleteById(id);

		User u = (User) session.getAttribute("user");

		Pantry pantry = u.getPantry();
		List<Food> foodList = pantry.getPantryFood();

		if (foodList.contains(foodRepo.findById(id).orElse(null))) {
			foodList.remove(id);
			pantry.setPantryFood(foodList);
		}
		pRepo.saveAndFlush(pantry);

		return new ModelAndView("redirect:/login?email=" + u.getEmail() + "&password=" + u.getPassword());
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
		return new ModelAndView("redirect:/login?email=" + u.getEmail() + "&password=" + u.getPassword());
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
		if(newAmt < 0) {
			newAmt = 0.0;
		}

		f.setQuantity(newAmt);
		foodRepo.save(f);

		User u = (User) session.getAttribute("user");

		return new ModelAndView("redirect:/login?email=" + u.getEmail() + "&password=" + u.getPassword());
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
		for (Food f : fList) {

			Double amtToAdd = converter.convert(f.getPurchaseQuantity(), f.getPurchaseUnit(), f.getQuantityUnit());
			f.setQuantity(f.getQuantity() + amtToAdd);
			foodRepo.save(f);
		}
		return new ModelAndView("user-pantry", "updatedPantry", u.getPantry());

	}

	@RequestMapping("buy-selected")
	public ModelAndView buySelectedGroceries(@RequestParam("check") String checked) {
		User u = (User) session.getAttribute("user");
		Pantry p = u.getPantry();
		List<Food> groceryList = groceryListGenerator.createGroceryList(p);
		String[] selectedFoodNames = checked.split(",");
		System.out.println(Arrays.toString(selectedFoodNames));
		for (Food grocery : groceryList) {
			for (String selectedName : selectedFoodNames) {

				if (grocery.getName().equalsIgnoreCase(selectedName)) {

					// In case the stored quantity and purchase quantity are different, this will
					// convert the amount to auto-purchase
					// to the current unit of the food
					Double amtToAdd = converter.convert(grocery.getPurchaseQuantity(), grocery.getPurchaseUnit(),
							grocery.getQuantityUnit());
					grocery.setQuantity(grocery.getQuantity() + amtToAdd);

					foodRepo.save(grocery);
				}
			}
		}
		return new ModelAndView("user-pantry", "updatedPantry", u.getPantry());
	}

	@RequestMapping("change-unit")
	public ModelAndView changeUnit(@RequestParam("id") Integer id, @RequestParam("unitChoice") String unitChoice) {
		User u = (User) session.getAttribute("user");
		Pantry p = u.getPantry();
		Optional<Food> food = foodRepo.findById(id);
		Food f = food.get();

		double newAmt = converter.convert(f.getQuantity(), f.getQuantityUnit(), unitChoice);
		f.setQuantity(newAmt);
		f.setQuantityUnit(unitChoice);
		foodRepo.save(f);
		return new ModelAndView("redirect:/login?email=" + u.getEmail() + "&password=" + u.getPassword());
	}

	@RequestMapping("manage-grocery-settings")
	public ModelAndView goToGrocerySettingPage() {
		return new ModelAndView("grocery-manager");
	}

	@RequestMapping("change-grocery-setting")
	public ModelAndView changeGrocerySetting(@RequestParam("food") Integer foodId, @RequestParam("qty") Double quantity,
			@RequestParam("unitChoice") String unitChoice) {
		User u = (User) session.getAttribute("user");
		Pantry p = u.getPantry();
		Food f = foodRepo.findById(foodId).get();
		f.setPurchaseQuantity(quantity);
		f.setPurchaseUnit(unitChoice);
		foodRepo.save(f);
		return new ModelAndView("redirect:/login?email=" + u.getEmail() + "&password=" + u.getPassword());

	}
	
	@RequestMapping("remove-autosubtraction")
	public ModelAndView removeAutoSub(@RequestParam("sub-to-remove") Integer subId) {
		User u = (User) session.getAttribute("user");
		aRepo.deleteById(subId);
		return new ModelAndView("redirect:/login?email=" + u.getEmail() + "&password=" + u.getPassword());
	}
}
