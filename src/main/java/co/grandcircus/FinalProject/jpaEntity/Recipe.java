package co.grandcircus.FinalProject.jpaEntity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Recipe {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToMany
	@JoinTable(
	  name = "food_recipe", 
	  joinColumns = @JoinColumn(name = "recipe_id"), 
	  inverseJoinColumns = @JoinColumn(name = "food_id"))
	Set<Food> recipeFood;

	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recipe(Integer id, Set<Food> recipeFood) {
		super();
		this.id = id;
		this.recipeFood = recipeFood;
	}

	public Recipe(Set<Food> recipeFood) {
		super();
		this.recipeFood = recipeFood;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<Food> getRecipeFood() {
		return recipeFood;
	}

	public void setRecipeFood(Set<Food> recipeFood) {
		this.recipeFood = recipeFood;
	}

	@Override
	public String toString() {
		return "Recipe [id=" + id + ", recipeFood=" + recipeFood + "]";
	}
	
}
