package co.grandcircus.FinalProject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.FinalProject.helpers.CookingUnitConverter;
import co.grandcircus.FinalProject.jpaEntity.Food;
import co.grandcircus.FinalProject.jpaEntity.User;
import co.grandcircus.FinalProject.repository.FoodRepository;

@Controller
public class EditController {
	@Autowired
	FoodRepository foodRepo;

	@Autowired
	HttpSession session;

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
		foodRepo.deleteById(id);
		User u = (User) session.getAttribute("user");

		return new ModelAndView("user-pantry", "a", u);
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

		return new ModelAndView("user-pantry", "a", u);
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

		return new ModelAndView("user-pantry", "a", u);
	}

}
