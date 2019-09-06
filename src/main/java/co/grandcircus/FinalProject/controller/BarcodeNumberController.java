package co.grandcircus.FinalProject.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class BarcodeNumberController {

	RestTemplate rt = new RestTemplate();
	
	@Value("${nutritionix-barcode.key}")
	private String key;
	
	@Value("${nutritionix-barcode.project}")
	private String projId;
	
	
	
	@RequestMapping("/")
	public String showJsonForBarcodeNum() {
		String url = "https://nutritionix-api.p.rapidapi.com/v1_1/item?upc=041633052097";
		HttpHeaders headers = new HttpHeaders();
		
		headers.add("x-rapidapi-host", "nutritionix-api.p.rapidapi.com");
		headers.add("X-RapidAPI-Key", key);
		headers.add("RapidAPI Project", projId);
		
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		ResponseEntity<String> response = rt.exchange(url, HttpMethod.GET, entity, String.class);
		String responseBody = response.getBody();
		return responseBody;
		
	}
}
