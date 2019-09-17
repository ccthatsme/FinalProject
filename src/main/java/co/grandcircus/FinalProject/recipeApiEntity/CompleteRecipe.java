package co.grandcircus.FinalProject.recipeApiEntity;

import java.util.ArrayList;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CompleteRecipe {
	
	
	private Integer id;
	private String image;
	private String title;
	private String usedIngredientType;
	private String sourceUrl;
	ArrayList<UsedIngredients> usedIngredients;
	
	public CompleteRecipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompleteRecipe(Integer id, String image, String title, String usedIngredientType, String sourceUrl,
			ArrayList<UsedIngredients> usedIngredients) {
		super();
		this.id = id;
		this.image = image;
		this.title = title;
		this.usedIngredientType = usedIngredientType;
		this.sourceUrl = sourceUrl;
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

	
	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	@Override
	public String toString() {
		return "CompleteRecipe [id=" + id + ", image=" + image + ", title=" + title + ", usedIngredientType="
				+ usedIngredientType + ", sourceUrl=" + sourceUrl + ", usedIngredients=" + usedIngredients + "]";
	}

}
