package co.grandcircus.FinalProject.entity.jsonEntity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductResponse {
	
	private ArrayList<Product> foods;

	public ProductResponse(ArrayList<Product> foods) {
		super();
		this.foods = foods;
	}

	public ProductResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Product> getFoods() {
		return foods;
	}

	public void setFoods(ArrayList<Product> foods) {
		this.foods = foods;
	}

	@Override
	public String toString() {
		return "ProductResponse [foods=" + foods + "]";
	}
	
	

}
