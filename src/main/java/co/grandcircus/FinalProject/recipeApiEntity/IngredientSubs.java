package co.grandcircus.FinalProject.recipeApiEntity;

import java.util.List;


public class IngredientSubs {
	
	private String ingredient;
	List<String> substitue;
	private String messsage;
	public IngredientSubs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IngredientSubs(String ingredient, List<String> substitue, String messsage) {
		super();
		this.ingredient = ingredient;
		this.substitue = substitue;
		this.messsage = messsage;
	}
	public String getIngredient() {
		return ingredient;
	}
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	public List<String> getSubstitue() {
		return substitue;
	}
	public void setSubstitue(List<String> substitue) {
		this.substitue = substitue;
	}
	public String getMesssage() {
		return messsage;
	}
	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}
	@Override
	public String toString() {
		return "IngredientSubs [ingredient=" + ingredient + ", substitue=" + substitue + ", messsage=" + messsage + "]";
	}
	
}
