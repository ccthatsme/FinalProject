package co.grandcircus.FinalProject.jpaEntity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

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
	
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(Set<Restriction> restriction, Set<Pantry> pantry, String name, Double quantity, String quantityUnit,
			Integer calories, Integer sugar, Integer carbs, Integer protein, Integer fat) {
		super();
		this.restriction = restriction;
		this.pantry = pantry;
		this.name = name;
		this.quantity = quantity;
		this.quantityUnit = quantityUnit;
		this.calories = calories;
		this.sugar = sugar;
		this.carbs = carbs;
		this.protein = protein;
		this.fat = fat;
	}

	public Food(Integer id, Set<Restriction> restriction, Set<Pantry> pantry, String name, Double quantity,
			String quantityUnit, Integer calories, Integer sugar, Integer carbs, Integer protein, Integer fat) {
		super();
		this.id = id;
		this.restriction = restriction;
		this.pantry = pantry;
		this.name = name;
		this.quantity = quantity;
		this.quantityUnit = quantityUnit;
		this.calories = calories;
		this.sugar = sugar;
		this.carbs = carbs;
		this.protein = protein;
		this.fat = fat;
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

	@Override
	public String toString() {
		return "Food [id=" + id + ", restriction=" + restriction + ", pantry=" + pantry + ", name=" + name
				+ ", quantity=" + quantity + ", quantityUnit=" + quantityUnit + ", calories=" + calories + ", sugar="
				+ sugar + ", carbs=" + carbs + ", protein=" + protein + ", fat=" + fat + "]";
	}
	
	
}
