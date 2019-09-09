package co.grandcircus.FinalProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.FinalProject.jpaEntity.User;
import co.grandcircus.FinalProject.repository.UserRepository;

@Controller
public class LoginController {
	
	
	User user;
	
	@Autowired
	UserRepository repo;
	
	@RequestMapping("log-in")
	public ModelAndView login(User user) {
		ModelAndView mv;
		//this checks to see if the user data we pull will exist in the database
		
		if (repo.findByEmail(user.getEmail()).size() == 0) {
			mv = new ModelAndView("page","testing", user);
		}
		else {
			//if they arent this goes to a registration page
			mv = new ModelAndView("register", "testing", user);
		}
		mv = new ModelAndView("register", "testing", user);
		return mv;
		
	}
	
	@RequestMapping("register")
	public ModelAndView register(User user) {
		ModelAndView mv;
		if (repo.findByEmail(user.getEmail()).size() == 0) {
			mv = new ModelAndView("log-in");
		}
		else {
			repo.save(user);
			mv = new ModelAndView("index");
		}
	
		
		return mv;
	}

}
