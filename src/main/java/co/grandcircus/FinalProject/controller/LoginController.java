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

	// Making a bunch of changes here, change it back it if doesn't work
	@RequestMapping("log-in")
	public ModelAndView login() {
		return new ModelAndView("log-in");
	}

	@RequestMapping("login")
	public ModelAndView getUser(@RequestParam("email") String email, @RequestParam("password") String password) {
		User user = new User(email, password, new Pantry(new ArrayList<Food>(), new ArrayList<AutoSubtraction>()),
				new ArrayList<Restriction>());
		if (repo.findByEmail(email) == null) {
			if (validatePassword(user, password)) {
				session.setAttribute("user", user);
				Pantry p = user.getPantry();
				p.setUser(user);
				repo.save(user);
				pRepo.save(p);
				return new ModelAndView("user-pantry", "a", user);
			}
			else {
				return new ModelAndView("wrong-login");
			}
		} else {
			User u = repo.findByEmail(user.getEmail());
			if (validatePassword(u, password)) {	
				session.setAttribute("user", u);
				return new ModelAndView("user-pantry", "a", user);
			} else {
				return new ModelAndView("wrong-login");
			}
		}
	}

	@RequestMapping("register")
	public ModelAndView register(User user) {
		ModelAndView mv;
		if (repo.findByEmail(user.getEmail()) == null) {
			session.setAttribute("user", user);
			return new ModelAndView("user-pantry", "a", session.getAttribute("user"));
		} else {
			// check later may not need
			repo.save(user);
			session.setAttribute("user", user);
			return new ModelAndView("user-pantry", "a", session.getAttribute("user"));
		}
	}

	public boolean validatePassword(User u, String password) {
		if (u.getPassword().equals(password)) {
			return true;
		}
		return false;
	}

}
