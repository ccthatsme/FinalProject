package co.grandcircus.FinalProject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.FinalProject.jpaEntity.Food;
import co.grandcircus.FinalProject.jpaEntity.Pantry;
import co.grandcircus.FinalProject.jpaEntity.User;
import co.grandcircus.FinalProject.repository.FoodRepository;
import co.grandcircus.FinalProject.repository.PantryRepository;

@Controller
@SessionAttributes("user")
public class CustomFoodController {

	@Autowired
	HttpSession session;
	
	@Autowired
	FoodRepository fRepo;
	
	@Autowired
	PantryRepository pRepo;
	
	@RequestMapping("create-custom-food-page")
	public ModelAndView showCustomFoodPage() {
		return new ModelAndView("create-food-page");
	}
	
	@RequestMapping("create-custom-food")
	public ModelAndView createCustomFood(Food newFood) {
		User u = (User) session.getAttribute("user");
		Pantry p = u.getPantry();
		fRepo.save(newFood);
		p.getPantryFood().add(newFood);
		pRepo.save(p);
		return new ModelAndView("redirect:/login?email=" +u.getEmail()+"&password="+ u.getPassword());
	}
}
