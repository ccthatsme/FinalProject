package co.grandcircus.FinalProject.jpaEntity;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Food {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToMany(mappedBy = "restrictedFood")
	Set<Restriction> restriction;
	
	@ManyToMany(mappedBy = "recipeFood")
	Set<Recipe> recipe;
	
	@ManyToMany(mappedBy = "pantryFood")
	Set<Pantry> pantry;
	
	private String name;
	private Double quantity;
	private String quantityUnit;
	private Integer calories;
	private Integer sugar;
	private Integer carbs;
	private Integer protein;
	private Integer fat;
	private Double purchaseQuantity;
	private String purchaseUnit;
	
	@OneToMany(mappedBy="food") //, cascade=CascadeType.ALL, orphanRemoval=true
	List<AutoSubtraction> autosubtraction;
	
	public Food() {
		super();
		this.name = name;
		this.quantity = 0.0;
		this.quantityUnit = "oz";
		this.calories = 0;
		this.sugar = 0;
		this.carbs = 0;
		this.protein = 0;
		this.fat = 0;
		this.purchaseQuantity = 0.0;
		this.purchaseUnit = "oz";
	}

	public Food(String name) {
		super();
		this.name = name;
		this.quantity = 0.0;
		this.quantityUnit = "oz";
		this.calories = 0;
		this.sugar = 0;
		this.carbs = 0;
		this.protein = 0;
		this.fat = 0;
		this.purchaseQuantity = 5.0;
		this.purchaseUnit = "oz";
	}



	public Food(String name, Double quantity, String quantityUnit) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.quantityUnit = quantityUnit;
		this.calories = 0;
		this.sugar = 0;
		this.carbs = 0;
		this.protein = 0;
		this.fat = 0;
		this.purchaseQuantity = 0.0;
		this.purchaseUnit = "oz";
	}



	public Food(String name, Double quantity, String quantityUnit, Integer calories, Integer sugar, Integer carbs,
			Integer protein, Integer fat) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.quantityUnit = quantityUnit;
		this.calories = calories;
		this.sugar = sugar;
		this.carbs = carbs;
		this.protein = protein;
		this.fat = fat;
		this.purchaseQuantity = 0.0;
		this.purchaseUnit = "oz";
	}



	public Food(Set<Restriction> restriction, Set<Recipe> recipe, Set<Pantry> pantry, String name, Double quantity,
			String quantityUnit, Integer calories, Integer sugar, Integer carbs, Integer protein, Integer fat,
			List<AutoSubtraction> autosubtraction) {
		super();
		this.restriction = restriction;
		this.recipe = recipe;
		this.pantry = pantry;
		this.name = name;
		this.quantity = quantity;
		this.quantityUnit = quantityUnit;
		this.calories = calories;
		this.sugar = sugar;
		this.carbs = carbs;
		this.protein = protein;
		this.fat = fat;
		this.autosubtraction = autosubtraction;
		this.purchaseQuantity = 0.0;
		this.purchaseUnit = "oz";
	}

	public Food(Integer id, Set<Restriction> restriction, Set<Recipe> recipe, Set<Pantry> pantry, String name,
			Double quantity, String quantityUnit, Integer calories, Integer sugar, Integer carbs, Integer protein,
			Integer fat, List<AutoSubtraction> autosubtraction) {
		super();
		this.id = id;
		this.restriction = restriction;
		this.recipe = recipe;
		this.pantry = pantry;
		this.name = name;
		this.quantity = quantity;
		this.quantityUnit = quantityUnit;
		this.calories = calories;
		this.sugar = sugar;
		this.carbs = carbs;
		this.protein = protein;
		this.fat = fat;
		this.autosubtraction = autosubtraction;
		this.purchaseQuantity = 0.0;
		this.purchaseUnit = "oz";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<Restriction> getRestriction() {
		return restriction;
	}

	public void setRestriction(Set<Restriction> restriction) {
		this.restriction = restriction;
	}

	public Set<Recipe> getRecipe() {
		return recipe;
	}

	public void setRecipe(Set<Recipe> recipe) {
		this.recipe = recipe;
	}

	public Set<Pantry> getPantry() {
		return pantry;
	}

	public void setPantry(Set<Pantry> pantry) {
		this.pantry = pantry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Integer getSugar() {
		return sugar;
	}

	public void setSugar(Integer sugar) {
		this.sugar = sugar;
	}

	public Integer getCarbs() {
		return carbs;
	}

	public void setCarbs(Integer carbs) {
		this.carbs = carbs;
	}

	public Integer getProtein() {
		return protein;
	}

	public void setProtein(Integer protein) {
		this.protein = protein;
	}

	public Integer getFat() {
		return fat;
	}

	public void setFat(Integer fat) {
		this.fat = fat;
	}

	public List<AutoSubtraction> getAutosubtraction() {
		return autosubtraction;
	}

	public void setAutosubtraction(List<AutoSubtraction> autosubtraction) {
		this.autosubtraction = autosubtraction;
	}

	public Double getPurchaseQuantity() {
		return purchaseQuantity;
	}

	public void setPurchaseQuantity(Double purchaseQuantity) {
		this.purchaseQuantity = purchaseQuantity;
	}

	public String getPurchaseUnit() {
		return purchaseUnit;
	}

	public void setPurchaseUnit(String purchaseUnit) {
		this.purchaseUnit = purchaseUnit;
	}


}
