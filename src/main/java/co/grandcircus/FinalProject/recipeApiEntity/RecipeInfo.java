package co.grandcircus.FinalProject.recipeApiEntity;

import java.util.ArrayList;

public class RecipeInfo {

	private Integer id;
	private String title;
	private String image;
	private Integer servings;
	private Integer readyInMinutes;
	private String license;
	private String sourceName;
	private String sourceUrl;
	private String spoonacularSourceUrl;
	ArrayList<diets> diets;
	
	public RecipeInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecipeInfo(Integer id, String title, String image, Integer servings, Integer readyInMinutes, String license,
			String sourceName, String sourceUrl, String spoonacularSourceUrl,
			ArrayList<co.grandcircus.FinalProject.recipeApiEntity.diets> diets) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.servings = servings;
		this.readyInMinutes = readyInMinutes;
		this.license = license;
		this.sourceName = sourceName;
		this.sourceUrl = sourceUrl;
		this.spoonacularSourceUrl = spoonacularSourceUrl;
		this.diets = diets;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getServings() {
		return servings;
	}

	public void setServings(Integer servings) {
		this.servings = servings;
	}

	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}

	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public String getSpoonacularSourceUrl() {
		return spoonacularSourceUrl;
	}

	public void setSpoonacularSourceUrl(String spoonacularSourceUrl) {
		this.spoonacularSourceUrl = spoonacularSourceUrl;
	}

	public ArrayList<diets> getDiets() {
		return diets;
	}

	public void setDiets(ArrayList<diets> diets) {
		this.diets = diets;
	}

	@Override
	public String toString() {
		return "RecipeInfo [id=" + id + ", title=" + title + ", image=" + image + ", servings=" + servings
				+ ", readyInMinutes=" + readyInMinutes + ", license=" + license + ", sourceName=" + sourceName
				+ ", sourceUrl=" + sourceUrl + ", spoonacularSourceUrl=" + spoonacularSourceUrl + ", diets=" + diets
				+ "]";
	}
	
	
}
