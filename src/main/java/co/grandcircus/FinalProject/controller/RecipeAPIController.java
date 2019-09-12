package co.grandcircus.FinalProject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("user")
public class RecipeAPIController {

	@Value("${spoonacular-recipe.key}")
	private String key;
	
	@Autowired
	HttpSession sess;
	
	RestTemplate rt = new RestTemplate();
	
	@RequestMapping("/recipe")
	public ModelAndView showJsonForRecipe() {
		String url = "https://api.spoonacular.com/recipes/findByIngredients?ingredients=apples,+flour,+sugar&number=2&apiKey=" + key;
		HttpHeaders headers = new HttpHeaders();		
		headers.add("Content-Type", "application/json");
//		headers.add(, headerValue);

	
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		ResponseEntity<String> response = rt.exchange(url, HttpMethod.GET, entity, String.class);
		System.out.println(response.getBody());

		return new ModelAndView("log-in");

	}
}
