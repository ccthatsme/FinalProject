package co.grandcircus.FinalProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.FinalProject.repository.FoodRepository;

@Controller
public class EditController {
	@Autowired
	FoodRepository foodRepo;

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
		return new ModelAndView("user-pantry2");
	}
//	@RequestMapping("add-to")
//	public ModelAndView addTo(@RequestParam("id") int id) {
//		foodRepo.save(foodRepo.findByFoodId(id));
//		return new ModelAndView("add-to-pantry");
//	}
//	@RequestMapping("subtract-from")
//	public ModelAndView subtractFrom(@RequestParam("id") int id) {
//		
//		return new ModelAndView("add-to-pantry");
//	}
//	

}
