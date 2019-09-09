package co.grandcircus.FinalProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.FinalProject.jpaEntity.User;
import co.grandcircus.FinalProject.repository.UserRepository;

@Controller
public class LoginController {
	
	@Autowired
	UserRepository repo;
	
	//Making a bunch of changes here, change it back it if doesn't work
	@RequestMapping("log-in")
	public ModelAndView login() {
		return new ModelAndView("log-in");
	}
	
	@RequestMapping("login")
	public ModelAndView getUser(@RequestParam("email") String email, @RequestParam("password") String password) {
		User user = new User(email, password);
			if (repo.findByEmail(email).size() == 0) {
				repo.save(user);
				return new ModelAndView("register-success", "user", user);
			}
			else {
				return new ModelAndView("returning-user", "user", user);
			}
	}
	
	@RequestMapping("register")
	public ModelAndView register(User user) {
		ModelAndView mv;
		if (repo.findByEmail(user.getEmail()).size() == 0) {
			mv = new ModelAndView("page", "user", user);
		}
		else {
			repo.save(user);
			mv = new ModelAndView("index");
		}
	
		
		return mv;
	}

}
