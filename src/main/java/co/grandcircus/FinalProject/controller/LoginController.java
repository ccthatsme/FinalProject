package co.grandcircus.FinalProject.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.FinalProject.jpaEntity.AutoSubtraction;
import co.grandcircus.FinalProject.jpaEntity.Food;
import co.grandcircus.FinalProject.jpaEntity.Pantry;
import co.grandcircus.FinalProject.jpaEntity.Restriction;
import co.grandcircus.FinalProject.jpaEntity.User;
import co.grandcircus.FinalProject.repository.PantryRepository;
import co.grandcircus.FinalProject.repository.UserRepository;

@Controller
public class LoginController {
	
	@Autowired
	UserRepository repo;
	
	@Autowired
	HttpSession session;
	
	@Autowired
	PantryRepository pRepo;
	
	//Making a bunch of changes here, change it back it if doesn't work
	@RequestMapping("log-in")
	public ModelAndView login() {
		return new ModelAndView("log-in");
	}
	
	@RequestMapping("login")
	public ModelAndView getUser(@RequestParam("email") String email, @RequestParam("password") String password) {
		User user = new User(email, password, new Pantry(new ArrayList<Food>(), new ArrayList<AutoSubtraction>()), new ArrayList<Restriction>());
			if (repo.findByEmail(email).size() == 0) {
				session.setAttribute("user", user);
				Pantry p = user.getPantry();
				p.setUser(user);
				repo.save(user);
				pRepo.save(p);
				return new ModelAndView("register-success", "user", user);
			}
			else {
				User u = repo.findByEmail(user.getEmail()).get(0);
				session.setAttribute("user", u);
				return new ModelAndView("returning-user", "user", user);
			}
	}
	
	@RequestMapping("register")
	public ModelAndView register(User user) {
		ModelAndView mv;
		if (repo.findByEmail(user.getEmail()).size() == 0) {
			session.setAttribute("user", user);
			mv = new ModelAndView("page", "user", user);
		}
		else {
			//check later may not need
			repo.save(user);
			session.setAttribute("user", user);
			mv = new ModelAndView("index");
		}
	
		
		return mv;
	}

}
