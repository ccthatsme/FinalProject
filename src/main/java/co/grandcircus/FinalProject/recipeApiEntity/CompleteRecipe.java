package co.grandcircus.FinalProject.recipeApiEntity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompleteRecipe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String image;
	private String title;
	private String usedIngredientType;
	ArrayList<UsedIngredients> usedIngredients;
	
	public CompleteRecipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompleteRecipe(Integer id, String image, String title, String usedIngredientType,
			ArrayList<UsedIngredients> usedIngredients) {
		super();
		this.id = id;
		this.image = image;
		this.title = title;
		this.usedIngredientType = usedIngredientType;
		this.usedIngredients = usedIngredients;
	}

	public CompleteRecipe(String image, String title, String usedIngredientType,
			ArrayList<UsedIngredients> usedIngredients) {
		super();
		this.image = image;
		this.title = title;
		this.usedIngredientType = usedIngredientType;
		this.usedIngredients = usedIngredients;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUsedIngredientType() {
		return usedIngredientType;
	}

	public void setUsedIngredientType(String usedIngredientType) {
		this.usedIngredientType = usedIngredientType;
	}

	public ArrayList<UsedIngredients> getUsedIngredients() {
		return usedIngredients;
	}

	public void setUsedIngredients(ArrayList<UsedIngredients> usedIngredients) {
		this.usedIngredients = usedIngredients;
	}

	@Override
	public String toString() {
		return "CompleteRecipe [id=" + id + ", image=" + image + ", title=" + title + ", usedIngredientType="
				+ usedIngredientType + ", usedIngredients=" + usedIngredients + "]";
	}
	

}
