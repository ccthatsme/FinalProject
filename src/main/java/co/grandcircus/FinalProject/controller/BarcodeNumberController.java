package co.grandcircus.FinalProject.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.FinalProject.entity.jsonEntity.Product;

@Controller
public class BarcodeNumberController {

	RestTemplate rt = new RestTemplate();
	
	@Value("${nutritionix-barcode.key}")
	private String key;
	
	@Value("${nutritionix-barcode.project}")
	private String projId;
	
	
	
	@RequestMapping("/")
	public ModelAndView showJsonForBarcodeNum() {
		String url = "https://nutritionix-api.p.rapidapi.com/v1_1/item?upc=044000032029";
		HttpHeaders headers = new HttpHeaders();
		
		headers.add("x-rapidapi-host", "nutritionix-api.p.rapidapi.com");
		headers.add("X-RapidAPI-Key", key);
		headers.add("RapidAPI Project", projId);
		
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		ResponseEntity<Product> response = rt.exchange(url, HttpMethod.GET, entity, Product.class);
		Product p = response.getBody();
		
		//String responseBody = response.getBody();
		return new ModelAndView("index", "response", p);
		
	}
}
